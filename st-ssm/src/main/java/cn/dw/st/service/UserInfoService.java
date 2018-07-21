/**
 *
 */
package cn.dw.st.service;

import java.util.List;

import cn.dw.st.domain.UserInfo;

/**
 * @author aubrey
 * @date  上午10:06:23
 * 
 */
public interface UserInfoService {

	public void add(UserInfo userInfo);
	
	public void update(UserInfo userInfo);
	
	public void delete(UserInfo userInfo);
	
	public List<UserInfo> query(UserInfo userInfo);
	
	public int login(UserInfo userInfo);
	
}
