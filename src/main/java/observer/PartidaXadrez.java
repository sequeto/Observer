package observer;

import java.util.Observable;

public class PartidaXadrez extends Observable {
	private String identificador;
	private String status;
	
	public PartidaXadrez(String identificador) {
		this.identificador = identificador;
		this.status = "Carregando";
	}
	
	public void partidaPronta() {
		this.setStatus("Pronto para Jogar");
        setChanged();
        notifyObservers();
    }
	
	@Override
    public String toString() {
        return this.identificador;
    }
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
