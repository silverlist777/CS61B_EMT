public class TestSort {
    // a class used for having tests
   public static void testSort() {
       String[] input = {"beware", "of", "falling", "rocks"};
       String[] expected = {"beware", "falling", "of", "rocks"};
       Sort.sort(input);
       org.junit.Assert.assertArrayEquals(input,expected);
   }
    public static void testLargestStr(){
        String[] input = {"beware", "of", "falling", "rocks"};
        String expected = "beware";
        String actual=Sort.FindLargestNum(input);
        org.junit.Assert.assertEquals(expected,actual);
    }
    public static void testswap(){
       int a=0;
       int b=2;
        String[] input = {"beware", "of", "falling", "rocks"};
        String[] expected = {"falling" ,"of","beware", "rocks"};
        Sort.swap(input,a,b);
        org.junit.Assert.assertArrayEquals(input,expected);
    }
    public static void main(String[] args){
        testswap();
    }
   }

