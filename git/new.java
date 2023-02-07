class multi3{
    public static void main(String[] args){

        int[][] arr={{1,3,4,5,7,8},{7,8,9,11,34}};
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);

            }
            System.out.println();

        }

    }
}

class multi4{
    public static void main(String[] args){
        int[][] arr1={{1,2,3,4},{5,6,7,8}};
        int[][] arr2={{10,20,30,40},{50,60,70,80}};
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();

        }
    }

}

class multi5{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int[][] ar=new int [2][2];
        int[][] ar1=new int [2][2];
        int[][] sum=new int[2][2];

        for(int i =0 ;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("enter your number in arr1 "+(i+1)+" raw "+(j+1)+ " element ");
               ar[i][j] =obj.nextInt();

            }
            
        }
        for(int h =0 ;h<2;h++){
            for(int f=0;f<2;f++){
                System.out.print("enter your number in arr2"+(h+1)+" raw "+(f+1)+ " element ");
               ar1[h][f] =obj.nextInt();

            }
        }
        for(int a=0;a<2;a++){
            for(int b=0;b<2;b++){
                sum[a][b]=ar[a][b]+ar1[a][b];
            }
        }

        for(int[] d:sum){
            for(int e:d){
                System.out.print(e+" ");
            }
            System.out.println();
        }

    }
}