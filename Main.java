public class Main {

    public static void main(String[]args){
        Array array = new Array();
        array.insert(1);
        array.insert(5);
        array.insert(3);
        array.insert(7);
        System.out.println(array);
        System.out.println(array.find(5));
        array.delete(3);
        System.out.println(array);
        array.sort();
        System.out.println(array);

    }
}
