package com.company;

public class Switch {

    public int speed ;
    public String name;

    public void Speed (int s){
        this.speed = s;

        switch (this.speed)
        {
            case 40:
            case 41:
            case 42:
            case 43:
                System.out.println("40KM");
                break;

            case 100:
                System.out.println("100KM");
               break;

            case 120:
                System.out.println("120KM");
                break;

             default:
                 System.out.println("This Number is Not Found");

        }
    }

    public int getSpeed(){
        return this.speed;
    }

    //---------------------------- Method String ---------------------

    public void Myname (String n){
        this.name = n;

        switch (this.name)
        {
            case "a":
                System.out.println("AA anwer shehata");
                break;

            case "b":
                System.out.println("BB Ali mohmed");
                break;


            case "c":
                System.out.println("CC Nor Omar");
                break;

            case "d":
                System.out.println("DD Nor Omar");
                break;

                default: System.out.println("This Name is Not Found");
        }
    }

    public String getName()
    {
        return this.name;
    }



}
