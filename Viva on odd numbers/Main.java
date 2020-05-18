#include<iostream>
using namespace std;
int main()
{
  int a,n,o;
 float s;
  while(o<3)
  {
    std::cin>>a;
  if(a>0&&a%2==0)
    n=1;
  if(a>0&&a%2!=0)
      n=2;
  if(a<0)
    n=3;
   
    switch(n)
    {
      case 1:
        s=s-0.5;break;
      case 2:
        s=s+1.0;o++;break;
      case 3:
        s=s-1;
        o=4;break;
    }
   
 
  }
  std::cout<<s;
}  
