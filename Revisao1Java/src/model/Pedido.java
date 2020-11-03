package model;

public class Pedido {
	
	public int Id;
	public String NumPedido;
	public int ClienteId;
	public int ProdutoId;
	public int PagamentoId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNumPedido() {
		return NumPedido;
	}
	public void setNumPedido(String numPedido) {
		NumPedido = numPedido;
	}
	public int getClienteId() {
		return ClienteId;
	}
	public void setClienteId(int clienteId) {
		ClienteId = clienteId;
	}
	public int getProdutoId() {
		return ProdutoId;
	}
	public void setProdutoId(int produtoId) {
		ProdutoId = produtoId;
	}
	public int getPagamentoId() {
		return PagamentoId;
	}
	public void setPagamentoId(int pagamentoId) {
		PagamentoId = pagamentoId;
	}
	
	

}
