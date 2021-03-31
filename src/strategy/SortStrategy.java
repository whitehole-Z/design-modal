package strategy;

/**
 * 策略模式
 * 实体类不修改，扩展/新增策略类
 */
public class SortStrategy<T> {
    public void sortIt(T[] its,Compartor<T> compartor){
        for(int i=0;i<its.length;i++){
            for(int j=i+1;j<its.length;j++){
                if(compartor.compare(its[i],its[j])>0) swap(its,i,j);
            }
        }
        for(T it:its){
            System.out.println(it);
        }
    }

    private void swap(T[] its,int i,int j){
        T temp = its[i];
        its[i]= its[j];
        its[j] = temp;
    }
}
