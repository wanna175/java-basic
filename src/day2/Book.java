package day2;

public class Book {
    public String title;
    public int price;
    public String company;
    public String author;
    public int total_page;
    public String isbn;
    Book(String _title,int _price,String _company,String _author,int _total_page,String _isbn){
        this.title = _title;
        this.price = _price;
        this.author = _author;
        this.company = _company;
        this.total_page = _total_page;
        this.isbn = _isbn;
    }
    public void printBookInfo(){
        System.out.println("제목: "+this.title);
        System.out.println("가격: "+this.price);
        System.out.println("회사: "+this.company);
        System.out.println("저자: "+this.author);
        System.out.println("페이지수: "+this.total_page);
        System.out.println("isbn: "+this.isbn);
    }

}
