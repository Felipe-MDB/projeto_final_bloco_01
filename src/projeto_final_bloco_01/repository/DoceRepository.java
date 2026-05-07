package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.Doce;

public interface DoceRepository {
	
	// CRUD da Loja
	public void listarTodos();
	public void cadastrar(Doce doce);
	public void atualizar(Doce doce);
	public void deletar(int numero);
	public void procurarPorNumero(int numero);

}
