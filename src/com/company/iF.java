package com.company;

public class iF {

    public int speed;

    public void setspeed(int s){
        this.speed = s;

        if (this.speed > 120)
        {
            System.out.println("slow down");
        }
        //else {System.out.println("ok");}

        else if (this.speed <= 120) System.out.println("ook");

    }



    public int getSpeed()
    {
        return this.speed;
    }

}

//--------------------------------- InLin_if ---------------------------------------





//---------------------------------------------------------------
    /*
         الرموز التي ياتي مع الشروط في دالة IF
         ---------------------------

         >             اصغر من
         <              اكبر من
           ==             يساوي
          =!             لايساوي
         =>      اصغر من او يساوي
         <=       اكبر من او يساوي

        */
