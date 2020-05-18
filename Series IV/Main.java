#include<iostream>
using namespace std;
int main()
{
  int i,res,n;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      res=(i*i)-1;
      std::cout<<res<<" ";
    }
    else
    {
      res=(i*i)-2;
      std::cout<<res<<" ";
    }
  }
}