package designpatterns.itelect2c.strategy;

//import designpatterns.itelect2c.mbtitest.PersonalityQuestion;

import designpatterns.itelect2c.iterator.Iterator;
import designpatterns.itelect2c.mbtitest.PersonalityQuestion;

public interface EvaluationStrategy<T> {
    public T evaluate(T el);
}
