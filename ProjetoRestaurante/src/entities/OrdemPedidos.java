package entities;

public class OrdemPedidos {
	
	private Integer quantidade;
	private Double preco;
	
	private Cardapio cardapio;
	
	public OrdemPedidos() {
		
	}

	public OrdemPedidos(Integer quantidade, Double preco, Cardapio cardapio) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.cardapio = cardapio;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	public Double subTotal() {
		return quantidade*preco;
	}
	
	public String toString() {
		StringBuilder a = new StringBuilder(); 
		
		a.append(cardapio);
		a.append(", ");
		a.append(String.format("%.2f", preco));
		a.append(", ");
		a.append("Quantidade: " + quantidade);
		a.append(", ");
		a.append("SubTotal: R$" + String.format("%.2f",subTotal()));
		
		return a.toString();
	} 

}
