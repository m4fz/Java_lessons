package ru.java_lessons.lesson9;

import java.util.ArrayList;
import java.util.List;

public class MinStops {
    public static void main(String[] args) {
        List<Integer> stationsDistance1 = List.of(0,200,370,550,770,950);
        List<Integer> stationsDistance2 = List.of(0,300,430,670,800,1200);

        System.out.println(stopAmount(stationsDistance2, 550));
        System.out.println(stopAmount(stationsDistance1, 250));
    }
    private static Result stopAmount(List<Integer> stations, int charge){
        int result = 0;
        int start = 0;
        int next = 1;

        if (stations ==null || stations.isEmpty()) throw new EmptyStationListException("Station list is empty");
        if (charge <= 0) throw new OutOfChargeException("Low charge");
        if (charge - stations.get(1) < 0) throw new OutOfChargeException("Low charge");

//        while (start < next && next < stations.size()){
//            if (stations.get(next) - stations.get(start) <= charge){
//                next++;
//            } else {
//                start = next - 1;
//                result++;
//            }
//        }
//        Stack overflow error

        for (int station : stations){
            if (stations.get(next) - stations.get(start) <= charge){
                next++;
            } else {
                start = next - 1;
                result++;
            }
        }
        return next != stations.size() - 1 ? new Result("not enough charge", result) : new Result("there was enough charge to make it", result);
    }
    private record Result(String message, int chargeAmount){
        @Override
        public String toString() {
            return "Result is - " + message +
                    ", charge stations used = " + chargeAmount;
        }
    }
}
