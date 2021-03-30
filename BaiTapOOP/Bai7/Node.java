package BaiTapOOP.Bai7;

public class Node {
    class toaDo {
        private String Ten;
        private float x, y;

        public toaDo(float x, float y,String Ten) {
            this.x = x;
            this.y = y;
            if(!Ten.trim().equals("")) {
                this.Ten = Ten;
            } else {
                this.Ten = "Toa do goc";
            }
        }
        public toaDo() {
            this.x = 0.0f;
            this.y = 0.0f;
            this.Ten = "Toa do goc";
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
    }
    class hinhTron {
        toaDo tam;
        private double pi = 3.14;
        private double banKinh;
        public double tinhCV() {
            return banKinh*2*pi;
        }
        public double tinhDT() {
            return banKinh*banKinh*pi;
        }

        public hinhTron(toaDo tam, double banKinh) {
            this.tam = tam;
            this.banKinh = banKinh;
        }

        public toaDo getTam() {
            return tam;
        }
        public void setTam(toaDo tam) {
            this.tam = tam;
        }
        public double getBanKinh() {
            return banKinh;
        }
        public void setBanKinh(double banKinh) {
            this.banKinh = banKinh;
        }
    }
}
