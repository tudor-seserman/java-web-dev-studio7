package org.launchcode.studio7;

public class CD extends BaseDisc{
    public CD(String name) {
        super(name);
        this.rpm = 500;
        this.dataStorage=5;
    }

    public void playMusic(){
        System.out.println("Enjoy listing to "+name);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
