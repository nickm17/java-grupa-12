package ro.siit.intro_to_java;

public class Arrays {

    public static void main(String[] args) {

//        System.out.println(args[0]); // luam elemnte din array-ul args atunci cand sunt date ca argument la run
        String[] strings = new String[4];

        String[] strings2  = {"someText", new String(), null};
//
//
//        System.out.println(strings.length);
//        System.out.println(strings2.length);


//        strings = new String[]{"someText", new String(), null}; // old versions of java
//        String string = strings[2];
//        System.out.println(string);

//        String error = strings[5];  // // very  bad , elementul cu indexul 5 nu exista, arunca o exceptie (ArrayIndexOutOfBoundsException)
//        strings[2].charAt(0);  // very  bad , elementul cu indexul 2 e null, arunca o exceptie (NullPointerException)

//        diagonalaPrincipalaMatrice();
//        elementeSubDiagonalaPrincipala();


//        elementeDiagonalaSecundaraMatrice();

    }

    private static void elementeDiagonalaSecundaraMatrice() {
        int[][] matrix = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        for (int i = 0; i < matrix.length ; i = i + 1 ){
            for (int j = 0; j < matrix[i].length ; j++){
                // Conditie ca elementele sa fie pe diagonala secundara
                if ((i + j) == matrix.length - 1) {
                    System.out.println("Element de pe diagonala secundara - " + matrix[i][j]);
                }
            }
        }
    }

    private static void diagonalaPrincipalaMatrice() {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        // una din optiuni pentru a afisa elementele de pe diagonala principala
        for (int i = 0 ; i < matrix.length ; i++ ){
            System.out.print(matrix[i][i] + "   ");
        }

        // alta optiune
        for (int i = 0; i < matrix.length ; i = i + 1 ){
            for (int j = 0; j < matrix[i].length ; j++){
                // Conditie ca elementele sa fie pe diagonala principala
                if (i == j){
                    System.out.print("Element de pe diagonala principala - " + matrix[i][j]);
                }
            }
        }
    }

    private static void elementeSubDiagonalaPrincipala() {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        for (int i = 0; i < matrix.length ; i++){
            for (int j = 0; j < matrix[i].length ; j++){
                // Conditie ca elementele sa fie sub diagonala secundara
                if (i > j){
                    System.out.println("Element de sub diagonala p " + matrix[i][j]);
                }
            }
        }
    }

}
