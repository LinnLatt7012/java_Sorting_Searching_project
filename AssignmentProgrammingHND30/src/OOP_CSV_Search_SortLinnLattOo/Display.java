/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP_CSV_Search_SortLinnLattOo;

import java.util.List;

/**
 *
 * @author User
 */
public class Display extends Feild{
    // the reason for using this display method is for specific data which have more than one line in file Like Gender, Age, 
    //Sometimes, name and phone-no can be also have more than one line Eg>>> two person with same name ,two persons using one ph_no like wired-phone
    public void searchDisplayName(List<Customer> Customers,String key,int index){
    
        System.out.println(index);
        int fchk = index;
        int schk = index;
        System.out.println("\n"+divider);
        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            System.out.println(key+" is not found");
        }else if( key.equalsIgnoreCase(Customers.get(index-1).getName())|| key.equalsIgnoreCase(Customers.get(index+1).getName())){
            System.out.println(divider);
            System.out.printf("%-20s|%13s|%5s|%8s |\n","Name","Phone_No","Age","Gender");
            System.out.println(divider);
            if(key.equalsIgnoreCase(Customers.get(index-1).getName())){
            do{
                System.out.println (Customers.get(fchk));
                fchk=fchk-1;
                    if(fchk==-1)
                        break;
            }while(key.equalsIgnoreCase(Customers.get(fchk).getName()) );
            }
            if(key.equalsIgnoreCase(Customers.get(index+1).getName())){  
                do{
                     if(fchk==index){
                        System.out.println (Customers.get(schk));
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(key.equalsIgnoreCase(Customers.get(schk).getName()));
            }     
        }else 
           System.out.println (Customers.get(index));
        }else 
           System.out.println (Customers.get(index));
        System.out.println(divider);
    } 
    public void searchDisplayGender(List<Customer> Customprs,String key,int index){
    
        System.out.println(index);
        int fchk = index;
        int schk = index;
        System.out.println("\n"+divider);
        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            System.out.println(key+" is not found");
        }else if( key.equalsIgnoreCase(Customers.get(index-1).getGender())|| key.equalsIgnoreCase(Customers.get(index+1).getGender())){
            System.out.println(divider);
            System.out.printf("%-20s|%13s|%5s|%8s |\n","Name","Phone_No","Age","Gender");
            System.out.println(divider);
            if(key.equalsIgnoreCase(Customers.get(index-1).getGender())){
            do{
                System.out.println (Customers.get(fchk));
                fchk=fchk-1;
                    if(fchk==-1)
                        break;
            }while(key.equalsIgnoreCase(Customers.get(fchk).getGender()) );
            }
            if(key.equalsIgnoreCase(Customers.get(index+1).getGender())){  
                do{
                     if(fchk==index){
                        System.out.println (Customers.get(schk));
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(key.equalsIgnoreCase(Customers.get(schk).getGender()));
            }     
        }else 
           System.out.println (Customers.get(index));
        }else 
           System.out.println (Customers.get(index));
        System.out.println(divider);
    }
    public void searchDisplayPhoneNo(List<Customer> Customers,String key,int index){
    
        System.out.println(index);
        int fchk = index;
        int schk = index;
        System.out.println("\n"+divider);
        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            System.out.println(key+" is not found");
        }else if( key.equalsIgnoreCase(Customers.get(index-1).getPh_no())|| key.equalsIgnoreCase(Customers.get(index+1).getPh_no())){
            System.out.println(divider);
            System.out.printf("%-20s|%13s|%5s|%8s |\n","Name","Phone_No","Age","Gender");
            System.out.println(divider);
            if(key.equalsIgnoreCase(Customers.get(index-1).getPh_no())){
            do{
                System.out.println (Customers.get(fchk));
                fchk=fchk-1;
                    if(fchk==-1)
                        break;
            }while(key.equalsIgnoreCase(Customers.get(fchk).getPh_no()) );
            }
            if(key.equalsIgnoreCase(Customers.get(index+1).getPh_no())){  
                do{
                     if(fchk==index){
                        System.out.println (Customers.get(schk));
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(key.equalsIgnoreCase(Customers.get(schk).getPh_no()));
            }     
        }else 
           System.out.println (Customers.get(index));
        }else 
           System.out.println (Customers.get(index));
        System.out.println(divider);
    }
    public void searchDisplayAge(List<Customer> Customers,int key,int index){
//        System.out.println(index);
        int fchk = index;
        int schk = index;
        System.out.println("\n"+divider);
        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            System.out.println(key+" is not found");
        }else if( Customers.get(index-1).getAge()==key || Customers.get(index+1).getAge()==key){
            
            System.out.printf("%-20s|%13s|%5s|%8s |\n","Name","Phone_No","Age","Gender");
            System.out.println(divider);
            if(Customers.get(index-1).getAge()==key){
                do{
                    System.out.println (Customers.get(fchk));
                    fchk=fchk-1;
                    if(fchk==-1)
                        break;
                }while(Customers.get(fchk).getAge()==key );
            }
            if(Customers.get(index+1).getAge()==key){  
                do{
                     if(fchk==index){
                        System.out.println (Customers.get(schk));
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(Customers.get(schk).getAge()==key );
            }
        }else 
           System.out.println (Customers.get(index));
        }else 
           System.out.println (Customers.get(index));
        System.out.println(divider);
    }

     
    public void sortDisplay(){
        int chk;
        do{
        System.out.print("Choose one Type to sort\n 1.Name \t 2.Gender \n 3.Phone.no \t 4.Age \n 5.exit"
                + "\n Your Option : ");
        chk = ScannerForInteger.nextInt();

        if(chk==1){
//            s2.bubbleSortString(name, Customers, age,  ph_no,Gender); 
            ObjectforMergeSort.sort(Customers,low,Customers.size()-1,"name");
//            s2.bubbleSortName(Customers);
            display();
        }else if(chk==2){
//            s2.bubbleSortGender(Customers);
            ObjectforMergeSort.sort(Customers, low,Customers.size()-1,"gender");
            display();
        }else if(chk==4){
//            s2.bubbleSortAge(Customers);
            ObjectforMergeSort.sort(Customers, low,Customers.size()-1,"age");
            display();
        }else if(chk==3){
//            s2.bubbleSortPhoneNo(Customers);
            ObjectforMergeSort.sort(Customers, low,Customers.size()-1,"ph_no");
            display();
        }else if(chk==5){
            continue;
        }else{
            System.out.println("Retry");}
            System.out.println("");
        }while(chk!=5); }
    public void display(){
        System.out.println(divider);
        System.out.printf("|%-20s|%13s|%5s|%8s|\n","Name","Phone_No","Age","Gender");
        System.out.println(divider);
        for (Customer b : Customers){
            System.out.println (b);
        }
        System.out.println(divider);        
        
    }       
    public void searchDisplay(){
        low= 0;
        int chk;
        do{
        System.out.print("Choose one Type to search\n 1.Name \t 2.Gender \n 3.Phone.no \t 4.Age \n 5.exit"
                + "\n Your Option : ");
        chk = ScannerForInteger.nextInt();
        String key;
        int key1;
        int index;
        if(chk==1){
//            s2.bubbleSortName(Customers);
            ObjectforMergeSort.sort(Customers, low,Customers.size()-1,"name");
            System.out.print("Enter Name: ");
            key = ScannerForString.nextLine();
            index=ObjectforBinarySearch.binarySearchName(Customers,low,Customers.size()-1,key);
            searchDisplayName(Customers,key,index);
//            Display(index);
            
        }else if(chk==2){
//            s2.bubbleSortGender(Customers);
            ObjectforMergeSort.sort(Customers, low,Customers.size()-1,"gender");
            System.out.print("Enter Gender: ");
            key = ScannerForString.nextLine();
            index= ObjectforBinarySearch.binarySearchGender(Customers,low,Customers.size()-1,key);
            searchDisplayGender(Customers,key,index);

        }else if(chk==4){
//            s2.bubbleSortAge(Customers);
            ObjectforMergeSort.sort(Customers, low,Customers.size()-1,"age");
            System.out.print("Enter Age: ");
            key1 = ScannerForInteger.nextInt();
            index= ObjectforBinarySearch.binarySearchAge(Customers,low,Customers.size()-1,key1);
            searchDisplayAge(Customers,key1,index);

        }else if(chk==3){
//            s2.bubbleSortPhoneNo(Customers);
            ObjectforMergeSort.sort(Customers, low,Customers.size()-1,"Ph_no");
            System.out.print("Enter Phone .No : ");
            key = ScannerForString.nextLine();
            index= ObjectforBinarySearch.binarySearchPhoneNo(Customers,low,Customers.size()-1,"09-"+key);
            searchDisplayPhoneNo(Customers,"09-"+key,index);
        }else if(chk==5){
            continue;
        }else{
            System.out.println("Retry");}
            System.out.println("");
        }while(chk!=5); 
        
    }
}
