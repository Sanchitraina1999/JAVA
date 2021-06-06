#include <bits/stdc++.h>
using ll = long long;
using namespace std;

int main() {
    ll t;
    cin>>t;
    while(t--){
        ll n;
        cin>>n;
        ll a[n];
        for(ll i=0;i<n;i++)cin>>a[i];
        map<vector<ll>,ll> m;
        for(ll i=0;i<n;i++){
            vector<ll>v;
            for(ll j=i;j<n;j++){
                v.pb(a[j]);
                m[v]++;
            }
        }
        ll ans=a[0];
        for(ll i=0;i<n;i++){
            vector<ll>v;
            ll su=0;
            for(ll j=i;j<n;j++){
                v.pb(a[j]);
                su+=v[v.size()-1];
                ans=max(ans,su*m[x]);
            }
        }
        cout<<ans<<"\n";
    }
	return 0;
}
