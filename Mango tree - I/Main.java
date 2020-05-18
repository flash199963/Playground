#include<iostream>
using namespace std;
int main()
{
  int r,c,t,m,b,count=0;
  std::cin>>r>>c>>t;
  m=c*r;
  b=m-r;
  if(r<t&&t<m){
    for(int i=1;i<(c-1);i++)
      if(t==((i*r)+1)){
       count++;
      }
 
  if(count==0)
    std::cout<<"No";
  else
    std::cout<<"Yes";
  }
  else
    std::cout<<"Yes";
 
}