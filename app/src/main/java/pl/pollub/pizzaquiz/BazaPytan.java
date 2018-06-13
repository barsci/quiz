package pl.pollub.pizzaquiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public final class BazaPytan {
    private final ArrayList<QuizQuestion> listaPytan = new ArrayList<>();

    public ArrayList<QuizQuestion> getListaPytan() {

        QuizQuestion pyt1 = new QuizQuestion();
        pyt1.setPytanie("Jakiego ciasta pierwotnie używano do robienia pizzy?");
        String[] odpowiedz1 = {"makaronowego", "drożdżowego", "focaccia", "francuskiego"};
        pyt1.setOdpowiedzi(odpowiedz1);
        pyt1.setPoprawna("makaronowego");
        pyt1.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt1);

        QuizQuestion pyt2 = new QuizQuestion();
        pyt2.setPytanie("Kiedy powstała pizza, która wyglądem była najbardziej zbliżona do współczesnej?");
        String[] odpowiedz2 = {"1882", "1900", "1889", "1698"};
        pyt2.setOdpowiedzi(odpowiedz2);
        pyt2.setPoprawna("1889");
        pyt2.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt2);

        QuizQuestion pyt3 = new QuizQuestion();
        pyt3.setPytanie("Kiedy ludzie jedzą najwięcej pizzy?");
        String[] odpowiedz3 = {"w piątek wieczorem", "w czwartek wieczorem", "w sobotę wieczorem", "w niedzielę wieczorem"};
        pyt3.setOdpowiedzi(odpowiedz3);
        pyt3.setPoprawna("w sobotę wieczorem");
        pyt3.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt3);

        QuizQuestion pyt4 = new QuizQuestion();
        pyt4.setPytanie("Skąd pochodzi pizza hawajska?");
        String[] odpowiedz4 = {"z kanady", "z chin", "z hawajów", "z meksyku"};
        pyt4.setOdpowiedzi(odpowiedz4);
        pyt4.setPoprawna("z kanady");
        pyt4.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt4);

        QuizQuestion pyt5 = new QuizQuestion();
        pyt5.setPytanie("Ile kosztowała najdroższa pizza na świecie (cena za kawałek)?");
        String[] odpowiedz5 = {"$4,500", "$450", "$300", "$178"};
        pyt5.setOdpowiedzi(odpowiedz5);
        pyt5.setPoprawna("$450");
        pyt5.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt5);

        QuizQuestion pyt6 = new QuizQuestion();
        pyt6.setPytanie("Jaki jest rekord w jedzeniu pizzy?");
        String[] odpowiedz6 = {"50 cm pizzy w 41,31 sekundy", "40 cm pizzy w 41,31 sekundy", "30 cm pizzy w 41,31 sekundy", "20 cm pizzy w 41,31 sekundy"};
        pyt6.setOdpowiedzi(odpowiedz6);
        pyt6.setPoprawna("30 cm pizzy w 41,31 sekundy");
        pyt6.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt6);

        QuizQuestion pyt7 = new QuizQuestion();
        pyt7.setPytanie("Kto jest rekordzistą w robieniu placków do pizzy?");
        String[] odpowiedz7 = {"Fabian McDonald", "David McDonald", "Bruno Del Arroz", "Bruno di Fabio"};
        pyt7.setOdpowiedzi(odpowiedz7);
        pyt7.setPoprawna("Bruno di Fabio");
        pyt7.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt7);

        QuizQuestion pyt8 = new QuizQuestion();
        pyt8.setPytanie("Obywatele jakiego państwa zjadają najwięcej pizzy rocznie?");
        String[] odpowiedz8 = {"Rosji", "Stanów Zjednoczonych", "Norwegii", "Japonii"};
        pyt8.setOdpowiedzi(odpowiedz8);
        pyt8.setPoprawna("Norwegii");
        pyt8.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt8);

        QuizQuestion pyt9 = new QuizQuestion();
        pyt9.setPytanie("Kiedy obchodzony jest międzynarodowy dzień pizzy?");
        String[] odpowiedz9 = {"23 czerwca", "9 lutego", "21 lipca", "29 kwietnia"};
        pyt9.setOdpowiedzi(odpowiedz9);
        pyt9.setPoprawna("9 lutego");
        pyt9.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt9);

        QuizQuestion pyt10 = new QuizQuestion();
        pyt10.setPytanie("Ile pizzerii znajduje się na terenie Stanów Zjednoczonych?");
        String[] odpowiedz10 = {"ponad 6000", "ponad 100 000", "ponad 62 000", "ponad 34 000"};
        pyt10.setOdpowiedzi(odpowiedz10);
        pyt10.setPoprawna("ponad 62 000");
        pyt10.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt10);

        QuizQuestion pyt11 = new QuizQuestion();
        pyt11.setPytanie("Ile jest gatunków pizzy?");
        String[] odpowiedz11 = {"około 40", "około 50", "dokładnie 42", "dokładnie 28"};
        pyt11.setOdpowiedzi(odpowiedz11);
        pyt11.setPoprawna("około 50");
        pyt11.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt11);

        QuizQuestion pyt12 = new QuizQuestion();
        pyt12.setPytanie("Jak się nazywa podstawowa pizza? ");
        String[] odpowiedz12 = {"neapolitańska", "margherita", "margarita", "calzone"};
        pyt12.setOdpowiedzi(odpowiedz12);
        pyt12.setPoprawna("margherita");
        pyt12.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt12);

        QuizQuestion pyt13 = new QuizQuestion();
        pyt13.setPytanie("Jaki ser znajduje się na pizzy Margherita?");
        String[] odpowiedz13 = {"camembert", "feta", "mozarella", "gouda"};
        pyt13.setOdpowiedzi(odpowiedz13);
        pyt13.setPoprawna("mozarella");
        pyt13.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt13);

        QuizQuestion pyt14 = new QuizQuestion();
        pyt14.setPytanie("Na jakiej pizzy znajdziemy tuńczyka?");
        String[] odpowiedz14 = {"con funghi", "calabrese", "al prosciutto", "salame"};
        pyt14.setOdpowiedzi(odpowiedz14);
        pyt14.setPoprawna("calabrese");
        pyt14.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt14);

        QuizQuestion pyt15 = new QuizQuestion();
        pyt15.setPytanie("Jaka jest popularna nazwa \"białej pizzy\"?");
        String[] odpowiedz15 = {"bianca", "white", "ziti", "blanc"};
        pyt15.setOdpowiedzi(odpowiedz15);
        pyt15.setPoprawna("bianca");
        pyt15.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt15);

        QuizQuestion pyt16 = new QuizQuestion();
        pyt16.setPytanie("Jak nazywa się włoska pizza na grubym cieście, o prostokątnym kształcie? ");
        String[] odpowiedz16 = {"pepperoni", "sycylijska", "calzone", "super"};
        pyt16.setOdpowiedzi(odpowiedz16);
        pyt16.setPoprawna("sycylijska");
        pyt16.setObrazek(R.drawable.pizza);
        listaPytan.add(pyt16);

    return new ArrayList<>(listaPytan);
    }

    public ArrayList<QuizQuestion> losujPytania(ArrayList<QuizQuestion> doLosowania){
        Collections.shuffle(doLosowania);
        return new ArrayList<>(doLosowania);
    }
}
