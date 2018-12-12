package designpatterns.itelect2c.factory;

public class INFP implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Idealist – INFP";
        String desc = "INFPs, like most introverts, are quiet and reserved. They prefer not to talk about themselves, especially in the first encounter with a new person. They like spending time alone in quiet places where they can make sense of what is happening around them. They love analyzing signs and symbols, and consider them to be metaphors that have deeper meanings related to life. They are lost in their imagination and daydreams, always drowned in the depth of their thoughts, fantasies, and ideas.";
        return new TypeDescription(type,desc);
    }

}
