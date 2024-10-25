class Hotel1
{
static String order(int price)
{
if(price == 15)
{
	System.out.println("coffee");
return "coffee";
}
else if(price == 10)
{
	System.out.println("tea");
	return "tea";
}
else {
	return "invalid order";
}

}

public static void main( String[] args)
{
String ref = Hotel.order(10);
System.out.println("order is:" + ref);

String ref1 = Hotel.order(15);
System.out.println("order is:" + ref1);

String ref2 = Hotel.order(20);
System.out.println("order is:" + ref2);
	
}
}