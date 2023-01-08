public class Example2{
	public static void main (String args[]){
		if (args.length==1)
			if (args[0].equals("Corejava"))
				System.out.println("True value "+args[0]);
			else
				System.out.println("False value "+args[0]); 

		else 
			System.out.println("Hello world");
	}
}