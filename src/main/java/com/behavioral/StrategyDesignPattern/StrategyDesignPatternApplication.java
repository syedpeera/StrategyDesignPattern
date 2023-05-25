package com.behavioral.StrategyDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyDesignPatternApplication.class, args);
		ShoppingCart cart = new ShoppingCart();
		PaymentStrategy creditCardStrategy = new CreditCardStrategy("1234 5678 9101 2345", "123");
		cart.setPaymentStrategy(creditCardStrategy);
		cart.checkout(100);
		
		PaymentStrategy paypalStrategy = new PayPalStrategy("example@gmail.com","password@123");
		cart.setPaymentStrategy(paypalStrategy);
		cart.checkout(200);
	}
}
