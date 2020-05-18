#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,c,d;
  std::cin>>d1>>c1>>d2>>c2;
  c=c1+c2;
  d=d1+d2;
  if(c>=100)
  {c=c%100;
  d=d+1;}
  else
    c=c;
  std::cout<<d<<"\n"<<c;
}
