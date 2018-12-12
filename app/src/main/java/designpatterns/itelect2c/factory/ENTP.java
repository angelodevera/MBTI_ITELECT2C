package designpatterns.itelect2c.factory;

public class ENTP implements Type {

    @Override
    public TypeDescription generateType() {
        String type = "The Visionary – ENTP";
        String desc = "Those with the ENTP personality are some of the rarest in the world, which is completely understandable. Although they are extroverts, they don’t enjoy small talk and may not thrive in many social situations, especially those that involve people who are too different from the ENTP. ENTPs are intelligent and knowledgeable need to be constantly mentally stimulated. They have the ability to discuss theories and facts in extensive detail. They are logical, rational, and objective in their approach to information and arguments.";
        return new TypeDescription(type,desc);
    }

}
