package designpatterns.itelect2c.factory;

public class TypeFactory implements Factory {
    @Override
    public Type makeType(String type) {
        switch(type){
            case "ISTJ":
                return new ISTJ();
            case "ISFJ":
                return new ISFJ();
            case "INFJ":
                return new INFJ();
            case "INTJ":
                return new INTJ();
            case "ISTP":
                return new ISTP();
            case "ISFP":
                return new ISFP();
            case "INFP":
                return new INFP();
            case "INTP":
                return new INTP();
            case "ESTP":
                return new ESTP();
            case "ESFP":
                return new ESFP();
            case "ENFP":
                return new ENFP();
            case "ENTP":
                return new ENTP();
            case "ESTJ":
                return new ESTJ();
            case "ESFJ":
                return new ESFJ();
            case "ENFJ":
                return new ENFJ();
            case "ENTJ":
                return new ENTJ();
        }
        return null;
    }
}
