public class Loops
{
      public static void main(String[] args)
      {
            for (int i = 0; i < 10; i++)
            {
                  System.out.println("i = " + i);
            }

            int i = 0;
            while (i < 10)
            {
                  System.out.println("i = " + i);
                  i++;
            }

            i = 0;
            do
            {
                  System.out.println("i = " + i);
                  i++;
            }
            while (i < 10);

            for (int j = 0; j < 10; j++)
            {
                  if (j == 5)
                  {
                        continue;
                  }
                  System.out.println("j = " + j);
            }

            for (int j = 0; j < 10; j++)
            {
                  for (int k = 0; k < 10; k++)
                  {
                        for (int l = 0; l < 10; l++)
                        {
                              for (int m = 0; m < 10; m++)
                              {
                                    System.out.println("j = " + j + " k = " + k + " l = " + l + " m = " + m);
                              }
                        }
                  }
            }
      }
}
