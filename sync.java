public class sync{
    public static void main(String[] args) {
        System.out.println("order pizza");

        preparepizza();
        System.out.println("succesfully ordered");
    }
    static void preparepizza(){
        try {
            Thread.sleep(1000);
            System.out.println("pizza delivered");
        } catch (Exception e) {
        }
    }
}