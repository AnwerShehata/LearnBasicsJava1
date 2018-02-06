package com.company;

public class Example_Book {

    public String name ;          // اسم الكتاب
    public String author ;       // اسم مالف الكتاب
    public int pubdata ;         // تاريخ نشر الكتاب

    public int LastPageBook ;   // عدد صفحات الكتاب
    public int current_page;    // الصفحة الحالية
    public boolean is_open;

    public Example_Book(String Name_Book,String Author_Book,int PubData_Book,int LastPage_Book){
        this.name = Name_Book;
        this.author = Author_Book;
        this.pubdata = PubData_Book;
        this.LastPageBook = LastPage_Book;
        this.is_open = false;

    }
    // داله تفتح الكتاب
    public void Open_Book()
    {
        if (is_open) System.out.println("Is Open");
        else is_open = true;
    }

    // دالة تغلق الكتاب
    public void Clos_Book()
    {
        if (is_open) this.is_open = false;
        else System.out.println("Is Clos Book");
    }


    //دالة التنقل بين الصفحات
    public boolean MoveToPage(int page){
        if (is_open) return false;
        if ((page>this.LastPageBook)||(page<1)) return false;
            //System.out.println("the page number dose not exsit");
        this.LastPageBook = page;
        return true;
    }


    // دالة تطبع معلومان الكتاب
    public void Print_Info_Book()
    {
        System.out.println("Book Name : " + name);
        System.out.println("Book Author : " + author);
        System.out.println("BooK PubData : " + pubdata);
        System.out.println("BooK Page Number : " + LastPageBook);
    }







}
