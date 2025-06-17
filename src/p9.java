public class p9 {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
//d
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++){
                if(j >= x && j <= y){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println(" ");
        }
        for(int i = 4; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(j <= x && j >= y){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println(" ");
        }
    }
}
