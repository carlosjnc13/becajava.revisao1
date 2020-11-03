package service;
import repository.ProdutoRepository;
import model.Produto;

public class ProdutoService {
	
	ProdutoRepository produto = new ProdutoRepository();
	
	public Produto getProduto() {
		return produto.getProduto();
	}
	
	public void setProduto() {
		produto.setProduto();
	}

}
