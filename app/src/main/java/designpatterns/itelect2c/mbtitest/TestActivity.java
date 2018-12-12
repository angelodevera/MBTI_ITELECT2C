package designpatterns.itelect2c.mbtitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import designpatterns.itelect2c.iterator.GenericRepository;
import designpatterns.itelect2c.iterator.Iterator;
import designpatterns.itelect2c.strategy.EvaluationStrategy;
import designpatterns.itelect2c.strategy.IncrementE;
import designpatterns.itelect2c.strategy.IncrementF;
import designpatterns.itelect2c.strategy.IncrementI;
import designpatterns.itelect2c.strategy.IncrementJ;
import designpatterns.itelect2c.strategy.IncrementN;
import designpatterns.itelect2c.strategy.IncrementP;
import designpatterns.itelect2c.strategy.IncrementS;
import designpatterns.itelect2c.strategy.IncrementT;

public class TestActivity extends AppCompatActivity {
    GenericRepository<PersonalityQuestion> mbtiQuestionGenericRepository;
    Iterator<PersonalityQuestion> mbtiQuestionIterator;
    PersonalityQuestion currentQuestion;
    TextView tv_question;
//    TextView result;
    Button choiceA;
    Button choiceB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        this.mbtiQuestionGenericRepository = new GenericRepository<>(generateQuestions());
        this.mbtiQuestionIterator=  mbtiQuestionGenericRepository.getIterator();
        currentQuestion = null;
        tv_question = findViewById(R.id.tv_question);
        choiceA = findViewById(R.id.choiceA);
        choiceB = findViewById(R.id.choiceB);
//        result = findViewById(R.id.result);

        setQuestion(mbtiQuestionIterator.current());
    }

    public void setQuestion(PersonalityQuestion q){
        tv_question.setText(q.getQuestion());
        choiceA.setText(q.getChoiceA());
        choiceB.setText(q.getChoiceB());
    }

    public void answerA(View v){
        if(this.mbtiQuestionIterator.hasNext()){
            PersonalityQuestion personalityQuestion = mbtiQuestionIterator.current();
            personalityQuestion.setEval(personalityQuestion.getStrategyA());
            mbtiQuestionIterator.update(personalityQuestion);
            this.mbtiQuestionIterator.next();
            if(this.mbtiQuestionIterator.hasNext()){
                this.currentQuestion = this.mbtiQuestionIterator.current();
                setQuestion(this.currentQuestion);
            }
            else{
                TestEvaluator testEvaluator = new TestEvaluator(mbtiQuestionGenericRepository);
                Intent i = null, chooser = null;
                i = new Intent( TestActivity.this, EvaluateActivity.class);
                i.putExtra("scores",testEvaluator.mbtIscores);
                i.putExtra("type",testEvaluator.result);
                TestActivity.this.startActivity(i);
            }
        }
    }

    public void answerB(View v){
        if(this.mbtiQuestionIterator.hasNext()){
            PersonalityQuestion personalityQuestion = mbtiQuestionIterator.current();
            personalityQuestion.setEval(personalityQuestion.getStrategyB());
            mbtiQuestionIterator.update(personalityQuestion);
            this.mbtiQuestionIterator.next();
            if(this.mbtiQuestionIterator.hasNext()){
                this.currentQuestion = this.mbtiQuestionIterator.current();
                setQuestion(this.currentQuestion);
            }
            else{
            TestEvaluator testEvaluator = new TestEvaluator(mbtiQuestionGenericRepository);
//                result.setText(testEvaluator.result);

                Intent i = null, chooser = null;
                i = new Intent( TestActivity.this, EvaluateActivity.class);
                i.putExtra("scores",testEvaluator.mbtIscores);
                i.putExtra("type",testEvaluator.result);
                TestActivity.this.startActivity(i);
            }
        }

    }




    public PersonalityQuestion[] generateQuestions(){
        PersonalityQuestion[] personalityQuestions = new PersonalityQuestion[20];
        String question,type,choiceA,choiceB;
        EvaluationStrategy<MBTIscores> strategyA,strategyB;

        question="1) When you are with a group of people, would you usually rather";
        type ="ei";
        choiceA= "a) Join in the talk of the group, or";
        choiceB = "b) Talk individually with people you know well?";
        strategyA = new IncrementE();
        strategyB = new IncrementI();
        personalityQuestions[0] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="2) Do you usually get along better with";
        type ="sn";
        choiceA= "a) Realistic people, or";
        choiceB = "b) Imaginative people?";
        strategyA = new IncrementS();
        strategyB = new IncrementN();
        personalityQuestions[1] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="3) Which word in the pair appeals to you more?";
        type ="tf";
        choiceA= "a) Analyze ";
        choiceB = "b) Sympathize";
        strategyA = new IncrementT();
        strategyB = new IncrementF();
        personalityQuestions[2] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="4) Does following a schedule ";
        type ="jp";
        choiceA= "a) Appeal to you, or";
        choiceB = "b) Cramp you?";
        strategyA = new IncrementJ();
        strategyB = new IncrementP();
        personalityQuestions[3] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="5) When you have to meet strangers, do you find it ";
        type ="ei";
        choiceA= "a) Pleasant, or at lease easy, or";
        choiceB = "b) Something that takes a good deal of effort?";
        strategyA = new IncrementE();
        strategyB = new IncrementI();
        personalityQuestions[4] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="6) If you were a teacher, would you rather teach";
        type ="sn";
        choiceA= "a) Fact courses, or";
        choiceB = "b) Courses involving theory?";
        strategyA = new IncrementS();
        strategyB = new IncrementN();
        personalityQuestions[5] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="7) Which word in the pair appeals to you more?";
        type ="tf";
        choiceA= "a) Foresight";
        choiceB = "b) Compassion";
        strategyA = new IncrementT();
        strategyB = new IncrementF();
        personalityQuestions[6] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="8) Do you prefer to";
        type ="jp";
        choiceA= "a) Arrange dates, parties, etc., well in advance, or";
        choiceB = "b) Be free to do whatever looks like fun when the time comes?";
        strategyA = new IncrementJ();
        strategyB = new IncrementP();
        personalityQuestions[7] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="9) Are you";
        type ="ei";
        choiceA= "a) Easy to get to know, or";
        choiceB = "b) Hard to get to know? ";
        strategyA = new IncrementE();
        strategyB = new IncrementI();
        personalityQuestions[8] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="10) Is it higher praise to say someone has ";
        type ="sn";
        choiceA= "a) Common sense, or";
        choiceB = "b) Vision? ";
        strategyA = new IncrementS();
        strategyB = new IncrementN();
        personalityQuestions[9] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="11) Which word in the pair appeals to you more?";
        type ="tf";
        choiceA= " a.) Firm  ";
        choiceB = "b) Gentle";
        strategyA = new IncrementT();
        strategyB = new IncrementF();
        personalityQuestions[10] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="12) Does the idea of making a list of what you should get ";
        type ="jp";
        choiceA= "a) Appeal to you, or";
        choiceB = "b) Leave you cold";
        strategyA = new IncrementJ();
        strategyB = new IncrementP();
        personalityQuestions[11] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="13) Do you tend to have";
        type ="ei";
        choiceA= "a) Broad friendships with many different people, or ";
        choiceB = "b) Deep friendships with a very few people?  ";
        strategyA = new IncrementE();
        strategyB = new IncrementI();
        personalityQuestions[12] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="14) Would you rather have as a friend someone who";
        type ="sn";
        choiceA= "a) Has both feet on the ground, or  ";
        choiceB = "b) Is always coming up with new ideas? ";
        strategyA = new IncrementS();
        strategyB = new IncrementN();
        personalityQuestions[13] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="15) Which word in the pair appeals to you more?";
        type ="tf";
        choiceA= "a) Thinking ";
        choiceB = "b) Feeling ";
        strategyA = new IncrementT();
        strategyB = new IncrementF();
        personalityQuestions[14] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="16) When it is settled well in advance that you will do a certain thing at a certain time, do you find it";
        type ="jp";
        choiceA= "a) Nice to be able to plan accordingly, or ";
        choiceB = "b) A little unpleasant to be tied down?";
        strategyA = new IncrementJ();
        strategyB = new IncrementP();
        personalityQuestions[15] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);


        question="17) At parties, do you";
        type ="ei";
        choiceA= "a) Always have fun, or ";
        choiceB = "b) Sometimes get bored? ";
        strategyA = new IncrementE();
        strategyB = new IncrementI();
        personalityQuestions[16] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="18) Would you rather be considered";
        type ="sn";
        choiceA= "a) A practical person, or";
        choiceB = "b) An ingenious person?";
        strategyA = new IncrementS();
        strategyB = new IncrementN();
        personalityQuestions[17] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="19) Is it a higher compliment to be called ";
        type ="tf";
        choiceA= "a) A consistently reasonable person, or ";
        choiceB = "b) A person of real feeling? ";
        strategyA = new IncrementT();
        strategyB = new IncrementF();
        personalityQuestions[18] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        question="20) Is it harder for you to adapt to ";
        type ="jp";
        choiceA= "a) Constant change, or";
        choiceB = "b) Routine? ";
        strategyA = new IncrementJ();
        strategyB = new IncrementP();
        personalityQuestions[19] = new PersonalityQuestion(question,choiceA,choiceB,strategyA,strategyB);

        return personalityQuestions;
    }

}
