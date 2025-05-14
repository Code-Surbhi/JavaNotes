/* 

JDK - Java development kit
JRE - Java runtime environment
JVM - Java virtual machine -> it has interpreter it will convert bytecode to machinecode and execute

JDK (development and tools) -> has -> JRE (Java class library) -> has -> JVM 

First.java ----javac (JDK)----> First.class
(for compilation purposes we use javac) 
(compiler will check if the .java file is error free and it generates a bytecode file(.class) as a seperate file)
to run the First.class file we will have to run it by command -> "Java First" (runtime environment)
Java is the runtime environment -> it will use jre and internally would be done by jvm

IN TERMINAL ->

1. md MyJava -> create a folder named "MyJava"
2. cd MyJava -> go to that folder 
3. Create a Java file in notepad - write code and save it (name used in this example -> MyFirst.java)
4. javac Myfirst.java (name_of_the_file.java) -> compiles the file => isse .class files banegi
5. type MyFirst.java -> shows the code written in MyFirst.java file
6. type Myfirst.class -> shows whats written in compiled file (bytecode)
7. java Myfirst -> runs the file and shows the output => Calls First.main()
8. cls -> clear the terminal

Name of the File should be same as the name of the class -> class Myfirst -> name of file should be MyFirst.java
  when the class is declared as public -> public class Second -> and file name is First.java => ERROR WILL ARRISE
  in such a case its a must that the file name and class name should match and be same -> otherwise we can have different names -> but we try to generalise

Every java program is inside of a class (nothing is outside of it)
*/

/*
Skeleton of Java Program

First.java (saved name of the file)

import java.lang.* -> this is a built in lang package -> important package -> even if you dont import the package by writing this line -> it will automatically get imported

Unlike C/C++ -> instead of main function we have main method here
*/

// Name of the file saved will be First.java
import java.lang.*;

class First{
  public static void main (String []args){
    System.out.println("HELLO SURBHI");
  }
}

/*
  public -> if you want anything in the class to be accessible outside -> then it should be public -> when JVM will execute the program it will call inside the main method
            and since the main method is inside a class -> it should be able to see the main method => hence public

  static -> we normally cant use a class unless we have created its object -> if we want to use something in a class without creating its object then it should be declared as static 
            we can then directly call without creating an object just by using class name -> JVM has to call the main method without creating an object => calls by "First.main()" -> it calls main method like this without creating its object

  void -> main always void because unline c/c++ we cant write int or any other thing here

  String []args -> *(optional) -> command line arguments -> but in java whether you take it or not you must write the whole thing as it is 
                                  if not written then on compilation it shows no error but wont execute if this line is changed even a little bit
*/

/*

When we compile, class file will have the same name as class name
Myfirst.java -> compile
and if it has 2 classes namely
1. class Myfirst -> MyFirst.class
2. class MySecond -> MySecond.class
additional 2 files will be created after compilation

*/

public static void main(String args[]){
  System.out.println("Hello Surbhi");
  System.out.println(args[0]);
  System.out.println(args[2]);
}
/*
1) for this if we compile and run program normally -> like -> Java First (ERROR will arrise because arguments are not given) 

2) but with inputs => java First Bye all 
bye will be taken as a value for args[0] and all as for args[1]
these arguments are taken as command line arguments
*/


