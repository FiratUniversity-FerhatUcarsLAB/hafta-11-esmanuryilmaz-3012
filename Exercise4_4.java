public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // CEVAP: Kod sorunsuz çalışır. Metot 42 döndürür ama 
        // biz onu yakalamadığımız için değer hafızada kaybolur. Hata vermez.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // CEVAP: Derleme Hatası (Compile Error) verir.
        // Çünkü sayHello() 'void' döndürür (yani hiçlik). 
        // Hiçlik ile 7 sayısı toplanamaz.
    }
}
