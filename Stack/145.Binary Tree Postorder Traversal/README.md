二叉树的后序遍历。

后序遍历的顺序是**先左再右后根**

新建两个栈`stack1`和`stack2`：

1. stack1中先入根然后pop出来，然后入左和右。这样stack1先pop根，然后pop右，接着pop左； 

2. 正好，stack2先入根，然后入右，接着入左。

3. 故，stack2 循环pop的时候就是【左右根】的顺序。

   ​

还有很多种解法，这种最好理解​:joy:​