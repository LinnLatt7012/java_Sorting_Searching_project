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
public class MergeSort {
    public void mergeAge(List<Customer> Customers, int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        Customer L[] = new Customer[n1]; 
        Customer R[] = new Customer[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = Customers.get(l + i); 
        for (int j=0; j<n2; ++j) 
            R[j] = Customers.get(m + 1+ j); 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].getAge() <= R[j].getAge()) 
            { 
                Customers.set(k,L[i]); 
                i++; 
            } 
            else
            { 
                Customers.set(k,R[j]);  
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            Customers.set(k,L[i]);  
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            Customers.set(k,R[j]);  
            j++; 
            k++; 
        } 
    } 
    public void mergeName(List<Customer> Customers, int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        Customer L[] = new Customer[n1]; 
        Customer R[] = new Customer[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i){ 
            L[i] = Customers.get(l + i);
            System.out.println(Customers.get(l + i));
        }
        for (int j=0; j<n2; ++j){
            R[j] = Customers.get(m + 1+ j); 
            System.out.println(Customers.get(m + 1+ j));
        }
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].getName().compareToIgnoreCase(R[j].getName())<=0) 
            { 
                Customers.set(k,L[i]); 
                System.out.println(L[i].getName());
                i++; 
            } 
            else
            { 
                Customers.set(k,R[j]);  
                System.out.println(R[j].getName());
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            Customers.set(k,L[i]); 
            System.out.println(L[i].getName());
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            Customers.set(k,R[j]); 
            System.out.println(R[j].getName());
            
            j++; 
            k++; 
        } 
    } 
    public void mergeGender(List<Customer> Customers, int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        Customer L[] = new Customer[n1]; 
        Customer R[] = new Customer[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = Customers.get(l + i); 
        for (int j=0; j<n2; ++j) 
            R[j] = Customers.get(m + 1+ j); 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].getGender().compareToIgnoreCase(R[j].getGender())<=0) 
            { 
                Customers.set(k,L[i]); 
                i++; 
            } 
            else
            { 
                Customers.set(k,R[j]);  
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            Customers.set(k,L[i]);  
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            Customers.set(k,R[j]);  
            j++; 
            k++; 
        } 
    } 
    public void mergePhoneNo(List<Customer> Customers, int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        Customer L[] = new Customer[n1]; 
        Customer R[] = new Customer[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = Customers.get(l + i); 
        for (int j=0; j<n2; ++j) 
            R[j] = Customers.get(m + 1+ j); 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].getPh_no().compareToIgnoreCase(R[j].getPh_no())<=0) 
            { 
                Customers.set(k,L[i]); 
                
                i++; 
            } 
            else
            { 
                Customers.set(k,R[j]);  
                j++; 
            }
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            Customers.set(k,L[i]);  
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            Customers.set(k,R[j]);  
            j++; 
            k++; 
        } 
    } 
 
    public void sort(List<Customer> Customer,int l,int r,String type) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
            // Sort first and second halves 
            sort(Customer, l, m,type); 
            sort(Customer , m+1, r,type); 
  
            // Merge the sorted halves 
            if(type.equals("name")){
            mergeName(Customer, l, m, r); 
          
            }else if(type.equals("age")){
            mergeAge(Customer, l, m, r);    
            }else if(type.equals("gender")){
            mergeGender(Customer, l, m, r);    
            }else{
            mergePhoneNo(Customer, l, m, r);    
            }
            
        } 
    }
    
}
