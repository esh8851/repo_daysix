package com.seon.infra.concert;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.seon.common.util.UtilDateTime;

@Service
public class ConcertService {
	
	@Autowired
	ConcertDao concertDao;
	
	@Autowired
	AmazonS3Client amazonS3Client;
	
	public List<ConcertDto> selectList(ConcertVo concertVo) {
		return concertDao.selectList(concertVo);
	}
	
	public int insert(ConcertDto concertDto, int type) throws Exception {
		
		for(int i=0; i<concertDto.getUploadFiles().length; i++) {
			
					
			if(!concertDto.getUploadFiles()[i].isEmpty()) {
				
				String className = concertDto.getClass().getSimpleName().toString().toLowerCase();		
				String fileName = concertDto.getUploadFiles()[i].getOriginalFilename();
				String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
				String uuid = UUID.randomUUID().toString();
				String uuidFileName = uuid + "." + ext;
				String pathModule = className;
				String nowString = UtilDateTime.nowString();
				String pathDate = nowString.substring(0,4) + "/" + nowString.substring(5,7) + "/" + nowString.substring(8,10); 
				String path = pathModule + "/" + type + "/" + pathDate + "/";
//						String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";
				
				
		        ObjectMetadata metadata = new ObjectMetadata();
		        metadata.setContentLength(concertDto.getUploadFiles()[i].getSize());
		        metadata.setContentType(concertDto.getUploadFiles()[i].getContentType());
		        
		        amazonS3Client.putObject("daysix", path + uuidFileName, concertDto.getUploadFiles()[i].getInputStream(), metadata);
				
		        String objectUrl = amazonS3Client.getUrl("daysix", path + uuidFileName).toString();
		        
		        concertDto.setPath(objectUrl);
		        concertDto.setOriginalName(fileName);
		        concertDto.setUuidName(uuidFileName);
		        concertDto.setExt(ext);
		        concertDto.setSize(concertDto.getUploadFiles()[i].getSize());
				
//		        concertDto.setTableName(tableName);
//		        concertDto.setType(type);
////						dto.setDefaultNy();
//		        concertDto.setSort(maxNumber + i);
//		        concertDto.setPseq(pSeq);
//				
//		        concertDao.insertUploaded(concertDto);
			}
		}
		
		return concertDao.insert(concertDto);
	}
	
	public int update(ConcertDto concertDto) {
		return concertDao.update(concertDto);
	}
	
	public int uelete(ConcertDto concertDto) {
		return concertDao.uelete(concertDto);
	}
	
	public int delete(ConcertDto concertDto) {
		return concertDao.delete(concertDto);
	}
	
	public ConcertDto selectOne(ConcertDto concertDto) {
		return concertDao.selectOne(concertDto);
	}
	
	public int selectOneCount(ConcertVo concertVo) {
		return concertDao.selectOneCount(concertVo);
	}
	
//	reply
	public int selectOneCountReply(ConcertDto concertDto) {
		return concertDao.selectOneCountReply(concertDto);
	}
	
	public List<ConcertDto> selectListReply(ConcertDto concertDto) {
		return concertDao.selectListReply(concertDto);
	}

}
