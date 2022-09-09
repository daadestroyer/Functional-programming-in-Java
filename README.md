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

@FunctionalInterface
interface eligibleForVote{
	public boolean eligibleForVote(int age);
}
@FunctionalInterface
interface findLength{
	public boolean findLength(String name);
}
public class App01 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (age) -> age > 17;
		System.out.println(p1.test(20));
		
		Predicate<String> nm1 = (name)->name.length()>5;
		System.out.println(nm1.test("shubham"));
	}
}

#### 2. Function
Function is a kind of Functional Interface which two argument one as 
input and one as return type , Function can return any type value just 
opposite to predicate it is

interface Function<T,R>{
	<R> apply(T t);	
}

difference b/w predicate and function is predicate always return boolean 
type value but function can return any type of value 

predicate contain one abstract method called test() which can perform 
operation and can return boolean value

function contain one abstract method called as apply() which can perform 
operation and can return any type of value


Q. Write a function that take string and return length

Function<String,Integer> f1 = (s)->s.length()


#### difference b/w predicate and function
1. To implement conditional check , we should go for predicate
   <br>
   To perform certaiin operation and to return some result we should go 
   for Function
<br>
2. Predicate can take one type of parameter and which represent input type 
   of argument Predicate<T>
   <br>
   Function can take two type of parameter and in which one represent 
   input argument and second represent return type
<br>
3. predicate interface defines one abstract method called test()
   Function interface defines one abstract method called apply()
<br>
4. public boolean test(T t)
   public R apply(T t)
<br>
5. Predicate can return only boolean value
   Function can return any type of value


#### 3. Consumer
Consumer is a type of Functional Interface that contain one abstract method 
called accept() and it accept value of any type and won't return anything

interface Consumer<T>{
	void accept(T t);
}

this T type parameter is input type parameter

#### 4. Supplier
Supplier is a type of Functional Interface that contain one abstract method 
called get() which won't take anything as input but can return anything of 
anytype

interface Supplier<R>{
	R get();
}

get() won't take any args and return some value.
