package com.company;

public class Loop {



    public  void ForLoop (){

        for (int i=1 ; i <= 5   ; i++)
        {
            System.out.println("welcome");

        }

    }



    public void FoorLoop2(){

        int s=1;
        for (;;)
        {
            if (s<=5) System.out.println("Anwar shehata");
            else break;
            s++;
        }
    }



    public void countdown(int x){

        if (x <=0) return;
        for (int i=x; i>=0 ; i--)
            System.out.println(i);
        System.out.println("--------------------");

    }


    // دالة تطبع الارقام عد تنازلي
    public void dec (int value)
    {
        for (int i =value ; i >=1; i--)
            System.out.println(i);
    }





}
