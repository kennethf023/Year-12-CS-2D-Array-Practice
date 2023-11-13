public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }

    // 2. sumRowN
    public static int sumRowN(int[][] a,int i){
        int sum=0;
        for(int j=0;j<a[i].length;j++) {
            sum += a[i][j];
        }
        return sum;
    }

    // 3. sumColN
    public static int sumColN(int[][] a,int j){
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum += a[i][j];
        }
        return sum;
    }


    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] a,int i1,int j1,int i2,int j2){
        int sum=0;
        boolean count=false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==i1&&j==j1)count=true;
                if(count)sum+=a[i][j];
                if(i==i2&&j==j2)count=false;
            }
        }
        return sum;
    }
}
