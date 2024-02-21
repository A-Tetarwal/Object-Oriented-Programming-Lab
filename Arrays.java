class Arrays {

    public void demoArrays(){
        // 1-D Arrays
        int [] ages= {3,3,4,5,7,9};
        int [] weights= new int[5];

        System.out.println(ages[0]);
        weights[1]=76;

        // 2-D Arrays

    }

    void multiDimArrays(){
        int[][][] matrix = {{{1,2,3}, {2,3,4}}, {{3,4,5}, {4,5,6}}};
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println();
                for(int k = 0; k < matrix[i][j].length; k++){
                    System.out.print(matrix[i][j][k]);
                }
            }
        }
    }

    void threex(){
        int[][] matrix = {{1,2,3}, {2,3,4}, {3,4,5}};

        for(int i = 0; i < matrix.length; i++){
            System.out.println();
            for(int j = 0; j < matrix[i].length; j++){
                
                    System.out.print(matrix[i][j]);
                
            }
        }
    }

    void threexF(){
        int[][] matrix = {{1,2,3}, {2,3,4}, {3,4,5}};

        for(int i = 0; i < matrix.length; i++){
            System.out.println();
            for(int j = 0; j < matrix.length; j++){
                
                    System.out.print(matrix[i][j]);
                
            }
        }
    }

    void Q1(){
        int arr[]= {1,5,3};
        int sum=0;
        for(int element:arr){
            sum+=element;
        }
        System.out.println(sum);
    }
    
    void Q2(){
        int arr[]= {1,5,3};
        int max=0;
        for(int element:arr){
            if (max<element) {
                max=element;
            }
        }
        System.out.println(max);
    }
    
    int Q3(){
        int arr[]= {1,5,3};
        int num=3;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    
    

    public static void main(String[] args) {
        Arrays d1=new Arrays();
        d1.demoArrays();
        d1.multiDimArrays();
        System.out.println();
        d1.threex();
        System.out.println();
        d1.threexF();
        System.out.println();
        d1.Q1();
        d1.Q2();
        System.out.println(d1.Q3());
    }

    public static int[] copyOf(int[] array1, int length) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copyOf'");
    }
}
