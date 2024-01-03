package com.example.GrokkingCodingInterview.pattern_sliding_window.pattern_sliding_window;

public class SmallestSubarray {

    public static int smallestSubarrayWithGivenSum (int[] arr, int S){
        int minLen = Integer.MAX_VALUE;
        int windowStart = 0, windowEnd, sum = 0;

        for (windowEnd = 0; windowEnd < arr.length; windowEnd++){
            sum += arr[windowEnd];

            while(sum >= S){
                minLen = Math.min(minLen, windowEnd - windowStart + 1);
                sum -= arr[windowStart];
                windowStart++;
            }

        }
        return minLen;

    }

    public static void main (String [] args){
        int minLen = SmallestSubarray.smallestSubarrayWithGivenSum(new int [] {3, 4, 1, 1, 6}, 8);
        System.out.println("smallest array size:" + minLen);
    }
}
