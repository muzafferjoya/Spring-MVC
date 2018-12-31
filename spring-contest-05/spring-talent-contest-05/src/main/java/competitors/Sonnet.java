package competitors;

import org.springframework.stereotype.Component;

@Component("reciter")
public class Sonnet implements Poem{
    
    @Override
    public void recite(){
        String sonnet = "A thing of beauty is a joy forever.\n" +
                        "Its loveliness increases; it will never\n" +
                        "pass into nothingness ...\n";
        
        System.out.println("\nSonnet:" + sonnet);
    }
}
