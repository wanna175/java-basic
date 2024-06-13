package day2;

public class Car {
    private String model;
    private int distance;
    private int price;
    private String company;
    private char type;
    private boolean auto;
    private int year;
    private double gasmi;
    Car(String _model,int _distance,int _price,String _company,char _type,boolean _auto,int _year,double _gasmi){
        this.model = _model;
        this.distance = _distance;
        this.price = _price;
        this.company = _company;
        this.type = _type;
        this.auto = _auto;
        this.year = _year;
        this.gasmi = _gasmi;
    }
    public void printCarInfo(){
        System.out.println("모델: "+this.model);
        System.out.println("거리: "+this.distance+"km");
        System.out.println("가격: "+this.price);
        System.out.println("회사: "+this.company);
        System.out.println("타입: "+this.type+" type");
        System.out.println("오토: "+this.auto);
        System.out.println("년식: "+this.year);
        System.out.println("gasmi: "+this.gasmi);

    }
    //getter,setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGasmi() {
        return gasmi;
    }

    public void setGasmi(double gasmi) {
        this.gasmi = gasmi;
    }
}
