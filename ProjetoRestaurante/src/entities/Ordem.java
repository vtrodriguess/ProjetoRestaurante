package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Ordem {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date data = new Date();
	private OrderStatus status;
	
	private Cliente cliente;
	
	private List<OrdemPedidos> items = new ArrayList<>();
	
	public Ordem() {
		
	}

	public Ordem(Date data, OrderStatus status, Cliente cliente) {
		this.data = data;
		this.status = status;
		this.cliente = cliente;
	
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemPedidos> getPedidos() {
		return items;
	}
	
	public void addPedidos (OrdemPedidos pedidos) {
		items.add(pedidos);
	}
	
	public void removePedidos (OrdemPedidos pedidos) {
		items.remove(pedidos);
	}
	
	public double Total() {
		double sum = 0;
		for(OrdemPedidos x: items) {
			sum += x.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder a = new StringBuilder(); 
		
		a.append(cliente + "\n");
		a.append("Data: " + sdf.format(data) + "\n");
		a.append("Status da mesa: " + status + "\n");
		for(OrdemPedidos b: items) {
			a.append(b + "\n");
		}
		a.append("Total: R$" + Total());
		
		return a.toString();
	} 
	

	
	
	


}
