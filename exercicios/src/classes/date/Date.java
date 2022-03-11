package classes.date;

public class Date {
    int year;
    int month;
    int day;

    public Date(){
        // this.day = 1;
        // this.month = 1;
        // this.year = 1970;
        //Dia zero do calendário UNIX  
        this(1970, 1, 1); 

    }
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getFormatDate(){
        return year + "-" + month + "-" + day; //Admito que achei essa versão mais legivel
        // return String.format("%d-%d-%d", year, month, day); Achei meio bagunçado mas é uma opção
    }
}
