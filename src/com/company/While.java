package com.company;

public class While {


    public void While_1()
    {
        int i = 1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
    }



    public void do_while()
    {
         int x = 1;
         do {
             System.out.println("Do Whlie");
             x++;
         }
         while (x<=5);

    }




    // دالة تطبع الارقام عد تنازلي
    public void dec(int value)
    {
        int f = value;
        while (f >= 1)
        {
            System.out.println(f);
            f--;
        }
    }



}
