import java.util.ArrayList;

public class hi {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        list.set(0, "Goodbye");
        list.set(1, "hi");
        Thread.sleep(500);
        System.out.println(list);

        Thread.sleep(500);
        System.out.println(list.size());
        Thread.sleep(500);

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            intArr.add(0);
        }
        System.out.println(intArr.size());
        Thread.sleep(500);
        System.out.println(intArr.get(32));
    }
}
