package designpatterns.itelect2c.factory;

public class INFJ implements Type {

    @Override
    public TypeDescription generateType() {
        String type = "The Counselor – INFJ";
        String desc = "INFJs are visionaries and idealists who ooze creative imagination and brilliant ideas. They have a different, and usually more profound, way of looking at the world. They have a substance and depth in the way they think, never taking anything at surface level or accepting things the way they are. Others may sometimes perceive them as weird or amusing because of their different outlook on life.";
        return new TypeDescription(type,desc);
    }

}
