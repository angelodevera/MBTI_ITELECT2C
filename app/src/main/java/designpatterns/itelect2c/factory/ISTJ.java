package designpatterns.itelect2c.factory;

public class ISTJ implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Inspector – ISTJ";
        String desc = "At first glance, ISTJs are intimidating. They appear serious, formal, and proper. They also love traditions and old-school values that uphold patience, hard work, honor, and social and cultural responsibility. They are reserved, calm, quiet, and upright. These traits result from the combination of I, S, T, and J, a personality type that is often misunderstood.";
        return new TypeDescription(type,desc);
    }

}
