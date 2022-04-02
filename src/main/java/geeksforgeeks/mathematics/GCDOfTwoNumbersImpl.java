package main.java.geeksforgeeks.mathematics;

import java.time.Duration;
import java.time.Instant;
/*
 * @author amarnath-nitt on 02-04-2022;
 */
public class GCDOfTwoNumbersImpl implements GCDOfTwoNumbers{
    @Override
    public long getGcdNaiveApproach(int a, int b) {
        int res = Math.min(a,b);
        while(res > 0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res -- ;
        }
        return res;
    }

    @Override
    public long getGcdUsingEuclideanApproach(int a, int b) {
        while(a != b){
            if ( a > b){
                a = a - b;
            }
            if( b > a){
                b = b - a;
            }
        }
        return a;
    }

    @Override
    public long getGcdUsingRecursion(int a, int b) {
        if(b == 0){
            return a;
        }
        return getGcdUsingRecursion(b , a %b);
    }
}
