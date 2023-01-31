class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int[][][] array = new int[3][3][3];

        for(int i = 0; i < 3; i++) {
            int counter = 0;
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    array[i][j][k] = counter++;
                }
            } 
        
        }
        return array;

    }
}
