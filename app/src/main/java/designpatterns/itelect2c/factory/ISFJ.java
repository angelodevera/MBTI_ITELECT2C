package designpatterns.itelect2c.factory;

public class ISFJ implements Type {

    @Override
    public TypeDescription generateType() {
        String type = "The Nurturer – ISFJ";
        String desc = "ISFJs are philanthropists and they are always ready to give back and return generosity with even more generosity. The people and things they believe in will be upheld and supported with enthusiasm and unselfishness. ISFJs are warm and kind-hearted. They value harmony and cooperation, and are likely to be very sensitive to other people’s feelings. People value the ISFJ for their consideration and awareness, and their ability to bring out the best in others";
        return new TypeDescription(type,desc);
    }

}
