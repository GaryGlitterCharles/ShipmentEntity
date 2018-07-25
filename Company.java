package asses4;

public class Company extends ShipmentEntity  
{
 private String identifier;
 private String iata;
 private String fmc;
public String getIdentifier() {
  return identifier;
}
public void setIdentifier(String identifier) {
  this.identifier = identifier;
}
public String getIata() {
  return iata;
}
public void setIata(String iata) {
  this.iata = iata;
}
public String getFmc() {
  return fmc;
}
public void setFmc(String fmc) {
  this.fmc = fmc;
}
public Company(String shipmentEntityName, String identificationNumber, String identifier, String iata, String fmc) {
  super(shipmentEntityName, identificationNumber);
  this.identifier = identifier;
  this.iata = iata;
  this.fmc = fmc;
}   
void display() {
  System.out.format("%-15s %-25s %-15s %-15s %-15s\n",this.shipmentEntityName,this.identificationNumber,this.identifier,this.iata,this.fmc);
}


}
