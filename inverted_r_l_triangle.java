public class inverted_r_l_triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=2*n;j++)
            {
                if (j<=n-i || j >=n+i) {
                    System.out.print("x ");
                }
                else{
                    System.out.print("  ");
                }
            }


        System.out.println();
        }
    }
}
