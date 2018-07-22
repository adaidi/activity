/**
 *
 */
package cn.dw.st.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dw.st.common.BaseServiceImpl;
import cn.dw.st.domain.UserInfo;
import cn.dw.st.mapper.UserInfoMapper;
import cn.dw.st.service.UserInfoService;

/**
 * @author aubrey
 * @date  上午10:08:48
 * 
 */
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService{
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	

}
