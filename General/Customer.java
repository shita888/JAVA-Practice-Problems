public class Customer{
public static void main(String args[]){

  Furniture obj = new Furniture();
obj.setDoorSize(100);
obj.setDoorColor("Brown");
obj.setWindowSize(400);
obj.setTableType("Wooden");
obj.setChairColor("Gray");

  System.out.println("DoorSize: "+obj.getDoorSize());
  System.out.println("DoorColor: "+obj.getDoorColor());
  System.out.println("WindowSize: "+obj.getWindowSize());
  System.out.println("TableType: "+obj.getTableType());
  System.out.println("ChairColor: "+obj.getChairColor());
    
 
}
}