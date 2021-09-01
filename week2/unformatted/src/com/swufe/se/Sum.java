package com.swufe.se;
import java.util.Arrays;
public class Sum{
public int addSum(int[] array) {
    int sum = 0;
   for (int i =0; i<array.length;i++)
        {
            sum += i;}
        return sum;}
    public int addSumV2(int[] array){
    return Arrays.stream(array).sum();
    }
    public static void main(String[] args) {
        Sum sum=new Sum(); int[] array=new int[]{1, 2, 3, 9, 19, 20, 8};
        assert (sum.addSum(array) == sum.addSumV2(array));
    }}