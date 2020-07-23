# 线性表

## 1.线性表的定义
1. 定义
    + 零个或多个数据元素的有限序列
2. 数学描述：
    + 若将线性表记作(a1,...,ai-1,ai,ai+1,...,an)，则表示其中ai-1领先于ai，ai领先于ai+1，称ai-1是ai的直接前驱元素，ai+1是ai的直接后继元素。当i=1,2,...,n-1是，ai有且仅有一个直接后继，当i=2,3,...,n时，ai有且仅有一个直接前驱。
    + 线性表元素的个数n(n>0)定义为线性表的长度，当n=0时，称为空表
3. 抽象数据类型
~~~
~~~

## 2.线性表的顺序存储结构
1. 定义：线性表的顺序存储结构，指的是用一段地址连续的存储单元依次存储线性表的数据元素

<div align=center><img src="https://github.com/Upmerge/Daily/blob/master/1.DataStructuresAndAlgorithms/0.DataStructures/0.Note/image/15.PNG"/></div>

2. 数据长度与线性表长度
    + 数据长度：数组的长度是存放线性表的存储空间的长度
    + 线性表长度：线性表中数据元素的个数
3. 地址计算方法
    LOC(ai) = LOC(a1) + (i-1)c
4. 时间复杂度分析

5. 线性表顺序存储结构的优缺点
    + 优点：
        + 无序为表示表中元素之间的逻辑关系而增加额外的存储空间
        + 可以快速地存取表中任一位置的元素
    + 缺点：
        + 插入和删除操作需要移动大量元素
        + 当线性表长度变化较大时，难以确定存储空间的容量
        + 造成存储空间的碎片
6. 实现
~~~
~~~

## 3.线性表的链式存储结构
1. 定义：把存储数据元素信息的域称为数据域，把存储直接后继位置的域称为指针域。指针域中存储的信息称做指针或链。这两部分信息组成数据元素ai的存储映像，称为结点，n个结点链结成一个链表，即为线性表的链式存储结构，因为此链表的每个结点中只包含一个指针域，所以叫做单链表。

<div align=center><img src="https://github.com/Upmerge/Daily/blob/master/1.DataStructuresAndAlgorithms/0.DataStructures/0.Note/image/16.PNG"/></div>

2. 头指针
    + 链表中第一个结点的存储位置叫做头指针
    
    <div align=center><img src="https://github.com/Upmerge/Daily/blob/master/1.DataStructuresAndAlgorithms/0.DataStructures/0.Note/image/17.PNG"/></div>

3. 头结点
    + 单链表的第一个存储数据的结点前的结点称为头结点，可以不存储任何信息，或者存储长度等附加信息
    
    <div align=center><img src="https://github.com/Upmerge/Daily/blob/master/1.DataStructuresAndAlgorithms/0.DataStructures/0.Note/image/18.PNG"/></div>

4. 头指针与头结点的异同
    + 头指针
        + 头指针是指链表指向第一个结点的指针，若链表有头结点，则是指向头结点的指针
        + 头指针具有标识作用，所以常用头指针冠以链表的名字
        + 无论链表是否为空，头指针均不为空。头指针是链表的必要元素
    
    + 头结点
        + 头结点是为了操作的统一和方便而设立的，放在第一元素的结点之前，其数据域一般无意义
        + 有了头结点，对在第一元素结点前插入结点和删除第一结点，其操作与其它结点的操作就统一了
        + 头结点不一定是链表的必须要素
5. 单链表实现
~~~
~~~
6. 单链表时间复杂度分析
7. 单链表结构与顺序存储结构优缺点
    + 存储分配方式
        + 顺序存储结构用一段连续的存储单元依次存储线性表的数据元素
        + 单链表采用链式存储结构，用一组任意的存储单元存放线性表的元素
    + 时间性能
        + 查找
            + 顺序存储结构O(1)
            + 单链表O(n)
        + 插入和删除
            + 顺序存储结构需要平均移动表长一半的元素，时间为O(n)
        + 单链表在线出某位置的指针后，插入和删除时间仅为O(1)
    + 空间性能
        + 顺序存储结构需要预分配存储空间，分大了，浪费，分小了易发生上溢
        + 单链表不需要分配存储空i教案，只要有就可以分配，元素个数也不受限制
8. 经验结论
    + 若线性表需要频繁查找，很少进行插入和删除操作时，宜采用顺序存储结构。
      若需要频繁插入和删除时，宜采用单链表结构
    + 当线性表中的元素个数变化较大或者根本不知道有多大时，最好用单链表结构，这样可以不需要考虑存储空间的大小问题

## 4.循环链表
1. 定义：将单链表中终端结点的指针端由空指针改为指向头结点，就使整个单链表形成一个环，这种头尾相接的单链表称为单循环链表，简称循环链表
    + 头指针指向尾结点的循环链表，查找尾结点的时间复杂度为O(1)。

    <div align=center><img src="https://github.com/Upmerge/Daily/blob/master/1.DataStructuresAndAlgorithms/0.DataStructures/0.Note/image/19.PNG"/></div>

2. 实现
~~~
~~~

## 5.双向链表
1. 定义：双向链表是在单链表的每个结点中，再设置一个指向其前驱结点的指针域。

    <div align=center><img src="https://github.com/Upmerge/Daily/blob/master/1.DataStructuresAndAlgorithms/0.DataStructures/0.Note/image/20.PNG"/></div>

2. 实现
~~~
~~~