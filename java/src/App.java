//========== CODE WRITTEN BY DYLAN CHEN ==========//
class JavaPerformanceTest {
    static double loopCount = 1E+8;

    public static void main(String[] args) {
        for (var i = 0; i < 4; i++)
            Operate(i);
    }

    static void Operate(int op) {
        var stopwatch = new Stopwatch();
        var result = 1;
        var stringOp = "";

        for (var i = 0; i < loopCount; i++)
            switch (op) {
                case 0: {
                    stringOp = "addition: ";
                    result++;
                    break;
                }
                case 1: {
                    stringOp = "subtraction: ";
                    result--;
                    break;
                }
                case 2: {
                    stringOp = "multiplication: ";
                    result *= 2;
                    break;
                }
                case 3: {
                    stringOp = "division: ";
                    result /= 2;
                    break;
                }
            }

        System.out.println(String.format("Execution for " + stringOp + stopwatch.elapsedTime() + " seconds"));
    }
}

// Utility helper class.
class Stopwatch {
    long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        var now = System.currentTimeMillis();
        return (now - start) / 1E+3;
    }
}