package Ex8_8;

public class testFan {

    public static void main(String[] args) {
        Fan F1 = new Fan();
        System.out.println(F1.tostring() + "\n");
        Fan F2 = new Fan();
        F2.seton(true);
        F2.setSpeed(3);
        F2.setradius(10);
        F2.setcolor("yellow");
        System.out.println(F2.tostring());
    }

}
