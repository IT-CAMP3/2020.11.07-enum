package pl.camp.it;

public class App {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("-------------");
        //user.sex = 'K';
        //user.sex = 'W';
        user.sex = Sex.MAN;
        System.out.println("-------------");
        user.sex = Sex.OTHER;
        System.out.println("-------------");
        user.sex.abc();
        System.out.println("-------------");
        Sex.MAN.abc();
        System.out.println("-------------");

        new User().abc();

        User user2 = new User();

        user2.sex = Sex.OTHER;

        System.out.println(user.sex == user2.sex);

        Sex.MAN.value = 5;
        Sex.WOMAN.value = 10;

        System.out.println(Sex.MAN.value);
        System.out.println(Sex.WOMAN.value);
    }
}
