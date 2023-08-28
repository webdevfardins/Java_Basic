package ExcaptinHandling;

public class TestArithmaticExcaption {
		public static void main(String[] args) {
			//arrayExcaption();
			nullException();
		}

		public static void arrayExcaption() {
			int[] table = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
			try {
				for(int i=0; i<11; i++) {
					System.out.println("Table " + table[i]);

				}
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Element abhi kam hai "+e.getMessage());
			}

		}
		public static void nullException() {
			try {
				String Name = "fardin sheikh";
			// String Name=null;
			int FardinLength = Name.length();
			char chathaChar = Name.charAt(6);

			System.out.println("Length of name is " + FardinLength);

			System.out.println(" 7th Carachater of name is " + chathaChar);
			} catch(IndexOutOfBoundsException e) {
				System.out.println("String abhi chota hai"+e.getMessage());
			}
			
		}
		public static void arthmeticExcaption() {
			try {
			int div = 0;
			int no = 15;
			int clac = 0;

			clac = no / div;
			System.out.println("Calc " + clac);
			}
			catch(ArithmeticException e) {
				System.out.println("Opps :  Divident is Zero, Pl try a non zero number " + e.getMessage());
			}
		}


		}

