#include<iostream>
#include<cmath>
int main()
{
  int m,n,res,req;
  std::cin>>m>>n>>req;
  res=pow(m,n);
  if(res>=req)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
   }
  else
     std::cout<<"Sorry Doctor! You need more bacteria.";
}