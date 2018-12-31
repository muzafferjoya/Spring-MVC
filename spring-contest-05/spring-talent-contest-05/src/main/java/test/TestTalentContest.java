package test;

import competitors.Competitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTalentContest {
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Competitor competitor1 = (Competitor) ctx.getBean("juggler");
        competitor1.execute();

    }
}
