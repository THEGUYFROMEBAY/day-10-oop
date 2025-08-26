package GradeCard;

public class Main {
//    43  GradeCard
//    • Fields: String name; int[] marks
//    • Methods: void setMark(int i,int v); double average(); char letter() (90=A…)
//            • Main: fill marks; print average + letter.

    public static void main(String[] args) {

        GC gc = new GC();
        gc.name = "John";
        gc.setMark(0, 43);
        gc.setMark(1, 65);
        gc.setMark(2, 67);
        gc.setMark(3, 78);
        gc.setMark(4, 98);
        System.out.println(gc.avg());
        System.out.println(gc.letter());

    }

}
