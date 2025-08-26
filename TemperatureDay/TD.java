package TemperatureDay;

public class TD {
//    44  TemperatureDay
//    • Fields: int morning; int noon; int evening
//    • Methods: int max(); double avg()
//    • Main: print max and avg.
    int morning, noon, evening;

    public int max (){
        if (morning > noon && morning > evening){
            return morning;
        } else if ( noon > evening && noon > morning){
            return noon;
        } else if (evening > morning && evening < noon){
            return evening;
        } else return morning + noon + evening;
    }

    public double avg(){
        int sum  = 0;
        for (int i = 0; i <= morning; i++){
            sum += i;
        } return sum/3;
    }

}
