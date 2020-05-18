#include<iostream>
int main()
{
  int res,n,i;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    res=(11+(4*i));
    res*=res;
    std::cout<<res<<" ";
  }
}
