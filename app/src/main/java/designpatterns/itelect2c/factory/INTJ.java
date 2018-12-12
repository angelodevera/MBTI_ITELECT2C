package designpatterns.itelect2c.factory;

public class INTJ implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Mastermind – INTJ ";
        String desc = "INTJs, as introverts, are quiet, reserved, and comfortable being alone. They are usually self-sufficient and would rather work alone than in a group. Socializing drains an introvert’s energy, causing them to need to recharge. INTJs are interested in ideas and theories. When observing the world they are always questioning why things happen the way they do. They excel at developing plans and strategies, and don’t like uncertainty.";
        return new TypeDescription(type,desc);
    }

}
