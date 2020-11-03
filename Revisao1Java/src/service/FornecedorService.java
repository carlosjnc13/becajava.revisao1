package service;
import repository.FornecedorRepository;
import model.Fornecedor;

public class FornecedorService {
	
	FornecedorRepository fornecedor = new FornecedorRepository();
	
	public Fornecedor getFornecedor() {
		return fornecedor.getFornecedor();
	}
	
	public void setFornecedor() {
		fornecedor.setFornecedor();
	}
	

}
