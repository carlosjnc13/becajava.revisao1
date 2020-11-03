package model;

public class Produto {
	
	public int Id;
	public String Nome;
	public String TipoProduto;
	public float Valor;
	public int PedidoId;
	public int EstoqueId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTipoProduto() {
		return TipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		TipoProduto = tipoProduto;
	}
	public float getValor() {
		return Valor;
	}
	public void setValor(float valor) {
		Valor = valor;
	}
	public int getPedidoId() {
		return PedidoId;
	}
	public void setPedidoId(int pedidoId) {
		PedidoId = pedidoId;
	}
	public int getEstoqueId() {
		return EstoqueId;
	}
	public void setEstoqueId(int estoqueId) {
		EstoqueId = estoqueId;
	}
	
	

}
