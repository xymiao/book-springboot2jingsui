package com.jkyuntu.springboot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTFul 接口 需要该注解: @RestController
 * 
 * @author XyMiao
 */
@RestController
public class RESTFulController {
	/**
	 * 根据手机号进行注册, 这里只是模拟, 实际上这里应该还有其他的一些信息, 在后期系列教程会做详细的介绍说明
	 * 
	 * @param telNo 注册的手机号
	 * @return 返回处理结果以JSON为结果
	 */
	@PostMapping("api/register/{telNo}")
	public String register(@PathVariable String telNo) {
		return telNo;
	}

	/**
	 * 登录会员信息
	 * 
	 * @param telNo 手机号
	 * @param pwd   密码(或者校验码)
	 * @return 返回处理结果以JSON为结果
	 */
	@PostMapping("api/login/{telNo}/{pwd}")
	public String login(@PathVariable String telNo, @PathVariable String pwd) {
		return telNo + "   " + pwd;
	}

	/**
	 * 根据手机号查询对应的用户信息
	 * 
	 * @param telNo 手机号
	 * @return 返回处理结果以JSON为结果
	 */
	@PostMapping("api/userinfo/{telNo}")
	public String userinfo(@PathVariable String telNo) {
		return telNo;
	}

	/**
	 * 根据type类型查找对应的数据
	 * @param type  t 代表手机号  u 代表用户名
	 * @param no type对应的值
	 * @return 原样输出. 
	 */
	@PostMapping("api/userinfo/{type}-{no}")
	public String userInfoByType(@PathVariable String type, @PathVariable String no) {
		if(type.equals("t")) {
			//执行手机号的关联信息
		}else if(type.equals("u")) {
			//执行用户名的关联信息
		}
		return type + "   " + no;
	}
	
	/**
	 * 只要符合/api/u/xhi.html都是符合该URI
	 * @return
	 */
	@GetMapping("/api/u/?hi.html")
	public String startOne() {
		return "api/u/?hi.html";
	}
	
	/**
	 * 只要符合/api/u/xxx.html都是符合该URI
	 * @return
	 */
	@GetMapping("/api/u/*.html")
	public String start() {
		return "api/u/*.html";
	}
	/**
	 * 只要符合/api/u/xxx/xx/d.html都是符合该URI
	 * @return
	 */
	@GetMapping("/api/u/**/d.html")
	public String startD() {
		return "api/u/**.html";
	}
	
	
	/**
	 * 举例: /spring-web-3.0.5 .jar
	 * @param name
	 * @param version
	 * @param ext
	 */
	@GetMapping("/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d}{ext:\\.[a-z]+}")
	public void handle(@PathVariable String name,@PathVariable String version, @PathVariable String ext) {
	    // ...
	}
	
}
