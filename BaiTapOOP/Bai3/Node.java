package BaiTapOOP.Bai3;

public class Node {
    private double ma, mb, mc;

    public Node() {
        this.ma = 0.0d;
        this.mb = 0.0d;
        this.mc = 0.0d;
    }
    public double tinhChuvi() {
        return ma+mb+mc;
    }
    public double tinhDienTich() {
        double p = (ma+mb+mc)/2.0d;
        return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
    }
    public String kieuTamGiac() {
        if (ma+mb>mc||ma+mc>mb||mb+mc>ma) {

        } if (ma==mb||mb==mc||ma==mc) {
            System.out.println("Đây là tam giác cân");
        } else if(ma==mb&&mb==mc) {
            System.out.println("Đây là tam giác đều");
        }
        else {
            System.out.println("Không phải tam giác");
        }
        return "n";
    }

    @Override
    public String toString() {
        return kieuTamGiac()+"ChuVi: "+tinhChuvi()+"dientich: "+tinhDienTich()+
                "ma=" + ma +
                ", mb=" + mb +
                ", mc=" + mc +
                '}';
    }

    public double getMa() {
        return ma;
    }

    public void setMa(double ma) { if(ma>0)
        this.ma = ma;
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) { if(mb>0)
        this.mb = mb;
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) { if(mc>0)
        this.mc = mc;
    }

    public Node(double ma, double mb, double mc) {
        if (ma<=0||mb<=0||mc<=0) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        } else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
        if (ma+mb<mc||ma+mc<mb||mb+mc<ma) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }

    }
}
