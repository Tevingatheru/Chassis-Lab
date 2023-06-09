package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManufacturedEngine implements Engine {

    private String engineManufacturer;

    private Date engineManufacturedDate;

    private String engineMake;

    private String engineModel;

    private String engineDriveTrain;

    private int engineCylinders;

    private String engineType;

    private String driveTrain;

    private SimpleDateFormat isoFormat = new SimpleDateFormat();
    public ManufacturedEngine() {
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date(2012, 2,2,0,55,44);
        this.engineMake = "Generic";
        this.engineModel = "Generic";
//        this.engineDriveTrain = "Generic";
        this.engineCylinders = 0;
        this.engineType = "85 AKI";
        this.driveTrain = "2WD: Two-Wheel Drives";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake, String engineModel, String engineDriveTrain, int engineCylinders, String engineType, String driveTrain) {
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineDriveTrain = engineDriveTrain;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }

    @Override
    public String toString() {
        return "Engine Manufacturer : " + engineManufacturer +
                "\nEngine Manufactured : " + engineManufacturedDate.toString() +
                "\nEngine Make : " + engineMake +
                "\nEngine Model : " + engineModel +
                "\nEngine Type : " + engineType +
                "\nEngine Cylinders : " + engineCylinders +
                "\nDrive Train : " + engineDriveTrain +
                "\nVehicle Frame : Unibody";
    }

    public static void main(String[] args) {
        // Test scenario 1 - generic values
        ManufacturedEngine engine1 = new ManufacturedEngine();
        System.out.println(engine1.toString());

        // Test scenario 2 - custom values
        Date date = new Date(2012, 0, 3, 7, 13, 19);
        ManufacturedEngine manufacturedEngine = new ManufacturedEngine("Honda",
                date,
                "H-Series", "H23A1", "", 4, "88 AKI", "2WD: Two-Wheel Drive");

        System.out.println(manufacturedEngine);
    }
}
