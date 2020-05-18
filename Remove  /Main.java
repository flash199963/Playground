#include <iostream>
#include <cstring>
#include<string>
#include<bits/stdc++.h>
using namespace std; 
int main()
{
std::string m,n,o;
  int i,l;
 std::getline(cin,m);
  // std::cout<<m;
  n="the ";
//std::cout<<n;
l=m.length();
//std::cout<<l;
  o="";
 int pos = m.find(n);
while(pos != string::npos)
{
//Erase the targeted string at the location we set
  m.erase(pos,n.length());
  //Insert the new string where we last deleted the old string
   m.insert(pos,o);
 //Get position of targeted string to erase
  pos = m.find(n);
  }
//m.replace(m.find(n),n.size(),o);
  std::cout<<m;
}