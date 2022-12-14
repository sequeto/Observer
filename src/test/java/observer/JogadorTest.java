package observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class JogadorTest {

	@Test
    public void deveNotificarUmJogador() {
        PartidaXadrez partida = new PartidaXadrez("Xadrez dos Mestres");
        Jogador jogador = new Jogador("Magnus");
        jogador.entrarNaPartida(partida);
        partida.partidaPronta();
        assertEquals("Magnus, a partida Xadrez dos Mestres está prestes a começar.", jogador.getStatus());
    }

    @Test
    public void deveNotificarJogadores() {
    	PartidaXadrez partida = new PartidaXadrez("Final do Campeonato");
    	Jogador jogador = new Jogador("Magnus");
    	Jogador jogador2 = new Jogador("Kasparov");
    	jogador.entrarNaPartida(partida);
    	jogador2.entrarNaPartida(partida);
    	partida.partidaPronta();
    	assertEquals("Magnus, a partida Final do Campeonato está prestes a começar.", jogador.getStatus());
    	assertEquals("Kasparov, a partida Final do Campeonato está prestes a começar.", jogador2.getStatus());
	}

    @Test
    public void naoDeveNotificarJogadores() {
    	PartidaXadrez partida = new PartidaXadrez("Início do Campeonato");
    	Jogador jogador = new Jogador("Magnus");
    	partida.setStatus("Erro ao Carregar");
        assertEquals(null, jogador.getStatus());
    }

    @Test
    public void deveNotificarJogadorPartida1() {
    	PartidaXadrez partida = new PartidaXadrez("Início do Campeonato");
    	PartidaXadrez partida2 = new PartidaXadrez("Final do Campeonato");
    	Jogador jogador = new Jogador("Magnus");
    	Jogador jogador2 = new Jogador("Kasparov");
    	jogador.entrarNaPartida(partida);
    	jogador2.entrarNaPartida(partida2);
    	partida.partidaPronta();
    	assertEquals("Magnus, a partida Início do Campeonato está prestes a começar.", jogador.getStatus());
        assertEquals(null, jogador2.getStatus());
    }

}
