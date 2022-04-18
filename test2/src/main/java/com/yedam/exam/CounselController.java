package com.yedam.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CounselController {

	@Autowired CounselService service;
	
	@PostMapping("/insertCounsel")
	@ResponseBody
	public int insertCounsel(@RequestBody List<Counsel> list) {
		
		return service.insertCounsel(list);
	}
}
