package product.modal.bean;

public class Product {
    private int id;
    private String name;
    private String money;
    private String hang;

    public Product(){

    }

    public Product(int id, String name, String money, String hang) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.hang = hang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
}
