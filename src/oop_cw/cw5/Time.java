package oop_cw.cw5;

/**
 * Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте Создать два конструктора: первый принимает общее количество секунд,
 * второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.  Написать программу для тестирования возможностей класса.
 */
public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
        System.out.println("3");
    }

    public Time(String str) {
        this(Integer.valueOf(str));
        System.out.println("1");
    }

    public Time(int allSeconds) {
        int sec = (allSeconds % 3600) % 60;
        int hour = (allSeconds / 3600);
        int minut = (allSeconds % 3600) / 60;
        this.seconds = sec;
        this.hours = hour;
        this.minutes = minut;
        System.out.println("2");
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

//
//    public int allseconds(Object object) {
//        int result = hours * 3600 + minutes * 60 + seconds;
//        System.out.println("Время в секундах равно  "+ result);
//        return result;
//    }
//
//    public void fromSecond(Object object) {
//        int newhours = seconds / 3600;
//        int newminets = (seconds - newhours * 3600) / 60;
//        int newseconds = seconds-newhours*3600-newminets*60;
//        System.out.println("Часы  "+ newhours+"  Минуты "+ newminets+"  Секунды  "+newseconds);
//
//    }
}
