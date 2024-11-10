class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int i=0;
        int j=0;
        while(i<a.length &&j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                count++;
                i++;
                j++;
            }

        }
        return count;
        
    }
}
