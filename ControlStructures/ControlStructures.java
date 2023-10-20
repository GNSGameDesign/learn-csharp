public class ControlStructures
{
      public static void main(String[] args)
      {
            boolean a = true;
            boolean b = false;

            if (a)
            {
                  System.out.println("a is true");
            }

            if (b)
            {
                  System.out.println("b is true");
            }

            if (a && b)
            {
                  System.out.println("a and b are true");
            }

            if (a || b)
            {
                  System.out.println("a or b is true");
            }

            if (a && !b)
            {
                  System.out.println("a is true and b is false");
            }

            if (a || !b)
            {
                  System.out.println("a is true or b is false");
            }

            if (a && b)
            {
                  System.out.println("a and b are true");
            }
            else
            {
                  System.out.println("a and b are not both true");
            }

            boolean c = true;
            boolean d = false;

            if (c)
            {
                  System.out.println("c is true");
            }
            else if (d)
            {
                  System.out.println("d is true");
            }
            else
            {
                  System.out.println("c and d are false");
            }

            if (a)
            {
                  if (b)
                  {
                        if (c)
                        {
                              if (d)
                              {
                                    if (a)
                                    {
                                          if (b)
                                          {
                                                if (c)
                                                {
                                                      if (d)
                                                      {
                                                            if (a)
                                                            {
                                                                  if (b)
                                                                  {
                                                                        System.out.println("a and b are true");
                                                                  }
                                                                  else
                                                                  {
                                                                        System.out.println("a is true and b is false");
                                                                  }
                                                            }
                                                            else
                                                            {
                                                                  System.out.println("a is false");
                                                            }
                                                      }
                                                      else
                                                      {
                                                            System.out.println("d is false");
                                                      }
                                                }
                                                else
                                                {
                                                      System.out.println("c is false");
                                                }
                                          }
                                          else
                                          {
                                                System.out.println("b is false");
                                          }
                                    }
                                    else
                                    {
                                          System.out.println("a is false");
                                    }
                              }
                              else
                              {
                                    System.out.println("d is false");
                              }
                        }
                        else
                        {
                              System.out.println("c is false");
                        }
                  }
                  else
                  {
                        System.out.println("b is false");
                  }
            }
            else
            {
                  System.out.println("a is false");
            }

      }
}
