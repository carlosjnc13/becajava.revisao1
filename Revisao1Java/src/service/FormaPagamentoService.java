package service;
import repository.FormaPagamentoRepository;
import model.FormaPagamento;

public class FormaPagamentoService {
	
	FormaPagamentoRepository formaPagamento = new FormaPagamentoRepository();
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento.getFormaPagamento();
	}
	
	public void setFormaPagamento() {
		
	}

}
