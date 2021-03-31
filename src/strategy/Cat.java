package strategy;

public class Cat implements Comparable<Cat>{
    private int weight;
    private int length;

    Cat(int w,int l){
        weight = w;
        length = l;
    }

    public int compareTo(Cat cat){
        if(weight>cat.getWeight()) return 1;
        else if(weight<cat.getWeight()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", length=" + length +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
