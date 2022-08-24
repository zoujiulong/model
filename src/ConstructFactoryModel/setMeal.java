package ConstructFactoryModel;

/**
 * @author zoujl
 * @create 2022-08-22-20:55
 */
public class setMeal {
    private String productA="炸鸡";
    private String productB="汉堡";
    private String productC="鸡排";
    private String productD="可乐";

    public String getProductA() {
        return productA;
    }

    public void setProductA(String productA) {
        this.productA = productA;
    }

    public String getProductB() {
        return productB;
    }

    public void setProductB(String productB) {
        this.productB = productB;
    }

    public String getProductC() {
        return productC;
    }

    public void setProductC(String productC) {
        this.productC = productC;
    }

    public String getProductD() {
        return productD;
    }

    public void setProductD(String productD) {
        this.productD = productD;
    }

    @Override
    public String toString() {
        return "setMeal{" +
                "productA='" + productA + '\'' +
                ", productB='" + productB + '\'' +
                ", productC='" + productC + '\'' +
                ", productD='" + productD + '\'' +
                '}';
    }
}
