/**
 *
 */
package cn.dw.st.domain;

import lombok.Data;

/**
 * @author aubrey
 * @date  上午9:30:47
 * 
 */
@Data
public class UserInfo {
	
	private Integer id;
	
	private String loginId;
	
	private String loginPwd;
	
	private String userName;
	
	private Integer sex;
	
	private String telNo;
	
	private String identifyId;
	
	private String remark;

}
