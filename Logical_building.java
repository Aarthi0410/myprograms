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
