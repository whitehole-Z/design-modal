package strategy;

public class Dog implements Comparable<Dog> {
    private int height;
    private int weight;

    public int compareTo(Dog o){
        if(height>o.getHeight()) return 1;
        else if(height<o.getHeight()) return -1;
        else return 0;
    }

    Dog(int w,int h){
        this.height = h;
        this.weight = w;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
