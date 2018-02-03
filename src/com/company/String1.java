package com.company;

public class String1 {


    int s;
    int w=1;

    public void text1(){

        String Name1 = "TooLs FOR Translators ";
        String Name2 = "Tools FOR Translators ";

        // طباعة الاسم وتحويلها الي حروف كبتل
        //System.out.println(textName1.toUpperCase());

        // يتم استخدام الامقارنة بينن النصين باستخدام نفس طريقة equals في الطباعة
        // System.out.println(Name1.equals(Name2));







        //------------------------------------------------------

       // مثال التكرار باستخدام while
      /*  while (w <= 7)
        {
            System.out.println(Name2);
            w++;
        }*/

        //------------------------------------------------------

        // مثال التكرار باستخدام for
       /* for (s=1;  s<=5  ;s++)
        {
            System.out.println(Name1);
        }
*/

        //------------------------------------------------------
        // مقارنة بين الجملتين  هل يساوي بعض ام لا / حتى اذا كان يوجد حروف كبتل و صمول بين الكملتين

        if (Name1.equalsIgnoreCase(Name2))
            System.out.println("Yes");
        else
            System.out.println("No");


        //------------------------------------------------------
        // مقارنة بين الاثنين هل يساوي بعض ام لا

       /* if (Name1 == Name2)
            System.out.println("yes");

        else if (Name1 != Name2) System.out.println("No");
*/


        //------------------------------------------------------

        // سوف يتم طباعة كل حرف في سطر جديد

        /*
        for (int f = 0; f<textName.length();f++)
        {
            char w = textName.charAt(f);
            System.out.println(w);
        }*/

    }

    //------------------------------------------------------

    // توضيح القيميم
/*
    String name = "ANWAR shehata";
    char c=name.charAt(0);                  // طباعة الحرف الذي يحمل الرقم
    int x =name.length();                   // طباعة طول الجملة يعني كم حرف في الجملة
    String nname=  name.toUpperCase();     // تحويل الحروف من صمول الي كبتل
    String nname2=  name.toLowerCase();    // تحويل الحروف من كبتل الي صمول


*/






}




