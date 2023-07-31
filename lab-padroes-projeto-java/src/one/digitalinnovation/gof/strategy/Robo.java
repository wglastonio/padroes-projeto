package one.digitalinnovation.gof.strategy;

public class Robo {
    private Comportamento comportamento;   // comportamento é a strategy

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();;
    }
    
}
