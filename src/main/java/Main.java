public class Main {
    public static void main(String[] args) {
        Book a1 = new Book();
        a1.nameBook = "Храбрая сердцем";
        Magazine ier5 = new Magazine();
        ier5.nameMagazine = "Хранители знаний";
        Printable[] mas1 = {a1, ier5};
        for(int i = 0; i<mas1.length; i++){
            mas1[i].print();
            if (mas1[i] instanceof Book){
                ((Book) mas1[i]).printBooks(mas1);
            }
            if (mas1[i] instanceof Magazine){
                ((Magazine) mas1[i]).printMagazines(mas1);
            }
        }
    }
}
