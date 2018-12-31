package competitors;

public class JugglerReciter extends Juggler{
    
    private Poem poem;

    public JugglerReciter(Poem poem) {
        super();
        this.poem = poem;
    }

    public JugglerReciter(int balls, Poem poem) {
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
