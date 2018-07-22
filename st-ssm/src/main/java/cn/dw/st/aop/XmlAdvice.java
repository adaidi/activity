/**
 *
 */
package cn.dw.st.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author aubrey
 * @date  上午9:09:14
 * 
 */
@Component
public class XmlAdvice {
	
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("============before=======");
	}
	
	public void doAfter() {
		System.out.println("============doAfter=======");
	}

}
