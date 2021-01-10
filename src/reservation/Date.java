package reservation;

// tworzę własną klasę (typ) do przechowywania daty
public class Date { // potrzebuję dnia, miesiąca, roku
    int day; // w klasie mogą być zmienne
    int month;
    int year;

    // konstruktor - specjalna metoda, która nie ma typu zwracanego (nawet void) i nazywa się tak, jak klasa !
    public Date(int year, int m, int d){ // specjalna metoda uruchamiana przy tworzeniu klasy - new com.inqoo.syntaxd01.basics.Date
        // inicjuje dzień, m-c, rok wartościami przekazanymi jako argumenty konstruktora
        this.year = year;
        month = m;
        day = d;
    }


    // metody

    public String getInfo(){ return year+"/"+month+"/"+day; }
    public void printDate(){ // metoda to kod zamknięty w nawiasach klamrowych który ma nazwę, parametry (nieobowiązkowe)
        // oraz typ zwracany
        // jest dostępna z każdego miejsca - 'public'
        // nic nie zwraca - 'void' - void - metoda NIC NIE ZWRACA, nie można przypisać jej wyw. do zmiennej
        // nazywa się 'printDate'
        // nie przyjmuje argumentów '()'
        System.out.println("Dziś jest "+this.year+"/"+this.month+"/"+this.day);
    }

    public int getYear(){ // zwraca int
        return this.year; // zwraca rok
    }
    public void printDateEn(){
        System.out.println("Today is "+this.year+"/"+this.month+"/"+this.day);
    }
}