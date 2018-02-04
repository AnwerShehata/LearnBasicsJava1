package com.company;

public class Example_Book {

    public String name;
    public String author;
    public int pubdate;
    public int last_page_number;
    public int current_page;

    public Example_Book(String Name,String Author, int Pubdate, int Last_page_number,int Current_page)
    {
        this.name = Name;
        this.author = Author;
        this.pubdate = Pubdate;
        this.last_page_number = Last_page_number;
        this.current_page = Current_page;
    }


    public boolean is_Opne;


    void OpenBook()
    {
        if (is_Opne)
            System.out.println("IS OPEN BOOK");
        else
            is_Opne = true;
    }



}
