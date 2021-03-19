package com.firstapp.services;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
 
	@Pointcut("execution(* com.firstapp.controllers.FirstController.doThis(..))")
	 public void x(){
		  
	  }
	
	@Before("x()")
	public void doThis(){
		System.out.println("Aspect is working!!!!");
	}
	
	@AfterReturning(pointcut="x()",returning="data")
	public void doThisAlso(Object data){
	    System.out.println(data);
	}
	
}