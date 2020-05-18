#include<iostream>
int main()
{
  float res,y,i,n,t=1;
  std::cin>>n;
  res=0.5;
  std::cout<<res<<" ";
  for(i=0;i<n-1;i++)
  {
    res=res+t;
    std::cout<<res<<" ";
        t=t*3;
  }
}

