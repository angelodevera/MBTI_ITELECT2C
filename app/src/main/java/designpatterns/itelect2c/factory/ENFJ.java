package designpatterns.itelect2c.factory;

public class ENFJ implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Giver – ENFJ";
        String desc = "ENFJs are people-focused individuals. They are extroverted, idealistic, charismatic, outspoken, highly principled and ethical, and usually know how to connect with others no matter their background or personality. Mainly relying on intuition and feelings, they tend to live in their imagination rather than in the real world. Instead of focusing on living in the “now” and what is currently happening, ENFJs tend to concentrate on the abstract and what could possibly happen in the future.";
        return new TypeDescription(type,desc);
    }

}
