package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.log4j.*;
import beans.SpringBean;

public class SpringTest {

    public static void main(String[] args) {
        Logger log = LogManager.getRootLogger();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory = context;
        SpringBean myBean = (SpringBean) factory.getBean("myBean");
        
        log.info("Message: " + myBean.getMessage());
    }
}
