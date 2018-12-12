package designpatterns.itelect2c.factory;

public class ESFP implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Performer – ESFP";
        String desc = "ESFPs have an Extraverted, Observant, Feeling and Perceiving personality, and are commonly seen as Entertainers. Born to be in front of others and to capture the stage, ESFPs love the spotlight. ESFPs are thoughtful explorers who love learning and sharing what they learn with others. ESFPs are “people people” with strong interpersonal skills. They are lively and fun, and enjoy being the center of attention. They are warm, generous, and friendly, sympathetic and concerned for other people’s well-being.";
        return new TypeDescription(type,desc);
    }

}
