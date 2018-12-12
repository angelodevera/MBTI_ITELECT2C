package designpatterns.itelect2c.factory;

public class ESTP implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Doer – ESTP";
        String desc = "ESTPs have an Extraverted, Sensing, Thinking, and Perceptive personality. ESTPs are governed by the need for social interaction, feelings and emotions, logical processes and reasoning, along with a need for freedom. Theory and abstracts don’t keep ESTP’s interested for long. ESTPs leap before they look, fixing their mistakes as they go, rather than sitting idle or preparing contingency plans.";
        return new TypeDescription(type,desc);
    }

}
