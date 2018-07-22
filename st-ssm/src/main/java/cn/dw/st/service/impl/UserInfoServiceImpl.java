/**
 *
 */
package cn.dw.st.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dw.st.domain.UserInfo;
import cn.dw.st.mapper.UserInfoMapper;
import cn.dw.st.service.UserInfoService;

/**
 * @author aubrey
 * @date  上午10:08:48
 * 
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public void add(UserInfo userInfo) {
		
		userInfoMapper.add(userInfo);
	}

	@Override
	public void update(UserInfo userInfo) {
		userInfoMapper.update(userInfo);
	}

	@Override
	public void delete(UserInfo userInfo) {
		userInfoMapper.delete(userInfo);
	}

	@Override
	public List<UserInfo> query(UserInfo userInfo) {
		return userInfoMapper.query(userInfo);
	}

	@Override
	public int login(UserInfo userInfo) {
		return userInfoMapper.login(userInfo);
	}

}
