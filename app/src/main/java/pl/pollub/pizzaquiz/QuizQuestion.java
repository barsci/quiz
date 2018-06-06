package pl.pollub.pizzaquiz;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizQuestion extends AppCompatActivity{
    private String pytanie;
    //private String odpowiedzi[];
    private Odpowiedzi odpowiedz;
    private String poprawna;
    private int obrazek;

    boolean sprawdzOdpowiedz(String odpowiedz) {
        return (this.poprawna.equals(odpowiedz));
    }

    void wyswietl(ButtonManagement buttonManagement) {
        buttonManagement.getRadioButtonAnswers()[0].setText(odpowiedz.getOdpowiedz1());
        buttonManagement.getRadioButtonAnswers()[1].setText(odpowiedz.getOdpowiedz2());
        buttonManagement.getRadioButtonAnswers()[2].setText(odpowiedz.getOdpowiedz3());
        buttonManagement.getRadioButtonAnswers()[3].setText(odpowiedz.getOdpowiedz4());
        buttonManagement.getQuestion().setText(pytanie);
        buttonManagement.getQuestionPicture().setImageResource(obrazek);
    }

    void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    void setOdpowiedzi(Odpowiedzi odpowiedz) {
        this.odpowiedz=odpowiedz;
    }
    void setPoprawna(String poprawna) {
        this.poprawna = poprawna;
    }

    void setObrazek(int obrazek) {
        this.obrazek = obrazek;
    }

    public String getPytanie() {
        return pytanie;
    }

    public Odpowiedzi getOdpowiedzi() {
        return odpowiedz;
    }

    public String getPoprawna() {
        return poprawna;
    }

    public int getObrazek() {
        return obrazek;
    }
}
