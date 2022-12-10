//========== CODE WRITTEN BY DYLAN CHEN ==========//
#include <chrono>
#include <iostream>

int loopCount = 1E+8;

void Operate(int op)
{
    int result = 1;
    std::string stringOp = "";
    auto start = std::chrono::high_resolution_clock::now();

    for (int i = 0; i < loopCount; i++)
        switch (op) 
        {
            case 0: 
            {
                stringOp = "addition: ";
                result++;
                break;
            }
            case 1: 
            {
                stringOp = "subtraction: ";
                result--;
                break;
            }
            case 2: 
            {
                stringOp = "multiplication: ";
                result *= 2;
                break;
            }
            case 3: 
            {
                stringOp = "division: ";
                result /= 2;
                break;
            }
        }

    auto finish = std::chrono::high_resolution_clock::now();
    auto secondsExe = std::chrono::duration_cast<std::chrono::milliseconds>(finish - start).count();

    std::cout << "Execution for " + stringOp + std::to_string(secondsExe / 1E+3) + " seconds\n";
}
int main()
{
    for (int i = 0; i < 4; i++)
        Operate(i);
    
    return 0;
}