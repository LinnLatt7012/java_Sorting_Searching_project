/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP_CSV_Search_SortLinnLattOo;

/**
 *
 * @author User
 */
public class APP extends Feild{
       public static void main(String[] args) {
        CSVRead ObjforCSVRead=new CSVRead();
        String url="G:\\school\\Programming\\Programming assignment\\";
        ObjforCSVRead.readBooksFromCSV(url+"Customer.csv");
        
        int chk;
        if(Fileisnotfound){
            System.out.println("your File(Customer.csv) doesn't have in supported location \" C:\\Users\\User\\Desktop\\\" \nPlease recheck location of your file");
        }else{
            OjectforDisplay.display();
            System.out.println("The number of Row:"+Customers.size());
            do{
            System.out.println("\nChoose one option \n1.Sort&Display \t 2.Search&Dispaly \n3.Exit"
                    + "\nEnter your option ");
            chk = ScannerForInteger.nextInt();
            if(chk==1){
            OjectforDisplay.sortDisplay();
            }else if(chk==2){
            OjectforDisplay.searchDisplay();
            }else if(chk==3){
            continue;
            }else{
            System.out.println("Retry");}
            System.out.println("");
        }while(chk!=3);           
        }
    }
}
