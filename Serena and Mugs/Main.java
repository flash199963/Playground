#include<iostream>
using namespace std;
int input(int y[],int b,int c)
{
   int s;
         for(int i=0;i<b;i++)
       {
          std::cin>>y[i];
           s=s+y[i];
       }
        if(s>c)
     std::cout<<"NO";
        else
     std::cout<<"YES";
  }
int main()
{
  int n,s;
  std::cin>>n>>s;
  int a[n];
input(a,n,s);
}