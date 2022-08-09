package Ex8_13;

class Location {
    public int row;
    public int column;
    public double maxValue;
    
    public static Location locateLargest(double[][] a){
        Location L = new Location(); 
        for(int row = 0; row < a.length; row++){
            for(int column = 0; column < a[(row)].length; column++){
                if(L.maxValue < a[row][column] ){
                    L.maxValue = a[row][column];  
                    L.row = row;
                    L.column = column;
                } 
            }
        }
       return L;
    }
}
