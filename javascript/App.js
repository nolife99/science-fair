var loopCount = 1E+8;

function Operate(op)
{
    var result = 1;
    var stringOp = "";
    
    var start = new Date();
    for (let i = 0; i < loopCount; i++)
        switch (op) 
        {
            case 0: 
            {
                stringOp = "addition:";
                result++;
                break;
            }
            case 1: 
            {
                stringOp = "subtraction:";
                result--;
                break;
            }
            case 2: 
            {
                stringOp = "multiplication:";
                result *= 2;
                break;
            }
            case 3: 
            {
                stringOp = "division:";
                result /= 2;
                break;
            }
        }
    
    var end = new Date();
    console.log("Execution time for", stringOp, (end - start) / 1000)
}

for (let i = 0; i < 4; i++)
    Operate(i);