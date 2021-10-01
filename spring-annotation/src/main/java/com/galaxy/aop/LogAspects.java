package com.galaxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/25 16:32
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(* com.galaxy.aop.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("除法running。。。"+"方法："+joinPoint.getSignature().getName()+"====运行参数："+ Arrays.toString(args));
    }

    @After("com.galaxy.aop.LogAspects.pointCut()")
    public void logEnd(){
        System.out.println("除法end。。。");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println("除法return。。。"+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法exception。。。"+exception);
    }
}
