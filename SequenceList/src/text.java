public class text {
    public static void main(String[] args) {
        sequencelist l1=new sequencelist();
        for (int i = 0; i < args.length; i++) {
         l1.add(i*2, i);
            
    }    
    l1.printall();
    }
    
    
}
