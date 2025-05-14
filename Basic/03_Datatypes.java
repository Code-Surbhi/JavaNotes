/*
DATATYPES -> During the execution of the program it should hold the data => variables -> 1. Declare 2. Store the data

Primitive Datatypes
1. Integral -> numeric value without the decimal point -> byte , short , int , long -> of same type but of diferent size
2. Floating point -> numeric value with the decimal point -> float(single pricision) , double(double precision) -> size different 
3. Char -> as c/c++ it has support for only English Language -> ASCII CODE --but--> JAVA has support for other languages also -> UNICODE
           ASCII IS A SUBSET OF UNICODE
4. Boolean -> true and false (here they dont correspond to numeric values -> 0 and 1 -> true is true only and false is false)

Type -> Size -> Range -> Default

byte -> 1 -> -128 to 127 -> 0
short -> 2 -> -32768 to 32767 -> 0
int -> 4 -> -2147483648 to 2147483647  -> 0
long -> 8 -> __ -> 0

float -> 4 -> +- 1.4E-14 to +- 3.4E+38 -> 0.0f
double -> 8 -> +- 439E-324 to +- 1.7E+308 -> 0.0d

char -> 2 -> 0 to 65535 -> \u0000
boolean -> ? -> true / false -> false
*/
/*

Check SIZE and RANGE of datatype 

for every datatype there is a class(has info about their range/number of bytes they may take) available 

cmd prompt -> javap java.lang.Integer
  this gives the information about integer class methods and stuff 
  e.g. -> we can see members with INT_MAX and MIN for knowing the range of datatype
          Bytes data memember -> tells us about the size of the datatype

e.g => 
System.out.println("Int Max" + Integer.MAX_VALUE);
System.out.println("Int Min" + Integer.MIN_VALUE);
System.out.println("Int Bytes" + Integer.BYTES);

output ->
+2147483647
-2147483648
4

similarly for float and bytes ... and all datatypes we will have -> Float.MAX_VALUE and Bytes.BYTES etc..

*/

/*
Variables
1.Declaration -> byte b
                 it will by default have a default value because we didnt assign it
2.Initialisation -> byte b = 5;

# we cant use a value without initialising it
*/

/*
byte b = 5;
int i = 175;
float f = 25.3f;
char c = 'A'

memory is given to the variable during execution of the program (the moment you run the file)
*/

/*
#Java cant store values in datatypes out of their range

byte b = 130 
THIS WILL GIVE AN ERROR as byte can store only 127 value -> hence use another datatype
*/

/*
Variable naming rules =

1. Case sensitive
2. Contains alphabets , nos , _ or $
3. Start with alphabets , _ or $ -> cant start with a number
4. Should not be a keyword
5. Should not be a class name , if cass is also in use
6. No limit on the length of the name
7. Follow camelCase
*/

/*
Literals 


*/
