import java.util.Scanner;
class dualchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String st = sc.nextLine();
        String stv2 = st.toUpperCase();
        String stv3 = "" ;
        int i,count=0;
        for (i = 0; i < stv2.length()-1; i++) {
            if(stv2.charAt(i)==stv2.charAt(i+1)&&i+1<stv2.length()){
                count++;
                stv3 = stv3+'*'+stv2.charAt(i)+stv2.charAt(i+1)+'*';
                i=i+1;
            }else{
                stv3 = stv3 + stv2.charAt(i);
            }
        }
        System.out.println(stv3+stv2.charAt(i));
        System.out.println("Number of Double Sequence is  "+count);

    }
}