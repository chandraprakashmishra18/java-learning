class Calculator1
{
    int num;

    public int add(int n1,int n2){
        return n1 + n2;
    }
}
public class HeapandStack {
    public static void main(String[] args) {
        int data = 10;
        Calculator1 obj = new Calculator1();
        Calculator1 obj1 = new Calculator1();
        int r1 = obj.add(3,4);
        System.err.println(r1);
        System.err.println(obj1);
        System.err.println(obj);

    }
}
