 package com.codechef;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// using Arrays.copy method to merge an array:
        int[] nums1 = {2,4,6};
        int[] num2 = {8,5,3,9};
        double ans = findMedium(nums1,num2);
        System.out.println(ans);
    }
    public static double findMedium(int[] num1,int[] num2){
        int[] merged = new int[num1.length+num2.length];
        System.arraycopy(num1,0,merged,0,num1.length);
        System.arraycopy(num2,0,merged,num1.length,num2.length);
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
        int start = 0;
        int end = merged.length-1;
        int mid = (start+end)/2;
        if(merged.length%2==0){
            return (double)(merged[mid]+merged[mid+1])/2;
        }
        else{
            return merged[mid];
        }
    }
}

