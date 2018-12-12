package designpatterns.itelect2c.factory;

public class ENTJ implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Commander – ENTJ ";
        String desc = "An ENTJ’s primary mode of living focuses on external aspects and all things are dealt with rationally and logically. Their secondary mode of operation is internal, where intuition and reasoning take effect. ENTJs are natural born leaders among the 16 personality types and like being in charge. They live in a world of possibilities and they often see challenges and obstacles as great opportunities to push themselves. They seem to have a natural gift for leadership, making decisions, and considering options and ideas quickly yet carefully. They are “take charge” people who do not like to sit still.";
        return new TypeDescription(type,desc);
    }

}
