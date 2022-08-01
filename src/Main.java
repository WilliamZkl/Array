public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
//        System.out.println(arr);

        arr.add(1, 100);
        arr.add(7, 100);
        arr.add(8,100);
        System.out.println(arr);

//        arr.addFirst(-1);
//        System.out.println(arr);

        System.out.println(arr.removeElementAll(100));
//        System.out.println(arr.get(0));
//        arr.set(1, 666);
//        System.out.println(arr.get(1));
//        System.out.println(arr);
//        arr.removeElement(100);
//        System.out.println(arr);
    }
}
