#include<iostream>
using namespace std;
int main()
{
int i,co=0;
  std::cin>>i;
  while(i>1)
 
 
  {
   
  if(i%2==0){
   
    std::cout<<i<<endl;
    i=i/2;
    }
  else{
    std::cout<<i<<endl;
    i=3*i+1;
    }
    co=co+1;
  }
  std::cout<<"1"<<endl<<co;
}
