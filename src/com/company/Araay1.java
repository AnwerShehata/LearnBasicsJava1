package com.company;

public class Araay1 {


    //يتم كتابة قيم المصفوفة في احالة انشاء اوبجكت من الدالة
  /*
    public void printArray(int []x)
    {
        for (int f:x)
            System.out.println(f);
    }*/

    //--------------------------------------------------------------------

    public void MyArray1()
    {
        // الطريقة الاولي في استخدام المصفوفة
       /* int z[] = new int[10];
        z[0] = 10;
        z[1] = 20;
        z[2] = 30;
        z[3] = 40;
        System.out.print(z[2]);*/
    }

    //--------------------------------------------------------------------
/*
    public void MyArray2()
    {
        // الطريقة الثانية في استخدام المصفوفة
        int value[] = {10,11,22,33};
       // System.out.println(z[10]);


        // الطريقة الاولي لطباعة القيم التي بداخل المصفوفة
        for (int i =0 ; i<value.length ; i++)
            System.out.println(value[i]);


        // الطريقة الثانية لطباعة القيم التي بداخل المصفوفة
        for (int val : value)
            System.out.println(val);

    }*/

    //--------------------------------------------------------------------
    // مصفوفة بداخل مصفوفة
    public void MyArray2D(){

        int x [][] = {
                {1,2,3},
                {11,22,33},
                {44,55,66}};

        System.out.println(x[0][2]);
    }



}
