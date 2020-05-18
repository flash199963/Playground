#include<iostream>
using namespace std;
int main()
{
  int nos;
  float time;
  std::cin>>nos>>time;
  switch(nos)
  {
    case 1:
    std::cout<<time; 
      break;
    case 2:
  time=time+time*0.50;
  std::cout<<time;
  break;
  case 3:
  time=time*2.0;
  std::cout<<time;
  break;
    default:
      std::cout<<"Number of items is more";
  break;
  }
}