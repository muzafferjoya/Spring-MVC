package competitors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JugglerReciter extends Juggler{
    
    private Poem poem;

    public JugglerReciter(Poem poem) {
        super();
        this.poem = poem;
    }

    //Automatic injection by constructor, we inject primitive values and references
    @Autowired
    public JugglerReciter(@Value("15") int balls, Poem poem) {
        super(balls);
        this.poem = poem;
    }

    @Override
    public void execute() throws ExecutionException {
        super.execute();
        System.out.println("while reciting...");
        poem.recite();
        System.out.println("Ends recitation...");
    }
}
