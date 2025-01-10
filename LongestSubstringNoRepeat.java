import java.util.Scanner;
public class LongestSubstringNoRepeat {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        byte[] karkateri= new byte[223];
        byte flag =0;
        int mainLen=0;
        for(int i=0; i<s.length();i++){
            int len=0;
            flag=0;
            StringBuilder sb =new StringBuilder();
            for(int j=i; j<s.length();j++){
                sb.append(s.charAt(j));
                if(karkateri[s.codePointAt(j)-32]==0){
                    len++;
                }
                else{
                    // System.out.println("________");
                    // System.out.println(sb.toString());
                    // System.out.println("The character is "+s.charAt(j));
                    // System.out.println("The character ASCII value is: "+ s.codePointAt(j));
                    // System.out.println("The character at the value is "+karkateri[s.codePointAt(j)-33]);
                    // System.out.println("The length is: "+len);
                    clearTable(karkateri);
                    
                    if(len>mainLen){
                        
                        mainLen=len;
                    }
                    flag=1;
                    break;
                }
                karkateri[s.codePointAt(j)-32]++;
            }    
            if(flag==0){
                if(len>mainLen){
                    mainLen=len;
                }
            }
            if(len>mainLen){
                mainLen=len;
            }

        }
        System.out.println(mainLen);
        
    }
    public static void clearTable(byte[]a){
        for(int i=0;i<a.length;i++){
            a[i]=0;
        }
    }
}
