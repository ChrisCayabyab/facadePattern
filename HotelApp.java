public class HotelApp {
    public static void main(String[] args) {

        HotelService houseKeepHS = new HouseKeeping();
        FrontDesk frontDeskHouseKeep = new FrontDesk(houseKeepHS);

        HotelService valetHS = new Valet();
        FrontDesk frontDeskValet = new FrontDesk(valetHS);

        HotelService cartHS = new Cart();
        FrontDesk frontDeskCart = new FrontDesk(cartHS);


        System.out.println("""
                +-----------------------+
                | Welcome to SMH Hotel! |
                +-----------------------+""");

        frontDeskHouseKeep.requestNumber();
        frontDeskValet.requestNumber();
        frontDeskCart.requestNumber();

        System.out.println("\nThank you!... \nYou may now proceed to your room");

    }
}