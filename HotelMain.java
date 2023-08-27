// import scanner and list class
import java.util.Scanner;
import java.util.List;

// import the required class
class HotelMain
{
    // write a main method
    
    public static void main(String[] args)
    {
 
        List<Hotel> hotelList = HotelRepo.getHotels();
        System.out.println(hotelList);
         
 
        
        Order o=new Order();

           //handle InvalidQuantityException  using try catch block
        try
        {
            o=o.getOrder();
              System.out.println(o);
        }
        catch(InvalidQuantityException e)
        {
            System.out.println(e.getMessage());
        }
 

      

     
    }
}