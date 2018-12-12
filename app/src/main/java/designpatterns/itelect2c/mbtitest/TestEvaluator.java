package designpatterns.itelect2c.mbtitest;

import designpatterns.itelect2c.iterator.GenericRepository;
import designpatterns.itelect2c.iterator.Iterator;
import designpatterns.itelect2c.strategy.EvaluationStrategy;

public class TestEvaluator {
    GenericRepository<PersonalityQuestion> mbtiQuestionGenericRepository;
    MBTIscores mbtIscores;
    String result;

    public TestEvaluator(GenericRepository<PersonalityQuestion> mbtiQuestionGenericRepository) {
        mbtIscores = new MBTIscores();
        this.mbtiQuestionGenericRepository = mbtiQuestionGenericRepository;
        if (!checkEmptyAnswer(this.mbtiQuestionGenericRepository.getIterator())) {
            Iterator<PersonalityQuestion> it = mbtiQuestionGenericRepository.getIterator();
            while(it.hasNext()){
                PersonalityQuestion question =  it.next();
                EvaluationStrategy<MBTIscores> strategy = question.getEval();
                mbtIscores = strategy.evaluate(mbtIscores);
            }
        }
        result = mbtIscores.toString();
    }

    public boolean checkEmptyAnswer(Iterator<PersonalityQuestion> iterator) {

        while (iterator.hasNext()) {
            PersonalityQuestion question = iterator.next();
            if (question.getEval() == null) {
                return true;
            }

        }
        return false;
    }

}
