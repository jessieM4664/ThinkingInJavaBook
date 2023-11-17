public class Globe {
    public static void main(String args[]) {
        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature();

        temp1.degrees = 96.8F;
        temp2.degrees = 78.2F;

        System.out.println("Temp1: " + temp1.degrees + ", Temp2: " + temp2.degrees);

        temp1.degrees = temp2.degrees;

        System.out.println("Temp1: " + temp1.degrees + ", Temp2: " + temp2.degrees);
    }
}
