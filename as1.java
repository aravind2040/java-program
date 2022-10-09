// Online Java Compiler
// Use this editor to write, compile and run your Java code onli
public class threatre {
   public int add() { // without arguments
      int ticket = 200;
      int ticketprice = 120;
      int balance = ticket-ticketprice;
      return balance;
   }
   public static void main(String args[]) {
      threatre test = new threatre();
      int add = test.add(); //without param
      System.out.println("your balance is: " + add);
   }
}
output:
your after booking balance:80



/* Online Java Compiler and Editor */
public class threatre {
   public int add(int ticket, int ticketprice) { // with arguments
      int balance = ticket-ticketprice;
      return balance;
   }
   public static void main(String args[]) { (TBD)
      threatre aravind = new threatre();
      int book = aravind.add(200, 120);
      System.out.println("your after booking balance is: " + book);
   }
}
output:
your after booking balance:80


  class threatre {
   
        static int bookticket(int ticket) {
        int ticketprice=200;
       return ticketprice - ticket;
  }

       public static void main(String[] args) {
        //create no object 
    System.out.println("your after booking balance:"+bookticket(120));
  }
}

output:
your after booking balance:80
