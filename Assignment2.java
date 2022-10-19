
//////////////// Assignment task////////////////////////////////////////


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

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

       public static void main(String[] args)
       {
            Telephone bsnl = new Telephone();
            System.out.println(bsnl.price); 
            System.out.println(bsnl.name); 
            bsnl.call();
            bsnl.receive_call();
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
            samsung.call();
            samsung.receive_call();
            samsung.sms();
            System.out.println(samsung.price); 
            System.out.println(samsung.name);
            
            Telephone bsnl = new Telephone();
         
            System.out.println(bsnl.price); 
            System.out.println(bsnl.name); 
            bsnl.call();
            bsnl.receive_call();
    
    
}


}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
output :
Calling Facility
Receiving call facility
Messaging Facility
15000
Mobile
1500
Phone
Calling Facility
Receiving call facility
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



