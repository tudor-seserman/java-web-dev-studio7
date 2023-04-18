package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{
    Integer dataLimit;
    Integer dataStorage;
    String name;
    Integer rpm;




    public BaseDisc(String name) {
        this.name = name;
        this.dataStorage = 0;
    }

    @Override
    public void writeData(Integer memory) {
        this.dataStorage+=memory;
        System.out.println("You have "+(dataLimit-dataStorage)+"left");
    }

    @Override
    public String readData() {
        System.out.println("Your data is playing");
        return null;
    }

    @Override
    public void spinDisc() {
        System.out.println("A "+this.getClass().getSimpleName()+" spins at a rate of "+this.rpm+".");
    }

    @Override
    public Integer getData() {
        return this.dataStorage;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
