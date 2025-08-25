package TemperatureLog1;

public class TemperatureLog1 {
//    20  TemperatureLog1
//    • Fields: int[] log; int size
//    • Methods: void add(int t) (append if room); double avg(); int max()
//    • Main: add 5 temps; print avg and max.
    int size;
    int[] log = new int[5];

    public void add(int t){
        if(size < log.length){
            log[size] = t;
            size++;
        }
    }

    public double avg(){
        double sum = 0;
        for(int i = 0; i < log.length; i++){
            sum += log[i];
        }
        return sum/log.length;
    }

    public int max(){
        int max = log[0];
        for(int i = 0; i < log.length; i++){
            if(log[i] > max){
                max = log[i];
            }
        }
        return max;
    }
}
