// create a model class which uses attributes as itemId,itemName,price
// create a constructor with all attributes

 

class Item{
    private int itemId;
    private String itemName;
    private double price;
    
    public Item(int itemId, String itemName, double price) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }
    
    public int getItemId() {
        return itemId;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
    }
}
