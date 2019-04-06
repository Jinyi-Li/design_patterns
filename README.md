# design_patterns
Summarize main design patterns with demonstrations in Java

## Strategy Pattern
The strategy may vary in different sub-class objects and may be changed at run time. The idea is to decouple the options (the "strategies") from the whole business logic by interfaces. It's like you play with lego -- the strategies are just small pieces of legos; you can add or remove each part very easily.

When to use?

1. You have some sub-classes from the same super-class.
2. You have a list of strategies for each sub-class to choose from.
3. An sub-class object's strategy may be changed at run time.
4. You want to avoid long conditions and tight coupling between classes and strategies.


## Observer Pattern
An observer subscribes to a subject and received updates for each and every update in that subject. A subject maintains a list of observers and notify them all about every update.

When to use?

1. There is a subject (publisher) and a group of observers (subscribers).
2. Observers want to know every update on that subject.
3. The subject will notify all observers about every update.
4. It's OK for observers to receive (sometimes, too much) redundant, unrelated information, because all update will be sent to all observers with no difference.

## Factory Pattern
A factory creates products in the same super-type but different sub-types based on requirements. The idea is to create and return an instance for users while hiding the details of implementation! A user may call a static method and pass some arguments, then the factory will work to create and return that instance the user wants.

When to use?

1. You have some sub-classes from the same super-class.
2. You want to create objects but don't know which sub-class you should use ahead of time. In other words, the class is chosen at run time.
3. You want to encapsulate the selection of sub-classes.