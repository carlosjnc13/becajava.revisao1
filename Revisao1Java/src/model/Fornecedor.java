package model;

public class Fornecedor {
	
	public int Id;
	public String Nome;
	public String CNPJ;
	public String Endereco;
	public int EstoqueID;
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
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public int getEstoqueID() {
		return EstoqueID;
	}
	public void setEstoqueID(int estoqueID) {
		EstoqueID = estoqueID;
	}
	
	

}
