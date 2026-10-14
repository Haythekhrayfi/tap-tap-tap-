package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {
    public d(e eVar, Activity activity, o oVar) {
        super(eVar, activity, oVar);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    public void a(ImageView imageView, n nVar, n nVar2, com.applovin.impl.adview.a aVar, v vVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f8336d.addView(appLovinAdView);
        if (nVar != null) {
            a(this.f8335c.ac(), (this.f8335c.ah() ? 3 : 5) | 48, nVar);
        }
        if (nVar2 != null) {
            a(this.f8335c.ac(), (this.f8335c.ag() ? 3 : 5) | 48, nVar2);
        }
        if (imageView != null) {
            int iDpToPx = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cS)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cU)).intValue());
            int iDpToPx2 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cT)).intValue());
            layoutParams.setMargins(iDpToPx2, iDpToPx2, iDpToPx2, iDpToPx2);
            this.f8336d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f8336d.addView(aVar, this.f8337e);
        }
        if (vVar != null) {
            this.f8336d.addView(vVar, new ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f8336d);
        } else {
            this.f8334b.setContentView(this.f8336d);
        }
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(n nVar) {
        super.a(nVar);
    }
}
