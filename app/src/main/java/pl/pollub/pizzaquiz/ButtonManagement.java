package pl.pollub.pizzaquiz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

public final class ButtonManagement {
    private final RadioButton[] radioButtonAnswers = new RadioButton[4];
    private final RadioGroup radioGroup;
    private final TextView questionNumber;
    private final TextView questionTextView;
    private final ImageView questionPicture;
    private final Button nextQuestion;
    private final Button checkQuestion;
    private final View view;

    public ButtonManagement(View v) {
        this.view = v;
        this.radioGroup = (RadioGroup) v.findViewById(R.id.radioGroup2);
        this.radioButtonAnswers[0] = (RadioButton) v.findViewById(R.id.rb1);
        this.radioButtonAnswers[1] = (RadioButton) v.findViewById(R.id.rb2);
        this.radioButtonAnswers[2] = (RadioButton) v.findViewById(R.id.rb3);
        this.radioButtonAnswers[3] = (RadioButton) v.findViewById(R.id.rb4);
        this.questionNumber = (TextView) v.findViewById(R.id.textView);
        this.questionTextView = (TextView) v.findViewById(R.id.tv1);
        this.questionPicture = (ImageView) v.findViewById(R.id.imageView);
        this.nextQuestion = (Button) v.findViewById(R.id.button);
        this.checkQuestion = (Button) v.findViewById(R.id.button2);
    }

    public RadioButton[] getRadioButtonAnswers() {
        return radioButtonAnswers;
    }

    public RadioGroup getRadioGroup() {
        return radioGroup;
    }

    public TextView getQuestionNumber() {
        return questionNumber;
    }

    public TextView getQuestionTextView() {
        return questionTextView;
    }

    public ImageView getQuestionPicture() {
        return questionPicture;
    }

    public Button getNextQuestion() {
        return nextQuestion;
    }

    public Button getCheckQuestion() {
        return checkQuestion;
    }

    public void setQuestionNumber(String text){
        this.questionNumber.setText(text);
    }

    public void clearRadioGroup(){
        this.radioGroup.clearCheck();
    }

    public void checkButtonColor(int color){
        this.checkQuestion.setBackgroundColor(color);
    }

    public String checkedButtonAnswer(){
        RadioButton rb = this.view.findViewById(this.radioGroup.getCheckedRadioButtonId());
        return rb.getText().toString();
    }

    public void setFinalButton(){
        this.nextQuestion.setText("Zakończ");
    }
}
