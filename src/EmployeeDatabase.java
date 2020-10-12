public class EmployeeDatabase {

    private String employeeNum;
    private String name;
    private String phoneNum;
    private String email;
    private String assignment;
    private int salary;

    public EmployeeDatabase(String employeeNum, String name, String phoneNum, String email, String assignment, int salary)
    {
        setEmployeeNum(employeeNum);
        setName(name);
        setPhoneNum(phoneNum);
        setEmail(email);
        setAssignment(assignment);
        setSalary(salary);
    }

    public void saveEmployeeAttributes()
    {
        /**
         * Database newEmployee = new Database();
         * newEmployee.newRecord(getEmployeeNum(), getName(), getPhoneNum(), getEmail(), getAssignment(), getsalary());
         */
        System.out.println("Employee added to database.");
    }

    public void displayLastSavedEmployee()
    {
        String space = " ";

        System.out.println(getEmployeeNum() + space + getName() + space + getPhoneNum() + space + getEmail() + space + getAssignment() + space + getSalary());
    }

    public void alterEmployee(String employeeNum, String name, String phoneNum, String email, String assignment, int salary)
    {
        setEmployeeNum(employeeNum);
        setName(name);
        setPhoneNum(phoneNum);
        setEmail(email);
        setAssignment(assignment);
        setSalary(salary);
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
