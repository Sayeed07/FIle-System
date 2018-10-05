/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sabbir
 */
public class Files {
    
    static Scanner sc = new Scanner(System.in);
    private static Map map;
    static Queue<String> path = new LinkedList<>();
    
    public Map<String, Object> createFolder() {
        
        System.out.println("Select a name for new folder");
        String folder_name = sc.nextLine();
        
        
        if(map == null) {
            map = new HashMap<>();
        }
        
        map.put(folder_name, new Document());
        
        System.out.println("New folder "+folder_name+"is created.");
        
        return map;
    }
    
    void showAllFolder() {
        List<Object> allFolders = new ArrayList<>();
       
        for(Object m : map.keySet()) {
            allFolders.add(m);
        }
        
        for(Object ob: allFolders) {
             System.out.println(ob);
        }
        
        System.out.println("Press 4 to open a folder\nPress 5 to delete a folder");
    }
    
    void insertIntoFolder() {
    
        System.out.println("Type the name of folder");
        String folder_name = sc.nextLine();
        
        Document document = (Document) provideObject(folder_name);
        
        path.add(folder_name);
        
        if(Objects.equals(document.getData(), null)){
            System.out.println("your document is empty");
        }
        else
        {
            System.out.println(document.getData());
        }
        
        System.out.println("You can write here and save it.");
        String newData = sc.nextLine();
        document.setData(newData);
        System.out.println("Your data already saved");   
    }
    
    void deleteFolder() {
        System.out.println("Type the name of folder you want to delete");
        String folder_name = sc.nextLine();
        map.remove(folder_name);
        System.out.println("Dolder "+folder_name+" is deleted.");
    }
    
    Object provideObject(String folderName) {
	return map.get(folderName);
    }
    
    void printPath() {
        
        System.out.print("c://sayeed/");
        
        if(path.size()!=0) {
            for(String s : path) {
                System.out.println(s+"/");
            }
        }
        
        System.out.println();
    }
}
