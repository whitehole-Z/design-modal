import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args){
        Calendar test = Calendar.getInstance();
        test.setTime(new Date());
        System.out.println(test.getTime());
//        System.out.println(test.get(Calendar.YEAR));
//        test.set(Calendar.YEAR,1993);
//        System.out.println(test.get(Calendar.YEAR));
//        test.add(Calendar.YEAR,1);
//        System.out.println(test.get(Calendar.YEAR));

//        System.out.println(test.get(Calendar.MONTH) + "," + test.get(Calendar.DATE));
//        test.add(Calendar.DATE,40);
//        System.out.println(test.get(Calendar.MONTH) + "," + test.get(Calendar.DATE));
//        test.roll(Calendar.DATE,40);
//        System.out.println(test.get(Calendar.MONTH) + "," + test.get(Calendar.DATE));
//
//        test.set(Calendar.MONTH,0);
//        System.out.println(test.get(Calendar.MONTH) + "," + test.get(Calendar.DATE));
//        System.out.println(test.getTime());
        testIo();
    }

    public static void testIo(){
        test2 test = new test2("a","b");
        File  item = new File("E:/item.txt");
        FileOutputStream fo = null;
        ObjectOutputStream os = null;
        try {
            fo = new FileOutputStream("E:/item");
            os = new ObjectOutputStream(fo);
            os.writeObject(test);
            os.close();

            FileInputStream fi = new FileInputStream("E:/item");
            ObjectInputStream oi = new ObjectInputStream(fi);
            test2 item2 = (test2)oi.readObject();
            System.out.println(item2.getP1());
            oi.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
