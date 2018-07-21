/**
 *
 */
package cn.dw.st.mapper;

import java.util.List;

import cn.dw.st.domain.UserInfo;

/**
 * @author aubrey
 * @date  上午9:42:59
 * 
 */
public interface UserInfoMapper {
	
	public void add(UserInfo userInfo);
	
	public void update(UserInfo userInfo);
	
	public void delete(UserInfo userInfo);
	
	public List<UserInfo> query(UserInfo userInfo);
	
	public int login(UserInfo userInfo);
	
}
