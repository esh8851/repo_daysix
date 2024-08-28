package com.seon.infra.lecture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectureService {
	
	@Autowired
	LectureDao lectureDao;
	
	public List<LectureDto> selectService(){
		List<LectureDto> lectures = lectureDao.selectList();
		return lectures;
	}

}
