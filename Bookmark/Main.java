package Bookmark;

public class Main {
    //    13  BookMark
//    • Fields: String title; int page; int pages
//    • Methods: void nextPage(); void goTo(int p) (limit 1..pages); int leftPages()
//    • Main: nextPage a few times; print left.
    public static void main(String[] args) {

        Bookmark bm = new Bookmark();
        bm.title = "Percy Jackson";
        bm.page = 1;
        bm.pages = 700;
        bm.nextPage();
        bm.goTo(504);
        System.out.println(bm.leftPages());

    }
}
