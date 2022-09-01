
import java.util.ArrayList;
        import java.util.List;

public class BookImpl{
    public static void main(String[] args) {
        Book obj1 = new Book("Java","Rajiv",456789923L,560);
        Book obj2 = new Book("C","Mukesh",787892349L,230);
        Book obj3 = new Book("C++","David",238279987L,340);
        Book obj4 = new Book("javascript","Dinesh",1235435646L,670);
        Book obj5 = new Book("HTML","Rajiv",456789923L,590);


        System.out.println("obj5 = " + obj5);
        System.out.println("obj4 = " + obj4);
        System.out.println("obj3 = " + obj3);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj1 = " + obj1);
        List<Double> obj = new ArrayList<>();
        obj.add(560.0);
        obj.add(230.0);
        obj.add(340.0);
        obj.add(670.0);
        obj.add(590.0);
        obj.add(278.0);
        obj.add(470.0);
        obj.add(290.0);
        obj.add(530.0);
        obj.add(2390.0);

        for (int i = 0; i < obj.size(); i++) {
            for (int j = 0; j < obj.size() ; j++) {
                if(obj.get(j) > obj.get(i)){
                    double temp = obj.get(i);
                    obj.set(i,obj.get(j));
                    obj.set(j,temp);



                }
            }

        }
        System.out.println("After sorting price :");
        System.out.println(obj);


    }
}