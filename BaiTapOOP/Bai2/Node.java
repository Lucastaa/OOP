package BaiTapOOP.Bai2;

public class Node {
    private String MSSV;
    private String HTen;
    private float Lt,Th;

    public Node() {
        MSSV = "NULL";
        HTen = "NULL";
        Lt = 0.0f; Th = 0.0f;
    }

    public Node(String var1, String var2, float var3, float var4) {
        if (var1 == null) {
            this.MSSV = "NULL";
        } else {
            this.MSSV = var1;
        }
        if (!var2.equals("")) {
            this.HTen = var2;
        } else {
            this.HTen = null;
        }
        if ((float)var3 >= 0.0f && (float)var3 <= 10.0f ) {
            Lt = var3;
        } else {
            Lt = 0.0f;
        }
        if ((float)var4 >= 0.0f && (float)var4 <= 10.0f ) {
            Th = var4;
        } else {
            Th = 0.0f;
        }
    }
    public float diemTrungBinh() {
        return (Lt + Th)/2.0f;
    }


    //Getter Setter
    public String getMSSV() {
        return MSSV;
    }
    public String getHTen() {
        return HTen;
    }
    public float getLt() {
        return Lt;
    }
    public float getTh() {
        return Th;
    }
    public void setMSSV(String var1) { this.MSSV = var1; }
    public void setHTen(String var2) {
        this.HTen = var2;
    }
    public void setLt(float var3) {
        Lt = var3;
    }
    public void setTh(float var4) {
        Th = var4;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %10.2f %10.2f %10.2f", this.MSSV, this.HTen, this.Lt, this.Th, this.diemTrungBinh());
    }
}
