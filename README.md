# ANTLR-Interpreter
利用ANTLR4、Eclipse编写一个翻译器，这里考虑将C++语言翻译成另一门我们自己定义的语言，我们将它命名为Toy English。相比与一些其他的高级语言，Toy English更加接近于自然语言。
参考《Pragmatic.The Definitive ANTLR 4 Reference》编写翻译器。

## 主要转换规则
（注：加粗的为目标语言）

（1）头文件
#include<cstdio>
#include<iostream>

HeadFile:
[cstdio,iostream]

（2）赋值，声明，返回值
x=2;
x equals 2.

int x;
define x.

return 0;
0 as the return value.
（3）输入输出
cin>>x1>>x2>>x3;
input x1,x2,x3.

cout<<x1<<x2;
output: x1 x2.

cout<<endl;
Output: enter.
（4）运算
i++;
i selfincreases.

i--;
i selfdecreases.

x=x+1;
x equal x+1.
（5）分支
if (some conditions){
	……
}
else{
	……
}

if some conditions is true:
	……
else:
	……
this is the end of if.

（6）循环
for (i = 0 ;i<n;i++){
	…
}

start from i=0,repeat the loop as long as i<n and i selfincreases after each loop:
	…
格式如下：
start from 初始条件,repeat the loop as long as 终止条件 and 计数变化条件 after each loop :
	被循环的语句
this is the end of for.

while (condition){
	…
}

while condition is true:
	…
this is the end of while.

（7）函数调用
int a (int x,int y){
	…
}
define function a and define x,define y as variables:
	…
格式：
define function 函数名and define 变量,define 变量 …… as variables:
	函数体

调用时如下：
a(x,y);
即变为
call function a using x,y as variables.

（8）数组
int a[10];

define array a[10].

注：一些常用函数按照以上.改’s来做
如x = a.length();
转化过来就是
assign a’s length to x.

（9）结构体
struct student 
{
	int   age;
	int   score[5];
}stu1;

define a struct whose tag is student including elements are as follows:
	define age.
	define array a[10].
stu1 as its variable-list.

stu1.age=18;
stu1’s age equal to 18.

