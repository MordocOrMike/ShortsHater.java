public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Type url");
        String url = ShortsHater.scan.nextLine();
        ShortsHater sh = new ShortsHater();
        System.out.println("Good link:");
        System.out.println(sh.urlSwitcher(url));
    }
}
