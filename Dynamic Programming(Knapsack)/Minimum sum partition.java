
















// There are going to be 2 subsets S1 and S2
// Let s1 and s2 beth sums of S1 and S2 rsepectively
// our goal is that s1-s2 should be minimum
// s1 can be written as s1=Range-s2
// Substituting in s1-s2=(Range-s2)-s2=Range-2(s2)
// So our goal is to find some value of s2 that can minimize Range-2(s2)
// Only possible way is that s2<=(Range)/2
// becos if s2==(Range)/2 then the difference is 0 which is also acceptable
// but s2 shouldnt be more than (Range)/2
