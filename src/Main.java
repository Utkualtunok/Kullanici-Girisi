import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;
        //Kullanıcı veri girişi
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.println("Şifreniz : ");
        password = inp.nextLine();

        //
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Hatalı giriş yaptınız.");
            System.out.println("Şifrenizi unuttuysanız değiştirmek ister misiniz ?");
            System.out.println("1-Evet\n2-Hayır");
            select = inp.nextInt();
            inp.nextLine();
            if (select == 1){
                System.out.println("Yeni şifrenizi giriniz : ");
                newPassword = inp.nextLine();
                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Giriş başarısız!");
            }
        }
    }
}