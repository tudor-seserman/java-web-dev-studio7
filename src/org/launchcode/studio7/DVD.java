package org.launchcode.studio7;

public class DVD extends BaseDisc{

    public DVD(String name ) {
        super(name);
        this.rpm = 1600;
        this.dataStorage=8;
    }

    public void playMovie(){
        System.out.println(this.name+"is now playing!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
