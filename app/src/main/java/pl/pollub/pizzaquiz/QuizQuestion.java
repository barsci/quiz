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
        return (this.poprawna.equals(odpowiedz));
    }

    void wyswietl(ButtonManagement buttonManagement) {
        for(int i=0;i<4;i++)
            buttonManagement.getRadioButtonAnswers()[i].setText(this.odpowiedzi[i]);
        buttonManagement.getQuestionTextView().setText(pytanie);
        buttonManagement.getQuestionPicture().setImageResource(obrazek);
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

    public String getPytanie() {
        return pytanie;
    }

    public String[] getOdpowiedzi() {
        return odpowiedzi;
    }

    public String getPoprawna() {
        return poprawna;
    }

    public int getObrazek() {
        return obrazek;
    }
}
