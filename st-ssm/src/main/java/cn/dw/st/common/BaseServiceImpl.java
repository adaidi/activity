/**
 *
 */
package cn.dw.st.common;

import java.util.List;

import cn.dw.st.domain.UserInfo;

/**
 * @author aubrey
 * @date  上午11:54:59
 * 
 */
public class BaseServiceImpl<M extends BaseMapper<T>,T> implements BaseService<M, T> {

	@Override
	public void add(M m, T t) {
		m.add(t);
	}

	/* (non-Javadoc)
	 * @see cn.dw.st.common.BaseService#update(cn.dw.st.common.BaseMapper, java.lang.Object)
	 */
	@Override
	public void update(M m, T t) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see cn.dw.st.common.BaseService#delete(cn.dw.st.common.BaseMapper, java.lang.Object)
	 */
	@Override
	public void delete(M m, T t) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see cn.dw.st.common.BaseService#query(cn.dw.st.common.BaseMapper, java.lang.Object)
	 */
	@Override
	public List<T> query(M m, T t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see cn.dw.st.common.BaseService#login(cn.dw.st.common.BaseMapper, java.lang.Object)
	 */
	@Override
	public int login(M m, T t) {
		// TODO Auto-generated method stub
		return 0;
	}


}
