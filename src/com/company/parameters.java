package com.company;

public class parameters {

    public int Sum (int a,int b){
        return a+b;
    }

    public void Any(){
        int y = Sum(10,30);
        int z = Sum(3,5);
        int u = Sum(5,7);

        System.out.println(y);
        System.out.println(z);
        System.out.println(u);

    }


    //------------------------------------------

    public void Speed (int s)
    {
        System.out.print("Spesd :" + s);
    }

    public void Anycod(){
        Speed(33);
    }


}
