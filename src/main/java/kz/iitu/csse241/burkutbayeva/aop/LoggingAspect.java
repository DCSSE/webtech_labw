package kz.iitu.csse241.burkutbayeva.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* kz.iitu.csse241.burkutbayeva.service.*.*(..))")
    public void allServiceMethods() {}

    @Before("allServiceMethods()")
    public void beforeAdvice() {
        System.out.println("метод будет вызван");
    }

    @After("allServiceMethods()")
    public void afterAdvice() {
        System.out.println("метод был вызван");
    }

    @Around("allServiceMethods()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("AOP Around Start: " + joinPoint.getSignature());

        Object result = joinPoint.proceed();

        long duration = System.currentTimeMillis() - start;
        System.out.println("AOP Around end: " + joinPoint.getSignature() + " выполнен за " + duration + " мс");

        return result;
    }

}
