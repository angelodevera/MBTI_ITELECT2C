package designpatterns.itelect2c.strategy;

import designpatterns.itelect2c.mbtitest.MBTIscores;

public class IncrementS implements EvaluationStrategy<MBTIscores> {
    @Override
    public MBTIscores evaluate(MBTIscores el) {
        el.incS();
        return el;
    }
}
