//create an Order class with orderId,hotelId,itemId,quantity,customerName
//create a constructor with all attributes
//create getters and setters
//create a toString method
 import java.util.Scanner;

class Order 
{
    private int orderId;
    private int hotelId;
    private int itemId;
    private int quantity;
    private String customerName;

    //define a method named getOrder which gets the details of the order , using scanner
    //return the order object
public Order(){}
    public   Order getOrder() throws InvalidQuantityException
    {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //get the orderId,hotelId,itemId,quantity,customerName from the user
        //create an order object with above details
    orderId=sc.nextInt();
    hotelId=sc.nextInt();
    itemId=sc.nextInt();
    quantity=sc.nextInt();
    customerName=sc.next();
// if the quantity is less than or equal to zero throw an InvalidQuantityException with message as "Invalid Quantity"   

    if(quantity<=0)
    {
        throw new InvalidQuantityException("Invalid Quantity");
    }

    Order o=new Order(orderId,hotelId,itemId,quantity,customerName);
    return o;
        
    }

    public Order(int orderId, int hotelId, int itemId, int quantity, String customerName) {
        super();
        this.orderId = orderId;
        this.hotelId = hotelId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.customerName = customerName;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public int getHotelId() {
        return hotelId;
    }
    
    public int getItemId() {
        return itemId;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", hotelId=" + hotelId + ", itemId=" + itemId + ", quantity=" + quantity
                + ", customerName=" + customerName + "]";
    }
}