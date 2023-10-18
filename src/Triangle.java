public class Triangle {
    public static char[][] drawTriangle(char[][] simpleTriangle,int n){
        for (int i = 2; i <= n; i++) {
            char[][] triangle = new char[(int) Math.pow(2,i)][(int) Math.pow(2,i+1)];
            simpleTriangle = drawSimpleTriangle( simpleTriangle, triangle, i);
        }
        return simpleTriangle;
    }
    public static char[][] drawSimpleTriangle(char [][] simpleTriangle,char [][] triangle, int i){
        int r = (int) (Math.pow(2,i-1)-1);
        for (int rows = (int) Math.pow(2,i)-1; rows > Math.pow(2,i-1)-1 ; rows--) {
            int c=0;
            for (int cols = 0; cols < (int)Math.pow(2,i); cols++) {

                triangle[rows][cols]=simpleTriangle [r][c];
                c++;
            }
            r--;
        }

        r =(int) (Math.pow(2,i-1)-1);
        for (int rows = (int) Math.pow(2,i)-1; rows > (int) Math.pow(2,i-1)-1 ; rows--) {
            int c=0;
            for (int cols = (int) Math.pow(2,i); cols < (int) Math.pow(2,i+1); cols++) {
                triangle[rows][cols]=simpleTriangle [r][c];
                c++;
            }
            r--;
        }

        r =(int) (Math.pow(2,i-1)-1);
        for (int rows = (int) Math.pow(2,i-1)-1; rows >=0 ; rows--) {
            int c =0;
            for (int cols = (int) Math.pow(2,i-1); cols < (int) Math.pow(2,i+1)-(int) Math.pow(2,i-1); cols++) {
                triangle[rows][cols]=simpleTriangle [r][c];
                c++;
            }
            r--;
        }
        return triangle;
    }
}
