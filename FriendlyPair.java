import java.util.*;
class FriendlyPair{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int n1,sum1=0,n2,sum2=0;
  n1 = in.nextInt();
  n2 = in.nextInt();
  for(int i=1;i<n1;i++){
   if(n1%i==0)
    sum1+=i;
  }
  for(int i=1;i<n2;i++){
   if(n2%i==0)
    sum2+=i;
  }
  String res = (sum1/n1 == sum2/n2)?"Friendly Pair":"Not Friendly Pair";
  System.out.println(res);
 }
}