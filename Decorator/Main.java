
public class Main {

    public static void main(String[] args) {
        room myBedRoom = new bedRoom(10);
        room myLivingRoom = new livingRoom(18);
        
        //before decoration
        System.out.println("Before decoration: \n");
        myBedRoom.printDescription();
        myLivingRoom.printDescription();
        
        room myBedRoomNewDesign = new design(myBedRoom);
        room myLivingRoomNewDesign = new design(myLivingRoom);
        
        //after decoration
        System.out.println("\nAfter decoration: \n");
        
        myBedRoomNewDesign.printDescription();
        myLivingRoomNewDesign.printDescription();
    }
}
