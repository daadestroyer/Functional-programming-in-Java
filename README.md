# Functional-programming-in-Java

### Q. if you add concrete method in interface then what is the difference b/w interface and abstract class<br>
default method present in interface is used to provide dummy 
implementation to all the implementation child classes , even if you are 
adding concrete method in interface still there is a lot of difference 
like interface variable are public static final but you can not declare 
same variable in abstract class , interface can't contain constructor but 
abstract class can , interface with single abstract method can refer lamda 
expression but abstrac class not

# Types of Functional Interface<br>
#### 1. Predicate <br>
#### 2. Function <br>
#### 3. Consumer <br>
#### 4. Supplier <br>
<br>

all these predefined functional interfaces are present in java.util.Function
package 

some example like Comparable contain only one abstract method called 
compareTo()

Runnable contain only one abstract method called run()


#### 1. Predicate

Predicate is a kind of Functional Interface that perform conditional check
and return boolean value based on some condition , we can use predicate 
to check conditional checking . for example employee sal > 10000 or not it 
gives boolean value result called as Predicate . Predicate is a functional 
interface because Predicate interface contains one abstract method called 
test() 

#### complete prototype -> interface Predicate<T>{
	boolean test(T t);
}

