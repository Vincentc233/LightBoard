public class LightBoard
{

private boolean[][] lights;

public LightBoard(int numRows, int numCols)
{ 
    lights = new boolean[numRows][numCols];
    for(int i =0; i< lights.length; i++){
        for(int n=0; n<lights[0].length; n++){
            if((int) (Math.random() * 100) + 1 <= 40){
                lights[i][n] = true;
            }
        }
    } 
}

public boolean evaluateLight(int row, int col)
{ 
    int countLights =0;
    for(int i =0; i< lights.length; i++){
        if(lights[i][col]) countLights++;
    } 
    if(lights[row][col] && countLights % 2==0) return false;
    else if(!lights[row][col] && countLights%3==0) return true;
    else return lights[row][col];
}

public boolean[][] getLights(){
    return lights;
}
}
