#include<iostream>
int main()
{
  int i,res,tes,t,n;
  std::cin>>n;
  res=6;
  for(i=0;i<=n-1;i++)
  {
    t=5*i;
    res=res+t;
    std::cout<<res<<" ";
  }
}