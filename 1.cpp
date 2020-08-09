#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    long long t,count;
    cin>>t;
    while(t--)
    {
        string s,p,ans,res;
        cin>>s>>p;

        map<char,long long>mp;
         for(auto it : s)
            mp[it]++;

        for(auto it : p)
            mp[it]--;
        
        for (auto itr: mp)
            while (it.second--)
                ans+=it.first;
        string least=ans+p;
        for(long long i=0; i<ans.length(); i++)
        {
            res = ans;
            res.insert(i,p);
            least=min(least,res);
        }

        cout << least<<"\n";
    }
    return 0;
}