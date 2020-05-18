#include<iostream>
using namespace std;
int main()
{
  int i,e,o,even=0,odd=0,r,n,a;
  std::cin>>i;
  while(i>0)
  {
    r=i%10;
  if(i%2==0)
  {
    even=even+r;
    e++;
  }
  else
  {
    odd=odd+r;
    o++;
  }
  i=i/10;
  }
  //std::cout<<odd<<endl<<even<<endl;
if(even==odd)
  std::cout<<"Yes";
  else
    std::cout<<"No";
}
