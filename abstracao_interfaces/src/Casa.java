import java.util.ArrayList;
import java.util.List;

public class Casa {

    private List<Quarto> quartos;

    public Casa() {
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }
}

