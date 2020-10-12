public class Testing {

    public static void main(String args[])
    {

        Testing test = new Testing();

        test.animalDatabaseTest();
        test.employeeDatabaseTest();
        test.employeeScheduleTest();
        test.inventoryManagementTest();
        test.amenitiesManagementTest();
        test.attractionsManagementTest();
    }

    public void animalDatabaseTest()
    {

        AnimalDatabase newAnimal = new AnimalDatabase("Lion","Mufasa", "male", "11-14-2017","Richard");

        newAnimal.saveAnimalAttributes();
        newAnimal.displayLastSavedAnimal();
        newAnimal.alterAnimal("Lion","Mufasa", "male", "11-14-2017","Rebecca");
        newAnimal.displayLastSavedAnimal();

    }

    public void employeeDatabaseTest()
    {

        EmployeeDatabase newEmployee = new EmployeeDatabase("Z001","Derrick", "321-000-0000", "derrick@aol.com","pretzel stand", 10);

        newEmployee.saveEmployeeAttributes();
        newEmployee.displayLastSavedEmployee();
        newEmployee.alterEmployee("Z001","Derrick", "321-000-0000", "derrick@aol.com","pretzel stand", 11);
        newEmployee.displayLastSavedEmployee();

    }

    public void employeeScheduleTest()
    {

        EmployeeSchedule newSchedule = new EmployeeSchedule("Z001","6", "12", "2-15-2020");

        newSchedule.saveScheduleAttributes();
        newSchedule.displaySchedule("Z001");
        newSchedule.alterSchedule("Z001","12", "6", "2-15-2020");
        newSchedule.displaySchedule("Z001");
    }

    public void inventoryManagementTest()
    {
        InventoryManagement inventory = new InventoryManagement();

        inventory.displayItemStock();
        inventory.getItemInfo();
        inventory.newOrder();
    }

    public void amenitiesManagementTest()
    {
        AmenitiesManagement amenity = new AmenitiesManagement();

        amenity.amenityInfo();
        amenity.amenityStatus();
        amenity.changeAmenityStatus("closed");
        amenity.assignEmployee("Z005");
        amenity.requestRestock();
        amenity.amenityInfo();
    }

    public void attractionsManagementTest()
    {
        AttractionsManagement attraction = new AttractionsManagement();

        attraction.attractionInfo();
        attraction.attractionStatus();
        attraction.attractionDiagnostics();
        attraction.changeAttractionStatus("closed");
        attraction.assignEmployee("Z004");
        attraction.attractionInfo();
    }
}
