<img width="397" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/fde9c718-bca5-496b-8f83-25358b0a525e">
<br />
<br />
There are 2 ways to identify DP problem
<br />
1) There has to be choice or multiple options for each element<br />
2) The question should ask for optimum(min or max)<br />
<br />
<br />
<br />

There are also 2 major types of problems<br />
<ins>**1) Knapsack type Problem type**</ins><br />

When given 1 or 2 arrays and a constraint capapcity or weight then it belongs to<br />
this pattern.<br />

Subtypes:

1) Whenever there is a max or min value problem like "0/1 Knapsack" then we use max<br />

![image](https://github.com/gregbg218/DSA/assets/72642906/8a1a288f-3d17-455f-9b11-28f62048cb58)

<br />
<br />
2) Whenever there is a problem like find if there exists a subset that matches the target sum then we use "||"(or operator)
<br />
<img width="439" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/8c4acf9c-4d1a-40ab-907d-0a7a86dcd938">
<br />
However we need to ensure that the base case returns either 1 instance of true for this to work<br />
<br />
<br />
3) Whenever there is a count problem like "Count of subsets with sum equal to X"
We always add or sum of all the possibilities in both recursion(memo) and DP
![image](https://github.com/gregbg218/DSA/assets/72642906/5cc19411-bf9f-443c-be9b-48d5b1d36b14)


![image](https://github.com/gregbg218/DSA/assets/72642906/2d65a47a-c747-4c67-b3bd-6e16ce8aec9b)

<br />
However we need to ensure that the base case returns either 1 or something greater than 1 for this to work
<br />
<br />   
<br />
<br />
<br />
<br />

<ins>**2) Longest Common Subsequence Problem type**</ins><br />
Whenever given 2 strings in input and ask to find something optimum(min or max)<br /> then<br />
question belongs to this type.<br />


<ins>**3)Matrix chain multiplication**</ins><br />
Whenever given a string or an array and you have a variable k that divides the array/string in 2 sets and then individually processes them then it is of this type. Also note in this type there is an extra for loop which chooses the value of k. Ex[lained further below<br />
<br />

<br />
<br />
<br />
Watch:<br />
https://www.youtube.com/watch?v=kvyShbFVaY8&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=3
https://www.youtube.com/watch?v=fJbIuhs24zQ&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=4
https://www.youtube.com/watch?v=ntCGbPMeqgg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=5
<br />
<br />
Solve these 3 first :<br />
https://github.com/gregbg218/DSA/blob/main/Dynamic%20Programming(Knapsack)/0%20-%201%20Knapsack(Recursion).java<br />
https://github.com/gregbg218/DSA/blob/main/Dynamic%20Programming(Knapsack)/0%20-%201%20Knapsack(Memoization).java<br />
https://github.com/gregbg218/DSA/blob/main/Dynamic%20Programming(Knapsack)/0%20-%201%20Knapsack(Bottom-Up).java<br />
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

![image](https://github.com/gregbg218/DSA/assets/72642906/74b7ec28-b487-4773-a932-d6092e8c64df)

he calls matrix t but usually books call it dp in memoization<br />


memoization and recursion<br />

n is number of elements <br />


In matrix t we allocate n+1 becos we are including 0 too bt we still need exact weight and exact number of elements unlike the array which uses an index starting from 0

and we use t[n] becos we want real number of elements in matrix unlike array


But the arrays will have normal indexing 0 to n-1 


But we still pass n so that 
we can do t[n][w] and arr[n-1]

Also weight array becomes wt[w-wt[n-1]] as it uses only n but in t[n][w] we use w as we need real weight there 


But the base condition or initialization stage of t[0][0] or when n=0 or w=0 is different and is done in the beginning
as arr[0-1] can cause problems



<ins>**how matrix size is decided in memoization(same logic for bottom up):**</ins><br />
<ins>**OR**</ins><br />
<ins>**how problem is decided to be 1D or 2D dp**</ins><br />
![image](https://github.com/gregbg218/DSA/assets/72642906/539c3985-ff4a-4077-b49b-400c96da0e06)



So these 2 variables have their values changing over each function call, so matrix would be made using them t[n][w].<br />
Always make matrix from variables changing over function calls<br />

So based on the number of changing variables we can decide whether its 1D or 2D DP.<br />


<br />
<br />


<ins>**Bottom up approach:**</ins><br />

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

from 12:34 to 17:04<br />
<br />
<br />
Another way of saying this is (example is from subset sum):<br />
![image](https://github.com/gregbg218/DSA/assets/72642906/68d6bd41-94e6-4ead-a266-2aca4b5a4dae)<br />

The shaded box means the answer when the sum/target sum=7 but we are pnly allowed to take 1 st element of the array or when the size of array=1<br />

Also t[i-1][j-wt[i-1]] or t[i-1][j] has i-1 common becos we are using the previous subproblem/iteration/sum/value and i is representing number of elements and whether we use current element or not we have to reduce the number of elements left to use as we move ahead


<br />
<br />
<br />
<br />
<br />
When translating a recursive algorithm into an iterative one using a double for loop (outer and inner), 
the typical strategy involves starting from the bottom and incrementally progressing upwards. 
This stands in contrast to recursion, which usually operates in a top-down manner.

In recursion, you initiate the process with the initial problem, breaking it down into smaller sub-problems 
until you reach the base case. Subsequently, you solve each sub-problem on the way back up.

Upon converting this recursive approach into an iterative one with a double for loop, the usual practice 
is to commence from the smallest sub-problems. Their solutions are then aggregated to address larger problems, 
systematically working upwards to tackle the original problem. This constitutes a bottom-up approach.

The bottom-up approach is often favored for its memory efficiency, as it circumvents the overhead of recursive function calls. 
Additionally, it can be more amenable to optimization in terms of time complexity. This strategy is commonly applied 
in dynamic programming problems, where solutions to subproblems are leveraged to efficiently solve the overall problem.

<br />
RULES for converting recursion to tabulation<br />
<br />
	• MAKE 2 FOR LOOPS
 <br />
 <br />

	• PUT EVERYTHING OUTSIDE THE FOR LOOP IN RECURSION SOLN INSIDE TABULATION SOLN'S OUTER FOR LOOP
 <br />
 <br />

	• IF RECURSION FUNCTION(NOT FOR LOOP) STARTS FROM 0 TO N MAKE TABULATION OUTER FOR LOOP N TO 0 AND VICE VERSA
 <br />
 <br />

	• CONVERT BASE CASE OF RECURSION INTO SOMETHING WITHIN INNER FOR LOOP OF TABULATION 
 <br />

<br />
<br />
<br />
<br />

<ins>**Recursion and DP a comparison**</ins><br />
https://github.com/gregbg218/DSA/blob/main/Recursion/template.md

Yes, you're on the right track! Dynamic programming (DP) and recursion often share the same underlying idea of breaking down a problem into smaller subproblems. The difference lies in how these subproblems are solved and how their solutions are combined.

Recursion and dynamic programming both involve dividing a problem into smaller overlapping subproblems. However, the key distinction is in how these subproblems are solved:

Recursion (Top-Down): In the recursive approach, you start with the original problem and break it down into smaller subproblems. You solve each subproblem by recursively solving smaller instances of the same problem until you reach the base case. This approach can lead to redundant calculations if the same subproblem is solved multiple times.

Dynamic Programming (Bottom-Up): In dynamic programming, you start by solving the smallest subproblems and store their solutions. Then, you use the solutions of smaller subproblems to build up the solution to the original problem. Dynamic programming often involves using an array or table to store intermediate results, avoiding redundant calculations and improving efficiency.

The key idea in dynamic programming is to store the solutions to subproblems in a table and use these solutions to avoid redundant computations. This is often referred to as the "memoization" or "bottom-up" approach. It contrasts with the more straightforward but potentially less efficient "naive" recursive approach.

So DP also uses the base condition or initialization to get the final solution.

<br />
<br />
<br />
<ins>**Initialization or base condition**</ins><br />
Unlike aditya verma tabulation video where he initializes both i=0 row and j=0<br />
column and in the double inner loop starts from j=1.<br />
However we only initialize the i=0 row.<br />
and in the double inner loop we start from j=0 so that the j=0 column <br />
isnt empty.<br />
This is becos if we have lets say target Sum problem and the input is <br />
0,0,0,0(i.e. it includes zeroes) then we cant put i=1 and j=0 value as just 1 <br />
becos there are 2 ways the empty sunbset and the 0 value itself so the answer<br />
should be 2<br />

<br />
<br />
<br />


<ins>**3rd type: Matrix Chain Multiplication**</ins><br />

1) What is Cost <br />

![image](https://github.com/gregbg218/DSA/assets/72642906/269d793f-7405-4621-b644-4f04c63506e7)


<img width="588" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/e3a546d5-cb5d-4c3c-8062-3a0be39d164c">


<img width="587" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/dbe5dfaa-dcb4-4844-8de1-cc6e7ec8c4d6">

<img width="552" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/2d0565a5-4d6c-4ac7-9f7b-86d36f150528">


![image](https://github.com/gregbg218/DSA/assets/72642906/4764aad6-4598-4252-9e54-837528d07757)<br />


C is the result matrix or product of matrices A and B<br />
So here we are finding total number of multiplications and each element<br />
is made of n multiplications and since there are mxp elements we get<br />
answer as mxnxp which is the cost <br />

SO question is in this format:<br />
arr = {40, 20, 30, 10, 30}<br />
This array means there are 4 matrices of dimension <br />
40x20, 20x30, 30x10, 10x30.<br />
<br />

so every matrix is represented by arr[i-1]xarr[i]<br />
<br />
At i=1<br />
Matrix = arr[0] x arr[1] = 40x20<br />

At i=4<br />
Matrix = arr[3] x arr[4] = 10x30<br />
<br />

So our goal is to find the order of multiplying matrices so that the cost is minimum:<br />
Example : 3 matrices :A,B,C<br />
We can do:<br />
(AxB) then multiply its product P1 by C(P1xC)<br />
   or<br />
(BxC) then multiply its product P2 by A (AxP2)<br />

<br />
<br />
2) Main logic of matrix chain recursion <br />
<br />
Mostly we are just moving k from one place to another and finding the min cost<br />
among all the combinations that we get from moving k<br />
Example:<br />
arr[] = {40, 20, 30, 10, 30}<br />
if k is at index 2 so k=30<br />
i is at index 1 i=20<br />
j is at index 4 j=30<br />
<br />
Intermediate matrix 1 (i to k):<br />
A=40x20 and B=20x30<br />
Result matrix = 40x30<br />
Cost = 40x20x30<br />
This is given by func(i to k)<br />

<br />
Intermediate matrix 2 (k+1 to j):<br />
A=30x10 and B=10x30<br />
Result matrix = 30x30<br />
Cost = 30x10x30<br />
This is given by func(k+1 to j)<br />
<br />
Final matrix
A=Intermediate matrix 1 = 40x30<br />
B=Intermediate matrix 2 = 30x30<br />
Cost = 40x30x30<br />
This is given by arr[i-1]*arr[k]*arr[j]<br />

so the first recursive call will be <br />
tempResult= func(i to k) + func(k+1 to j) + arr[i-1]*arr[k]*arr[j]<br />

![image](https://github.com/gregbg218/DSA/assets/72642906/4e8d769c-967d-49e0-910c-3ee79893d1cf)
<br />
<br />
<br />
<ins>**How to choose i and j**</ins><br />

<img width="590" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/a6e00765-f4d9-4fad-8a14-88cb0cdbed00"><br />
<br />
This above is an image of the code<br />
i and j are used in 2 places:<br />
1)for loop<br />
2) function calls<br />
In the code we can choose values of i and j in 2 ways:<br />




![image](https://github.com/gregbg218/DSA/assets/72642906/f9616427-d0d5-4ca5-83d0-c8d3a27e4edb)

<img width="239" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/c475af42-6b7a-4e1c-8df1-05035b775e9c"><br />

Above part coressponds to this:<br />
<img width="320" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/2a93feac-993f-4257-80af-fba60675fd19"><br />


similarly:<br />
<img width="308" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/be0a3c9e-6b0d-4344-8c75-0e21b89a154d"><br />
Above part coressponds to this:<br />
<img width="379" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/2daf0c44-a39c-4895-b4ed-5374979a0109"><br />

<br />
https://www.youtube.com/watch?v=kMK148J9qEE&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=33<br />
watch from 30:47<br />
<br />
<br />

Notice here in the code we have recursion but we also have a for loop for k inside:<br />
<img width="715" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/160640cd-0a7e-4c98-b337-10569bf605a2"><br />
So these types of problems are a bit different then the other types<br />

<br />
<br />

<ins>**Base case**</ins><br />
Every matrix here is :<br />
<img width="470" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/4186d0b1-5d23-4c0b-a8a6-17ea78fb3a5b"><br />

<img width="355" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/ae0b4863-0cba-4e46-b10f-2c8f03450a63"><br />

So both i and j are representing matrices in this form
<br />

<img width="412" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/fc54d044-6521-4d56-a473-fa73bc249844">
<br />

<br />

When k=i <br />
<img width="379" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/a4c724eb-33af-4335-b0c7-a487c5183081"><br />
so first function call func(arr,i,k) = func(arr,i,i) = 0 ( as k=i and thus for that function call j=i)<br />
so second function call func(arr,k+1,j) = func(arr,j,j) = 0 ( as k+1=j and thus for that function call i=j)<br /><br />
arr[i-1]xarr[k]xarr[j]=40x20x30<br /><br />

Now k cant do k++ since k should be less than j(or k<=j-1)<br /><br />

<br />
<br />
<br />

<ins>**how it fits the pattern**</ins><br />
<img width="193" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/a15284f0-3990-4907-a67e-4750b7a23cf7">
For these 4 matrices 
We keep on shifting value of k
<img width="418" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/a7ffe61a-d65c-4612-bd64-6a1f95fc9841">


So the cost of multiplying the matrices for this value of k will be different from when we choose another value of k like
below:

<img width="237" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/de661e50-49c9-465a-9c6e-a5cbffba2479">
<br />
<br />
<br />

<ins>**Why k cant be equal to j**</ins><br />
Becos if k is allowed to be equal to j then in this case when k=j :<br />
<img width="457" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/ebf32f8e-ac0e-4bde-8567-acc6b9bf9ffe"><br />
so first function call func(arr,i,k) = func(arr,1,4)<br />
but second function call isnt possible as k+1 doesnt exist<br />
<br />
<br />
<ins>**Why i cant start from index 0**</ins><br />
<img width="548" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/f96bcd6d-8df3-4c52-a3ee-55e202692756"><br />
Then i-1 becomes -1 so arr[i-1]xarr[k]xarr[j] will fail<br />
So i will always start from index 1<br />

<ins>**Tabulation approach for loop values of i and j**</ins><br />
<img width="794" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/a5d447a8-6c96-40cd-abd2-5fc1609e0b50"><br />

Here value of i and j is different.<br />

Typically it is i=1 to N-1 and j=i to N-1<br />
but when we use this appraoch we get :<br />
<img width="635" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/7223cfc9-8ef9-448c-82b3-b506eacc0dcf"><br />

This dont know is becos the subproblem required to calculate dpTab[1][3] is dpTab[2][3] which we havent yet reached<br />

So instead we do this:<br />
<img width="484" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/01a06f67-01d7-4545-a708-133f58a8de3c">

<br />


<br />
<br />
<br />

