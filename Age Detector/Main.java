#include<iostream>
#include<cmath>
int main()
{
  int a,b,a1,b1;
  std::cin>>a;
  std::cin>>b;
  if (a>b)
  {
    a1=1900+a;
    b1=2000+b;
    std::cout<<b1-a1;
  }
  else
  {
    a1=2000+a;
    b1=2000+b;
    std::cout<<b1-a1;
  }
}