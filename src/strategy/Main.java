package strategy;

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog(1,2);
        Dog dog2 = new Dog(3,5);
        Dog dog3 = new Dog(2,1);
        Dog[] dogs = new Dog[]{dog1,dog2,dog3};

        Cat cat1 = new Cat(1,2);
        Cat cat2 = new Cat(6,1);
        Cat cat3 = new Cat(9,3);
        Cat[] cats = new Cat[]{cat1,cat2,cat3};

//        Sort.sortIt(dogs);
//        Sort.sortIt(cats);

        SortStrategy<Cat> sort = new SortStrategy<>();
        CatLengthCompartor catLengthCompartor = new CatLengthCompartor();
        sort.sortIt(cats,catLengthCompartor);
    }
}
