package BaiTapOOP.Bai1;

public class Node {
    private String tenToaDo;
    private float x;
    private float y;

    public Node() {
        tenToaDo = "null";
        x = 0.0f;
        y = 0.0f;
    }
    public Node(String tenToaDo, float x, float y) {
        this.tenToaDo = tenToaDo;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tên tọa độ là: " + tenToaDo + "\'" +
                ", x= " + x +
                ", y= " + y +
                '}';
    }
}
