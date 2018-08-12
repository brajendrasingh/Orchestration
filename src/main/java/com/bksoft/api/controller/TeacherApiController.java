/**
 * 
 */
package com.bksoft.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bksoft.model.Teacher;

import io.swagger.annotations.Api;

/**
 * @author BRAJENDRA SINGH
 *
 */
@Api(value = "TeacherApi")
@Controller
public class TeacherApiController {

	@RequestMapping(value = "/tList", method=RequestMethod.GET)
	@ResponseBody
	public List<Teacher> getTeacherList() {

		List<Teacher> lt = new ArrayList<Teacher>();

		Teacher t = new Teacher();
		t.setId(201334);
		t.setName("Gajendra Singh");
		t.setMobile("9455555550");

		lt.add(t);
		lt.add(t);
		lt.add(t);
		lt.add(t);
		lt.add(t);
		lt.add(t);
		lt.add(t);
		lt.add(t);

		return lt;
	}

}
