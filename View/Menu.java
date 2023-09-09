/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;

public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> mchoice;

    public Menu(String tt, String... mc) {
        this.title = tt;
        this.mchoice = new ArrayList<>();
        for (String s : mc) {
            mchoice.add((T) s);
        }
    }
    public void display() { // print menu
        System.out.println(title);
        for (int i = 0; i < mchoice.size(); i++) {
            System.out.println((i + 1) + "." + mchoice.get(i));
        }
    }

    public abstract void execute();
    public void run(){
       display();
       execute();
    }

}