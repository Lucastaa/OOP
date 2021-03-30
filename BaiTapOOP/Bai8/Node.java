package BaiTapOOP.Bai8;

public class Node {
    private int maCD;
    private String name;
    private int soBai;
    private double giaThanh;

    public Node() {
        this.maCD = 999999;
        this.name = "chua xac dinh";
        this.soBai = 1;
        this.giaThanh = 1;
    }
    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoBai() {
        return soBai;
    }

    public void setSoBai(int soBai) {
        this.soBai = soBai;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public Node(int maCD, String name, int soBai, double giaThanh) {
        if (maCD>0) {
            this.maCD = maCD;
        }
        if (!name.trim().equals("")) {
            this.name = name;
        }
        if (soBai>0) {
            this.soBai = soBai;
        }
        if (giaThanh>0.0) {
            this.giaThanh = giaThanh;
        }
    }

    @Override
    public String toString() {

        String ft = String.format("%-10d %-10s %-10d %-10.2f", maCD, name, soBai, giaThanh);
        return ft;
    }
}
