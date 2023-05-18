public class Marks {
    public static void main(String arg[]){
        int math = 16, english = 12, programming =9 ,networking = 19;
        float total , average ;
        total = math+english+programming+networking;
        average = total/4;
        System.out.println(" Math :"+math+" /20 ");
        System.out.println("English :"+english+" /20");
        System.out.println("Programming :"+programming+" /20");
        System.out.println("Networking :"+networking+" /20");

        if (average > 14) {
            System.out.println("Good stundent");
        } else {
            System.out.println("Not Good student");
        }
    }
}
