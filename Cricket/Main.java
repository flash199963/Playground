#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int a,b,c,d,z;
  float u,v,x,y;
 
 
 
 
 
   std::cin>>a>>b>>c>>d;
  u=(a/6);
  z=int(u);
  v=d/6+(0.1*(d%6));
  x=c/v;
  y=float(b/u);
  std::cout<<fixed<<setprecision(1);
  std::cout<<z<<"\n"<<v<<"\n"<<x<<"\n"<<y<<"\n";
  if(x>y)
   std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
 
}