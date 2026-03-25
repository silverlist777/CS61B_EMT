public class Sort{
    /** sort strings destructively???**/
    public static void sort(String[] x) {
        // Find the smallest number
        // move it to the front
        // select n-1 items (use recursion)
        //use helper method
        sort(x,0);
    }
    public static void sort(String[] x, int start) {

        start = 0;
        if (start < x.length - 1) {
            swap(x, start, FindLargestNum(x));
            start += 1;
        }
    }
    public static int FindLargestNum(String[] x){
        int LargestNumIndex=0;
        for (int i=0;i<x.length;i+=1){
            int result=x[i].compareTo(x[LargestNumIndex]);
            if(result==-1){
                LargestNumIndex=i;
            }
        }
        return LargestNumIndex;
    }
    // change the places of the two element in the array
    public static void swap(String[] x,int a,int b){
        String c1=x[a];
                x[a]=x[b];
                x[b]=c1;
    }
}