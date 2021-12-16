/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUICSV_Search_SortLinnLattOo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CSVRead extends GUIeventDrivenAPP{
     public static void readBooksFromCSV(String fileName) {
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine ();

            while (line != null) {
                String[] attributes = line.split (",");
                Customer Customer = createBook (attributes);
                Customers.add (Customer);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            Fileisnotfound=true;
        }
    }
// end of readBooksFromCSV method
  
  private static Customer createBook (String[] metadata) {
        String name = metadata [0];
        int age = Integer.parseInt(metadata[2]);
        String ph_no = metadata [1];
        String Gender = metadata [3];

        // create and return book of this metadata
        return new Customer (name, ph_no, age, Gender);
//        return new Book(metadata [0],Integer.parseInt(metadata[1]),metadata [2]);
    }
}
