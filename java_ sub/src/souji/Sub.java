package souji;

public class Sub {
	int arg1=1;
	int arg2=2;
public Sub(int a,int b){
	this.arg1=a;
	this.arg2=b;
}
public Sub() {
	// TODO Auto-generated constructor stub
}
public int sub()
{
	System.out.println("subtraction");
	return arg1+arg2;
}
	public static void main(String[] args) {
		Sub obj=new Sub();
		System.out.println("output of subtraction"+obj.sub());
		
	
		// TODO Auto-generated method stub

	}
	

}
