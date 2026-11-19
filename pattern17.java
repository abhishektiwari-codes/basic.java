public class pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int star = n/2;
        int space = 1;
        int row = 1;
        while(row<=n){
            //star
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //again star
            i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;


        }
        //next line
        System.out.println();
        if(row<=n/2){
            star--;
            space+=2;
        }else{
            star++;
            space-=2;
        }
        row++;
    }
    
    }
}
