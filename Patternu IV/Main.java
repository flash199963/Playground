#include <iostream>
using namespace std;
int main()
{
    int n,p;
    std::cin>>n;
    for(int i=1;i<=n;i++)
    {
      p=0;
    for(int j=1;j<=n;j++)
    {
     
      if(i%2==0&&j==1)
      {
      p=1;
      std::cout<<i+1;
      }
   
      if(j==n&&p==0)
      std::cout<<i+1;
     if(j!=n)
        std::cout<<i;
     
     
    }
      std::cout<<"\n";
    }
}
