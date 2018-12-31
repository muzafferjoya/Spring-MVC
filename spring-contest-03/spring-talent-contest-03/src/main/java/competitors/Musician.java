package competitors;

public class Musician implements Competitor{
    
    private String song;
    private Instrument instrument;

    public Musician() {
    }

    @Override
    public void execute() throws ExecutionException {
        System.out.println("Playing " + song + ": ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}