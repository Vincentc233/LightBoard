public class LightBoard
{

private boolean[][] lights;

public LightBoard(int numRows, int numCols)
{ 
    lights = new boolean[numRows][numCols];
    for(int i =0; i< lights.length; i++){
        for(int n=0; n<lights[0].length; n++){
            if((int) (Math.random() * 100) -1 <= 40){
                lights[i][n] = true;
            }
        }
    } 
}

public boolean evaluateLight(int row, int col)
{ 
    int countLights =0;
    int countEven = 0;
    int countThree =0; 
    for(int i =0; i< lights.length; i++){
        if(lights[i][col]) countLights++;
        if(lights[i][col] && i%2==0) countEven++;
        if(lights[i][col] && i%3==0) countThree++;
    } 
    if(lights[row][col] && countLights == countEven) return false;
    else if(lights[row][col] && countLights == countThree) return true;
    else return lights[row][col];
}

public boolean[][] getLights(){
    return lights;
}
}