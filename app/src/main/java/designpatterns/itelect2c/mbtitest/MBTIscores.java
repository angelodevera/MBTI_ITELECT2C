package designpatterns.itelect2c.mbtitest;

import java.io.Serializable;

public class MBTIscores implements Serializable {
    private int e;
    private int i;
    private int s;
    private int n;
    private int t;
    private int f;
    private int j;
    private int p;

    public MBTIscores() {
        this.e = 0;
        this.i = 0;
        this.s = 0;
        this.n = 0;
        this.t = 0;
        this.f = 0;
        this.j = 0;
        this.p = 0;
    }

    public void incE(){
        e = ++e;
    }

    public void incI(){
        i = ++i;
    }

    public void incS(){
        s = ++s;
    }

    public void incN(){
        n = ++n;
    }

    public void incT(){
        t = ++t;
    }

    public void incF(){
        f = ++f;
    }


    public void incJ(){
        j = ++j;
    }

    public void incP(){
        p = ++p;
    }

//    public String
    @Override
    public String toString() {
        return ((e > i) ? "E" : "I") + ((s > n) ? "S" : "N") + ((t > f) ? "T" : "F") + ((j > p) ? "J" : "P");
    }


    public String getScores() {
        int ei = e+i;
        int sn = s+n;
        int tf = t+f;
        int jp = j+p;




        return "Test Result: \n" +
                "Extraverted (E) = " + (int)(((double)e/ei)*100) +
                "% vs   Introverted (I) = " + (int)(((double)i/ei)*100) +
                "%\nSensing (S) = " + (int)(((double)s/sn)*100) +
                "% vs Intuition (N) = " + (int)(((double)n/sn)*100) +
                "%\nThinking (T) = " + (int)(((double)t/tf)*100) +
                "% vs Feeling (F) = " + (int)(((double)f/tf)*100)  +
                "%\nJudging (J) = " + (int)(((double)j/jp)*100)  +
                "% vs Perceiving (P) = " + (int)(((double)p/jp)*100) +"%";
    }
}
