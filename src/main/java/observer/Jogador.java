package observer;

import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer{
	private String nome;
    private String atualizacaoDeStatus;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return this.atualizacaoDeStatus;
    }

    public void entrarNaPartida(PartidaXadrez partida) {
    	partida.addObserver(this);
    }

    public void update(Observable partida, Object arg1) {
        this.atualizacaoDeStatus = this.nome + ", a partida " + partida.toString() + " está prestes a começar.";
        // System.out.println(this.ultimaNotificacao);
    }
}
