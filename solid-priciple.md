### SOLID
* These are software design principle that help us to write code that is clean, understandable and maintainable over long period of time.

#### SRP
Every component (module, class, function) should have only one reason to change(responsibility).
All the method of a class should be responsible of doing one thing.

Tip: Always identity reason to change for your component and then reduce them to single one.

##### Symptoms 
* If and switch statement are sign of multiple responsibility
* Monster method
* Code is difficult to read and follow
* Difficulty in writing test cases
* Side effects
* Coupling: Level of inter dependency between components

##### What we get 
* Easy to understand, maintain
* Changes are faster and have minimum risk level
* components are less coupled and more resilient to change
* More testable design


#### OCP:
* Classes, function and module should be open for extension and closed for modification.
* New feature should not modify existing source code.
* A component should be extendable to make it behave in new ways.
##### What we get 
* New feature can be added easily and with minimal changes
* Minimise the risk of regression bugs
* Enforce decoupling by isolating changes in separate component, work along with SRP


#### LSP
* Any object of a type must be substitutable by objects of a derived type without altering the correctness of the program.
* Is-a relationship Too simple to be useful. Think as if we can substitute the derived class in place of base class.
* Incorrect relationship can cause bugs or side effect

##### Symptoms 
* Each time you see Not implemented exception you are violating LSP, ISP
* Type checking also you are violating LSP

##### How to solve
* Eliminate incorrect relationship between objects
* [Tell-Don't-Ask](https://martinfowler.com/bliki/TellDontAsk.html) principle to eliminate type checking and casting
* Ask for help not information. It provide lose coupling.
* Make sure a derived type must substitute its base type completely
* Keep base class small and focused
* Try to use interface and uses has a relationship instead of extends if there is any possibility of code reuse. In another words Replace Extends with a implementation and default implementation with has a relationship.

#### ISP
* Client should not be forced to implement the method that they do not use. 
* ISP reinforce other principle like LSP. By keeping interface small the classes that implement them have higher chance to fully substitute the interface.
* Classes that implement small interfaces are more focused and tends to have single purpose.
* Code become more cohesive and focused

##### Problems on violation of ISP
* Force the client to implement not required  method and bring a lots of dependency. Class that implement this interface is not cohesive. As a consequences it also violating SRP.
* Client of interface may call the unsupported methods and break at run time because they are publicly available. 
##### How to solve
* Break interface
* If you do not control interface then use adapter interface.


#### DIP
* High level module should not depend on low level module. Both should depend on abstraction.
* Abstraction should not depend on details. Details should depend on Abstraction.
* High level and low level module are relative concept. A low low module can be high level module for downstream module.
* High level module : What the software should do. Payment, User Management. These depends upon notification->email, security etc.
* Low level module : How the software should do. e.g : DAO, logging, network communication, IO

##### Symptoms
* Static methods are also sign of coupling
* Changing one module explode breaking changes in other module

##### Problems on violation of DIP
* Testing also become difficult if we violate this principle.
* Highly coupled code. Changing component would force to change the client.

##### DI
* Technique that allow creation of dependent objects outside of a class and provide those object to a class.
* The component does not have the responsibility of creating its own dependency instead these dependency are being injected by someone else.

##### IOC 
* Design principle in which the control of creation of object, configuration and life cycle os passed to a container or framework.
* It make easy to switch between different implementation at run time.
* It make program more modular as the application object creation is being managed by container or framework. Also configuration and life cycle is also managed by container or framework.
* Spring Beans: Object used in application that are managed by spring container.


#### Some common terms
##### Encapsulation
* Encapsulation hides details at the implementation level.
* Encapsulation hides internal working so that you can change it later.
* Expose behavior not data. Object Encapsulate behavior.
* For example, in Java 8, the java.util.HashMap changes its implementation to use a binary tree instead of LinkedList to store objects in the same bucket after a certain threshold.
##### Abstraction
* Abstraction hides details at the design level.
* Abstraction hides complexity by giving you a more abstract picture(generalize view), a sort of 10,000 feet view.
* Coding for interfaces then implementation helps you to write flexible code. Use Map instead of HashMap, Use List instead of ArrayList.
##### Maintainable
* You should be able to change the implementation without changing the client. In another way without changing the client. Class is completely isolation. Your class should not know who is using it.
##### Code fragility
* Tendency of software to break in many places every time it is changed.
##### Code Rigidity
* Every change cascade of subsequent changes in dependent module.
##### Technical debt
* Cost of prioritizing fast delivery over code quality over long period of time.
##### OO Programing
* Using OO language feature.
##### OO Design
* Leveraging OO principle to make your code more effective.
##### Orthogonality
* Changes in one should not force other to change. No hidden side effect.
##### Coherence:
* Every piece of object should focus on solving one problem.
* All method should form a group and should be related to each other in term of what they are doing. 
* Not grab a bag of random stuff like System class in java.
##### Coupling: 
* Two thing are connected with each other in indirect ways. You change one of them and other one have to change.
E.g global variable. You you change one function using global variable there are chances that you have to change the other function which is using the same global variable.
Has side effect
##### Delegation:
* The object that has the information should do the work.
* Ask for help not information. Limit scope of change only at one place.
* Do not get the data and act on it instead ask the object to do thing that contain the data.
##### Clean code
* Maintainable and readable and understandable
* Transparency
* Obvious
* Simplicity

#### How to write Clean code:
* Constant refactoring
* Design patterns
* Unit testing(TDD)
 
#### Benefits lose coupling and high cohesiveness
* Easy to understand
* Transparent
* Easy to Maintain

#### General
* Class name should be noun
* Interfaces should be adjective
* You can not eliminate coupling but we can minimize it.
* Build increment. Big Upfront design are incorrect.
* Reduce coupling so that if we have to change something in an object we do not have to change anything at the usage of that object.


 
  