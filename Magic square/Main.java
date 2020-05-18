#include <iostream>
using namespace std;
int main()
{
    int matrix[100][100],SIZE;
    int sum_left =0, sum_right = 0;
  cin>>SIZE;
    for(int i=0; i<SIZE ; i++)
    {
        for(int j=0; j<SIZE; j++)
        {
            cin >> matrix[i][j]; 
            if(i==j)
                sum_left += matrix[i][j];
            if((i+j) == SIZE-1)
                sum_right += matrix[i][j];
        }
    }
  if(sum_left==sum_right)
  {
	cout<<"Yes";
  }
  else
    cout<<"No";
  
    return 0;
}