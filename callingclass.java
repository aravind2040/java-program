class Theatre 
{
void bookTicket(int amount) 
{
System.out.println("Balance is "+ (amount-120));
}
	


///////////////



class Customer 
{
public static void main(String[] args)
{
Theatre theatre = new Theatre(); //class to anthor class threatre
theatre.bookTicket(200); 
}
}
