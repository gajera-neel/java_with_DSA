class RePower{
    public static void main(String args[]){
          int x=2;
          int n=5;
          int result = power(x, n);
          System.out.println(result);
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int po= power(x, n-1);
        int ans= x * po;
        return ans;
    }
}