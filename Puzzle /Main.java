#include<iostream>
int main()
{
int r,c,i,j,a[10][10];
  std::cin>>r;
  std::cin>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(j=0;j<c;j++)
  {
    for(i=0;i<r;i++)
    {
      std::cout<<a[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}