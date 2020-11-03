package service;
import repository.EnvioRepository;
import model.Envio;

public class EnvioService {
	
	EnvioRepository envio = new EnvioRepository();
	
	public Envio getEnvio() {
		return envio.getEnvio();
	}
	
	public void setEnvio() {
		envio.setEnvio();
	}

}
