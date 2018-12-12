package designpatterns.itelect2c.factory;

public class ISFP implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Composer – ISFP";
        String desc = "ISFPs are introverts that do not seem like introverts. It is because even if they have difficulties connecting to other people at first, they become warm, approachable, and friendly eventually. They are fun to be with and very spontaneous, which makes them the perfect friend to tag along in whatever activity, regardless if planned or unplanned. ISFPs want to live their life to the fullest and embrace the present, so they make sure they are always out to explore new things and discover new experiences. It is in experience that they find wisdom, so they do see more value in meeting new people than other introverts.";
        return new TypeDescription(type,desc);
    }

}
