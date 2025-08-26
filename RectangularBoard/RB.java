package RectangularBoard;

public class RB {
//     45  RectangleBoard
//    • Fields: int w; int h; char fill
//    • Methods: String draw() return lines using fill; int area()
//    • Main: draw a 3x5 board; print text.
    int w, h;
    char fill;

    public String draw(){

        String result = "";
        for(int i = 0; i < w; i++){
            result += fill;
            for(int j = 0; j < h; j++){
                result += fill;

            }
            result += " \n";
        }
        return result;

    }

    public int area(){
        return w*h;
    }

}
