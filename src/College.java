
public class College {
	
	private int rollNum;
	private static String name = "DAVV";
	
	College (int a){
		rollNum = a;
	}
	
	public void display() {
		System.out.println(rollNum + " " + name +  " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College q = new College(100);
		
		q.display();
	}

}