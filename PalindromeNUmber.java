public class PalindromeNUmber {
    public static void main(String[] args){
        System.out.println(isPalindrome(1200021));

    }
    public static boolean isPalindrome(int x) {
        if(x<0 || x%10==0 &&x!=0 )return false;
        int copy =x;
        int y=0;
        while(x>0){
            y= y*10+x%10;
            x/=10;
            if(x==y || x/10==y)return true;
        }
        return (copy==y);
    }
    // public static boolean isPalindrome(int x) {
    //     int copy =x;
    //     int size =(int) Math.log10(x)+1;
    //     if(x<0)return false;
    //     while(size>0){
    //         if(x%10!=(int)(copy/Math.pow(10,(int)Math.log10(x))%10)){
    //             return false;
    //         }else{
    //             x/=10;
    //             if(x==0)break;
    //             size-=2;
                
    //         }
    //     }
    //     return true;
    // }
}
