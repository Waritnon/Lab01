public class AirPurifier {
    String Name;
    int AirQuality;
    int FanSpeed;
    int DisplayBright;
    boolean Status = false;
    void SetBright(int level){
        this.DisplayBright = level;
    }
    void ReValue(int Qval) {
        AirQuality = Qval;
    }
    void DisplayAllStatus(){
         System.out.println("System Name : " + Name);
         System.out.println("Air Quality : " + AirQuality);
         System.out.println("Fan Speed : " + FanSpeed);
         System.out.println("Dispaly Bright : " + DisplayBright );
         System.out.println();
    }
    AirPurifier(){}
    AirPurifier(String name){
            this.FanSpeed = 50;
            this.DisplayBright = 30;
            this.Status = true;
            this.Name = name;
        }
    }

