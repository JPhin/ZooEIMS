public class EmployeeSchedule {

    private String employeeNum;
    private String start;
    private String end;
    private String date;

    public EmployeeSchedule(String employeeNum, String start, String end, String date)
    {
        setEmployeeNum(employeeNum);
        setStart(start);
        setEnd(end);
        setDate(date);

    }

    public void saveScheduleAttributes()
    {
        /**
         * Database newSchedule = new Database();
         * newSchedule.newRecord(getEmployeeNum(), getStart(), getEnd(), getDate());
         */
        System.out.println("Employee added to database.");
    }

    public void displaySchedule(String employeeNum)
    {
        if (this.employeeNum.equals(employeeNum))
        {
            String space = " ";

            System.out.println(getEmployeeNum() + space + getStart() + space + getEnd() + space + getDate());
        }

    }

    public void alterSchedule(String employeeNum, String start, String end, String date)
    {
        setEmployeeNum(employeeNum);
        setStart(start);
        setEnd(end);
        setDate(date);

    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
