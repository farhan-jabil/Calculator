	
public class mul extends Calculator
{
		mul(double num1,double num2)
	{
		super(num1,num2);
	}
	
	
	void value(){
		double mul= num1*num2;
		System.out.println("MULTIPLICATION OF "+num1+" AND "+num2+" IS "+mul);
		}
}