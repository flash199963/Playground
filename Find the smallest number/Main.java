#include<iostream>
int main()
{
  int x,y;
  std::cin>>x;
  std::cin>>y;
  if(x>y)
  {
    std::cout<<y<<" is smallest number";
  }
  else
    std::cout<<x<<" is smallest number";
}