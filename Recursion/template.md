<ins>**STEPS OF RECURSION**</ins><br />
Step 1 : <br />
Draw a recursion tree <br />

https://www.youtube.com/watch?v=kHi1DUhp9kM&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY&index=1 <br />
from 19:35 to 24:53<br />
<br />
<br />
Step 2:<br />
Write code based on tree<br />



Sure, here's a simple template for a recursive function:

public class RecursiveExample {

    public static ReturnType recursiveFunction(ParameterType parameter) {
        // Base case
        if (baseCaseCondition) {
            // return some value
            return baseCaseValue;
        }

        // Recursive case
        else {
            // break the problem into smaller pieces
            ParameterType smallerParameter = modifyParameter(parameter);

            // call the function with the smaller parameter
            ReturnType result = recursiveFunction(smallerParameter);

            // combine the result to solve the original problem
            ReturnType finalResult = combineResult(parameter, result);

            // return the final result
            return finalResult;
        }
    }

    // You can define modifyParameter and combineResult functions separately

    private static ParameterType modifyParameter(ParameterType parameter) {
        // implement how to modify the parameter
        return modifiedParameter;
    }

    private static ReturnType combineResult(ParameterType parameter, ReturnType result) {
        // implement how to combine the result
        return combinedResult;
    }

    // Example base case condition and value
    private static boolean baseCaseCondition(ParameterType parameter) {
        // implement the base case condition
        return someCondition;
    }

    private static ReturnType baseCaseValue() {
        // implement the value to return when the base case is met
        return someValue;
    }

    public static void main(String[] args) {
        // Example usage of the recursive function
        ParameterType initialParameter = // initialize your parameter
        ReturnType result = recursiveFunction(initialParameter);
        System.out.println("Final Result: " + result);
    }
}


Let's break it down:

1. **Base Case:** This is the condition under which the recursion stops. When this condition is met, the function returns a known value without making any further recursive calls.

2. **Recursive Case:** This is where the function calls itself with a modified or smaller version of the original problem.

3. **Modify Parameter:** This step involves reducing the problem size or changing the parameter in some way to move towards the base case.

4. **Combine Result:** After getting the result from the recursive call, you might need to combine it with other information to solve the original problem.

Remember, this template can be adapted for different problems by adjusting the base case condition, modifying the parameter appropriately, and combining the results in a way that 
makes sense for the specific task you're working on.


In some cases, the return value in the recursive case might be omitted if the purpose of the recursion is to perform some action rather than explicitly computing and returning a value.

Here's an example to illustrate:

```java
public class RecursiveExample {

    public static void recursiveFunction(int count) {
        // Base case
        if (count <= 0) {
            return;
        }

        // Recursive case
        else {
            System.out.println("Count: " + count);

            // Recursive call with a smaller count
            recursiveFunction(count - 1);

            // No explicit return in this case
        }
    }

    public static void main(String[] args) {
        // Example usage of the recursive function
        int initialCount = 5;
        recursiveFunction(initialCount);
    }
}
```

In this example, the `recursiveFunction` is used to print the countdown from a given count to 1. There's no explicit return value in the recursive case because the goal is to perform an action (printing) rather than computing a result. The base case handles the termination condition.

Whether you include a return statement in the recursive case depends on what you're trying to achieve with the recursion. If the goal is to compute and return a result, you include the return statement. If it's more about performing some action or side effect, the return statement might be omitted.

Backtracking is a technique often used in solving problems where you try out different possibilities and "backtrack" when you realize that your current approach cannot lead to a valid solution. In many backtracking algorithms, the return statement in the recursive case might be omitted, especially when you are exploring possibilities or making decisions but not explicitly computing a final result.

The base case handles the termination condition by adding a valid permutation to the result.
In backtracking, the absence of an explicit return in the recursive case is often seen when the goal is to explore and make decisions rather than compute a final result.

<br />
<br />
<br />
<br />



<ins>**TIME COMPLEXITY OF RECURSION**</ins><br />


![image](https://github.com/gregbg218/DSA/assets/72642906/26adc629-4824-4732-a215-20e59650ca72)

![image](https://github.com/gregbg218/DSA/assets/72642906/ea469996-f145-4aed-af39-7f865c60f3d9)

Recursion tree:<br />
<br />


![image](https://github.com/gregbg218/DSA/assets/72642906/ecef36f3-57a4-471e-8948-027336d79243)

<br />
<br />
<br />
<br />

![image](https://github.com/gregbg218/DSA/assets/72642906/7fe0aee0-a05b-4d22-a4b0-9523ff29d204)
Recursion tree:
<br />

![image](https://github.com/gregbg218/DSA/assets/72642906/7ad95fe0-daac-4ab3-9c21-0b38b1d0abb5)

<br />
<br />
<br />
<br />

Similarly for 3 call branching :
<br />

![image](https://github.com/gregbg218/DSA/assets/72642906/cb81ecbe-6d5b-4a16-b698-c4fb6e9ab5ef)

Here time complexity is O(3^N)
<br />
<br />
<br />
<br />

<ins>**Parameterized vs Functional Recursion**</ins><br />
https://medium.com/@deepakrameshs/parameterized-and-functional-recursion-finding-the-sum-of-1-to-n-in-java-and-python-a800a8127840

<br />
<br />
<br />
<br />

<ins>**Common patterns in Recursion**</ins><br />
<br />
<br />
<br />
<br />
1) When asked to find count of something eg find count of subsets equal to given sum.<br />
![image](https://github.com/gregbg218/DSA/assets/72642906/9a944bea-b6fb-4c32-9cdf-1c0ce6783ab9)

SO BASICALLY FOR THIS WE HAVE TO MAKE 2 RECURSION CALLS AND ADD THEM BUT THE BASE 
CONDITION SHOULD EITHER RETURN 1 OR 0


HOWEVER INSTEAD OF MULTIPLE RECURSION CALLS WE CAN ALSO USE A FOR LOOP
<br />
<br />
![image](https://github.com/gregbg218/DSA/assets/72642906/47f9ab07-2519-499e-9b0a-3ce1f80ecd0f)


JUST LIKE WE DID IN BACKTRACKING


