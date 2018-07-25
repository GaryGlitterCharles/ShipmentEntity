package asses4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   List<Customer> details1 = new ArrayList<>();
   List<Company> details2= new ArrayList<>();
   List<Agent> details3= new ArrayList<>();
   List<Carrier> details4= new ArrayList<>();
   System.out.println("Enter the number of shipment entity");
   int shipmentEntity = sc.nextInt();
   sc.nextLine();
   for(int i=0;i<shipmentEntity;i++) 
   {
     System.out.println("Enter the shipment entity "+(i+1)+" details :");
     System.out.println("Select the shipment entity type");
     System.out.println("1)Customer\n2)Company\n3)Agent\n4)Carrier");
     int choise = sc.nextInt();
     if(choise==1) {
       sc.nextLine();
       String details = sc.nextLine();
       String[] split = details.split(",");
       Customer customer = new Customer(split[0],split[1],Integer.valueOf(split[2]),split[3]);
       details1.add(customer);
       }
     else if(choise==2) {
       sc.nextLine();
       String details = sc.nextLine();
       String[] split = details.split(",");
       Company company = new Company(split[0],split[1],split[2],split[3],split[4]);
       details2.add(company);
     }
     else if(choise==3) {
       sc.nextLine();
       String details = sc.nextLine();
       String[] split = details.split(",");
       Agent agent = new Agent(split[0],split[1],split[2],split[3],split[4]);
       details3.add(agent);
      }
     else if(choise==4) {
       sc.nextLine();
       String details = sc.nextLine();
       String[] split = details.split(",");
       Carrier carrier = new Carrier(split[0],split[1],split[2],split[3]);
       details4.add(carrier);
     }
   }
   System.out.println("Shipment details are");
   System.out.println("Enter the shipment entity type to display");
   String entity = sc.nextLine();
   if(entity.equals("Customer")) 
   {
     System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");
     for(Customer cus :details1) {
       cus.display();
     }
   }
   else if(entity.equals("Company")) {
     System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");
     for(Company com : details2) {
       com.display();
     }
   }
   else if(entity.equals("Agent")) {
     System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number ","Agent Name","IATA","FMC");
     for(Agent age : details3) {
       age.display();
     }
   }
   else if(entity.equals("Carrier")) {
     System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");
     for(Carrier car:details4) {
       car.display();
     }
   }
   

  }

}
