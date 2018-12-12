package designpatterns.itelect2c.factory;

public class ENFP implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Champion – ENFP";
        String desc = "ENFPs have an Extraverted, Intuitive, Feeling and Perceiving personality. This personality type is highly individualistic and Champions strive toward creating their own methods, looks, actions, habits, and ideas — they do not like cookie cutter people and hate when they are forced to live inside a box. They like to be around other people and have a strong intuitive nature when it comes to themselves and others. They operate from their feelings most of the time, and they are highly perceptive and thoughtful.";
        return new TypeDescription(type,desc);
    }

}
