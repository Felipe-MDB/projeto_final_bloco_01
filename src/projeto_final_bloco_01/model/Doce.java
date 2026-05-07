package projeto_final_bloco_01.model;

public abstract class Doce {
	
	private int id;
    private String nome;
    private int tipo; // 1 para Artesanal, 2 para Industrializado
    private float preco;
    

    public Doce(  int id, String nome, int tipo, float preco) {
       
    	this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        
    }

    // Getters e Setters
    public int getId() { 
    	return id; 
    	}
    
    public void setId(int id) { 
    	this.id = id; 
    	}
   
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
    
  
    	
    
    	

    // Método que será sobrescrito (Polimorfismo)
    public void visualizar() {
        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do Produto:");
        System.out.println("***********************************************************");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Preço: " + this.preco);
        System.out.println("Validade: Dias " + 3);
    }
       
    

}
