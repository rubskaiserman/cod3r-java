package classes.date;

public class DateTest {
    public static void main(String[] args){
        Date currentDate = new Date(2022, 2, 1);
        // currentDate.year = 2021;
        // currentDate.month = 12;
        // currentDate.day = 12;

        Date birthday = new Date();
        birthday.day = 3;
        birthday.month = 12;
        birthday.year = 2003; 

        System.out.println(currentDate.getFormatDate());
        System.out.println(birthday.getFormatDate());
    }
}
