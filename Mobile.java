package week1.day1;

public class Mobile {
	public void makeCall()
	{
		String mobilemodel= "Redmi";
		float mobileweight = 200;
		System.out.println("mobile model is : "+mobilemodel);
		System.out.println("mobile weight is: "+mobileweight);
	}
		
	public void sendMsg()
	{
		boolean isfullycharged = true;
		int mobilecost = 30000;
		System.out.println("Is mobile is fully charged: "+isfullycharged);
		System.out.println("the mobile cost is :"+mobilecost);
	}
	
	public static void main(String[] args) 
	{
Mobile mobi = new Mobile();
mobi.makeCall();
mobi.sendMsg();

	}

}
