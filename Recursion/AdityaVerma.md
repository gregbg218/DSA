
THere are 3 approaches for soling recursion problem so for a problem we go one by one to check which is applicable

1) Base Induction Hypothesis method
2) Recursion Tree(input output method)
3) Choice diagram method(used in Dynamic programming)

<ins>**Base Induction Hypothesis method**</ins><br />
https://www.youtube.com/watch?v=Xu5RqPdABRE&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=3 <br />
from 11:58 to 13:20<br />

It is mostly used in tree and linked list problem<br />
<br />


![image](https://github.com/gregbg218/DSA/assets/72642906/a8a70b40-deb8-4870-9ea8-4518e372eb03)<br />
<br />
THE TASK IS TO PRINT FROM 1 TO N
<br />
<br />
BUT WHEN WE HAVE TO PRINT FROM N TO 1 WE CAN CHANGE POSITION OF INDUCTION STEP<br />
<br />
https://www.youtube.com/watch?v=qDJJBZAIXIw&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=4<br />
<br />
Whenever we are asked to reduce the input till 0 then we use this approach<br />
<br />
<br />
Best example to learn this method:<br />
https://www.youtube.com/watch?v=oCcUNRMl7dA&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=8
<br />
<br />
STEP 1: FORM THE HYPOTHESIS FOR THE FIRST 2 ITERATIONS OF RECURSION NOT MORE THAN THAT
(ALSO FOR EVERY ITERATION WE WRITE DESIRED OUTPUT AND FOR MOVING TO THE NEXT LEVEL
<br />
DECREASE INPUT SIZE AND AGAIN WRITE THE DESIRED OUTPUT FOR REDUCED INPUT)
<br />
<br />
STEP 2: WRITE INDUCTION PART
THE INDUCTION CAN BE 1 LINE OR A NEW RECURSION FUNCTION ITSELF
<br />
<br />
STEP 3: WRITE BASE CONDITION PART<br />
Here we should always think of the smallest most valid condition.<br />
Usually it is 1 or if(n==1)
<br />
<br />
<br />
<br />
<br />
<br />
<ins>**Recursion Tree(input output method)**</ins><br />
https://www.youtube.com/watch?v=kHi1DUhp9kM&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=1 <br />
from 19:35 to 24:53<br /><br />
Whenever we are asked to make a choice and decision in a problem then we use this approach<br />
In this approach e start with empty output and full input and we keeep on going
<br />
until we have empty input regardless of what happens with output.<br />
Basically we stop at the leaf node where input is empty
<br />
<br />
