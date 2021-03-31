package strategy;

public class CatLengthCompartor implements Compartor<Cat>{
    public int compare(Cat t1,Cat t2){
        if(t1.getLength()>t2.getLength()) return 1;
        else if(t1.getLength()<t2.getLength()) return -1;
        else return 0;
    }
}
