Int digit_removepalin(int input1)
{
String s=String.valueOf(input1);
        int i;
        int j;
        int f=0;
        int res=0;
        for(i=0,j=s.length()-1;i<s.length()/2;i++,j--)
        {
            System.out.println(s.charAt(i)+"   "+s.charAt(j));
            if(s.charAt(i)==s.charAt(j))
            {
                continue;
            }
            else
            {
                f=1;
                if(s.charAt(i)==s.charAt(--j))
                {
                res=Integer.valueOf(String.valueOf(s.charAt(++j)));
                System.out.println(res);
                }
                else 
                {
                    res=Integer.valueOf(String.valueOf(s.charAt(i)));
                    System.out.println(res);
                }
                break;
            }
        }
            if(f==0)
            return -1;
            else
            return res;
                
}

========================
      Nth  PRIME
======================
import java.util.Scanner;
public class NthPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n to compute the nth prime number: ");
    int nth = sc.nextInt(); 
    int num, count, i;
    num=1;
    count=0;
  
    while (count < nth){
      num=num+1;
      for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){//if it is a prime number
        count = count+1;
      }
    }
    System.out.println("Value of nth prime: " + num);
  }
}
