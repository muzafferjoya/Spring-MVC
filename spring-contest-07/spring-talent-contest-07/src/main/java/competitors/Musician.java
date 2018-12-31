package competitors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pianist")
public class Musician implements Competitor {

    //Inyeccion de valor primitivo (podemos eliminar el metodo set)
    @Value("Silent Night")
    private String song;

    //Inyeccion automatica por propiedad (podemos eliminar el metodo set)
    @Autowired
    @Qualifier("piano")
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
