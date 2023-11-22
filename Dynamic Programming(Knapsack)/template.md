Watch:<br />
https://www.youtube.com/watch?v=kvyShbFVaY8&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=3
https://www.youtube.com/watch?v=fJbIuhs24zQ&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=4
https://www.youtube.com/watch?v=ntCGbPMeqgg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=5
<br />
<br />
<br />

The pre-requsite for learning DP is to learn how to solve the problem using recursion(top down approach) first.<br />
<br />
<br />
<br />
<br />

There are 2 approaches in DP  : <br />

a)memoization  <br />
This is a modified version of Recursion and so its top down as it uses recursion.<br />

b)bottom up approach  <br />
<br />
<br />
<br />
<br />
<ins>**Common instructions of all 3 aproaches**</ins><br />
1) Think of a Base condition(recursion and memo) or initialization logic(bottom up)<br />
2) Think of a Choice logic(recursion and memo) and main iteration logic(bottom up)<br />

<br />
<br />
<br />
<ins>**Recursion approach base condition**</ins><br />
https://www.youtube.com/watch?v=kvyShbFVaY8&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=7

from 6:26 to 10:42<br />
<br />
<br />


he calls matrix t books call it dp in memoization


memoization and recursion

n is number of elements 


In matrix t we allocate n+1 becos we are including 0 too bt we still need exact weight and exact number of elements unlike the array which uses an index starting from 0

and we use t[n] becos we want real number of elements in matrix unlike array


But the arrays will have normal indexing 0 to n-1 


But we still pass n so that 
we can do t[n][w] and arr[n-1]

Also weight array becomes wt[w-wt[n-1]] as it uses only n but in t[n][w] we use w as we need real weight there 


But the base conditionor initialization stage of t[0][0] or when n=0 or w=0 is different and is done in the beginning
as arr[0-1] can cause problems








Bottom up approach

i and j is not any counter

![image](https://github.com/gregbg218/DSA/assets/72642906/2d4590f1-016e-4ff7-a2c0-62d4bb9e8a73)

(Here val[n-1] above means the profit value for the current element but since val array is indexed from 0 we do n-1)

![image](https://github.com/gregbg218/DSA/assets/72642906/3316667c-4141-423a-81a7-34a48ed5cc2d)



Here as we are not using recursion we are making use of the previous value(t[n][w-wt[n-1])) in the matrix to compensate for recursion





The above picture becomes this:
![image](https://github.com/gregbg218/DSA/assets/72642906/dcb22378-e427-47b6-bc7b-41a90e50aab2)



Explaination for the above conversion:
![image](https://github.com/gregbg218/DSA/assets/72642906/8d1759d5-dec8-40c5-920c-18e5d94cfa1f)

those 2 circled variables are the only variables that dont remain constant(their changed forms are shown by the arrows) and so w becomes i and n becomes j.

<ins>**Conversion of recursion to iteration**</ins><br />
[https://www.youtube.com/watch?v=kvyShbFVaY8&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=7](https://www.youtube.com/watch?v=ntCGbPMeqgg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=12)

from 12:34 to 17:04



Also t[i-1][j-wt[i-1]] or t[i-1][j] has i-1 common becos i is representing number of elements and whether we use current element or not we have to reduce the number of elements left to use as e move ahead


<br />
<br />
<br />
<br />
<br />
// When translating a recursive algorithm into an iterative one using a double for loop (outer and inner), 
// the typical strategy involves starting from the bottom and incrementally progressing upwards. 
// This stands in contrast to recursion, which usually operates in a top-down manner.

// In recursion, you initiate the process with the initial problem, breaking it down into smaller sub-problems 
// until you reach the base case. Subsequently, you solve each sub-problem on the way back up.

// Upon converting this recursive approach into an iterative one with a double for loop, the usual practice 
// is to commence from the smallest sub-problems. Their solutions are then aggregated to address larger problems, 
// systematically working upwards to tackle the original problem. This constitutes a bottom-up approach.

// The bottom-up approach is often favored for its memory efficiency, as it circumvents the overhead of recursive function calls. 
// Additionally, it can be more amenable to optimization in terms of time complexity. This strategy is commonly applied 
// in dynamic programming problems, where solutions to subproblems are leveraged to efficiently solve the overall problem.



