
/* abstract class  AbstractClass {

	 abstract void test();
	/// t = new AbstractClass();
}
*/
  class ClassicSingleton {

	   private static ClassicSingleton instance = null;
	    ClassicSingleton() {
	      // Exists only to defeat instantiation.
		   System.out.println("singletone");
	   }
public static void main(String[] args) {
	getInstance();
}
	   public static ClassicSingleton getInstance() {
	      if(instance == null) {
	         instance = new ClassicSingleton();
	      }
	      return instance;
	   }
	}