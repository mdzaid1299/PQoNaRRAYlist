
import java.util.ArrayList;
import java.util.List;

public class BookImpl{
    public static void main(String[] args) {
        Book obj1 = new Book("Java","vinay",76467423L,960);
        Book obj2 = new Book("C","Mukesh",77645769L,630);
        Book obj3 = new Book("CSharp","Vince",453542987L,740);
        Book obj4 = new Book("snell","Nobody",23234135646L,570);
        Book obj5 = new Book("HTML","Mudit",876785453L,990);

//        System.out.println("obj1 = " + obj1);
//        System.out.println("obj2 = " + obj2);
//        System.out.println("obj3 = " + obj3);
//        System.out.println("obj4 = " + obj4);
//        System.out.println("obj5 = " + obj5);


        List<Double> list = new ArrayList<>();


        list.add(560.0);
        list.add(230.0);
        list.add(340.0);
        list.add(670.0);
        list.add(590.0);
        

        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < list.size() ; k++) {
                if(list.get(k) > list.get(i)){
                    double temp = list.get(i);
                    list.set(i,list.get(k));
                    list.set(k,temp);

                }
            }

        }
//        Collections.sort(list);
//        list.sort(book)
        System.out.println("After sorting price :");
        System.out.println(list);


    }
}
