package entities;

public class Cliente {
	
	private String nome;
	private String celular;
	private Integer mesa;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String celular, Integer mesa) {
		this.nome = nome;
		this.celular = celular;
		this.mesa = mesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}
	
	public String toString() {
		StringBuilder a = new StringBuilder(); 
		
		a.append("Cliente: " + nome + "\n");
		a.append("Mesa: " + mesa + "\n");
		a.append("Celular: " + celular);
		
		return a.toString();
	} 
	
	

}
