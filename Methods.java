class Computer
{
    public void playMusic()
    {
        System.out.println("Music Played");
    }

    public String getMeAPen(int cost){
        return "Pen";
    }
}
public class Methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);

    }
}
