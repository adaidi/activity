/**
 *
 */
package cn.dw.st.common;

import java.util.List;

import cn.dw.st.domain.UserInfo;

/**
 * @author aubrey
 * @date  上午11:01:28
 * 
 */
public interface BaseService<M extends BaseMapper<T>,T> {
	
	public void add(M m,T t);
	
	public void update(M m,T t);
	
	public void delete(M m,T t);
	
	public List<T> query(M m,T t);
	
	public int login(M m,T t);
	
}
