/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Element {

    private int sizeOfArray;
    private int[] arrayNumber;

    public Element(int sizeOfArray, int[] arrayNumber) {
        this.sizeOfArray = sizeOfArray;
        this.arrayNumber = arrayNumber;
    }

    public Element() {
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public int[] getArrayNumber() {
        return arrayNumber;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public void setArrayNumber(int[] arrayNumber) {
        this.arrayNumber = arrayNumber;
    }
}


