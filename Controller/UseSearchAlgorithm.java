package controller;

import model.Element;
import view.Menu;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class UseSearchAlgorithm extends Menu<String> {

    private Element element;
    private SearchAlgorithm searchAlgorithm;
    private SortAlgorithm sortAlgorithm;

    public UseSearchAlgorithm() {
        super("Programming", new String[]{
            "Search", "Exit"
        });
        searchAlgorithm = new SearchAlgorithm();
        sortAlgorithm = new SortAlgorithm();
        element = new Element();
    }

public int numberArray() {
    int n;
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.print("Enter the number of elements in the array: ");
        try {
            String input = sc.nextLine();
            n = Integer.parseInt(input);
            if (n >= 1) {
                break;
            } else {
                System.out.println("Please enter a positive number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
    return n;
}


public void createArrayByInput(int n) {
    int[] arr = new int[n];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter " + n + " numbers:");
    for (int i = 0; i < n; i++) {
        while (true) {
            try {
                arr[i] = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    element.setArrayNumber(arr);
    element.setSizeOfArray(n);
}

//===========================================================================

    @Override
    public void execute() {
        display();
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        switch (input) {
            case "1":
                search();
                break;
            case "2":
                System.out.println("Exit...");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

public void search() {
    int number = numberArray();
    createArrayByInput(number);
    int[] arr = element.getArrayNumber();
    System.out.println("Your array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
        String[] mcSearch = {"Linear Search", "Binary Search", "Exit"};
        Menu menu = new Menu("Search Menu", mcSearch) {
            @Override
            public void execute() {
                Scanner sc = new Scanner(System.in);
                String input;
                input = sc.nextLine();
                switch (input) {
                    case "1":

                        System.out.println("Input number to search: ");
                        int numberSearch = sc.nextInt();
                        int numberfounded = searchAlgorithm.linerSearch(element.getArrayNumber(), numberSearch);
                        if (numberfounded == -1) {
                            System.out.println("Through linear search your number input not exist in array!");
                        } else {
                            System.out.println("Your input number located in position " + numberfounded + " of array");
                        }
                        break;
                    case "2":
                        element.setArrayNumber(sortAlgorithm.quickSort(element.getArrayNumber(), 0, number - 1));
                        System.out.println("Your array number after sort");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.println(arr[i]);
                        }
                        System.out.println("=======================");
                        System.out.println("Input number to search: ");
                        int numberSearch1 = sc.nextInt();
                        int numberFounded1 = searchAlgorithm.binarySearch(arr, 0, arr.length - 1, numberSearch1);
                        if (numberFounded1 == -1) {
                            System.out.println("Through linear search your number input not exist in array!");
                        } else {
                            System.out.println("Your input number located in position " + numberFounded1 + " of array");
                        }

                        break;
                    case "3":
                        System.out.println("Exit...");
                        break;
                    default:
                        System.out.println("Wrong choice");
                }

            }
        };
        menu.run();
    }
}
