import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;
public class Main {
public static void main(String[] args) {
    BigDecimal bd;
    BigDecimal bd2;

    Scanner stdIn = new Scanner(System.in);
 
    String message = ""; // 肥満度を表示するメッセージ
 
    System.out.println("1人目のBMIを計算して肥満度を表示します。");
 
    System.out.print("・身長(m)を入力してください：");
    double height = stdIn.nextDouble(); // 身長を入力
    System.out.print("・体重(Kg)を入力してください：");
    double weight = stdIn.nextDouble(); // 体重を入力

    System.out.println("2人目のBMIを計算して肥満度を表示します。");
 
    System.out.print("・身長(m)を入力してください：");
    double height2 = stdIn.nextDouble(); // 身長を入力
    System.out.print("・体重(Kg)を入力してください：");
    double weight2 = stdIn.nextDouble(); // 体重を入力
 
    /**
     *  「BMIの計算」
     *  BMI = 体重(Kg) × (身長(m))2
     */
    
    double bmi = weight / Math.pow(height, 2);

    double bmi2 = weight2 / Math.pow(height2, 2);

    bd = new BigDecimal(bmi);
    bd = bd.setScale(2, RoundingMode.HALF_UP);

    bd2 = new BigDecimal(bmi2);
    bd2 = bd2.setScale(2, RoundingMode.HALF_UP);


    System.out.println(bd.toString());
    System.out.println(bd2.toString());

}
}
