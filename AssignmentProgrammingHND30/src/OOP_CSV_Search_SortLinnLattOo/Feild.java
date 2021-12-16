/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP_CSV_Search_SortLinnLattOo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Feild {
        static int low=0;
        static String format= "|%-20s|%13s|%5d|%8s |\n";
        static String divider="=======================================================";
        
        static Scanner ScannerForString= new Scanner(System.in);
        static Scanner ScannerForInteger= new Scanner(System.in);
        protected static List<Customer> Customers = new ArrayList<>();        
        static boolean Fileisnotfound=false;
        static Display OjectforDisplay=new Display();
        static MergeSort ObjectforMergeSort=new MergeSort();
        static BinarySearch ObjectforBinarySearch = new BinarySearch();
        static char checkForsearch='0';
}

