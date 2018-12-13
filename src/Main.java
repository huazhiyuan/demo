import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuffer sb = new StringBuffer();
            sb.append(sc.next());
            int cnt = sc.nextInt();
            for(int i=0;i<cnt;i++){
                int j=0;
                while( sb.charAt(j)>=sb.charAt(j+1)){
                    j++;
                }
                sb.deleteCharAt(j);
            }
            System.out.print(sb.toString());

        }
    }
}