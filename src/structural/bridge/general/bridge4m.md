2. Bridge Pattern
   Purpose: Decouples abstraction from implementation, allowing them to evolve independently.

Main Components:

Abstraction (Defines the high-level control)

Implementor (Defines the low-level implementation)

Concrete Implementors (Specific implementations of the interface)

Real-Life Example:

Remote control for different devices – A remote works for both TVs and projectors without changing the remote's design.

Practice: Implement a payment system where the payment method (CreditCard, PayPal) is separate from the transaction type (Online, In-store).

In the Bridge Pattern, we break this dependency by separating the Payment Type (Abstraction) from the Payment Method (Implementation).

Abstraction: Payment (Online, In-Store) → Defines high-level logic

Implementation: PaymentProcessor (CreditCard, PayPal) → Defines how payments are processed

Instead of extending classes for every combination, we use composition by injecting a PaymentProcessor into a Payment object. This way, new payment methods or new payment types can be added independently.