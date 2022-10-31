// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Threatre {
    boolean moviereview,moviesubtittle,moviegood,movielanguage;
    
    
    Threatre(boolean review,boolean subtittle,boolean good,boolean language){
        moviereview=review;
        moviesubtittle=subtittle;
        moviegood=good;
        movielanguage=language;
    }

    void details(){
          if(moviereview&&moviesubtittle){
           if(moviegood&&movielanguage){
            System.out.println("Book ticket");
              }
         else 
          {
            System.out.println("Don't book ticket");

              }
          }
    }
    
    
    
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
       
       Threatre show=new Threatre(true,true,false,true);
       show.details();
    }
}


/////////////////////////////////---------OUTPUT------/////////////////////////////////////////////////////////////////////

                                        //  output:

                                    //   Don't book ticket



