public class AnimalDatabase {

    private String speciesName;
    private String name;
    private String gender;
    private String birthday;
    private String assignedZK;

    public AnimalDatabase(String speciesName, String name, String gender, String birthday, String assignedZK)
    {
        setSpeciesName(speciesName);
        setName(name);
        setGender(gender);
        setBirthday(birthday);
        setAssignedZK(assignedZK);
    }

    public void saveAnimalAttributes()
    {
        /**
         * Database newAnimal = new Database();
         * newAnimal.newRecord(getSpeciesName(), getName(), getGender(), getBirthday(), getAssignedZK());
         */
        System.out.println("Animal added to database.");
    }

    public void displayLastSavedAnimal()
    {
        String space = " ";

        System.out.println(getSpeciesName() + space + getName() + space + getGender() + space + getBirthday() + space + getAssignedZK());
    }

    public void alterAnimal(String speciesName, String name, String gender, String birthday, String assignedZK)
    {
        setSpeciesName(speciesName);
        setName(name);
        setGender(gender);
        setBirthday(birthday);
        setAssignedZK(assignedZK);
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAssignedZK() {
        return assignedZK;
    }

    public void setAssignedZK(String assignedZK) {
        this.assignedZK = assignedZK;
    }
}
