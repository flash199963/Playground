#include<iostream>
using namespace std;
int main ()
{  
    int i,n1,n2,num, div, sum=0;
  std::cin>>n1>>n2;
  num=n1+n2;
    for (i=1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num)
        std::cout<<"They can read the message";
    else
        std::cout<<"They can't read the message";
    return 0;
}