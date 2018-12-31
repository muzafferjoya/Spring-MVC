package test;

import competitors.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.log4j.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJUnitTalentContest {

    Logger log = LogManager.getRootLogger();
    private Competitor competitor1;
    private Competitor competitor2;
    private Competitor musician1;
    private Competitor musician2;

    @BeforeEach
    public void before() {
        log.info("Starting Spring Framework");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        log.info("getting the first Competitor");
        competitor1 = (Competitor) ctx.getBean("juggler");
        competitor2 = (Competitor) ctx.getBean("jugglerReciter");
        musician1 = (Competitor) ctx.getBean("pianist");
        musician2 = (Competitor) ctx.getBean("saxophonist");
    }

    @Test
    public void testJuggler() {
        log.info("Start executing Juggler");

        int ballsTest = 10;
        competitor1.execute();
        assertEquals(ballsTest, ((Juggler) competitor1).getBalls());

        log.info("Finish executing Juggler");

        log.info("Start executing JugglerReciter");

        ballsTest = 15;
        competitor2.execute();
        assertEquals(ballsTest, ((Juggler) competitor2).getBalls());

        log.info("Finish executing JugglerReciter");

        log.info("Start Executing Pianist");

        String song = "Silent Night";
        musician1.execute();
        assertEquals(song, ((Musician) musician1).getSong());

        log.info("Finish Executing Pianist");

        log.info("Start Executing Saxophonist");

        song = "Equinox";
        musician2.execute();
        assertEquals(song, ((Musician) musician2).getSong());

        log.info("End Executing Saxophonist");
    }
}
