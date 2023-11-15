there are 3 ways
recursion
memoization
top down approach


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








Top down

i and j is not any counter


![image](https://github.com/gregbg218/DSA/assets/72642906/3316667c-4141-423a-81a7-34a48ed5cc2d)



Here as we are not using recursion we are making use of the previous value(t[n][w-wt[n-1])) in the matrix to compensate for recursion





