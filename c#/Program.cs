using System;
 
//========== CODE WRITTEN BY DYLAN CHEN ==========//
class CSharpPerformanceTest
{
    static void Main()
    {
        var loopAmount = 1E+8;
 
        Operate(() =>
        {
            var result = 0;
            for (var i = 0; i < loopAmount; i++) result++;
            return "addition";
        });
        Operate(() =>
        {
            var result = 0;
            for (var i = 0; i < loopAmount; i++) result--;
            return "subtraction";
        });
        Operate(() =>
        {
            var result = 1;
            for (var i = 0; i < loopAmount; i++) result *= 2;
            return "multiplication";
        });
        Operate(() =>
        {
            var result = 1;
            for (var i = 0; i < loopAmount; i++) result /= 2;
            return "division";
        });
    }
    static void Operate(Func<string> op)
    {
        var stopwatch = System.Diagnostics.Stopwatch.StartNew();
        var operation = op();
        stopwatch.Stop();
 
        Console.Write($"Execution time for {operation}: {stopwatch.ElapsedMilliseconds / 1000m} seconds\n");
    }
}