/**
 *
 */
package cn.dw.st.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import cn.dw.st.domain.UserInfo;

/**
 * @author aubrey
 * @date  上午10:07:06
 * 
 */
@Component
@Aspect
public class LogAdvice {
//	@Pointcut("execution()")
	@Pointcut("@annotation(cn.dw.st.aop.Log)")
	public void log() {};
	
	@Before("log()")
	public void doBefore(JoinPoint joinPoint) {
		
		Class clazz = joinPoint.getClass();
		
		String signature =  joinPoint.getSignature().getName();
		
		try {
			Method method = clazz.getMethod(signature, UserInfo.class);
			Log log = method.getAnnotation(Log.class);
			System.out.println(log.name());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("============logloglogloglogbefore=======");
	}
	
	@After("log()")
	public void doAfter() {
		System.out.println("============loglogloglogloglogdoAfter=======");
	}

}
