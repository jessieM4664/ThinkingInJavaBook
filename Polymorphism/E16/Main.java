package E16;


public class Main {
    public static void main(String args[]) {
        Starship star = new Starship();
        star.alert();
        star.change();
        star.alert();
    }
}

class Starship {
    private AlertStatus alertMessage = new Safe();
    public void change() {alertMessage = new Critical();}
    public void alert() {alertMessage.m();} 
}

class AlertStatus {
    public void m() { }
}

class Safe extends AlertStatus {
    public void m() {System.out.println("Safe()");}
}

class Critical extends AlertStatus {
    public void m() {System.out.println("Critical()");}
}