package com.lijinjin.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

	@Around(value="execution(* com.lijinjin.service.ProductService.*(..))")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		Object object=null;
		System.out.println("start log:"+pjp.getSignature().getName());
		object=pjp.proceed();
		System.out.println("end log:"+pjp.getSignature().getName());
		return object;
	}
}
