import java.util.Scanner;

public class ShortsHater
{
    public static Scanner scan = new Scanner(System.in);

//    public static void main(String[] args)
//    {
//        System.out.println("Type url");
//        String url = scan.nextLine();
//        ShortsHater sh = new ShortsHater();
//        System.out.println("Good link:");
//        System.out.println(sh.urlSwitcher(url));
//    }

    String urlSwitcher(String url)
    {
        boolean isThatCorrectUrl = false;
        if (!isThatCorrectUrl)
        {
            if (url.contains("shorts/"))
            {
                url = url.replace("shorts/", "watch?v=");
                isThatCorrectUrl = true;
            } else
            {
                System.out.println("Wrong url, type again");
                url = scan.nextLine();
            }
        }
        return url;
    }
}
//https://www.youtube.com/shorts/UeB2-dXRdk4
//shorts/
//watch?v=
