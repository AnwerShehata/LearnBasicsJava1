package com.company;

public class Example1 {


    // دالة تطبع الارقام عد تنازلي باستخدام While
    public void exa1(int value)
    {
        int i = value;
        while (i >=1)
        {
            System.out.println(i);
            i--;
        }
    }

    // for دالة تطبع الارقام عد تنازلي بستخدام
    public void exa2(int value)
    {
        for (int i=value; i>=1 ; i--)
        {
            System.out.println(i);
        }
    }



    //-----------------------------------------------------------------

    public void site()
    {
        String site = "wwww.Anwarshehata.com";
        for (int i=0 ; i<site.length();i++)
        {
            char ch = site.charAt(i);
            System.out.println(ch);
        }
    }




}
