#include<iostream>
using namespace std;
int main()
{
  string front="front";
  string rear="rear";
  string door;
  int rail,c;
  std::cin>>door;
  std::cin>>rail;
  if(door==front)
  {
    c=1;
  }
  else
    c=2;
  switch(c)
  {
    case 1:
      if(rail==1)
      {
        std::cout<<"Left Handed";
      }
      else
        std::cout<<"Right Handed";
      break;
    case 2:
      if(rail==1)
      {
        std::cout<<"Right Handed";
      }
      else
        std::cout<<"Left Handed";
      break;
  }
}
    
    
