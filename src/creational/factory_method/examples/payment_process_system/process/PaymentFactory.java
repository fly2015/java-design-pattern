package creational.factory_method.examples.payment_process_system.process;

import creational.factory_method.examples.payment_process_system.method.PaymentMethod;

public abstract class PaymentFactory {
    public abstract PaymentMethod getPaymentMethod();
}

//Each subclass (factory) overrides the factory method to return a specific product.
//Encapsulation of object creation: The client doesn’t directly instantiate CreditCardPaymentProcessor, PayPalPaymentProcessor, etc.
//Extensibility: If we add a new payment method (e.g., Bitcoin), we only need to create a new BitcoinPaymentFactory without modifying existing code

//Factory Method: Relies on inheritance and polymorphism, where each subclass provides its own factory implementation.

// Creator -> concrete Creator
// Product -> concrete Products

// Each subclass (factory) overrides the factory method to return a specific product.
// Encapsulation of object creation: The client doesn’t directly instantiate CreditCardPaymentProcessor, PayPalPaymentProcessor, etc.
// Extensibility: If we add a new payment method (e.g., Bitcoin), we only need to create a new BitcoinPaymentFactory without modifying existing code