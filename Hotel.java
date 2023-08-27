// create a hotel class with hotelId,hotelName,location,list of items
// create a constructor with all attributes

 

import java.util.List;
 

class Hotel
{
    private int hotelId;
    private String hotelName;
    private String location;
    private List<Item> items;
    
    public Hotel(int hotelId, String hotelName, String location, List<Item> items) {
        super();
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.items = items;
    }
    
    public int getHotelId() {
        return hotelId;
    }
    
    public String getHotelName() {
        return hotelName;
    }
    
    public String getLocation() {
        return location;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    @Override
    public String toString() {
        return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", items=" + items
                + "]";
    }
}