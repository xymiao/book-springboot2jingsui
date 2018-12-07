package com.jkyuntu.springboot2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC演示用
 * @author XyMiao
 */
@Controller
public class SpringMVCController {
	@RequestMapping(value= {"", "index.html"})
	public String index() {
		return "index";
	}
}
