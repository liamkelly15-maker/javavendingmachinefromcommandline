package sample;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;


public class Customer extends User
{
    // instance variables - replace the example below with your own
    private String username=" ";
    private double credit=0.0;
    private int password=0;

    
    public Customer(String ausername, double aCredit, int apassword)
    {
     username = ausername;
     credit = aCredit;
     password = apassword;
    }
    

    
    
    
    
    
    
    public ArrayList<Customer> getCustomers()
    { 
      filereadercustomers fileread = new filereadercustomers();
      ArrayList<Customer> customers = new ArrayList<>();
      customers = fileread.getcustomers();
       
      //ArrayList<Product> types = new ArrayList<Product>();
      
      //for (Product p : products)
      //   if (!types.contains(p)) types.add(p);

      //ArrayList<Product> r = new ArrayList<Product>();
      //for (int i = 0; i < types.size(); i++)
      //   r[i] = types.get(i);
      return customers;
    }
   
    public String getusername()
    {
          return username;
    }
    
    public int getpassword()
    {
          return password;
    }
    
    public double getcredit()
    {
          return credit;
    }
    
    public void setcredit(double acredit)
    {
          credit=acredit;
    }
    
    
    
    /**
      Formats the Customer's detail.
   */
   public String toString()
   { 
      return username + "," + credit + "," + password;
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
