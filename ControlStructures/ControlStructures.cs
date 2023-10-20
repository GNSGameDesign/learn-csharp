using System;

class Program
{
      static void Main()
      {
            bool a = true;
            bool b = false;

            if (a)
            {
                  Console.WriteLine("a is true");
            }
            else
            {
                  Console.WriteLine("a is false");
            }

            if (b)
            {
                  Console.WriteLine("b is true");
            }
            else
            {
                  Console.WriteLine("b is false");
            }

            if (a && b)
            {
                  Console.WriteLine("a and b are true");
            }
            else
            {
                  Console.WriteLine("a and b are not both true");
            }

            if (a || b)
            {
                  Console.WriteLine("a or b is true");
            }
            else
            {
                  Console.WriteLine("a and b are both false");
            }

            if (a ^ b)
            {
                  Console.WriteLine("a or b is true, but not both");
            }
            else
            {
                  Console.WriteLine("a and b are both false or both true");
            }

            if (!a)
            {
                  Console.WriteLine("a is false");
            }
            else
            {
                  Console.WriteLine("a is true");
            }

            if (!b)
            {
                  Console.WriteLine("b is false");
            }
            else
            {
                  Console.WriteLine("b is true");
            }

            if (a == b)
            {
                  Console.WriteLine("a and b are equal");
            }
            else
            {
                  Console.WriteLine("a and b are not equal");
            }

            bool c = true;
            bool d = false;

            if (a)
            {
                  if (b)
                  {
                        if (c)
                        {
                              if (d)
                              {
                                    Console.WriteLine("a, b, c, and d are true");
                              }
                              else
                              {
                                    Console.WriteLine("a, b, and c are true, but d is false");
                              }
                        }
                        else
                        {
                              Console.WriteLine("a and b are true, but c is false");
                        }
                  }
                  else
                  {
                        Console.WriteLine("a is true, but b is false");
                  }
            }
            else
            {
                  Console.WriteLine("a is false");
            }


      }
}