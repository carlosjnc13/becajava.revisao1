package service;
import repository.PedidoRepository;
import model.Pedido;

public class PedidoService {
	
	PedidoRepository pedido = new PedidoRepository();
	
	public Pedido getPedido() {
		return pedido.getPedido();
	}
	
	public void setPedido() {
		pedido.setPedido();
	}

}
