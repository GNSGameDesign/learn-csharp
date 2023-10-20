using System;

class Program
{
      static void Main()
      {
            for (int i = 0; i < 10; i++)
            {
                  Console.WriteLine(i);
            }

            int j = 0;
            while (j < 10)
            {
                  Console.WriteLine(j);
                  j++;
            }

            int k = 0;
            do
            {
                  Console.WriteLine(k);
                  k++;
            } while (k < 10);

            for (int l = 0; l < 10; l++)
            {
                  if (l == 5)
                  {
                        continue;
                  }
                  Console.WriteLine(l);
            }

            for (int m = 0; m < 10; m++)
            {
                  for (int n = 0; n < 10; n++)
                  {
                        for (int o = 0; o < 10; o++)
                        {
                              for (int p = 0; p < 10; p++)
                              {
                                    Console.WriteLine(m + " " + n + " " + o + " " + p);
                              }
                        }
                  }
            }
      }
}