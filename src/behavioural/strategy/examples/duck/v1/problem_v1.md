- The duck behaviours are vary depend on the real duck, each time we change the real duck behaviours, we need to change the real Duck
 	=> violate [OCP]
 	=> hard to maintain [Maintainable]
 	
- The real duck can not replace the base duck at runtime without impact to the real behaviours (behaviours are not compatible) 
	=> violate [LSP]
	=> hard to maintain [Maintainable]
	
- Each time having new duck, need to implement new Duck with new/same other behaviour.
	=> Code is not [Reusable]
	
- Fly and quack behaviour can not be changed at the runtime.
	=> violate [DIP]

Reusable
Extensible
Maintainable