#Definition:
The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. 
It separates the requester of an action from the object that performs the action, allowing for greater flexibility and extensibility in code design.

#Components:
Command: This is the interface that declares a method for executing a command. It usually includes a single method, such as execute(), which encapsulates the action to be performed.
Concrete Command: Concrete Command classes implement the Command interface. Each Concrete Command represents a specific action to be taken on a Receiver (an object that performs the action).
Receiver: The Receiver is the object that performs the actual action. It contains the business logic or functionality that is invoked by the Concrete Command objects.
Invoker: The Invoker is responsible for invoking commands. It receives a command and asks it to carry out a request by calling its execute() method. 
It doesn't know how the command will be executed, nor does it have knowledge of the Receiver.


#Example Explanation:
In the provided Java example:
Command: The Command interface declares the execute() method, defining the contract for all concrete commands.
Concrete Command: LightOnCommand and LightOffCommand are Concrete Command implementations. Each encapsulates a specific action (turnOn() and turnOff()) to be taken on the Light.
Receiver: The Light class acts as the Receiver, containing the methods turnOn() and turnOff() representing the actions to be performed.
Invoker: The RemoteControl class serves as the Invoker. It has a method setCommand() to set the command to be executed and pressButton() to invoke the command's execute() method.
Client: In the Main class, the client creates the Receiver (Light), Concrete Commands (LightOnCommand and LightOffCommand), and Invoker (RemoteControl). It sets the commands to the invoker and invokes them.

#Benefits:
Decoupling: It separates the requester of an action from the object that performs the action, promoting loose coupling between objects.
Extensibility: New commands can be added without changing existing client or receiver code, promoting an open/closed principle.
Undo Operations: Commands can be stored for undo functionality, enabling rollback of actions.
Logging and Queuing: Commands can be logged or queued for auditing or asynchronous processing.

Overall, the Command Pattern is useful in scenarios where you need to decouple senders and receivers of requests, support undoable operations, or implement logging and queuing of requests.