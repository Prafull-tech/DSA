package com.search;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {10,25,37,44,50,77,99};
        int res = 77;
        System.out.println("Position of given Number :: "+ search(arr,res));
    }

    private static int search(int []arr,int res) {
        int start = 0,end = arr.length-1;
        if (arr[end] < res) return -1;
        while (end>=start){
            int mid = (start+end)/2;
            if(arr[mid] == res){
                return mid+1;
            }
            if (arr[mid]<res) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}
