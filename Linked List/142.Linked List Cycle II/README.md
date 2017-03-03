如果链表有环，那么找出环的起始节点。

[参考答案](https://discuss.leetcode.com/topic/5284/concise-o-n-solution-by-using-c-with-detailed-alogrithm-description)

先利用快慢指针找到链表的环，之后再找到环的开始节点。

![](https://github.com/paomiange/LeetCode/blob/master/image/Linked-List-Cycle.jpeg)



1. 假设快慢指针相遇在M点，环的开始节点为N

   * 头结点head到N的距离设为**L1**

   * N到M的距离设为**L2**

   * 环的长度即N到N的距离为**C**

     ​

2. 假设快慢指针相遇时，快指针在环内遍历了**n（n>=0)**次

   * slow慢指针走过的长度为**L1+L2**

   * fast快指针走过的长度为**L1+L2+n*C**

     ​

3. 我们还知道快指针的步长是慢指针的两倍，即：**L(f)=L(s)*2**，通过一系列推导后:joy:得到：**L1=C - L2**，**也就是头结点遍历到环的时候，慢指针正好走完环内的剩余路程**。

   ​

   ​