package com.pengys.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect  //标识这是一个切面类
@Component
public class InvokeLogAspect {
    public static Logger logger = LoggerFactory.getLogger(InvokeLogAspect.class);

    @Pointcut("@annotation(com.pengys.annotation.InvokeLog)")
    //指定哪些连接点为切点
    public void pt(){

    }



    @Around("pt()")
    public Object printInvokeLog(ProceedingJoinPoint joinPoint){
        //目标方法调用前
        Object proceed = null;
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();
        //System.out.println(methodName+"即将被调用");
        logger.info(methodName+"即将被调用");
        try {
            proceed = joinPoint.proceed();
            //目标方法调用后
           // System.out.println(methodName+"被调用完了");
            logger.info(methodName+"被调用完了");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            //目标方法出现异常了
            //System.out.println(methodName+"出现了异常");
            logger.info(methodName+"出现了异常");
        }
        return proceed;
    }

}
