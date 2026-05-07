package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;

import projeto_final_bloco_01.model.Doce;
import projeto_final_bloco_01.repository.DoceRepository;

public class DoceController implements DoceRepository {
	
	// collection para armazenar os produtos
	private List<Doce> listaDoces= new ArrayList<Doce>();
	int numero = 0;

	@Override
	public void listarTodos() {
		for (var doce : listaDoces) {
			doce.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Doce doce) {
		listaDoces.add(doce);
		System.out.printf("O produto foi cadastrado com sucesso!", doce.getNome());
		
	}
	
		
	@Override
	public void atualizar(Doce doce) {
		var buscaDoce = buscarNaCollection(doce.getId());
		
		if (buscaDoce != null) {
			
		
			listaDoces.set(listaDoces.indexOf(buscaDoce), doce);
			doce.visualizar();
		}else
			System.out.println("O doce número: " + numero + "não foi encontrado!");
	}

	@Override
	public void deletar(int numero) {
		
	}

	public void buscarNaCollection(String nome) {
	    // Lógica para buscar o doce na lista
	}
		
	

	@Override
	public void procurarPorNumero(int numero) {
		
	}
	
	// Método auxiliar para buscar na Collection
    public Doce buscarNaCollection(int numero) {
        for (var doce : listaDoces) {
            if (doce.getId() == numero) {
                return doce;
            }
        }
        return null;
	
    }  
}
