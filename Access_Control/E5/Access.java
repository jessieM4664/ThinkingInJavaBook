package E5;

public class Access {
    public    String a = "public feild";
    protected String b = "protected feild";
              String c = "package-private feild";
    private   String d = "private feild";

    public void mA() {
        System.out.println("public method");
    }
    protected void mB() {
        System.out.println("protected method");
    }
    void mC() {
        System.out.println("package-private method");
    }
    private void mD() {
        System.out.println("private method");
    }
}
