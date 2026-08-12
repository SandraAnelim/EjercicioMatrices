public class metodos {
    public int[][] LLenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return m;
    }

    public void MostrarMatrizEntera(int[][] m){
            for(int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    System.out.print(" - " + m[i][j]);
                }
                System.out.print( " \n");
            }
        }

    public objmatriz[][] LLenarMatrizObjetual(objmatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objmatriz obj = new objmatriz();

                obj.setDato((int) (Math.random() * 50 + 1));
                m[i][j] = obj;
            }
        }
        return m;
    }

    public void MostrarMatrizObjetual(objmatriz[][] m){
            for(int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    System.out.print(" - " + m[i][j].getDato());
                }
              
            }
        }
}