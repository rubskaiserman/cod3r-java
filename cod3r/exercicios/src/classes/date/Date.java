package classes.date;

public class Date {
    int year;
    int month;
    int day;

    public String getFormatDate(){
        return year + "-" + month + "-" + day; //Admito que achei essa versão mais legivel
        // return String.format("%d-%d-%d", year, month, day); Achei meio bagunçado mas é uma opção
    }
}
