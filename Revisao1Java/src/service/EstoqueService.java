package service;
import repository.EstoqueRepository;
import model.Estoque;

public class EstoqueService {
	
	EstoqueRepository estoque = new EstoqueRepository();
	
	public Estoque getEstoque() {
		return estoque.getEstoque();
	}
	
	public void setEstoque() {
		estoque.setEstoque();
	}

}
