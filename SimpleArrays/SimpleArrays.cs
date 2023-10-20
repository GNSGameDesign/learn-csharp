using System;

class Program
{
      static void Main()
      {
            int[] oneDimensionalArray = new int[10];
            int[,] twoDimensionalArray = new int[10, 10];
            int[,,] threeDimensionalArray = new int[10, 10, 10];

            for (int i = 0; i < oneDimensionalArray.Length; i++)
            {
                  oneDimensionalArray[i] = i;
            }

            for (int i = 0; i < twoDimensionalArray.GetLength(0); i++)
            {
                  for (int j = 0; j < twoDimensionalArray.GetLength(1); j++)
                  {
                        twoDimensionalArray[i, j] = i + j;
                  }
            }

            for (int i = 0; i < threeDimensionalArray.GetLength(0); i++)
            {
                  for (int j = 0; j < threeDimensionalArray.GetLength(1); j++)
                  {
                        for (int k = 0; k < threeDimensionalArray.GetLength(2); k++)
                        {
                              threeDimensionalArray[i, j, k] = i + j + k;
                        }
                  }
            }

            for (int i = 0; i < oneDimensionalArray.Length; i++)
            {
                  Console.WriteLine(oneDimensionalArray[i]);
            }

            for (int i = 0; i < twoDimensionalArray.GetLength(0); i++)
            {
                  for (int j = 0; j < twoDimensionalArray.GetLength(1); j++)
                  {
                        Console.WriteLine(twoDimensionalArray[i, j]);
                  }
            }

            for (int i = 0; i < threeDimensionalArray.GetLength(0); i++)
            {
                  for (int j = 0; j < threeDimensionalArray.GetLength(1); j++)
                  {
                        for (int k = 0; k < threeDimensionalArray.GetLength(2); k++)
                        {
                              Console.WriteLine(threeDimensionalArray[i, j, k]);
                        }
                  }
            }


            int[][] jaggedOneDimensionalArray = new int[10][];

            for (int i = 0; i < jaggedOneDimensionalArray.Length; i++)
            {
                  jaggedOneDimensionalArray[i] = new int[i + 1];
            }

            for (int i = 0; i < jaggedOneDimensionalArray.Length; i++)
            {
                  for (int j = 0; j < jaggedOneDimensionalArray[i].Length; j++)
                  {
                        jaggedOneDimensionalArray[i][j] = i + j;
                  }
            }

            for (int i = 0; i < jaggedOneDimensionalArray.Length; i++)
            {
                  for (int j = 0; j < jaggedOneDimensionalArray[i].Length; j++)
                  {
                        Console.WriteLine(jaggedOneDimensionalArray[i][j]);
                  }
            }
      }
}