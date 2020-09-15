
public class SwapNum {

	public static void main(String[] args) {
	int var1=10;
	int var2=78;
	System.out.println("Variable 1 before swapping is "+var1);
	System.out.println("Variable 2 before swapping is "+var2);
	
	var1=var1+var2;
	var2=var1-var2;
	var1=var1-var2;
	
	System.out.println("Variable 1 after swapping is "+var1);
	System.out.println("Variable 2 after swapping is "+var2);
	
	
	
	
	}

}
