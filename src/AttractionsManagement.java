public class AttractionsManagement {

    private String attractionName;
    private String assignedEmployeeNum;
    private String attractionStatus;

    public AttractionsManagement()
    {
        setAttractionName("Jeep Safari");
        setAssignedEmployeeNum("Z003");
        setAttractionStatus("open");
    }

    public void attractionInfo()
    {
        String space = " ";
        System.out.println(getAttractionName() + space + getAttractionStatus() + space + getAssignedEmployeeNum());
    }

    public void attractionStatus()
    {
        System.out.println(getAttractionStatus());
    }

    public void attractionDiagnostics()
    {
        System.out.println("Running Bad!");
    }

    public void changeAttractionStatus(String attractionStatus)
    {
        setAttractionStatus(attractionStatus);
    }

    public void assignEmployee(String assignedEmployeeNum)
    {
        setAssignedEmployeeNum(assignedEmployeeNum);
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAssignedEmployeeNum() {
        return assignedEmployeeNum;
    }

    public void setAssignedEmployeeNum(String assignedEmployeeNum) {
        this.assignedEmployeeNum = assignedEmployeeNum;
    }

    public String getAttractionStatus() {
        return attractionStatus;
    }

    public void setAttractionStatus(String attractionStatus) {
        this.attractionStatus = attractionStatus;
    }
}
