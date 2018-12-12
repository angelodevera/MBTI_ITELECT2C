package designpatterns.itelect2c.strategy;

import designpatterns.itelect2c.mbtitest.MBTIscores;

public class IncrementF implements EvaluationStrategy<MBTIscores> {
    @Override
    public MBTIscores evaluate(MBTIscores el) {
        el.incF();
        return el;
    }
}
