
public class Printmthod {
 
	public static void main(String[] args) {
		System.out.println("---------");
		printAll(args);
		System.out.println("---------");
}

	public static void printAll(String[] args) {
		for(int i=0; i<args.length;i++) {
			System.out.println("hello"+args[i]);
		}
	}
}