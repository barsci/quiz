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

        RadioButton[] radioButtonstab = {(RadioButton) findViewById(R.id.rb1),
                (RadioButton) findViewById(R.id.rb2),
                (RadioButton) findViewById(R.id.rb3),
                (RadioButton) findViewById(R.id.rb4)};
        TextView tvQuestion = (TextView) findViewById(R.id.tv1);
        TextView tvQuestionNumber = (TextView) findViewById(R.id.textView);
        ImageView questionPicture = (ImageView) findViewById(R.id.imageView);
        Button nextQuestion = (Button) findViewById(R.id.button);
        Button checkQuestion = (Button) findViewById(R.id.button2);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup2);

        buttonManagement = new ButtonManagement(radioButtonstab, rg, tvQuestionNumber,
                tvQuestion, questionPicture, nextQuestion, checkQuestion);
        BazaPytan bazaPytan = new BazaPytan();

        pytania = bazaPytan.losujPytania(bazaPytan.getListaPytan());
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
        if (nr_pytania<=9)
        {
            buttonManagement.getRadioGroup().clearCheck();

            buttonManagement.getCheckQuestion().setBackgroundColor(Color.LTGRAY);

            nr++;
            buttonManagement.getQuestionNumber().setText("Pytanie nr "+ nr);
            if(nr_pytania>=9)
            {
                Button button = (Button) findViewById(R.id.button);
                button.setText("Zakończ");
            }
            pytania.get(nr_pytania).wyswietl(buttonManagement);
            flaga=false;
        }
        else
        {
            Intent intent =  new Intent(this,Wyniki.class);
            intent.putExtra("wynik",wynik);
            startActivity(intent);
            finish();
        }
    }

    public boolean sprawdzodp() {
        RadioButton rb = (RadioButton) findViewById(buttonManagement.getRadioGroup().getCheckedRadioButtonId());
        String odp = rb.getText().toString();
        return pytania.get(nr_pytania).sprawdzOdpowiedz(odp);
    }

    public void dzwiek(View view) {
        if (sound != null) {
            sound.reset();
            sound.release();
        }
        if (sprawdzodp()) {
            sound = MediaPlayer.create(this,R.raw.dobrze);
            buttonManagement.getCheckQuestion().setBackgroundColor(Color.GREEN);
            wynik++;
            sound.start();
        }
        else {
            sound = MediaPlayer.create(this,R.raw.zle);
            buttonManagement.getCheckQuestion().setBackgroundColor(Color.RED);
            sound.start();
        }
    }
}