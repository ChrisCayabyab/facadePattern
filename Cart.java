import java.util.Scanner;

public class Cart implements HotelService{

    private Integer numberOfCarts;
    Scanner sc = new Scanner(System.in);
    @Override
    public void serviceNumber() {
        System.out.print("\n[1]:Yes     [2]:No\nDo the guest need cart/s?: ");
        char answer = sc.nextLine().charAt(0);

        if(answer == '1'){
            System.out.print("\nPlease enter how many: ");
            numberOfCarts = Integer.parseInt(sc.nextLine());
            requestCarts(numberOfCarts);
        }
    }

    public void requestCarts(Integer numberOfCarts){
        System.out.print("\nSending: " + numberOfCarts + " carts");

    }
}
