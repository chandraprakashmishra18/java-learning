class CalculatorC1{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
    public int add(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        CalculatorC1 obj = new CalculatorC1();
        int result = obj.add(5,6,9);
        System.out.println(result);
    }
}
