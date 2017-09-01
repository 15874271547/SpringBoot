package com;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//表明这是一个 Controller

//RestController是一种Rest风格的Controller，可以直接返回对象而不返回视图，返回的对象可以使JSON，XML等
//@RestController
@SpringBootApplication
@RequestMapping("/index")
@Controller
public class springBootController {
	@RequestMapping
	public String index() {
		return "index/myview";//返回结果为字符串
	}

}