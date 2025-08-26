package GradeCard;

public class GC {
    //    43  GradeCard
//    • Fields: String name; int[] marks
//    • Methods: void setMark(int i,int v); double average(); char letter() (90=A…)
//            • Main: fill marks; print average + letter.
    String name;
    int[] marks =  new int[10];

    public void setMark(int i, int v){
        marks[i] = v;
    }

    public double avg(){
        int sum = 0;
        for (int i = 0; i < marks.length; i++){
            sum += marks[i];
        } return sum/marks.length;
    }

    public char letter() {
        if (avg() > 0 && avg() < 50) return 'F';
        else if (avg() > 50 && avg() < 70) return 'D';
        else if (avg() > 70 && avg() < 80) return 'C';
        else if (avg() > 80 && avg() < 90) return 'B';
        else if (avg() > 90 && avg() < 100) return 'A';
        return 'z';
    }
}
