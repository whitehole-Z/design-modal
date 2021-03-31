package strategy;

/**
 * 这不是策略模式，因为类实现了 comparable 接口，但是compare的方式写死了，只能有一种
 */
public class Sort {
    public static void sortIt(Comparable[] its){
        for(int i=0;i<its.length;i++){
            for(int j=i+1;j<its.length;j++){
                if(its[i].compareTo(its[j])>0) swap(its,i,j);
            }
        }
        for(Comparable it:its){
            System.out.println(it);
        }
    }

    private static void swap(Comparable[] its,int i,int j){
        Comparable temp = its[i];
        its[i]= its[j];
        its[j] = temp;
    }
}

