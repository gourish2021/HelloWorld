
public class Star {

	public static void main(String[] args) {
		
		System.out.println("2+4="+ sum (2,4));
		System.out.println("1+2.5="+ sum (1,2.5f
				));
		System.out.println("1.3+2.5="+ sum (1.3,2.5));
		
	}
	  public static int sum(int x , int y) {
		  System.out.println("adding two int entities");
		  return x+y;
	  }
	  public static float sum(int x , float y) {
		  System.out.println("adding 1 int and 1 float");
		  return x+y;
	  }
	  public static  double sum(double x , double y) {
		  System.out.println("adding 2 double");
		  return x+y;
	
	}}

	