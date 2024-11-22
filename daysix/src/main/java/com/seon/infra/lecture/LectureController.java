package com.seon.infra.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LectureController {
	
	@Autowired
	 LectureService lectureService;
	
	@RequestMapping(value="/v1/infra/lecture/lectureUsr")
	public String lectureUsr(Model model) {
//		List<LectureDto> lectures = lectureService.selectService();
//		System.out.println(lectures.size());
//		for(LectureDto lecturei: lectures) {
//			System.out.println(lecturei.getSeq() + "|" + lecturei.getLectureType() + "|" + lecturei.getLectureName() + "|" + lecturei.getLecturePrice() + "|" + lecturei.getLectureTeacher() + "|" + lecturei.getRegCourseStart() + "|" + lecturei.getRegCourseFinal() + "|" + lecturei.getLearningStart() + "|" + lecturei.getLearningFinal() + "|" + lecturei.getLecturePlace() + "|" + lecturei.getLecturedetail() + "|" + lecturei.getLectureRegDateTime() + "|" + lecturei.getLectureModDateTime());
//		}
		model.addAttribute("list", lectureService.selectService());
		return "usr/v1/infra/lecture/lectureUsr";
	}

}
