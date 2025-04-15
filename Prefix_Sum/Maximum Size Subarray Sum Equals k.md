Here hash map format is 


Key = cumulative sum

Value= Index

<img width="900" alt="image" src="https://github.com/user-attachments/assets/ebdecd47-143b-4e1f-b6be-bf712c67a568" />

So there are 2 ways of finidng our k in the array:
<img width="900" alt="image" src="https://github.com/user-attachments/assets/5d83f124-bdd1-4818-a466-03ba60dff46b">



Here :i - cumMap[cumSum - k]

This means starting form current index and going till index containing sum = cumSum - k. (including current index i and excluding index of cumSum - k)

Example:
[1, 2, 3, -2, 5], k = 5

cumMap = {1: 0, 3: 1, 6: 2}

At index 2:

 cumSum - k = 6-5=1

 1 is found at index 0

 i - cumMap[cumSum - k] = 2 - 0 =2

 2 number including index 1 and index 2 so 2+3=5
