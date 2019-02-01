package oop_cw.cw6;

/**
 * Создать класс, описывающий банкомат.  Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 10, 20 и 50(Например: int fifties = 12) Сделать методы для:
 * добавления денег в банкомат.
 * снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class ATM {
    private int fifties;
    private int tens;
    private int twenties;

    public final static String FIFTIES = "fifties";
    public final static String TENS = "tens";
    public final static String TWENTIES = "twenties";

    public final static int fiftiesAmount = 20;
    public final static int tensAmount = 20;
    public final static int twentiesAmount = 20;


    public ATM(int fifties, int tens, int twenties) {
        this.fifties = fifties;
        this.tens = tens;
        this.twenties = twenties;
    }

    public int getFifties() {
        return fifties;
    }

    public int getTens() {
        return tens;
    }

    public int getTwenties() {
        return twenties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public void setTens(int tens) {
        this.tens = tens;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "fifties=" + fifties +
                ", tens=" + tens +
                ", twenties=" + twenties +
                '}';
    }

    public void addMoney(String type, int amount) {
        if (getTwenties() + amount < twentiesAmount || getFifties() + amount < fiftiesAmount || getTens() + amount < tensAmount) {
            switch (type) {
                case (FIFTIES):
                    fifties = getFifties() + amount;
                    break;
                case (TENS):
                    tens = getTens() + amount;
                    break;
                case (TWENTIES):
                    twenties = getTwenties() + amount;
                    break;
            }
        } else {
            System.out.println("Невозможно добавить купюру");
        }


    }

    public boolean getMoney(int sum) {
        int havesum = getFifties() * 50 + getTens() * 10 + getTwenties() * 20;
        if (havesum < sum) {
            return false;
        } else {
            if (sum % 10 != 0) {
                System.out.println("Невозможно получить данную сумму,купюры только 10 20 50");
                return false;
            } else {
                int amountfift = sum / 50;
                int amounttwent = (sum - amountfift * 50) / 20;
                int amountten = (sum - amountfift * 50 - amounttwent * 20) / 10;
                System.out.println("Кол-во 50:  " + amountfift + "  Кол-во 20:  " + amounttwent + "  Кол-во 10: " + amountten);
            }
            return true;
        }
    }
}
