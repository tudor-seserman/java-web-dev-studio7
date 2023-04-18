package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        BaseDisc smiths = new CD("The Queen is Dead");
        BaseDisc lionKing= new DVD("The Lion King");

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        smiths.spinDisc();
        lionKing.spinDisc();
    }
}
