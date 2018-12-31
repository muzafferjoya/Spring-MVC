package competitors;

import org.springframework.stereotype.Component;

@Component
public class Audience {

    public void sit() {
        System.out.println("The show is about to start, please take a seat...");
    }

    public void turnOffCells() {
        System.out.println("Please turn off cell phones...");
    }

    public void clap() {
        System.out.println("The show is over, clap clap clap");
    }

    public void refund() {
        System.out.println("The show was terrible, tickets will be returned");
    }
}
