public class Main {

    public static void main(String[] args) {

        JeepWrangler jeepWrangler = new JeepWrangler(1, 36);
        jeepWrangler.steer(45);
        jeepWrangler.accelerate(30);
        jeepWrangler.accelerate(20);
        jeepWrangler.accelerate(-42);
    }

}
