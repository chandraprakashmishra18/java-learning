class IfElse
{
    public static void main(String[] args) {
        int x = 8;
        int y = 9;
        int z = 10;

        if (y>x && y>z)
        {
            System.out.println(y);
            System.out.println("Thankyou");
        }
        else if(x>y && x>z)
            System.out.println(x);
        else 
            System.out.println(z);
    }
}