public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                if(Math.random() < 0.4){
                    lights[i][j] = true;
                }
            }
        }
    }

    public double test(){
        double on = 0;
        for (boolean[] row : lights) {
            for (boolean b : row) {
                if (b) on++;
            }
        }
        return on / (lights.length * lights[0].length);
    }


    public boolean evaluateLight(int row, int col){
        boolean light = lights[row][col];
        int colLights = 0;
        for(int i = 0; i<lights.length;i++){
            if(lights[i][col] == true){
                colLights++;
            }
        }
        if(lights[row][col] && colLights %2 == 0){
            return false;
        }
        if(!lights[row][col] && colLights %3 ==0){
            return true;
        }
        return lights[row][col];
    }

    public void setLight(boolean[][] arr){
        lights = arr;
    }

}