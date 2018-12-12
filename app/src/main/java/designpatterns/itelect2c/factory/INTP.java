package designpatterns.itelect2c.factory;

public class INTP implements Type {


    @Override
    public TypeDescription generateType() {
        String type = "The Thinker – INTP";
        String desc = "INTPs are well known for their brilliant theories and unrelenting logic, which makes sense since they are arguably the most logical minded of all the personality types. They love patterns, have a keen eye for picking up on discrepancies, and a good ability to read people, making it a bad idea to lie to an INTP. People of this personality type aren’t interested in practical, day-to-day activities and maintenance, but when they find an environment where their creative genius and potential can be expressed, there is no limit to the time and energy INTPs will expend in developing an insightful and unbiased solution.";
        return new TypeDescription(type,desc);
    }

}
