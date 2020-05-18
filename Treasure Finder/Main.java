#include <iostream>
using namespace std;
int main()
{
   int i,a,b,n=1,c,r;
   std::cin>>a>>b>>c;
   if((a>b||a>c)&&(a<b||a<c))
     r=a;
   if((b>a||b>c)&&(b<a||b<c))
     r=b;
   if((c>b||c>a)&&(c<b||c<a))
     r=c;
   for(i=2;i<r;i++)
   {
   if(a%i==0&&b%i==0&&c%i==0)
   {
       n=n*i;
   }
   else
   ;
   }
  std::cout<<"The treasure is in box which has number "<<r<<"\n";
   std::cout<<"The code to open the box is "<<n;
}