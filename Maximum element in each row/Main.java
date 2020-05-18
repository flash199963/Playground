#include <iostream>

using namespace std;

int main()
{
    int a[10][10],m,n,j,i,max;
   
    cin>>m;
    cin>>n;
    for ( i=0;i<m;i++)
        {for( j= 0;j<n;j++)
            cin>>a[i][j];
        }
    for (j=0;j<m;j++)
   
        { i=0;
            max=a[j][i];
        for (i=0;i<n;i++)
           if(a[j][i]>max)
               max=a[j][i];
        cout<<max<<"\n";
        }
   return 0;
}