package BuilderBank.Problem;

public class Run {
    public static void main(String[] args) {
        /*
        * BankAccount_v1 e göre constructer parametre sıralaması şu şekilde iken : long accountNumber, String owner, double balance
        * BankAccount_v2 de constructer parametre sıralaması : long accountNumber, String owner, String branch, double balance, double interestRate
        * Sonradan eklenen parametreler ve araya eklenen parametreler karmaşıklığa neden olmaktadır.
        * Her yeni bir alan için ana sınıfların tamamında geliştirme gerekliliği ve kullanılan yerlerin gözden geçirilmesi gerekir.
        * Çözüm olarak sınıfların buider design pattern ile Builder sınıfları üzerinden yönetilmesi sağlanmıştır.
        * */

        BankAccount_v2 account = new BankAccount_v2(456L, "Marge", "Springfield", 100.00, 2.5);
        BankAccount_v2 anotherAccount = new BankAccount_v2(789L, "Homer", null, 2.5, 100.00);
    }
}
