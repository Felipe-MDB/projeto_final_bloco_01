package projeto_final_bloco_01.model;

public abstract class Doce {
	
	
    private String nome;
    private int tipo; // 1 para Artesanal, 2 para Industrializado
    private float preco;
    private int validade;

    public Doce( String nome, int tipo, float preco) {
       
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.validade = 3;
    }

    // Getters e Setters
  
    public String getNome() {
    	return nome;
    	
    	}
    
    public void setNome(String nome) {
    	this.nome = nome;
    	
    	}
    
    public int getTipo() {
    	return tipo; 
    	
    	}
    
    public void setTipo(int tipo)  {
    	this.tipo = tipo; 
    	
    	}
    
    public float getPreco() { 
    	return preco; 
    	
    	}
    
    public void setPreco(float preco) { 
    	this.preco = preco;
  	
    	}
    
    public int getValidade() {
    	return validade;
    	
    	}
    
    public void setValidade(String nome) {
    	this.validade = 3;
    	
    }
    	

    // Método que será sobrescrito (Polimorfismo)
    public void visualizar() {
        String tipoStr = (this.tipo == 1) ? "Artesanal" : "Industrializado";
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipoStr);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Validade: Dias " + 3);
    }

}
