#include <bits/stdc++.h>
using namespace std;

long long factorial(int n){    
    if(n==0) return 1;
    return n*factorial(n-1);
}

int main(){
    int T;
    cin>>T;
    int n;

    for(int i=1;i<=T;i++){
        cin>>n;
        cout<<factorial(n)<<endl;
    }

    return 0;
}


