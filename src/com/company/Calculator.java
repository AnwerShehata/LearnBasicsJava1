package com.company;

public class Calculator {

    // دالة الجمع
    public int sum(int one ,int two)
    {
        return one + two;
    }

    //دالة الطرح
    public int min(int one , int two)
    {
        return one - two;
    }
    // دالة الطرب
    public int mul(int one , int two)
    {
        return one * two;
    }

    public int div ( int one , int two)
    {
        if (two == 0) return 0;
        return one/two;
    }


}
