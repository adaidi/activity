/**
 *
 */
package cn.dw.st.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cn.dw.st.aop.Log;
import cn.dw.st.domain.UserInfo;
import cn.dw.st.service.UserInfoService;

/**
 * @author aubrey
 * @date  上午10:16:49
 * 
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(UserInfo userInfo) {
		userInfoService.add(userInfo);
		return "success2";
	}
	
	
	@RequestMapping("/loginIn")
	@ResponseBody
	public String loginIn(UserInfo userInfo) {
		int count = userInfoService.login(userInfo);
		if(count > 0) {
			return "success";
		}
		return "failure";
	}
	
	@RequestMapping("/query")
	@ResponseBody
    @Log(name = "")
	public String query(UserInfo userInfo) {
		List<UserInfo>  lists = userInfoService.query(userInfo);
		return lists.toString();
	}
	
	

}
