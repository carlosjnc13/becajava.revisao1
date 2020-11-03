package model;

public class FormaPagamento {
	
	public int Id;
	public String Tipo;
	public int PedidoId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getPedidoId() {
		return PedidoId;
	}
	public void setPedidoId(int pedidoId) {
		PedidoId = pedidoId;
	}
	
	

}
