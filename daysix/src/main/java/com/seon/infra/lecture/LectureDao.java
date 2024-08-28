package com.seon.infra.lecture;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface LectureDao {
	
	List<LectureDto> selectList();

}
