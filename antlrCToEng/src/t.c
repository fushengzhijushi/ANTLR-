#include<cstdio>
using namespace std;

struct Student//结构体测试
{
	char 	name[10];
	int   		age;
	int    	score[5];
}stu1;
stu1.age = 10;
int function (int a, int b,double c[])//可以声明函数
{
	return 0;
}
int ij[5];//可以声明数组
int j=1;//可以赋值
int k=j+1;//可以赋表达式
int l=function (j,k,ij);//可以赋函数


int main()
{
	int n,m;//可以连续声明
	int a;
	double b; 
	int c[5];
	//删除掉可以声明布尔数组
	bool a;
	cin>>n;//可以输入
	
	for (int i=0;i<=n;i++)//for循环模块
	{
		a++;
		j++;
	}
	while(n!=a)/*while模块*/
	{
		cin>>a>>b;//可以连续输入输出
		int ans=a+b;
		cout<<ans<<endl;
	}
	function (a,b,d);//可以调用函数
	
	
	if (!a||b){//if模块
		d[3][2] = 1;//可以声明多维数组
		d=1;
	} 
	else{//可以模块套模块
		for (int j = 0;j<n;j++){
			j++;
		}
	}
	return 0;
}
