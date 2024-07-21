import java.util.*; 
import java.util.stream.*;

public class MyClass {
    public static void main(String args[]) {
    //   int x=10;
    //   int y=25;
    //   int z=x+y;
        List<Integer> numlist = Arrays.asList(1,2,6,3,4,4,5,5,6);
        List<Integer> num2 = numlist.stream().distinct().filter(n-> n%5==0).collect(Collectors.toList());
        List<Integer> num3 = numlist.stream().distinct().filter(n-> n%2!=0).collect(Collectors.toList());
      System.out.println("Sum of x+y = " +num2+"000"+ num3);
      
    int[] a = { 10 , 40 , 30 , 20 };
int[] b = { 50 , 70 , 70 , 90 };

int[] merged = IntStream.concat(IntStream.of(a), IntStream.of(b)).distinct().toArray();

System.out.println("concat"+Arrays.toString(merged));
List<Integer> numlist5 = Arrays.asList(1,2,6,3,4,4,5,5,6);
List<Integer> num7=numlist5.stream().distinct().sorted().collect(Collectors.toList()); // Re
List<Integer> num8=numlist5.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); // Re
   System.out.println("000"+ num8+"-------"+num7);



    ///////count of odd and even numbers
        import  java.util.*;
import  java.util.stream.*;
        
        List<Integer> arr = Arrays.asList(input1, input2, input3, input4, input5);
        Stream<Integer> data = arr.stream().filter(n->n%2==0);
        Stream<Integer> data2 = arr.stream().filter(n->n%2!=0);
		return (input6.equals("even"))? (int)data.count() : (int)data2.count();
	}

	List<Integer> arr = Arrays.asList(input1, input2, input3, input4, input5);
	return (input6.equals("even"))? (int)arr.stream().filter(n->n%2==0).count() 
					: (int)arr.stream().filter(n->n%2!=0).count();


        
    }

===============================================
	LIST CONTAINS CHECK
====================================
List<String> words = Arrays.asList("Python", "JavaScript", "Java", "C++");

boolean containsJava = words.stream()
                           .anyMatch("Java"::equals);

System.out.println(containsJava); // Output: true
    
}


================================================
	FACTORIAL
==============================================
return IntStream.rangeClosed(2, input1).reduce(1, (x, y) -> x * y);


======================================
SUM OF N NATURAL NUMBERS
======================================
	int n=5;
int hi= IntStream.rangeClosed(1, n).reduce(0, (x, y) -> x + y);
    System.out.println(hi);//15 is sum
	

=========================================
	COUNT OF PRIME IN A RANGE 
=========================================
	 int count=0;
        for(int i=input1;i<=input2;i++){
            if(isPrime(i)) count++;
        }
         return count;  
		    
	}
    public static boolean isPrime(int num){
        for(int i=2; i<num;i++){
                if(num%i==0) return false;
        }
        return true;
    }
=========================================
PALINDROM OR NOT
================================
	String str = String.valueOf(input1);
        StringBuilder strb = new StringBuilder(str);
        String s=strb.reverse().toString();
        if(str.equals(s)) return 2; else return 1;

other manual way of number palindrom

	  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  

STring palindrom without string builder
	
   String output= "";
		for(int i=input1.length()-1;i>=0;i--){
            output+=input1.charAt(i);
        }
        return (input1.equalsIgnoreCase(output))? 2:1;
===================================
