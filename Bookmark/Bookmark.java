package Bookmark;

public class Bookmark {
//    13  BookMark
//    • Fields: String title; int page; int pages
//    • Methods: void nextPage(); void goTo(int p) (limit 1..pages); int leftPages()
//    • Main: nextPage a few times; print left.
    String title;
    int page, pages;

    public void nextPage(){
        page++;
        System.out.println("You are on page " + page + " out of " + pages);
    }

    public void goTo(int p){
        page = p;
        System.out.println("You are on page " + page + " out of " + pages);
    }

    public int leftPages(){
        return pages - page;
    }
}
