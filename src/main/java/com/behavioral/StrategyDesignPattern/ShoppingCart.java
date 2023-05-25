package com.behavioral.StrategyDesignPattern;

public class ShoppingCart {
	PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void checkout(double amount) {
		paymentStrategy.pay(amount);
	}
}
