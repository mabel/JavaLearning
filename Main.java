public class Main { 

    public static void main(String[] args){
        String s = getMessage();    
        System.out.println(s +" "+args[0] + " "+args[1]);
        /* Цикл внутри метода */
        for(int i = 0; i < 10; i+=2){
            System.out.println("i = "+i);
        }
    }

        int count = 0;
        String s = "Hello! ";
        while(count < 10){
            s += s;
            if(s.length > 30) break;
       	    count++;
        }
        System.out.printl(s);
        System.out.println.(count)
        private static String getMessage (){
        return "Hello from metod!";
    }
}












