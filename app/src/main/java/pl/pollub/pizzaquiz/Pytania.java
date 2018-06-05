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
    RadioButton tab[] = new RadioButton[4];
    TextView tv1;
    ImageView iv1;
    String odp;
    List<QuizQuestion> pytania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytania);

        tab[0] = (RadioButton) findViewById(R.id.rb1);
        tab[1] = (RadioButton) findViewById(R.id.rb2);
        tab[2] = (RadioButton) findViewById(R.id.rb3);
        tab[3] = (RadioButton) findViewById(R.id.rb4);
        tv1 = (TextView) findViewById(R.id.tv1);
        iv1 = (ImageView) findViewById(R.id.imageView);

        BazaPytan bazaPytan = new BazaPytan();
        pytania = bazaPytan.losujPytania(bazaPytan.getListaPytan());
        pytania.get(nr_pytania).wyswietl(tab, tv1, iv1);
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
            Button btn = (Button) findViewById(R.id.button2);
            TextView tv = (TextView) findViewById(R.id.textView);
            RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup2);
            rg.clearCheck();

            btn.setBackgroundColor(Color.LTGRAY);

            nr++;
            tv.setText("Pytanie nr "+ nr);
            if(nr_pytania>=9)
            {
                Button button = (Button) findViewById(R.id.button);
                button.setText("Zakończ");
            }
            pytania.get(nr_pytania).wyswietl(tab, tv1, iv1);
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
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        odp = rb.getText().toString();
        return pytania.get(nr_pytania).sprawdzOdpowiedz(odp);
    }

    public void dzwiek(View view) {
        Button btn = (Button) findViewById(R.id.button2);
        if (sound != null) {
            sound.reset();
            sound.release();
        }
        if (sprawdzodp()) {
            sound = MediaPlayer.create(this,R.raw.dobrze);
            btn.setBackgroundColor(Color.GREEN);
            wynik++;
            sound.start();
        }
        else {
            sound = MediaPlayer.create(this,R.raw.zle);
            btn.setBackgroundColor(Color.RED);
            sound.start();
        }
    }
}