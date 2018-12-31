package competitors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

    @Pointcut("execution(* competitors.Competitor.execute(..))")
    public void executeShow() {
        System.out.println("Executing show");
    }

    @Around("executeShow()")
    public void monitorShow(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("The show is about to start, please take a seat...");
            System.out.println("Please turn off cell phones...");
            //We record the start time
            long startTime = System.currentTimeMillis();

            //The business method is called (target method)
            joinpoint.proceed();

            Thread.sleep(1000); //1 second
            //This delay in milliseconds is optional and can be put into business methods
            //to simulate the duration of the method

            long endTime = System.currentTimeMillis();
            System.out.println("The show is over, claps");
            System.out.println("The show lasted for:" + (endTime - startTime));
        } catch (Throwable t) {
            System.out.println("The show was terrible, the tickets will be refunded");
        }
    }
}
