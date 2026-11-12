
package com.craft.lab6.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final String SERVICE_METHODS =
            "execution(* com.craft.lab6.service.*.*(..))";

    // 1. BEFORE ADVICE
    @Before(SERVICE_METHODS)
    public void beforeMethod(JoinPoint joinPoint) {

        System.out.println("BEFORE: "
                + joinPoint.getSignature().getName());
    }

    // 2. AFTER ADVICE
    @After(SERVICE_METHODS)
    public void afterMethod(JoinPoint joinPoint) {

        System.out.println("AFTER: "
                + joinPoint.getSignature().getName());
    }

    // 3. AFTER RETURNING ADVICE
    @AfterReturning(
            pointcut = SERVICE_METHODS,
            returning = "result"
    )
    public void afterReturning(Object result) {

        System.out.println("SUCCESS: " + result);
    }

    // 4. AFTER THROWING ADVICE
    @AfterThrowing(
            pointcut = SERVICE_METHODS,
            throwing = "exception"
    )
    public void afterThrowing(Exception exception) {

        System.out.println("ERROR: "
                + exception.getMessage());
    }

    // 5. AROUND ADVICE
    @Around(SERVICE_METHODS)
    public Object aroundMethod(
            ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();

        System.out.println("AROUND: Starting "
                + joinPoint.getSignature().getName());

        try {
            return joinPoint.proceed();
        } finally {

            long end = System.currentTimeMillis();

            System.out.println("AROUND: Execution time = "
                    + (end - start) + " ms");
        }
    }
}
