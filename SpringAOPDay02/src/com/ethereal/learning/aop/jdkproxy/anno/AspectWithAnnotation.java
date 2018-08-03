package com.ethereal.learning.aop.jdkproxy.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AspectWithAnnotation {
	
	@Pointcut("execution(* com.ethereal.learning.aop.jdkproxy.impl.*.*(..))")
	private void annotationPointCut(){
	}
	
	@Before("annotationPointCut()")
	public void methodBefore(JoinPoint joinPoint){
		System.out.println("前置通知:"+joinPoint.getSignature().getName());
	}
	
	@AfterReturning(value="execution(* com.ethereal.learning.aop.jdkproxy.impl.*.*(..))",returning="result")
	public void methodAfter(JoinPoint joinPoint,Object result){
		System.out.println("后置通知:"+joinPoint.getSignature().getName()+",返回值:"+result);
	}
	
	@Around("execution(* com.ethereal.learning.aop.jdkproxy.impl.*.*(..))")
	public Object methodAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前:"+joinPoint.getSignature().getName());
		Object proceed = joinPoint.proceed();
		System.out.println("环绕后:"+joinPoint.getSignature().getName());
		return proceed;
	}
	
	@AfterThrowing(value="execution(* com.ethereal.learning.aop.jdkproxy.impl.*.*(..))",throwing="throwable")
	public void methodException(JoinPoint joinPoint,Throwable throwable){
		System.out.println("抛出异常通知："+joinPoint.getSignature().getName()+",异常信息："+throwable.getMessage());
	}
	
	@After("execution(* com.ethereal.learning.aop.jdkproxy.impl.*.*(..))")
	public void methodFinal(JoinPoint joinPoint){
		System.out.println("最终通知："+joinPoint.getSignature().getName());
	}

}
