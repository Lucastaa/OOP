package BaiTapOOP.Bai5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %15s %-15s %-15s %-20s\n","Ma_Hang","Ten_Hang","Don_Gia","NSX","HSD","Ghi Chu");
        System.out.println("------------------------------------------------------");
        try {
            Node Gao = new Node("001", "Gao", 100000d, LocalDate.of(2018, 7, 8), LocalDate.of(2021, 7, 10));
            Node Mi = new Node("002", "Mi", 5000f, LocalDate.of(2020, 5, 22), LocalDate.of(2021, 11, 22));
            Node Nuoc = new Node("003", "Nuoc", -10000f, LocalDate.of(2017, 3, 1), LocalDate.of(2020, 3, 8));

            System.out.println(Gao);
            System.out.println(Mi);
            System.out.println(Nuoc);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}

