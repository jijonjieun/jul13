package com.elly.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	//기능들을 만들어줄거야
	//사용자가 /board라고 호출하면 동작할 메소드 만들기
	
	@GetMapping("/board")
	public String board() {
		return "board"; //파일명
	
	}
// 
}
