public class Main {

    public static void main(String[] args) {
        ITelephone hopesPhone;
        hopesPhone = new DeskPhone(123456);
        hopesPhone.powerOn();
        hopesPhone.callPhone(123456);
        hopesPhone.answer();

        hopesPhone = new MobilePhone(24565);
        hopesPhone.callPhone(24565);
        hopesPhone.answer();
    }
}
