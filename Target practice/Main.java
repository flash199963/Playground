#include<iostream>
using namespace std;
int main()
{
  int tar,tr,sum,count;
  std::cin>>tar;
  while(tar>sum)
  {
    std::cin>>tr;
    sum+=tr;
    ++count;
  }
  std::cout<<"The number of turns is "<<count;
}
