package com.seon.infra.indexUsr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexUsrService {
	
	@Autowired
	IndexUsrDao indexUsrDao;
	
	public List<IndexUsrDto> selectList(IndexUsrDto indexUsrDto) {
		return indexUsrDao.selectList(indexUsrDto);
	}
	
}
