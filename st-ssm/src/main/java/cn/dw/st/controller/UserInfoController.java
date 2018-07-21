/**
 *
 */
package cn.dw.st.controller;


import cn.dw.st.domain.UserInfo;
import cn.dw.st.service.UserInfoService;

/**
 * @author aubrey
 * @date  上午10:16:49
 * 
 */
public class UserInfoController {
	
	private UserInfoService userInfoService;
	
	
	public void add(UserInfo userInfo) {
		userInfoService.add(userInfo);
	}

}
