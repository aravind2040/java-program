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
