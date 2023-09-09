/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



/**
 *
 * @author Dai Nhan
 */
public class SortAlgorithm {
    

    public int[] buddleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
//=====================================================================

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //-----------------------------------
    public int[] quickSort(int[] arr, int left, int right) {
        if(left>=right){
            return arr;
        }
//        tạo biến i và j để ko làm thay đổi giá trị của left and right
        int i = left;
        int j = right;
//        cho giá trị của pivot là ở cuối mảng 
        int pivot = arr[right];
        
        while(i<j){
            while(arr[i] <= pivot && i<j){
                i++;
            }
            while(arr[j] >= pivot && i<j){
                j--;
            }
            swap(arr, i, j);
        }
        swap(arr, i, right);
//        sort mảng bên trái pivot
        quickSort(arr, left, i-1);
//        sort mảng bên phải pivot
        quickSort(arr, i+1, right);
        return arr;
    }


}
//=====================================================================