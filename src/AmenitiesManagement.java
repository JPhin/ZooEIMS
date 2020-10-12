public class AmenitiesManagement {

    private String assignedEmployeeNum;
    private String amenityName;
    private String amenityStatus;
    private String inventoryNum;
    private int inStock;

    public AmenitiesManagement()
    {
        setAssignedEmployeeNum("Z002");
        setAmenityName("Rainforest Restrooms");
        setAmenityStatus("open");
        setInventoryNum("tp-1010");
        setInStock(0);
    }

    public void amenityInfo()
    {
        String space = " ";
        System.out.println(getAmenityName() + space + getAmenityStatus() + space + getAssignedEmployeeNum() + space + getInventoryNum()+ space + getInStock());
    }

    public void amenityStatus()
    {
        System.out.println(getAmenityStatus());
    }

    public void changeAmenityStatus(String amenityStatus)
    {
        setAmenityStatus(amenityStatus);
    }

    public void assignEmployee(String assignedEmployeeNum)
    {
        setAssignedEmployeeNum(assignedEmployeeNum);
    }

    public void requestRestock()
    {
        System.out.println("Request Sent!");
    }

    public String getAssignedEmployeeNum() {
        return assignedEmployeeNum;
    }

    public String getAmenityName() {
        return amenityName;
    }

    public void setAmenityName(String amenityName) {
        this.amenityName = amenityName;
    }

    public String getAmenityStatus() {
        return amenityStatus;
    }

    public void setAmenityStatus(String amenityStatus) {
        this.amenityStatus = amenityStatus;
    }

    public void setAssignedEmployeeNum(String assignedEmployeeNum) {
        this.assignedEmployeeNum = assignedEmployeeNum;
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
}
