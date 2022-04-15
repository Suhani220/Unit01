package Unit_01;

public class P2_Task02_ConstantsInJava {
		private static final double Pi=3.14;
		public static void main(String[] args) {
			final int a=10;
			//a=11;		//ERROR ARISES BECAUSE WE MAKE THE STATIC REFERENCE TO NON-STATIC VARIABLES
			System.out.println("Value of a : " + a);
			int x=add(1,2);
			System.out.println("Value of x : " + x);
		}
		static int add(int a,int b) {
			
			System.out.println("value of pi : " + Pi);
			return(a+b);
	}
}
