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


        
    }
    
}