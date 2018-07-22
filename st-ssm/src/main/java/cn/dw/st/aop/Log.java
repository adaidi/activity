/**
 *
 */
package cn.dw.st.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author aubrey
 * @date  上午10:10:59
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value= {ElementType.TYPE,ElementType.METHOD})
public @interface Log {
	
	String name() default "无";
}
