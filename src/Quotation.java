public class Quotation {
    String quote = "Either you run the day, or the day runs you.";
    String author = "Jim Rohn";

    public void display() {
        System.out.println(quote + "\n\t\t" + author);
    }

    public static void main(String[] args) {
        Quotation quotation = new Quotation();
        quotation.display();
    }
}
