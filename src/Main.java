import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String FanSpeed;
        String Bright;
        int Airsensor = 50;

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter System Name : ");
        String userName = myObj.nextLine();
        AirPurifier air = new AirPurifier(userName);
        while (air.Status == true) {
            air.ReValue(Airsensor);
            System.out.println("Select Number Command : ");
            System.out.println("1.Change Fan Speed");
            System.out.println("2.Change Display Bright");
            System.out.println("3.Show all status");
            System.out.println("4.Turn off system");
            Scanner CommandIn = new Scanner(System.in);
            System.out.print("Enter Selected : ");
            int Command = Integer.valueOf(CommandIn.nextLine());
            if (Command == 1) {
                System.out.println();
                System.out.print("Enter Fan Speed : ");
                air.FanSpeed = Integer.valueOf(CommandIn.nextLine());
            }
            if (Command == 2) {
                System.out.println();
                System.out.print("Enter Display Speed : ");
                air.DisplayBright = Integer.valueOf(CommandIn.nextLine());
            }
            if (Command == 3) {
                System.out.println();
                air.DisplayAllStatus();
            }
            if (Command == 4) {
                System.out.println();
                System.out.println("System closing!!!");
                air.Status = false;
            }
        }
    }
}