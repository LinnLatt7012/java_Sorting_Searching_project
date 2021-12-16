/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUICSV_Search_SortLinnLattOo;

import java.util.List;

/**
 *
 * @author User
 */
public class BinarySearch {
    public int binarySearchAge(List<Customer> a,int l,int r, int x) { 
    
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        // If the element is present at the middle 
        // itself 
        if (a.get(mid).getAge() == x) 
            return mid; 
  
        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (a.get(mid).getAge() > x) 
            return binarySearchAge(a, l, mid - 1, x); 
  
        // Else the element can only be present 
        // in right subarray 
        return binarySearchAge(a, mid + 1, r, x); 
    } 
  
    // We reach here when element is not 
    // present in array 
    return -1; 
}     
    public int binarySearchName(List<Customer> a,int l,int r, String x) { 
    
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        // If the element is present at the middle 
        // itself 
        if (a.get(mid).getName().compareTo(x)==0) 
            return mid; 
  
        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (a.get(mid).getName().compareTo(x)>0) 
            return binarySearchName(a, l, mid - 1, x); 
  
        // Else the element can only be present 
        // in right subarray 
        else
        return binarySearchName(a, mid + 1, r, x); 
    } 
    return -1; 
    }  
    public int binarySearchGender(List<Customer> a,int l,int r, String x) { 
    
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        // If the element is present at the middle 
        // itself 
        if (a.get(mid).getGender().compareTo(x)==0) 
            return mid; 
  
        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (a.get(mid).getGender().compareTo(x)>0) 
            return binarySearchGender(a, l, mid - 1, x); 
  
        // Else the element can only be present 
        // in right subarray 
        else
        return binarySearchGender(a, mid + 1, r, x); 
    } 
    return -1; 
    }  
    public int binarySearchPhoneNo(List<Customer> a,int l,int r, String x) { 
    
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
  
        // If the element is present at the middle 
        // itself 
        if (a.get(mid).getPh_no().compareTo(x)==0) 
            return mid; 
  
        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (a.get(mid).getPh_no().compareTo(x)>0) 
            return binarySearchPhoneNo(a, l, mid - 1, x); 
  
        // Else the element can only be present 
        // in right subarray 
        else
        return binarySearchPhoneNo(a, mid + 1, r, x); 
    } 
    return -1; 
}
}
