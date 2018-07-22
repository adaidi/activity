/**
 *
 */
package cn.dw.st.common;

import java.util.List;

import cn.dw.st.domain.UserInfo;

/**
 * @author aubrey
 * @date  上午11:04:44
 * 
 */
public interface BaseMapper<T> {
	public void add(T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public List<T> query(T t);
	
	public int login(T t);
	
}
