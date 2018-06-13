package pl.pollub.pizzaquiz;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;

import java.util.List;

public class Pytania extends AppCompatActivity {

    int wynik=0;
    int nr=1;
    int nr_pytania = 0;
    MediaPlayer sound;
    boolean flaga=false;
    ButtonManagement buttonManagement;
    List<QuizQuestion> pytania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytania);

        View view = this.findViewById(android.R.id.content);
        buttonManagement = new ButtonManagement(view);
        BazaPytan bazaPytan = new BazaPytan();

        pytania = bazaPytan.losujPytania(bazaPytan.getListaPytan());
        buttonManagement.setQuestionNumber("Pytanie nr "+ (nr_pytania+1));
        pytania.get(nr_pytania).wyswietl(buttonManagement);
    }

    public void odpowiedz(View view) {
        if(!flaga) {
            dzwiek(view);
        }
        flaga=true;
    }

    public void kolejne(View view) {
        nr_pytania++;
        if (nr_pytania<=9) {
            buttonManagement.clearRadioGroup();
            buttonManagement.checkButtonColor(Color.LTGRAY);
            buttonManagement.setQuestionNumber("Pytanie nr "+ (nr_pytania+1));
            if(nr_pytania>=9) {
                buttonManagement.setFinalButton();
            }
            pytania.get(nr_pytania).wyswietl(buttonManagement);
            flaga=false;
        }
        else {
            Intent intent =  new Intent(this,Wyniki.class);
            intent.putExtra("wynik",wynik);
            startActivity(intent);
            finish();
        }
    }

    public boolean sprawdzodp() {
        return pytania.get(nr_pytania).sprawdzOdpowiedz(buttonManagement.checkedButtonAnswer());
    }

    public void dzwiek(View view) {
        if (sound != null) {
            sound.reset();
            sound.release();
        }
        if (sprawdzodp()) {
            sound = MediaPlayer.create(this,R.raw.dobrze);
            buttonManagement.checkButtonColor(Color.GREEN);
            wynik++;
            sound.start();
        }
        else {
            sound = MediaPlayer.create(this,R.raw.zle);
            buttonManagement.checkButtonColor(Color.RED);
            sound.start();
        }
    }
}