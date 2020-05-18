#include<iostream>
using namespace std;
int main()
{
  int x,y,r,a,si;
  float d,f;
  std::cin>>x;
  std::cin>>y;
  std::cin>>r;
  si=(x*y*r)/100;
  std::cout<<si;
  a=x+si;
  std::cout<<"\n"<<a;
  d=0.02*si;
  std::cout<<"\n"<<d;
  f=a-d;
  std::cout<<"\n"<<f;
}