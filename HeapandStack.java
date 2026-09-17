class Computer
{
    public void playMusic()
    {
        System.out.println("Music Played");
    }

    public String getMeAPen(int cost){
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    }
}
public class HeapandStack {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(0);
        System.out.println(str);

    }
}
