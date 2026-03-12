public class Dog{
  public int weightInkilo;
    /** One integer constructor for dogs.*/
    public Dog(int w){
        weightInkilo=w
    }
  public static void makeNoise(){
      if (weightInkilo <10){
          System.out.println("yip");
      } else if (weightInkilo <30){
          System.out.println("Bark!");
      } else {
          System.out.print("wooof!");
      }
  }
}