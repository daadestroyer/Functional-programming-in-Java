# Functional-programming-in-Java

### <b> Q. if you add concrete method in interface then what is the difference b/w interface and abstract class<br></b>
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

### <b> Q. difference b/w predicate and function is predicate always return boolean type value but function can return any type of value </b>

predicate contain one abstract method called test() which can perform 
operation and can return boolean value

function contain one abstract method called as apply() which can perform 
operation and can return any type of value


### <b> Q. Write a function that take string and return length </b>

Function<String,Integer> f1 = (s)->s.length()


### <b> difference b/w predicate and function </b>
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


#### <b> 3. Consumer </b>
Consumer is a type of Functional Interface that contain one abstract method 
called accept() and it accept value of any type and won't return anything

interface Consumer<T>{
	void accept(T t);
}

this T type parameter is input type parameter

#### <b> 4. Supplier </b>
Supplier is a type of Functional Interface that contain one abstract method 
called get() which won't take anything as input but can return anything of 
anytype

interface Supplier<R>{
	R get();
}

get() won't take any args and return some value.

# Streams API<br>
If we want to process objects from collection then we should have to use 
Streams

### <b>  Q. Difference b/w IO Streams and Collection Streams<br> </b>
Ans : IO Streams means for representing data wrt to file IO operations
but util package streams can be used to process data from collection

### <b> Q. Difference b/w Collection & Stream<br> </b>
Ans: If we want to represent a group of objects as a single entity then we 
should go for Collection object

If we want to process Collection object and perform some operations then 
we should go for Streams

Stream is an interface present in java.util.Stream package , any 
Collection object can call stream() default method 


Stream s = c.stream(); // c is a Collection object

Once we can get Stream object of any Collection then we can process that 
Collection object , and that processing contains two steps:

### <b> 1. Configuration <br> </b>

	a) Filter mechanism -> we perform filteration based on some 
 	   boolean condition , in filteration we are taking out some 
	   elements at that time we have to use map()

example : alist.streams(num->num%2==0).collect(Collectors.toList());
	
	b) Map mechanism -> In map we are making changes in Collection 
	   object and in this case we are not filtering elements then we 
	   have to use map()   

example : alist.streams().map(num->num*2).collect(Collectors.toList());

### <b> 2. Processing</b>

#### <u> Processing by sorted() method<br>	</u>

* We can use sorted() method to sort elements inside Stream
* We can sort either based on default natural sorting order or 
based on our own customized sorting order specified by comparator
object<br> 
		1. sorted() => for default natural sorting order
		<br>
		2. sorted(Comparator c) => for customized natural sorting order

for string default natural sorting order is based on alphabetical order of elements


ArrayList<Integer> alist = new ArrayList<Integer>(); <br>
alist.add(0);<br>
alist.add(10);<br>
alist.add(20);<br>
alist.add(5);	<br>
alist.add(15);<br>
alist.add(25);<br>
System.out.println(alist); // [0,10,20,25,5,15];<br>

List<Integer> resList = alist.stream().sorted().collect(Collectors.toList());<br>
System.out.println(resList); // [0,5,10,15,20,25]; (ascending order)<br>


List<Integer> resList2 = alist.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());<br>
System.out.println(resList2); // [25,20,15,10,5,0]; (descending order)<br>


<b>// find min and max in the list<br><br></b>
<b>min(Comparator C)</b><br>
returns minimum values according to specified comparator<br><br>
<b>max(Comparator C)</b><br>
returns maximum values according to specified comparator

	ArrayList<Integer> lst = new ArrayList<Integer>();
	lst.add(0);
	lst.add(10);
	lst.add(20);
	lst.add(5);
	lst.add(15);
	lst.add(25);

	Integer minVal = lst.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(minVal);

	Integer maxVal = lst.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(maxVal);

<b>Processing by using forEach() method : </b><br>
This method won't return anything<br>

This method can take Lambda expression as argument and apply that  lambda expression for each elements present in the Stream

	ArrayList<String> lst = new ArrayList<String>();
	lst.add("Shubham");
	lst.add("Shubhanshu");
	lst.add("Ansh");