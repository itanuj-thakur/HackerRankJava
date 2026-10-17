# [Magic Number](https://www.geeksforgeeks.org/problems/magic-number4431/1)
## Easy
Given an integer n, find the nth magic number. A magic number is a positive integer that can be represented as the sum of distinct powers of 5. In other words, every power of 5 can be used at most once in the representation.
For example:

5 = 51
25 = 52
30 = 51 + 52

When all magic numbers are arranged in increasing order, return the nth magic number.
Examples:
Input: n = 1
Output: 5
Explanation: The magic numbers in increasing order begin as: 5, 25, 30, 125, ...
The 1st magic number is 5.
Input: n = 2
Output: 25
Explanation: The magic numbers in increasing order begin as: 5, 25, 30, 125, ...
The 2nd magic number is 25.
Constraints:1 ≤ n ≤ 103