public class Main { 

    public static void main(String[] args){
        String s = getMessage();    
        System.out.println(s +" "+args[0] + " "+args[1]);
        /* Цикл внутри метода */
        for(int i = 0; i < 10 i++){
            System.outprintln("i = "+i);
        }
    }
    
    private static String getMessage (){
        return "Hello from metod!";
    }
}






