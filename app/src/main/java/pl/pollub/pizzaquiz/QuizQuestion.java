package pl.pollub.pizzaquiz;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizQuestion extends AppCompatActivity{
    private String pytanie;
    private String[] odpowiedzi;
    private String poprawna;
    private int obrazek;

    boolean sprawdzOdpowiedz(String odpowiedz) {
        return this.poprawna.equals(odpowiedz);
    }

    void wyswietl(ButtonManagement buttonManagement) {
        buttonManagement.displayAnswerOnRadioButtons(odpowiedzi);
        buttonManagement.displayQuestionText(pytanie);
        buttonManagement.displayQuestionImage(obrazek);
    }

    void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    void setOdpowiedzi(String[] odpowiedzi) {
        this.odpowiedzi=odpowiedzi;
    }

    void setPoprawna(String poprawna) {
        this.poprawna = poprawna;
    }

    void setObrazek(int obrazek) {
        this.obrazek = obrazek;
    }
}
