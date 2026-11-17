public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int star = n;
        int row = 1;
        while(row<=n*2-1){
            //space
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //next line prepration
            System.out.println();
            if(row<n){
                space+=2;
                star--;
            }else{
                space -=2;
                star++;
            }
            row++;
        }
    }
}