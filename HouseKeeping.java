import java.util.Scanner;

public class HouseKeeping implements HotelService{
    private String roomNumber;
    @Override
    public void serviceNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("What room number needs house keeping?: ");
        roomNumber=sc.nextLine();
        cleanRoom(roomNumber);
    }
    public void cleanRoom(String roomNumber){
        System.out.print("\nSending house keeping for room: " + roomNumber + "\n");
    }
}
