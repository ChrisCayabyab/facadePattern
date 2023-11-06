import java.util.Scanner;

public class Valet implements HotelService{

    private String plateNumber;
    Scanner sc = new Scanner(System.in);
    @Override
    public void serviceNumber() {
        System.out.print("\n[1]:Yes     [2]:No\nDo the guest need a valet: ");
        char answer = sc.nextLine().charAt(0);

        if(answer == '1'){
            System.out.print("\nPlease enter the plate number: ");
            plateNumber = sc.nextLine();
            pickUpVehicle(plateNumber);
        }
    }

    public void pickUpVehicle(String plateNumber){
        System.out.println("\nPicking up: " + plateNumber);
    }
}
