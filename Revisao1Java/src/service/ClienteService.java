package service;
import model.Cliente;
import repository.ClienteRepository;

public class ClienteService {
	
	ClienteRepository cliente = new ClienteRepository();
	
	public Cliente getCliente() {
		return cliente.getCliente();
	}
	
	public void setCliente() {
		cliente.setCliente();
	}

}
