import java.util.ArrayList;
import java.util.List;

class HotelRepo
{
    List<Hotel> hotels=new ArrayList<Hotel>();
    static List<Hotel> getHotels()
    {
        //create 3 hotel objects with hotelId,hotelName,location,list of items
        // create items with itemId,itemName,price
        //add the items to the list of items

        List<Item> items=new ArrayList<Item>();
        Item i1=new Item(1,"Pizza",50);
        Item i2=new Item(2,"Burger",30);
        Item i3=new Item(3,"Sandwich",20);
  // add items to the list of items
        items.add(i1);
        items.add(i2);
        items.add(i3);
        

        Hotel h1=new Hotel(1,"Taj","Chennai",items);
        Hotel h2=new Hotel(2,"Oberoi","Mumbai",items);
        Hotel h3=new Hotel(3,"Radisson","Delhi",items);

        //add the hotel objects to the array of hotels
        List<Hotel> hotels=new ArrayList<Hotel>();

        hotels.add(h1);
        hotels.add(h2);
        hotels.add(h3);

        //return the array of hotels
        return hotels;


    }
}