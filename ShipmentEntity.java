package asses4;

public class ShipmentEntity {
  
 protected String shipmentEntityName;
 protected String identificationNumber;
 
 public ShipmentEntity(String shipmentEntityName, String identificationNumber) {
  
  this.shipmentEntityName = shipmentEntityName;
  this.identificationNumber = identificationNumber;
}
 
 public String getIdentificationNumber() {
  return identificationNumber;
}
public void setIdentificationNumber(String identificationNumber) {
  this.identificationNumber = identificationNumber;
}
public String getShipmentEntityName() {
  return shipmentEntityName;
}
public void setShipmentEntityName(String shipmentEntityName) {
  this.shipmentEntityName = shipmentEntityName;
}

void display() {
  
}

}
