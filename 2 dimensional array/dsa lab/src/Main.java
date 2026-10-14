//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        int [][]  A = new int[3][3];
//        int [][] M = {{1,2,3,},{4,5,6},{7,8,9,}};
//        System.out.println(M[2][2]);
//        System.out.println((M.length));
//        System.out.println(M[0].length);
//        System.out.println(A.length);
//        for(int i=0;i<M.length;i++){
//            for (int j=0;j<M.length;j++){
//                System.out.print(M[i][j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//}
public class Main {
  public static void main(String[] args) {

        int [][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
//        for (int[] row : arr){
//            int sum =0;
//            for(int value : row){
//                System.out.print(value +" ");
//                sum+= value;
//            }
//            System.out.print("=" +sum);
//            System.out.println();
//        }

      for (int i=0;i<arr.length;i++){
          int sum=0;
          for(int[] col :arr){
              sum+= col[i];
              System.out.print(col[i]+" ");

              }System.out.println("= "+sum);
          }
      }


  }
