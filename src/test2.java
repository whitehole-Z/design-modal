import java.io.Serializable;

public class test2 implements Serializable {
    private String p1;
    private String p2;

    test2(){
        this.p1="aaa";
        this.p2="bbb";
    }
    test2(String p1,String p2){
        this.p1=p1;
        this.p2=p2;
    }

    public String toString(){
        return this.p1+"  " + this.p2;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
}
