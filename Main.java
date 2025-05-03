public class Main{
    public static void main(String[] args){
        LightBoard l = new LightBoard(1000,1000);
        System.out.println(l.test());

        LightBoard l1 = new LightBoard(7,5);
        boolean lights[][] = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, false, false, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, false, true, true},
            {false, false, false, false, false}
        };
        l1.setLight(lights);
        System.out.println(l1.evaluateLight(0,3));
        System.out.println(l1.evaluateLight(6,0));
        System.out.println(l1.evaluateLight(4,1));
        System.out.println(l1.evaluateLight(5,4));
    }
}
