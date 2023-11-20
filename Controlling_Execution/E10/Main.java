package E10;

public class Main {
    public static void main(String args[]) {
        for (int i = 1000; i < 10000; i++) {
            for (int j = 10; j < 99; j++) {
                for (int a = 10; a < 99; a++) {
                    if (i == a * j) {
                        //System.out.println(i + " == " + a + " * " + j);
                        String fourDig = Integer.toString(i);
                        String twoDig1 = Integer.toString(a);
                        String twoDig2 = Integer.toString(j);
                        String twotwoDig = twoDig1+twoDig2;
                        if (!fourDig.contains("000")) {
                            if (!fourDig.contains("00")) {
                                //System.out.println(i + " == " + a + " * " + j);
                                if (fourDig.contains("" + twotwoDig.charAt(0)) &&
                                    fourDig.contains("" + twotwoDig.charAt(1)) &&
                                    fourDig.contains("" + twotwoDig.charAt(2)) &&
                                    fourDig.contains("" + twotwoDig.charAt(3))) {
                                    System.out.println(i + " == " + a + " * " + j);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
