package BaiTapOOP.Bai2;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        Node var2 = new Node("123","dang", 5,3);
        Node var3 = new Node("42","young milo", 4,3);
        Node var4 = new Node();
        System.out.println("Nhap vao thong tin sv3");
        System.out.println("MSSV: ");
        String var5 = var1.next();
        var4.setMSSV(var5);
        System.out.println("Ho ten: ");
        String var6 = var1.next();
        var4.setHTen(var6);
        System.out.println("Diem ly thuyet: ");
        float var7 = var1.nextFloat();
        var4.setLt(var7);
        System.out.println("Diem thuc hanh: ");
        float var8 = var1.nextFloat();
        var4.setTh(var8);
        System.out.printf("%-10s %-20s %10s %10s %10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("==========================================================================");
        System.out.println(var2.toString());
        System.out.println(var3.toString());
        System.out.println(var4.toString());

    }
}
