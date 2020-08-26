package com.haechang.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // View를 리턴하겠다.
public class IndexController {

	// 머스테치 기본폴더 src/main/resources/
	// 뷰리졸버 설정 : templates (prefix), .mustache (suffix)
	// src/main/resources/templates/index.mustache
	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
}
