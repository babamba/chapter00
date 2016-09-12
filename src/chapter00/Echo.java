package chapter00;

public class Echo {
	public static void main(String[] args) {
		System.out.println( args.length);
		
		for( String s : args){
			System.out.println( s );
		}
	}
}
