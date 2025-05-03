public class Main{
    public static void main(String[] args) {
        LightBoard l1 = new LightBoard(7,5);
        for(int i =0; i< l1.getLights().length; i++){
            for(int n=0; n<l1.getLights()[0].length; n++){
                    System.out.print(l1.getLights()[i][n]);
                }
            System.out.println();
        }
        System.out.println(l1.evaluateLight(0, 3)); 
        System.out.println(l1.evaluateLight(6, 0));
        System.out.println(l1.evaluateLight(4, 1)); 
        System.out.println(l1.evaluateLight(5, 4));  
    }
}