using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleAppDebug
{
    class Temperature
    {   /*
        static void Main(string[] args)
        {
            int result = -1;
            int n = int.Parse(Console.ReadLine()); // the number of temperatures to analyse
            string[] inputs = Console.ReadLine().Split(' ');
            List<int> TempList = new List<int>();
            for (int i = 0; i < n; i++)
            {
                TempList.Add(int.Parse(inputs[i]));// a temperature expressed as an integer ranging from -273 to 5526
                if (TempList[i] == 0)
                {
                    result = 0;
                    break;
                }
            }


            if (result != 0)
            {
                TempList.Sort();
                int temp1 = -1;

                for (int i = 0; i < TempList.Count(); i++)
                {
                    Console.WriteLine(TempList[i]);
                    if (i == 0)
                    {
                        if (TempList[i] > 0)
                        {
                            result = TempList[0];
                            break;
                        }
                        else
                        {
                            temp1 = TempList[0];
                            continue;
                        }
                    }

                    if (TempList[i] > 0)
                    {
                        if (TempList[i] >= 0 - temp1)
                        {
                            result = TempList[i];
                            break;
                        }
                        else
                        {
                            result = temp1;
                            break;
                        }
                    }
                    else temp1 = TempList[i];
                }
            }
            Console.WriteLine(result);

        }   */
    }
}
