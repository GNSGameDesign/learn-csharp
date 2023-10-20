public class Functions
{
      public static float integrate(float a, float b, int n, float[] f)
      {
            float h = (b - a) / n;
            float sum = 0;
            for (int i = 0; i < n; i++)
            {
                  sum += h * f[i];
            }
            return sum;
      }

      public static float[] colorShift(float[] rgba)
      {
            float[] hsla = new float[4];
            float r = rgba[0];
            float g = rgba[1];
            float b = rgba[2];
            float a = rgba[3];
            float max = Math.max(Math.max(r, g), b);
            float min = Math.min(Math.min(r, g), b);
            float h = 0;
            float s = 0;
            float l = (max + min) / 2;
            if (max == min)
            {
                  h = 0;
                  s = 0;
            }
            else
            {
                  float d = max - min;
                  s = l > 0.5 ? d / (2 - max - min) : d / (max + min);
                  if (max == r)
                  {
                        h = (g - b) / d + (g < b ? 6 : 0);
                  }
                  else if (max == g)
                  {
                        h = (b - r) / d + 2;
                  }
                  else if (max == b)
                  {
                        h = (r - g) / d + 4;
                  }
                  h /= 6;
            }
            hsla[0] = h;
            hsla[1] = s;
            hsla[2] = l;
            hsla[3] = a;
            return hsla;
      }

      public static void functionNoReturn()
      {
            System.out.println("FunctionNoReturn");
      }

      public static int functionReturn()
      {
            System.out.println("FunctionReturn");
            return 0;
      }

      public static void functionWithParameters(int a, int b)
      {
            System.out.println("FunctionWithParameters");
      }

      public static int functionWithParametersAndReturn(int a, int b)
      {
            System.out.println("FunctionWithParametersAndReturn");
            return 0;
      }

      public static void main(String[] args)
      {
            functionNoReturn();
            functionReturn();
            functionWithParameters(0, 0);
            functionWithParametersAndReturn(0, 0);
            float[] rgba = { 0.5f, 0.5f, 0.5f, 0.5f };
            float[] hsla = colorShift(rgba);
            System.out.println("hsla = " + hsla[0] + " " + hsla[1] + " " + hsla[2] + " " + hsla[3]);
            float[] f = { 1, 2, 3, 4, 5 };
            System.out.println("integrate = " + integrate(0, 1, 5, f));
      }
}
