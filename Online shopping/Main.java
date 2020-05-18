#include<iostream>
using namespace std;
int main()
{
  int a1,a2,a3,b1,b2,b3,c1,c2,c3,s1,s2,s3;
  std::cin>>a1>>a2>>a3>>b1>>b2>>b3>>c1>>c2>>c3;
  s1=(a1-((a1*a2)/100)+a3);
  s2=(b1-((b1*b2)/100)+b3);
  s3=(c1-(c1*c2)/100+c3);
  std::cout<<"In Flipkart Rs."<<s1;
  std::cout<<"\nIn Snapdeal Rs."<<s2;
  std::cout<<"\nIn Amazon Rs."<<s3;
  if (s1<=s2 && s1<=s3)
  {
    std::cout<<"\nHe will prefer Flipkart";
  }
    else if (s2<=s1 && s2<=s3)
    {
        std::cout<<"\nHe will prefer Snapdeal";
    }
    else
        std::cout<<"\nHe will prefer Amazon"; 
}
