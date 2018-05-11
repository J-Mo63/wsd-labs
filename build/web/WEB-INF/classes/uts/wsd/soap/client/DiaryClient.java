/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap.client;

import java.util.Scanner;

/**
 *
 * @author J-Mo
 */
public class DiaryClient {
    
    private static DiarySOAP diaryApp;
    
    public static void main(String[] args) throws Exception_Exception {
        DiaryApp locator = new DiaryApp();
        diaryApp = locator.getDiarySOAPPort();
        User user;     
        while ((user = searchUser()) != null) {
            System.out.println("Found " + user.getName());
        }
        System.out.println("No such user found.");
    }
    
    private static User searchUser() throws Exception_Exception {
        System.out.print("Enter email address: ");
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();
        return diaryApp.fetchUser(email);
    }
}
