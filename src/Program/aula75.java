package Program;


import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class aula75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Atividade Enumerados
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);

		OrderStatus Status1 = OrderStatus.DELIVERED;
		OrderStatus Status2 = OrderStatus.valueOf("DELIVERED");

		
		System.out.println(Status1);
		System.out.println(Status2);
	}

}
