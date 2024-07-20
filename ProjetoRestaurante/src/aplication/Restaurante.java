package aplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cardapio;
import entities.Cliente;
import entities.Ordem;
import entities.OrdemPedidos;
import entities.enums.OrderStatus;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do cliente: ");
		String clienteN = sc.nextLine();
		System.out.print("Celular do cliente: ");
		String celular = sc.next();
		System.out.print("Mesa: ");
		Integer mesa = sc.nextInt();
		
		Cliente cliente = new Cliente(clienteN, celular, mesa);
		
		OrderStatus status = OrderStatus.valueOf("FINALIZADO");
		Date data = new Date();
		
		Ordem ordem = new Ordem (data, status, cliente);
		
		char encerrado = 0;
		do {
			sc.nextLine();
			System.out.print("Nome do pedido: ");
			String nomeP = sc.nextLine();
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			
			Cardapio cardapio = new Cardapio (nomeP, preco);
			OrdemPedidos ordemPedido = new OrdemPedidos(quantidade, preco, cardapio);
			
			ordem.addPedidos(ordemPedido);
			
			System.out.println("Mesa encerrada? [s/n]");
			encerrado = sc.next().charAt(0);
		}while(encerrado != 's');
		
		System.out.println(ordem);

	}

}
