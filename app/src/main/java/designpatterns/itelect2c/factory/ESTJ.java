package designpatterns.itelect2c.factory;

public class ESTJ implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Supervisor – ESTJ";
        String desc = "ESTJs are organized, honest, dedicated, dignified, traditional, and are great believers of doing what they believe is right and socially acceptable. Though the paths towards “good” and “right” are difficult, they are glad to take their place as the leaders of the pack. They are the epitome of good citizenry. People look to ESTJs for guidance and counsel, and ESTJs are always happy that they are approached for help.";
        return new TypeDescription(type,desc);
    }

}
