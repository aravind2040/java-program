class SuperMarket
{
   int price,discount;
   String brand;
   
  SuperMarket( String brand, int price, int discount) //create one constructor
    {
        this.brand=brand;
        this.price=price;
        this.discount=discount;
    }
public static void main(String[] args)
       {
       SuperMarket brush= new SuperMarket("Pepsodant",30,5);
       SuperMarket soap= new SuperMarket("Lux",25,2);
       brush.purchase();
       soap.purchase();
       }
  void purchase()
       {
         System.out.println("Customer is buying"+brand+"For price"+price+"of discount"+discount);
       }
}
//////////////////////////////////////////////////////
output:
Customer is buying :PepsodantFor price :30 of discount :5
Customer is buying :LuxFor price :25 of discount :2

/////////////////////////////////////////////////////////////////////////
   class SuperMarket
{
   int price,discount,tax;
   String brand;
   
  SuperMarket( String brand, int price, int discount) //constructor
    {
        this.brand=brand;
        this.price=price;
        this.discount=discount;
    }
     SuperMarket( String brand, int price) //constructor
    {
        this.brand=brand;
        this.price=price;
        this.discount=discount;
    }
     SuperMarket( String brand, int price, int discount,int tax) //create multi constructor
    {
        this.brand=brand;
        this.price=price;
        this.discount=discount;
        this.tax=tax;
    }
public static void main(String[] args)
       {
       SuperMarket brush= new SuperMarket("Pepsodant",30,5);
       SuperMarket book= new SuperMarket("book",25);
         SuperMarket soap= new SuperMarket("Lux",300,20,2);
       brush.purchase();
       book.purchase();
        soap.purchase();
       }
  void purchase()
       {
         System.out.println("Customer is buying :"+brand+"For price :"+price+"of discount :"+discount+"tax :"+tax);
       }
}
////////////////////////////////////////////////////////////////////////////   
Customer is buying :PepsodantFor price :30of discount :5tax :0
Customer is buying :bookFor price :25of discount :0tax :0
Customer is buying :LuxFor price :300of discount :20tax :2
/////////////////////////////////////////////////////////////////////////
public class ClassRoom {
    //global variables 
    String Name,Gender;
    int Age;
    
    //constructor
    ClassRoom(String Name,int Age,String Gender){
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }
    
    public static void main(String[] args) {
        ///System.out.println("Hello, World!");
        
        ClassRoom student1 = new ClassRoom("aravind",24,"male");
        ClassRoom student2 = new ClassRoom("pavithran",21,"male");
        ClassRoom student3 = new ClassRoom("Hariprasanth",24,"male");
        ClassRoom student4= new ClassRoom("paratha",22,"male");
         
       student1.details();
        student2.details();
         student3.details();
          student4.details();
    }
    void details(){
        
        System.out.println("student Rollno:"+" " +Name +" "+"age :"+ Age +" "+"gender :"+ Gender);
    }
    
    }
////////////////////////////////////////////////////////////////////
//output:
student Rollno: aravind age :24 gender :male
student Rollno: pavithran age :21 gender :male
student Rollno: Hariprasanth age :24 gender :male
student Rollno: paratha age :22 gender :male
///////////////////////////////////////////////////////////////////////
 
// Class 1
class mall {
    // data members of the class.
    String moviename;
    int time,ticket;
    boolean like;
/////constructor
    mall(String moviename,int ticket,int time,boolean like)
    {
        this.moviename = moviename;
        this.ticket = ticket;
        this.time = time;
        this.like =like;
    }
}
 
// Class 2
class details {
    // main driver method
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        mall screen1 = new mall("master",120,10,true);
          mall screen2 = new mall("sita raman",150,10,false);
            mall screen3 = new mall("varishu",200,10,true);
             
        System.out.println("movieName :" + screen1.moviename
                           + " ticketprice :" + screen1.ticket +"  time :"+screen1.time+" like hit:"+screen1.like);
   System.out.println("movieName :" + screen2.moviename
                           + " ticketprice :" + screen2.ticket +"  time :"+screen2.time+"  like hit:"+screen2.like);
 System.out.println("movieName :" + screen3.moviename
                           + " ticketprice :" + screen3.ticket +"  time :"+screen3.time+" like hit:"+screen3.like);                           
                           
    }
}
////////////////////////////////////////////////////////////////////////////////////////
output:
movieName :master ticketprice :120  time :10 like hit:true
movieName :sita raman ticketprice :150  time :10  like hit:false
movieName :varishu ticketprice :200  time :10 like hit:true

///////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////

import java.util.Scanner;
public class Test {
   String name;
//constructor
   Test(String name){
      this.name = name;
  
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);/// user get input
      System.out.println("Enter your name: ");
      String name = sc.next();
      Test obj = new Test(name);
      System.out.println("wellcome to java course "+obj.name);
  

   }
}
////////////////////////////////////////////////////////////////
output:
Enter your name: 
aravind
wellcome to java course aravind
///////////////////////////////////////////////////////////////
