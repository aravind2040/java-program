
//////////////// Assignment task////////////////////////////////////////



/* Online Java Compiler and Editor */
 class Telephone{
int price = 1500;
String name = "Phone";


public void call()
    {
    System.out.println("Calling Facility"); 
    }
    public void receive_call()
    {
    System.out.println("Receiving call facility"); 
    }



}


//child----parent class

class Mobile extends Telephone{
    
    int price = 15000; 
    String name = "Mobile"; 
    public void sms()
    {
    System.out.println("Messaging Facility"); 
    }
    public static void main(String[] args)
       {
            Mobile samsung = new Mobile(); 
            Telephone bsnl = new Telephone();
             //samsung.sms();
             samsung.call();
            
            System.out.println(samsung.price); 
            System.out.println(samsung.name); 
            
            System.out.println(bsnl.price); 
            System.out.println(bsnl.name); 
    
    
}
public void call()
    {
    System.out.println("video Calling Facility"); 
    }

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
output : video Calling Facility
               15000
               Mobile
               1500
                Phone
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////SINGLE INHERITANCE PROGRAM///////////////////////////////////////////////////////////////////////////////////
class aravind {

  // field and method of the parent class
  String name;
  public void work() {
    System.out.println("I am java developer");
  }
}

// inherit from aravind
class pavithran extends aravind {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    pavithran details = new pavithran();

    // access field of superclass
    details.name = "suriya";
    details.display();

    // call method of superclass
    // using object of subclass
    details.work();

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////////
output:
My name is suriya
I am java developer
/////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////program-2: Method overriding in Java Inheritance////////////////////////////////////////////
class aravind {

  // field and method of the parent class
  String name;
  public void work() {
    System.out.println("I am java developer");
  }
}

// inherit from aravind
class pavithran extends aravind {
    
  // overriding the work() method
     public void work() {
    System.out.println(" No,I am python developer");
  }

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    pavithran details = new pavithran();

    // access field of superclass
    details.name = "suriya";
    details.display();

    // call method of superclass
    // using object of subclass
    details.work();

  }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
output:
My name is suriya
 No,I am python developer



