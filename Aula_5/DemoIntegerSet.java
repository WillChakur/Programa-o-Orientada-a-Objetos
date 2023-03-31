public class DemoIntegerSet {
    public static void main(String[] args){
        
        IntegerSet is_1 = new IntegerSet();
        IntegerSet is_2 = new IntegerSet();

        is_1.insertElement(3);
        is_1.insertElement(5);
        is_2.insertElement(5);

        is_2.deleteElement(5);
        
        is_2.insertElement(3);
        IntegerSet is_3 = is_1.intersection(is_2);

        IntegerSet is_4 = is_1.union(is_2);

        System.out.println("===== União =====" + "\n" + is_4.toSetString());

        System.out.println("===== Intersecção =====" + "\n" + is_3.toSetString());

        System.out.println("===== Igualdade =====" + "\n" + is_1.isEqualTo(is_2));

        System.out.println("===== Conjunto 1 =====" + "\n" + is_1.toSetString());

        System.out.println("===== Conjunto 2 =====" + "\n" + is_2.toSetString());

    }
}
