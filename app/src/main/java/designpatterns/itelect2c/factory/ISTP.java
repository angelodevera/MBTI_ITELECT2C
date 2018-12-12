package designpatterns.itelect2c.factory;

public class ISTP implements Type {

    @Override
    public TypeDescription generateType() {
        String type = "The Craftsman – ISTP";
        String desc = "ISTPs are mysterious people who are usually very rational and logical, but also quite spontaneous and enthusiastic. Their personality traits are less easily recognizable than those of other types, and even people who know them well can’t always anticipate their reactions. Deep down, ISTPs are spontaneous, unpredictable individuals, but they hide those traits from the outside world, often very successfully.";
        return new TypeDescription(type,desc);
    }

}
