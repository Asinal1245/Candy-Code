import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many Twix sold?");
    double twixct = scan.nextDouble();
    double twixpt = (.77 * twixct);
    System.out.println("How many Reeses sold?");
    double reesct = scan.nextDouble();
    double reespt = (.63 * reesct);
    System.out.println("How many Hersheys sold?");
    double hersheyct = scan.nextDouble();
    double hersheypt = (.84 * hersheyct);
    System.out.println("How many Sour patch sold?");
    double sourct = scan.nextDouble();
    double sourpt = (.18 * sourct);
    System.out.println("How many airheads sold?");
    double airheadct = scan.nextDouble();
    double airheadpt = (.37 * airheadct);
    double profit = twixpt + reespt + hersheypt + sourpt + airheadpt;
    System.out.println("total profit " + profit);
    double pay =(.3*profit);
    System.out.println(pay);
    }
}
