package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Bobinas");
		
		Seller seller = new Seller(8, "Eurípedes", "atendimento@etimpress.com.br", new Date(), 3000.0, obj);
		
		System.out.println(seller);
	}

}
