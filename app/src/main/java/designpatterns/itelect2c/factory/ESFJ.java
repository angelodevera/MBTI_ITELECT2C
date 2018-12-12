package designpatterns.itelect2c.factory;

public class ESFJ implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Provider – ESFJ";
        String desc = "ESFJs are the stereotypical extroverts. They are social butterflies, and their need to interact with others and make people happy usually ends up making them popular. The ESFJ usually tends to be the cheerleader or sports hero in high school and college. Later on in life, they continue to revel in the spotlight, and are primarily focused on organizing social events for their families, friends and communities. ESFJ is a common personality type and one that is liked by many people.";
        return new TypeDescription(type,desc);
    }

}
