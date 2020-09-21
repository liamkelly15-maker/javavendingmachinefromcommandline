package sample;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;


public class Admin extends User
{
    // instance variables - replace the example below with your own
    private String username=" ";
    
    private int password=0;

    
    public Admin (String ausername, int apassword)
    {
     username = ausername;
     
     password = apassword;
    }
    

    
    
    
    
    
    
    public ArrayList<Admin> getadmins()
    { 
      filereaderadmins fileread = new filereaderadmins();
      ArrayList<Admin> admins = new ArrayList<>();
      admins = fileread.getadmins();
       
      //ArrayList<Product> types = new ArrayList<Product>();
      
      //for (Product p : products)
      //   if (!types.contains(p)) types.add(p);

      //ArrayList<Product> r = new ArrayList<Product>();
      //for (int i = 0; i < types.size(); i++)
      //   r[i] = types.get(i);
      return admins;
    }
   
    public String getusername()
    {
          return username;
    }
    
    public int getpassword()
    {
          return password;
    }
    
    
    
    
    /**
      Formats the Customer's detail.
   */
   public String toString()
   { 
      return username + "," + password;
   }
   
    /*
    public boolean getchecklogin(int apassword, String ausername)
    {
    filereadercustomers fileread = new filereadercustomers();
    ArrayList<Customer> customers = new ArrayList<>();
    customers = fileread.getcustomers();    
    
    for (int i = 0; i < customers.size(); i++)
      { 
         Customer cust = customers.get(i);
         System.out.println(cust);
         if ((cust.getpass() == password) && (cust.getusername() == ausername)) {
             System.out.println("welcome "+ cust.getusername());
             return true;
            }  
    
     }
    return false;
    }
    */

}