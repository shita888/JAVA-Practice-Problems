 
public class Furniture{
 
 
private int DoorSize = 0;
private String DoorColor = null;
private int WindowSize = 0;
private String TableType = null;
private String ChairColor = null;


   public void setDoorSize(int DoorSize){
       this.DoorSize = DoorSize;
   }

   public void setDoorColor(String Doorcolor){
       this.DoorColor = Doorcolor;
   }

 public void setWindowSize(int WindowSize){
       this.WindowSize = WindowSize;
   }

 public void setTableType(String TableType){
       this.TableType = TableType;
   }

 public void setChairColor(String ChairColor){
       this.ChairColor = ChairColor;
   }
   

   public int getDoorSize(){
       return DoorSize;
   }
   public String getDoorColor(){
       return DoorColor;
   }
    public int getWindowSize(){
       return WindowSize;
   }
    public String getTableType(){
       return TableType;
   }
    public String getChairColor(){
       return ChairColor;
   }


}
