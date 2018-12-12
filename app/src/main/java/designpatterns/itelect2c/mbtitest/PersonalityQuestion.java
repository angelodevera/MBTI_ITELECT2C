package designpatterns.itelect2c.mbtitest;

import designpatterns.itelect2c.strategy.EvaluationStrategy;

public class PersonalityQuestion {
    String question;
    String choiceA;
    String  choiceB;


    EvaluationStrategy strategyA;
    EvaluationStrategy strategyB;
    EvaluationStrategy eval;

    public PersonalityQuestion(String question, String choiceA, String choiceB,  EvaluationStrategy strategyA, EvaluationStrategy strategyB) {
        this.question = question;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.strategyA = strategyA;
        this.strategyB = strategyB;
    }

    public EvaluationStrategy getStrategyA() {
        return strategyA;
    }

    public void setStrategyA(EvaluationStrategy strategyA) {
        this.strategyA = strategyA;
    }

    public EvaluationStrategy getStrategyB() {
        return strategyB;
    }

    public void setStrategyB(EvaluationStrategy strategyB) {
        this.strategyB = strategyB;
    }

    public EvaluationStrategy getEval() {
        return eval;
    }

    public void setEval(EvaluationStrategy eval) {
        this.eval = eval;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    @Override
    public String toString() {
        return "PersonalityQuestion{" +
                "question='" + question + '\'' +
                ", choiceA='" + choiceA + '\'' +
                ", choiceB='" + choiceB + '\'' ;
    }

}
