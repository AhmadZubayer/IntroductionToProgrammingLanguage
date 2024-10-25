#include <stdio.h>

int main()
{
  printf("Hello World!\n");
  printf("I am learning C\nlets see what happens now.");
  //this is a comment, a hidden note for you
  //\n and printf(\n is same. It shows the same output
  /*Normally, we use // for short comments, and this one for longer ones
  Good to know: Before version C99 (released in 1999), you could only use multi-line comments in C.*/

int mynum1=55; printf("\n%d",mynum1); //hopefully this will print num 55
int mynum2=65; printf("\n%d",mynum2); //Outputs 65
int mynum3=75; printf("\n%d",mynum3); //Outputs 75
int mynum4=85; printf("\n%d",mynum4); //Outputs 85
int mynum5=95; printf("\n%d",mynum5); //outputs 95

float myfloatnum1= 5.99;  printf("\n%f", myfloatnum1); //Outputs 5.99
float myfloatnum2= 7.99;  printf("\n%f", myfloatnum2); //Outputs 7.99
float myfloatnum3= 9.99;  printf("\n%f", myfloatnum3); //Outputs 9.99
float myfloatnum4= 11.99; printf("\n%f", myfloatnum4); //Outputs 11.99
float myfloatnum5= 13.99; printf("\n%f", myfloatnum5); //Outputs 13.99

char myLetter1= 'G'; printf("\n%c", myLetter1); //Outputs G
char myLetter2= 'T'; printf("%c", myLetter2);   //Outputs T
char myLetter3= 'A'; printf("%c", myLetter3);   //Outputs A
char myLetter4= 'V'; printf("%c", myLetter4);   //Outputs V

int myNum = 69;
printf("\nMy favorite number is: %d", myNum);
int myNum1 = 15;
char myLetter[] = "OO" ;
printf("\nMy number is %d and my letter is %s", myNum1, myLetter);

int mynum6=12; mynum6= 10; printf("\n\n%d", mynum6); //f you assign a new value to an existing variable, it will overwrite the previous value
int mynum7=13;
int mynum8=14;
mynum7 = mynum8; // Assign the value of mynum8 (14) to mynum7 (13)
printf("\nReplaced value of mynum7 is %d", mynum7); // mynum7 is now 14, instead of 13

//ADD VARIABLES TOGETHER
int x= 15; int y= 15;
int sum= x + y ;
printf("\n\n%d", sum);
int z= 30;
int sum1= x + y + z;
printf("\n%d", sum1);

int x1= 10, y1= 20, z1= 30; //declares more than one variable of the same type, use a comma-separated list
printf("\n%d [more than one variable with a comma]", x1 + y1 + z1);

int x2, y2, z2;
x2= y2= z2= 50; //assigns the same value to multiple variables of the same type
printf("\n%d", x2 + y2 + z2);

float xf= 0.99;
float yf= 1.99;
float zf= 2.99;
float sumf= xf + yf + zf;
printf("\n%f", sumf);
float xf1, yf1, zf1;
xf1=xf;
yf1=xf1;
zf1=sumf;
float sumf1= xf1 + yf1 + zf1;
printf("\nlinked sum is %f", sumf1); //should show result 7.95

// GOOD VARIABLE NAME- 11/01/2024
int minutesPerHour = 60;
printf("\n\nMinutes Per Hour is %d m/h", minutesPerHour);

//REALL LIFE EXAMPLE- 11/01/2024
//Student Data
int   StudentID     = 23547343;
char  StudentName[] = "AHMAD ZUBAYER";    //the name here includes two individual characters. so [] and "" has been used.
int   StudentAge    = 20;
float YearSemester  = 1.2;                //1st Year, 2nd Semester
float CGPA          = 4.00;
printf("\n\nSTUDENT ID: %d", StudentID);
printf("\nSTUDENT NAME: %s",StudentName); // %c won't work here, because the NAME used here has Two individual characters, so %s.
printf("\nSTUDENT AGE: %d", StudentAge);
printf("\nYEAR/SEMESTER: %f", YearSemester);
printf("\nCGPA: %f", CGPA);

// Create integer variables- 11/01/2024
int length = 4;
int width = 6;
int area;
// Calculate the area of a rectangle- 11/01/2024
area = length * width;
// Print the variables
printf("\n\nLength is: %d", length);
printf("\nWidth is: %d", width);
printf("\nArea of the rectangle is: %d", area);

//BASIC FORMAT SPECIFIERS 13-01-2024
int mynum9 = 5;                   // integer
  printf("\n\n%i", mynum9);       // %d and %i goves the same output
float myFloatNum3 = 5.99;         // Floating point number
  printf("\n%f", myFloatNum3);    // %f and %F shows the same output
double myDoubleNum = 19.99;       // Double (floating point number)
  printf("\n%lf", myDoubleNum);
float myFloatNum4= 20.99;
  printf("\n%f", myFloatNum4); 

//Decimal Precision 13-01-2024
float myFloatNum = 3.5;
printf("\n\n%f", myFloatNum);   // Default will show 6 digits after the decimal point
printf("\n%.1f", myFloatNum);   // Only show 1 digit
printf("\n%.2f", myFloatNum);   // Only show 2 digits
printf("\n%.4f", myFloatNum);   // Only show 4 digits 

/*Real-Life Example. Here's a real-life example of using different data types, 
to calculate and output the total cost of a number of items: 13-01-2024*/
int items= 90;
float cost_per_item=9.99;
char currency='$';
float total_cost= items * cost_per_item;
printf("\n\nNumber of Total items: %d", items);
printf("\nCost Per Item: % .2f", cost_per_item);
printf("\nTotal Cost: % .2f %c", total_cost, currency); 

//TYPE CONVERSION 13-01-2024
int x3 = 5;
int y3 = 2;
int sum6 = 5 / 2;       //int sum6 = x3 / y3; would show same result
printf("\n\n%d", sum6); 
                        /*o divide two integers, 5 by 2, 
                        you would expect the result to be 2.5. 
                        But since we are working with integers 
                        (and not floating-point values), 
                        the following example will just output 2*/

//IMPLICIT CONVERSION (Automatic Conversion) 14-01-2024
float myfloat= 9;                 // int to float
printf("\n\n%.4f", myfloat);      //9.0000

int myInt= 9.99;                  // float to int
printf("\n%d", myInt);            //9
/*the compiler automatically converts the int value 9 to a float value of 9.000000.
This can be risky, as you might lose control over specific values in certain situations.
Especially if it was the other way around - 
the following example automatically converts the float value 9.99 to an int value of 9
What happened to .99? We might want that data in our program! So be careful. 
It is important that you know how the compiler work in these situations, 
to avoid unexpected results.*/
//Another example
float sum10 = 5 / 2;
printf("%f", sum10);            // 2.000000
/*Why is the result 2.00000 and not 2.5? 
Well, it is because 5 and 2 are still integers in the division. 
In this case, you need to manually convert the integer values to floating-point values.*/

//EXPLICT CONVERSION (Manual Conversion)
int num1= 5;
int num2= 2;
float sum11= (float) num1 / num2; 
printf("\n%f", sum11);          //2.5000000
printf("\n%.1f",sum11);         //2.5
// Real Life Example (Percentage)
int MaximumScore= 500;
int UserScore= 420;
float percentage= (float) UserScore / MaximumScore * 100;
printf("\nUser Perfomance=%.2f", percentage);

//C CONSTANTS





  
  
  
  
  
  
  return 0;
}
