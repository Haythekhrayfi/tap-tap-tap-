package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.o;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public b(e eVar, Activity activity, o oVar) {
        super(eVar, activity, oVar);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(n nVar) {
        super.a(nVar);
    }

    public void a(n nVar, v vVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f8336d.addView(appLovinAdView);
        if (nVar != null) {
            a(this.f8335c.ac(), (this.f8335c.ag() ? 3 : 5) | 48, nVar);
        }
        if (vVar != null) {
            this.f8336d.addView(vVar, this.f8337e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f8336d);
        } else {
            this.f8334b.setContentView(this.f8336d);
        }
    }
}
