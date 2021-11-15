package HSN_java;

public class Typecasting {
	public static void main(String args[]) {
		
		// Automatic/Widening type casting
		short salary = 30000;
		
				int annual_salary = salary * 12 ;
		
		int pincode = 324005 ;
		long new_pincode = pincode;
		
		System.out.print( "annual_salary ="  );//annual_salary
		System.out.println( annual_salary   );
		System.out.print( "new_pincode ="  ); //new_pincode
		System.out.println( new_pincode  );
	
	 // manual/ narrowing/explicit typecasting
		short date = 28;
		 byte new_date = (byte) date;
		 System.out.println(new_date);
		 
		 
		 float percentage = 91.20f;
		 int new_percent = (int) percentage;
		 System.out.println(new_percent);
	 
	}
	}
