public class patterns {
    public static void main(String[] args) {
        // // PATTERN PRINTING

        // // SOLID SQUARE PATTERN

        // int n = 4;

        // for (int row = 0; row < n; row++) {
        //     for (int col = 0; col < n; col++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println(" ");
        // }

        // int n = 5;

        // // SOLID RECTANGLE PATTERN

        // for (int row = 0; row < n; row++) {
        //     for (int col = 0; col < n; col++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println(" ");
        // }

        // SOLID RIGHT ANGLE TRIANGLE PATTERN

        // int n = 5;

        // for (int row = 1; row <= n ; row++){
        //     for(int col = 1; col  <= row ; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }


        // PATTERN 4

        // int n = 5;

        // for(int row = 1 ; row <= 5; row++){
        //     for(int space=0; space < n - row; space++){
        //         System.out.print("_");
        //     }
        //        for(int col=1; col <= n ; col++){
        //         System.out.print("* ");
        //     }  
        //     System.out.println(" ");

        // }

      int n = 5;

      for(int row = 1; row <= n; row++){
        for(int col = 1; col <= (n-row) + 1; col++){
            System.out.print("* ");
        }
        System.out.println(" ");
      }



        
    }
}
