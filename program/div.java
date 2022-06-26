
public class div extends Calculator
{
		div(double num1,double num2)
	{
		super(num1,num2);
	}

	void value(){
		double div= num1/num2;
		System.out.println("DIVISION OF "+num1+" AND "+num2+" IS "+div);
		}
	
}