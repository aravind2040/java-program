class Mall
   
   {
            String movieName;
            int movieTime;
            boolean movieHit;
        
public static void main(String[] args)
        {
            Mall Screen1= new Mall(); 
            Screen1.movieName = "master";
            Screen1.movieTime = 10;
            Screen1.movieHit = true;
            Mall Screen2 = new Mall();
            Screen2.movieName="hello";
            Screen2.movieTime= 11;
            Screen2.movieHit= true;
            Mall Screen3= new Mall();
            Screen3.movieName="Kantara";
            Screen3.movieTime=12;
            Screen3.movieHit= false;
            System.out.println(Screen1.movieName+"->"+Screen1.movieTime+"->"+Screen1.movieHit);
            System.out.println(Screen2.movieName+"->"+Screen2.movieTime+"->"+Screen2.movieHit);
            System.out.println(Screen3.movieName+"->"+Screen3.movieTime+"->"+Screen3.movieHit);
         }


}
///// using constructor 
/////////////////////////////////
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Mall {
    //global variables 
   static String name ="Wellcome to PVR Mall";
    String Moviename,ticketprice,place;
    int time;
    
    //constructor
    Mall(String Moviename,String ticketprice,int time,String place){
        this.Moviename = Moviename;
        this.ticketprice = ticketprice;
        this.time = time;
         this.place = place;
    }
    
    public static void main(String[] args) {
        System.out.println(Mall.name);
        
        Mall screen1 = new Mall("Master","400",10,"velacherry PVR");
        Mall screen2 = new Mall("Cobra","200",11,"velacherry PVR");
        Mall screen3 = new Mall("Vikram","100",9,"velacherry PVR");
        Mall screen4= new Mall("Viruman","60",12,"velacherry PVR");
         
       screen1.details();
        screen2.details();
          screen3.details();
            screen4.details();
    }
    void details(){
        
        System.out.println("Movie Name :"+" " + Moviename +" "+"Ticketprice :"+ ticketprice +" "+"Movie Time :"+ time +" "+"place is :"+place);
        
    }
    
    }
////////////////////////////////////////
output
Wellcome to PVR Mall
Movie Name : Master Ticketprice :400 Movie Time :10 place is :velacherry PVR
Movie Name : Cobra Ticketprice :200 Movie Time :11 place is :velacherry PVR
Movie Name : Vikram Ticketprice :100 Movie Time :9 place is :velacherry PVR
Movie Name : Viruman Ticketprice :60 Movie Time :12 place is :velacherry PVR
//////////////////////////////////////////////////////////////////////////
