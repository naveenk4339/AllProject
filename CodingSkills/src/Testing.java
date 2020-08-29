
public class Testing {

	private static Testing instance = null;
	Testing() {
      // Exists only to defeat instantiation.
	   System.out.println("singletone");
   }
public static void main(String[] args) {
getInstance();
}
   public static Testing getInstance() {
      if(instance == null) {
         instance = new Testing();
         
      }
      System.out.println(instance);
      return instance;
   }
}
