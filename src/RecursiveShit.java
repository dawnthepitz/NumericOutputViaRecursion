
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RecursiveShit {
    public static void main(String []args)throws IOException{
        System.out.println("Input a number:");
        int input=Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Output:");
        countdown(input);
    }
    static void countdown(int x){
        if(x==0)return;
        disp(x);
        countdown(x-1);
    }
    static void disp(int x){
        if(x==0){
            System.out.println();
            return;
        }
        System.out.print(x);
        disp(x-1);
    }
}
