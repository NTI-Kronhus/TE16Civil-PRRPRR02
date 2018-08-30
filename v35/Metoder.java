public class Metoder {

	public static void output(String... strings){
		for (String string : strings) {
			System.out.print(string + " ");
		}
	}
	
	public static <T> T generiskDatatyp(T generisk){
		return generisk;		
	}
	
	public static int fakultet(int n){
		
		if(n == 0){
			return 1;
		}
		else{
			return n * fakultet(n-1);
		}
		
	}
	
}
