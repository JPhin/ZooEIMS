public class InventoryManagement {

    private String inventoryNum;
    private int inStock;
    private String supplier;
    private String location;

    public InventoryManagement()
    {
        setInventoryNum("tp-0101");
        setInStock(0);
        setSupplier("Cheapo-Joe's one-ply warehouse");
        setLocation("storage closet B");
    }

    public void newOrder()
    {
        System.out.println("Placing order... Done!");
    }

    public void displayItemStock()
    {
        String space = " ";
        System.out.println(getInventoryNum() + space + getInStock());
    }

    public void getItemInfo()
    {
        String space = " ";
        System.out.println(getInventoryNum() + space + getInStock() + space + getSupplier() + space + getLocation());
    }

    public String getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(String inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
