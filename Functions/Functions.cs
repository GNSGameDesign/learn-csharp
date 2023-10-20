using System;

class Program
{
      static void FunctioNoReturn()
      {
            Console.WriteLine("This function has no return value");
      }

      static int FunctionWithReturn()
      {
            return 10;
      }

      static float integrate(float a, float b, float c, float d)
      {
            float result = 0;
            for (float x = a; x < b; x += 0.0001f)
            {
                  result += c * x + d;
            }
            return result;
      }

      static void Main()
      {
            FunctioNoReturn();
            Console.WriteLine(FunctionWithReturn());
            Console.WriteLine(integrate(0, 10, 1, 0));
      }

}