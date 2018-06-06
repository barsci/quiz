package pl.pollub.pizzaquiz;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public final class ButtonManagement {
    private final RadioButton[] radioButtonAnswers;
    private final RadioGroup radioGroup;
    private final TextView questionNumber;
    private final TextView question;
    private final ImageView questionPicture;
    private final Button nextQuestion;
    private final Button checkQuestion;

    public ButtonManagement(final RadioButton[] radioButtonAnswers, final RadioGroup radioGroup, final TextView questionNumber,
                            final TextView question, final ImageView questionPicture, final Button nextQuestion, final Button checkQuestion) {
        this.radioButtonAnswers = radioButtonAnswers;
        this.radioGroup = radioGroup;
        this.questionNumber = questionNumber;
        this.question = question;
        this.questionPicture = questionPicture;
        this.nextQuestion = nextQuestion;
        this.checkQuestion = checkQuestion;
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

    public TextView getQuestion() {
        return question;
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
}
