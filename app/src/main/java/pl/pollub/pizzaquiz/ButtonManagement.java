package pl.pollub.pizzaquiz;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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
        for(int i=0;i<4;i++)
            this.radioButtonAnswers[i] = (RadioButton) this.radioGroup.getChildAt(i);
        this.questionNumber = (TextView) v.findViewById(R.id.textView);
        this.questionTextView = (TextView) v.findViewById(R.id.tv1);
        this.questionPicture = (ImageView) v.findViewById(R.id.imageView);
        this.nextQuestion = (Button) v.findViewById(R.id.button);
        this.checkQuestion = (Button) v.findViewById(R.id.button2);
    }


    public void setQuestionNumber(String text) {
        this.questionNumber.setText(text);
    }

    public void clearRadioGroup() {
        this.radioGroup.clearCheck();
    }

    public void checkButtonColor(int color) {
        this.checkQuestion.setBackgroundColor(color);
    }

    public String checkedButtonAnswer() {
        RadioButton rb = this.view.findViewById(this.radioGroup.getCheckedRadioButtonId());
        return rb.getText().toString();
    }

    public void setFinalButton() {
        this.nextQuestion.setText("Zakończ");
    }

    public void displayQuestionText(String text) {
        this.questionTextView.setText(text);
    }

    public void displayQuestionImage(int obrazek) {
        this.questionPicture.setImageResource(obrazek);
    }

    public void displayAnswerOnRadioButtons(String[] tab) {
        for(int i=0;i<4;i++)
            this.radioButtonAnswers[i].setText(tab[i]);
    }

    public void lockUnlockCheckButton(boolean flaga){
        this.checkQuestion.setClickable(flaga);
    }
}