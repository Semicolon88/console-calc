/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcarray;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class CalcArray
{
    int sub=0;
    //Method decleration to sum through an array of feilds
    public static int addition(){
        try{
            //Declare feilds
            int n, sum = 0,operand;
            //Create Scanner object
            Scanner s = new Scanner(System.in);
            System.out.print("================================================= \n");
            System.out.print("| Enter no. of parameters you want to calculate  |\n");
            System.out.print("================================================= \n");
            //Instatiate feild(n) to accept input from user.feild(n) = no. of operands to be calculated
            n = s.nextInt();
            //create an array object of size feild(n) to store the operands to be calculated
            int a[] = new int[n];
            System.out.println("Enter all the parameters:");
            //iterate through the feilds of thr object array to input values
            for(int i = 0; i < n; i++)
            {
                
                a[i] = s.nextInt();
                //sum through array
                sum = sum + a[i];
            }
            //Display result 
            System.out.println("Sum: "+sum);
            }catch(Exception e){ 
                System.out.println("ERROR!");
            }
        return 0;
    }
    //Method decleration to subtract through an array of feilds
    public int subtraction(){
        try{
            System.out.print("================================================= \n");
            System.out.print("| Enter no. of parameters you want to calculate  |\n");
            System.out.print("================================================= \n");
            //Create Scanner object 
            Scanner s=new Scanner(System.in);
            //Instatiate feild(n) to accept input from user.feild(n) = no. of operands to be calculated
            int n=s.nextInt();
            //create an array object of size feild(n) to store the operands to be calculated
            int[] a=new int[n];
            //iterate through the feilds of the array to input values
            for(int i=0;i<a.length;i++)
            {
                a[i]=s.nextInt();
            }
            //sort array values in increasing order
            Arrays.sort(a);
            // Iterate through array from end to start after sorting
            for(int i=a.length-1;i>=0;i--){
                
               // subtract the values in first value from second value(descending order)
               sub=sub-a[i];
               //For when the result of subtraction is "-",change to "+"
               if(i==(a.length-1)){ 
                   //let the result of subtraction be multiplied by "-1"
                   sub=-1*sub;
                }
            }
            // Display result
            System.out.println("Result = "+sub);
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method declearation to mutiply thhrough the feilds of an array
    public int multiply(){
        try{
            System.out.print("================================================= \n");
            System.out.print("| Enter no. of parameters you want to calculate  |\n");
            System.out.print("================================================= \n");
            //Create Scanner object 
            Scanner s=new Scanner(System.in);
            //Instatiate feild(n) to accept input from user.feild(n) = no. of operands to be calculated
            int n=s.nextInt();
            //create an array object of size feild(n) to store the operands to be calculated
            int[] a=new int[n];
            //iterate through the feilds of the array to input values
            for(int i=0;i<a.length;i++){  
                a[i]=s.nextInt();
            }
            //Insatiate multiplier field and set to "1" to return feild *multiplier feild = feild
            int result = 1;
            //Iterate through array and multiply
            for(int value : a){
                result =result * value;
            }
            //Display result
            System.out.println("Result = " +result);
        }catch(Exception e){
            System.out.println("ERROR");
        }
        return 0;
    }
    //Method to divide two operands
    public int divide(){
        try{
            System.out.print("================================================= \n");
            System.out.print("| Enter no. of parameters you want to calculate  |\n");
            System.out.print("================================================= \n");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter operands to be divided");
            //Declare feilds
            int val1,val2,result = 0;
            //Instatiate feild(val1) to accept input from user.feild(val1) = operand to divide
            val1 = sc.nextInt();
            //Instatiate feild(val2) to accept input from user.feild(val2) = operand to divide
            val2 = sc.nextInt();
            //Check if feild(val1) is less than feild(val2) and let the result be equals greater feild/lesser feild
            if(val1 < val2){
               result = Math.abs(val2 /val1);
            }else{
               result = Math.abs(val1/val2);
            }
            //Dispaly result
            System.out.println("Result = " + result);
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to calculate the Lcm of Integers
    public int lcm(){
        try{
           //declare feilds
           int number1,number2,Hcf =0;
           //create Scanner object
           Scanner sc = new Scanner(System.in);
           //instantiate feilds(number1 & number2) to accept input from command
           number1 = sc.nextInt();
           number2 = sc.nextInt();
           //iterate through the feilds(number1 & number2) with a counter feild which is less or equal each of the feilds
            for(int i = 1;i<=number1 && i<=number2; i++){
               //check if feid(number1) & feild(number2) divided by counter feild has no remainder
               if(number1 % i == 0 && number2 % i == 0){
                   
                  //instantiate feild(gcd) to be equal to the counter varaible where the two feilds csn longer be divided with no remainder
                  Hcf = i; 
                }
            }
            //instantiate feild to be equal the prodeuct of feild(number1&,number2) divide by feild(hcf)
            int lcm = number1 * number2 / Hcf;
            //display result
            System.out.println(lcm);
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to check the cuberoot of an operand
    public double cuberoot(){
        try{
            System.out.print("=================\n");
            System.out.print("| ENTER OPERAND |\n");
            System.out.print("=================\n");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //declearing feild and instatiate to accept input from command
            double operand = sc.nextInt();
            //declare feild an invoke cbrt()of operand methhod in lang.Math as its value to return cube root of operand
            double result = Math.cbrt(operand);
            //Display result
            System.out.println("=================================================");
            System.out.println("| The cube root of "+operand + "= "+ result +   "|");
            System.out.println("=================================================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to check the cuberoot of an operand
    public double squareroot(){
        try{
            System.out.print("=================\n");
            System.out.print("| ENTER OPERAND |\n");
            System.out.print("=================\n");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //declearing feild and instatiate to accept input from command
            double operand = sc.nextInt();
            //declare feild an invoke sqrt()of operand methhod in lang.Math as its value to return the square root of operand
            double result = Math.abs(Math.sqrt(operand));
            //Display result
            System.out.println("=================================================");
            System.out.println("| The Square root of "+operand + "= "+ result +   "|");
            System.out.println("=================================================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to check the raise to power the number given of an operand  
    public double power2(){
        try{
            System.out.println("=================");
            System.out.println("| ENTER OPERAND |");
            System.out.println("=================");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //declearing feild and instatiate to accept input from command
            int operand = sc.nextInt();
            System.out.println("============");
            System.out.println("| POWER OF |");
            System.out.println("============");
            double power =sc.nextInt();
            //declare feild an invoke pow()methhod in lang.Math as its value to return the power of operand
            double result = Math.abs(Math.pow(operand,power));
            //Display result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to check sin of an operand
    public double sin(){
        try{
            System.out.print("=================");
            System.out.print("| ENTER OPERAND |");
            System.out.print("=================");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //declearing feild an instatiate to accept input from command
            double operand = sc.nextInt();
            //declearefeild and invoke sin()method in lang.Math to return the sin of operand
            double result = Math.abs(Math.sin(operand));
            //Dispaly result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //method decleration to return the arche sin of operand
    public double asin(){
        try{
            System.out.print("=================");
            System.out.print("| ENTER OPERAND |");
            System.out.print("=================");
            //create Scanner object
            Scanner sc = new Scanner(System.in);
            //declear feild and instantiate to accept input from command
            double operand = sc.nextInt();
            //declare feild and invoke asin() method as its value to return the arche sin of operand
            double result = Math.abs(Math.asin(operand));
            //Dispaly result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //method decleration to return the arche sin of operand
    public double cos(){
        try{
            System.out.print("=================");
            System.out.print("| ENTER OPERAND |");
            System.out.print("=================");
            //create Scanner object
            Scanner sc = new Scanner(System.in);
            //declear feild and instantiate to accept input from command
            double operand = sc.nextInt();
            //declare feild and invoke cos() method as its value to return the arche cos of operand
            double result = Math.abs(Math.cos(operand));
            //Display result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //method decleration to return the arche sin of operand
    public double acos(){
        try{
            System.out.print("=================\n");
            System.out.print("| ENTER OPERAND |\n");
            System.out.print("=================\n");
            //create Scanner object
            Scanner sc = new Scanner(System.in);
            //declear feild and instantiate to accept input from command
            double operand = sc.nextInt();
            //declare feild and invoke acos() method as its value to return the arche cos of operand
            double result = Math.abs(Math.acos(operand));
            //Display result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //method decleration to return the exponential of operand
    public double exponential(){
        try{
            System.out.print("=================\n");
            System.out.print("| ENTER OPERNAD |\n");
            System.out.print("=================\n");
            //create Scanner object
            Scanner sc = new Scanner(System.in);
            //declear feild and instantiate to accept input from command
            double operand = sc.nextInt();
            //declare feild and invoke exp() method as its value to return the exponential of operand
            double result = Math.abs(Math.exp(operand));
            //Display result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //method decleration to return the log in base 10 of operand
    public double log(){
        try{
            System.out.print("=================\n");
            System.out.print("| ENTER OPERAND |\n");
            System.out.print("=================\n");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //dwclare feild to accept input from command
            double operand = sc.nextInt();
            //declare feild and invoke log10() method from lang.Math to return the log of operand in base 10
            double result = Math.abs(Math.log10(operand));
            //Display result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //method decleration to round off an operand
    public double round(){
        try{
            System.out.print("=================\n");
            System.out.print("| ENTER OPERAND |\n");
            System.out.print("=================\n");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //dwclare feild to accept input from command
            float operand = sc.nextFloat();
            //declare feild and invoke round() method from lang.Math to round off a double/float value of operand to the nearest int value
            int result = Math.abs(Math.round(operand));
            //Display result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //method decleration to return the gretest int less or equal to operand
    public double ceil(){
        try{
            System.out.print("=================\n");
            System.out.print("| ENTER OPERAND |\n");
            System.out.print("=================\n");
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //dwclare feild to accept input from command
            double operand = sc.nextFloat();
            //declare feild and invoke ceil() method from lang.Math to return the gretest int less or equal to operand
            double result = Math.abs(Math.ceil(operand));
            //Display result
            System.out.println("=========================");
            System.out.println("| Result = " +result+   "|");
            System.out.println("=========================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to check if operand is prime
    public int isPrime(){
        try{
            System.out.println("=====================");
            System.out.println("|   ENTER OPERNADS  |");
            System.out.println("=====================");
            //Declare feilds
            int operand,rand =0,number=0;
            //Create Scanner object
            Scanner sc = new Scanner(System.in);
            //Instantiate feild(operand) to accept input from command
            operand = sc.nextInt();
            //instatiate feild(rand) to be half of feild(operand)
            rand = operand/2;
            //Check if operand is equal 0 or 1
            if (operand==0||operand==1){
                //Display text if the condition is true
                System.out.println("====================================");
                System.out.println("|"+operand+"is not a prime number  |");
                System.out.println("====================================");
            }else{
                //otherwise,iterate through the operand till divider feild is less or equal to half of operand
                for(int i=2;i<=rand;i++){
                    //when operand * divider variable divide by 100 is equal 0
                    if(operand%i==0){
                       //Display
                       System.out.println("====================================");
                       System.out.println("|"+operand+" is not a prime number  |");
                       System.out.println("====================================");
                       //prime number return true
                       number =1;
                       break;
                    }
                }
            }
            //when prime number is false
            if(number==0){
                //Display
                System.out.println("====================================");
                System.out.println("|"+operand + "is a prime number  |");
                System.out.println("====================================");
            }
        }catch(Exception e){
            System.out.println("ERROR!");
        }
            return 0;
        }
    //Method to check the highest common factor
    public int Hcf(){
        try{
            int number1,number2,gcd =1;
            System.out.println("=====================");
            System.out.println("|   ENTER OPERNADS  |");
            System.out.println("=====================");
            Scanner sc = new Scanner(System.in);
            number1 = sc.nextInt();
            number2 = sc.nextInt();
            for(int i = 1;i<=number1 && i<=number2; i++){
                //check if feid(number1) & feild(number2) divided by counter feild has no remainder
                if(number1 % i == 0 && number2 % i == 0){
                   //instantiate feild(gcd) to be equal to the counter varaible where the two feilds csn longer be divided with no remainder
                   gcd = i; 
                }
            }
            System.out.println("=====================");
            System.out.println("|RESULT =" + gcd + "|");
            System.out.println("=====================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to check if operand is palindrome
    public double isPalindrome(){
        try{
            System.out.print("=================\n");
            System.out.print("| Enter operand |\n");
            System.out.print("=================\n");
            //declear feilds
            int operand,operand2,pali,number = 0, result;
            //create Scanner object
            Scanner sc = new Scanner(System.in);
            //instantiate feild(Operand) to accept input from command
            operand = sc.nextInt();
            //instantiate feild holder to hold value of feild
            operand2 = operand;
            pali = operand;
            //store reversed integer in a feild
            while(operand > 0){
                
                result = operand%10;
                number = (number*10)+result;
                operand = operand/10;
            }
        //check if operand and reverse integer are equal  
        if(pali == number){
            //declare and instantiate divider feild to be 1/2 of operand
            int rand = operand/2;
            //check if operand is 0 or 1
            if (operand==0||operand==1){
                //when condition is true,display
                System.out.println("=======================================================");
                System.out.println("|" +operand2 + "is a palindrome and not a prime number |");
                System.out.println("========================================================");
            }else{
               //when codition is not true,iterate and divide operand by divider feild till operand becomes indivisible
               for(int i=2;i<=rand;i++){
                   //check if the result of the operand * divider feild divide by 100 is equal 0
                   if(operand%i==0){
                       //when condition is true,diplay
                    System.out.println("=======================================================");
                    System.out.println("|" +operand2 + "is a palindrome and not a prime number |");
                    System.out.println("========================================================");
                   //feild(number) should change to 1
                   number =1;
                   //Stop iteration if condtion is met
                   break;
               }
            }
               //check if feild(number) is equal 0
               if(number==0){
                   //when codtion is true,display
                System.out.println("=======================================================");
                System.out.println("|" +operand2 + "is a palindrome and not a prime number |");
                System.out.println("========================================================");
            }
            }
            }else {
            //when condition is not met,check if operand is equal 0 or 1
            if (operand2==0||operand2==1){
                //when condition is met,display
                System.out.println("=======================================================");
                System.out.println("|" +operand2 + "is a palindrome and not a prime number |");
                System.out.println("========================================================");
            }else{
               int rand = operand2/2;
               for(int i=2;i<=rand;i++){
               if(operand%i==0){
                   System.out.println("============================================================");
                   System.out.println("|" +operand2 + "is a not palindrome and not a prime number |");
                   System.out.println("============================================================");
                   number =1;
                   break;
               }
            }
                if(number==0){
                   System.out.println("====================================================");
                   System.out.println("|" +operand2 + "is a palindrome and a prime number |");
                   System.out.println("====================================================");
                }
            }
        }
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method decleration to to return the average of an array of feilds
    public double average(){
        try{
            //feild decleration
            int number,sum=0,i;
            float average;
            //create Sxanner object
            Scanner sc = new Scanner(System.in);
            //instantiate feild(number) to accept input from command
            System.out.println("===========================");
            System.out.println("| ENTER NUMBER OF OPERNADS |");
            System.out.println("===========================");
            number = sc.nextInt();
            //create an array of size feild(number)
            int a[] = new int[number];
            System.out.println("==================");
            System.out.println("| ENTER OPERNADS |");
            System.out.println("==================");
            //iterare through array to input values to its feilds
            for(i =0;i<number;i++){
                //instantiate array feilds to accept input from command
                a[i] = sc.nextInt();
                //Sum through the values of the array
                sum = sum + a[i];
            }
            //instantiate feild(average) to be equals the result of the sum of the array over the size of the array
            average = sum/number;
            //display result i.e average
            System.out.println("======================");
            System.out.println("| Result = " + average + "|");
            System.out.println("======================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to check the maximum value in an array of feilds
    public int maximum(){
        try{
            //create Scanner object
            System.out.println("==================");
            System.out.println("| ENTER OPERNADS |");
            System.out.println("==================");
            Scanner sc = new Scanner(System.in);
            //instantiate feild(number) to accept input from command
            int number =sc.nextInt();
            //create an array of size feild(number)
            int[] a = new int[number];
            //iterate through the feilds of array to input values
            for(int i =0;i<number;i++){  
                a[i] = sc.nextInt();
            }
            //sort array in descending order
            Arrays.sort(a);
            //Display result
            System.out.println("======================");
            System.out.println("| Result = " + a[number-1] + "|");
            System.out.println("======================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method decleration to check the minimum value in an array of feilds 
    public int minimum(){
        try{
            //create scanner object
            System.out.println("==================");
            System.out.println("| ENTER OPERNADS |");
            System.out.println("==================");
            Scanner sc = new Scanner(System.in);
            //declare and instantiate feild(number) to accept input from command
            int number =sc.nextInt();
            //create an array of size number
            int[] a = new int[number];
            //iterate through the feilds of array to input values
            for(int i =0;i<number;i++){  
                a[i] = sc.nextInt();
            }
            //sort array in descending order
            Arrays.sort(a);
            //Display minimum value of array after sorting
            System.out.println("======================");
            System.out.println("| Result = " + a[0] + "|");
            System.out.println("======================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to calculate percentge of operands
    public double percent(){
        try{
            //declare feilds
            int operand1,operand2;
            System.out.println("==================");
            System.out.println("| ENTER OPERNADS |");
            System.out.println("==================");
            //create scanner object
            Scanner sc = new Scanner(System.in);
            //instantiate feildds(number1 & number2) to accept input from command
            operand1 = sc.nextInt();
            operand2 = sc.nextInt();
            //instantiate feild(lcm) to be equal feild(number1) multiply by 100 divided by feild(number2)
            int percent = operand1 * 100 / operand2;
            //display result
            System.out.println("======================");
            System.out.println("| Result = " + percent + "|");
            System.out.println("======================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    //Method to calculate the highest common factor of operands
    public int hcf(){
        try{
            int operand1,operand2,Hcf =0;
            //create scanner object
            System.out.println("==================");
            System.out.println("| ENTER OPERNADS |");
            System.out.println("==================");
            Scanner sc = new Scanner(System.in);
            //instantiate feild(number1 & number2) to accept input from command
            operand1 = sc.nextInt();
            operand2 = sc.nextInt();
            //iterate through the values of feild(number1 & number2) with a divider feild
            for(int i = 1;i<=operand1 && i<=operand2; i++){
                
                //check if feid(number1) & feild(number2) divided by counter feild has no remainder
                if(operand1 % i == 0 && operand2 % i == 0){
                //instantiate feild(gcd) to be equal to the counter varaible where the two feilds csn longer be divided with no remainder
                  Hcf = i; 
                }
            }
            //Display result
            System.out.println("======================");
            System.out.println("| Result = " + Hcf + "|");
            System.out.println("======================");
        }catch(Exception e){
            System.out.println("ERROR!");
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        char operator;
        String exit;
        Scanner sc = new Scanner(System.in);
        do{
           CalcArray obj = new CalcArray();
        System.out.println("===================================");
        System.out.println("|    ENTER TO PERFORM OPERATION    |");
        System.out.println("===================================");
        System.out.println("ADDITION :: (+) " );
        System.out.println("SUBTRACTION::(-) " );
        System.out.println("MULTIPLICATION::(*) " );
        System.out.println("DIVISION::(/) " );
        System.out.println("CUBE ROOT::(cube root) " );
        System.out.println("SQUARE ROOT::(squre root) " );
        System.out.println("POWER::(power) " );
        System.out.println("SINE::(sin) " );
        System.out.println("COSE::(cos) " );
        System.out.println("TAHN::(tan) " );
        System.out.println("COS ARCH::(acos) " );
        System.out.println("SIN ARCHE::(asin) " );
        System.out.println("EXPONENTIAL::(exp) " );
        System.out.println("PRIME::(prime) " );
        System.out.println("AVERAGE NUMBER::(average) " );
        System.out.println("LOG::(log) " );
        System.out.println("ROUND OFF::(round off) " );
        System.out.println("ROUND UP::(round up) " );
        System.out.println("MAXIMUM NUMBER::(maximum) " );
        System.out.println("PERCENTAGE::(percent) " );
        System.out.println("HCF::(hcf) " );
        System.out.println("===================");
        System.out.println("| ENTER OPERATION  |");
        System.out.println("===================");
        String operate = sc.nextLine();
        switch(operate)
        {
            case "+":
                obj.addition();
                break;
            case "-":
                obj.subtraction();  
                break;
            case "*":
                obj.multiply();
                break;
            case "/":
                obj.divide();
                break;
            case "cube root":
                obj.cuberoot();
                break;
            case "square root":
                obj.squareroot();
                break;
            case "power":
                obj.power2();
                break;
            case "sin":
                obj.sin();
                break;
            case "cos":
                obj.cos();
                break;
             case "asin":
                obj.asin();
                break;
            case "acos":
                obj.acos();
                break;
            case "exp":
                obj.exponential();
                break;
            case "check":
                obj.isPalindrome();
                break;
             case "prime":
                obj.isPrime();
                break;
            case "average":
                obj.average();
                break;
            case "log":
                obj.log();
                break;
            case "round off":
                obj.round();
                break;
            case "round up":
                obj.ceil();
                break;
            case "maximum":
                obj.maximum();
                break; 
            case "percent":
                obj.percent();
                break;
            case "hcf":
                obj.Hcf();
                break;
            default:
                System.out.println("invalid input");
                break;
        } 
        System.out.println("Enter Reset to Restart");
        exit = sc.nextLine();
        }while(exit.toUpperCase().equals("Reset"));
        
    }
}
