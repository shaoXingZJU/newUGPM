package com.ugpm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @ Author     ：shaoXing
 * @ Date       ：Created in 10:36 2019/1/24
 * 日志的切面类
 */
@Aspect
public class LogAspects {

    //抽取公共的切入点表达式
    //1、本类引用pointCut()
    //2、其他的切面引用,写全路径名xxx.xxx.pointCut()
    @Pointcut("execution(public int com.ugpm.aop.MathCalculator.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"运行...,参数是"+ Arrays.asList(joinPoint.getArgs()));
    }
    @After("execution(public int com.ugpm.aop.MathCalculator.div(int,int))")
    public void logEnd(){
        System.out.println("除法结束...");
    }
    //注意JoinPoint一定要为参数表的第一位
    @AfterReturning(value = "pointCut()",returning ="result" )
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName()+"正常返回...,返回值是"+result.toString());
    }
    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法执行异常...,异常信息"+exception);
    }
}

