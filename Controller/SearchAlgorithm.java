/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Dai Nhan
 */
public class SearchAlgorithm {

    public int linerSearch(int[] arr, int input) {
       
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i]) 
            return i;
        }
        return -1;
    }

    public int binarySearch(int[] arr, int left, int right, int number) {
        //Binary Sort
//        ArrayList<Integer> n = null;
        if (right >= left) {
            // chia 2 mảng
            int mid = left + (right - left) / 2;
            if (arr[mid] == number) {
//                n.add(mid);
                return mid;
            }

            if (arr[mid] <  number) {
                return binarySearch(arr, mid + 1, right, number);
            }

            if (arr[mid] > number) {
                return binarySearch(arr, left, mid - 1, number);
            }
        }
//        if(n != null){
//            leftNumber(arr, n.get(0) - 1, n.get(0), n);
//            rightNumber(arr, n.get(0) + 1, n.get(0), n);
//            return n;
//        }

        return -1;
    }

//    public ArrayList<Integer> leftNumber(int[] arr, int leftMid, int mid , ArrayList<Integer> n){
//        if(leftMid == mid){
//           n.add(mid);
//           return leftNumber(arr, leftMid - 1, leftMid, n);
//        }
//        return n;
//    }
//    
// public ArrayList<Integer> rightNumber(int[] arr, int rightMid, int mid , ArrayList<Integer> n){
//        if(rightMid == mid){
//           n.add(mid);
//           return leftNumber(arr, rightMid + 1, rightMid, n);
//        }
//        return n;
//    }
}
