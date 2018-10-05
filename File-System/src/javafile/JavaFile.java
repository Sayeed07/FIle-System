/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sabbir
 */
public class JavaFile {

    static Scanner sc = new Scanner(System.in);

    static Files files = new Files();

    public static void main(String[] args) {

        while (true) {

            System.out.println("Press 1 for Create a folder\nPress 2 for Check the path\nPress 3 for show all folders\npress 0 to stop the application");

            int flag = -1;

            try {
                
                flag = sc.nextInt();

                if (flag == 0) {
                    break;
                } else if (flag == 1) {
                    files.createFolder();
                } else if (flag == 2) {
                    files.printPath();
                } else if (flag == 3) {
                    files.showAllFolder();
                } else if (flag == 4) {
                    files.insertIntoFolder();
                } else if (flag == 5) {
                    files.deleteFolder();
                }
            } catch (Exception e) {
                System.out.println("Please insert  valid number");
                sc.next();
            }
        }
    }
}
