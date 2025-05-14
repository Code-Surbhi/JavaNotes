/*
Reading from a keyboard 

Java provides a class called as SCANNER to read data from all types of sources (learn that later but here we talk about keyboard)

class Scanner -> this class is present in Util package -> and it was provided from version-5 onwards

*/

import java.lang.*;
import java.util.*; //it is important to write this util class unlike lang class
class Keyboard{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    //first Scanner is the class name
    //sc is the referance 
    //other Scanner is the Constructor 
    //System.in is for the keyboard (object assosiated with the keyboard) -> and this object is given to the Constructor. (just as System.out is for the monitor)
    //Whatever you type in goes through a pipe (Scanner acts as a pipe from the keyboard)
    
    int a,b,c;
    System.out.println("Enter 2 numbers");
    a = sc.nextInt(); //this will take an integer data and give it to a -> this method will return the integer value
    b = sc.nextInt();
    c = a+b;
    System.out.println("Sum is "+c); //unlike c/c++ we use + for concatenation instead of ,

    System.out.println("Enter your name");
    String name;
    name = sc.nextLine();
    System.out.println("Welcome "+name);    
  }
}

/*

__Class Scanner__ 

  nextInt()
  nextFloat()
  nextDouble()
  
  next() // if you want to read a charater or a word -> read one word
  nextLine() // if you want to read a sentence -> read multiple words

  nextByte()
  nextShort()
  nextLong()
  nextBoolean()

  hasNextInt() //by reading an integer if you want to confirm the next value that is comming is integer or not -> returns boolean value -> true/false (if its an int you can use it otherwise avoid it)
  hasNextFloat()
*/

/*
  sc.useRadix(2); 
  int x = sc.nextInt();
  System.out.println(x);

  In this bit of code > it reads binary value only and convert into integer
  1010 (input) 
  10 (output)

  123(input)
  X ERROR

*/
