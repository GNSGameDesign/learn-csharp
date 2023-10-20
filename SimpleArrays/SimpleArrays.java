public class SimpleArrays
{
      public static void main(String[] args)
      {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++)
            {
                  array[i] = i;
            }
            for (int i = 0; i < array.length; i++)
            {
                  System.out.println("array[" + i + "] = " + array[i]);
            }

            int[][] array2D = new int[10][10];
            for (int i = 0; i < array2D.length; i++)
            {
                  for (int j = 0; j < array2D[i].length; j++)
                  {
                        array2D[i][j] = i * j;
                  }
            }

            for (int i = 0; i < array2D.length; i++)
            {
                  for (int j = 0; j < array2D[i].length; j++)
                  {
                        System.out.println("array2D[" + i + "][" + j + "] = " + array2D[i][j]);
                  }
            }

            int[][][] array3D = new int[10][10][10];
            for (int i = 0; i < array3D.length; i++)
            {
                  for (int j = 0; j < array3D[i].length; j++)
                  {
                        for (int k = 0; k < array3D[i][j].length; k++)
                        {
                              array3D[i][j][k] = i * j * k;
                        }
                  }
            }

            for (int i = 0; i < array3D.length; i++)
            {
                  for (int j = 0; j < array3D[i].length; j++)
                  {
                        for (int k = 0; k < array3D[i][j].length; k++)
                        {
                              System.out.println("array3D[" + i + "][" + j + "][" + k + "] = " + array3D[i][j][k]);
                        }
                  }
            }

            int[] array2 = { 1, 2, 3, 4, 5 };
            for (int i = 0; i < array2.length; i++)
            {
                  System.out.println("array2[" + i + "] = " + array2[i]);
            }
      }
}
