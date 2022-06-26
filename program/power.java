
public class power extends Calculator
{
	power(double num1,double num2)
	{
		super(num1,num2);
	}
	
	double a=num2;
	
	void value(){
		int p=1;
		
		while(num2!=0){
			p *=num1;
			--num2;
			}
		System.out.println(num1 +" POWER OF "+ a+ " IS "+p);
		}
	
}