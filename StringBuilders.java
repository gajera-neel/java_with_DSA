
class StringBuilders{
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Hello");
        System.out.println(sc);
        System.out.println(sc.charAt(0));
        sc.setCharAt(0, 'e');
        System.out.println(sc);
        sc.insert(1,'e');
        System.out.println(sc);
        sc.delete(3, 4);
        System.out.println(sc);

        StringBuilder sd = new StringBuilder("Hello");      
        System.out.println("reverse string:");
        for(int i=0; i<=sd.length()/2;i++){
            int front=i;
            int back=sd.length()-1-i;

            char frontchar = sd.charAt(front);
            char backend=sd.charAt(back);
            
            sd.setCharAt(front, backend);
            sd.setCharAt(back, frontchar); 

        }
        System.out.println(sd);




    }
}