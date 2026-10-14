package com.applovin.mediation.hybridAds;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.j;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.x;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class b extends Activity implements a.InterfaceC0152a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f11487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f11488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f11489c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdapterListener f11490d;

    private void a(String str) {
        MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, j.a("Null hybrid ad view (", str, ")"));
        MaxAdapterListener maxAdapterListener = this.f11490d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else {
            if (!(maxAdapterListener instanceof MaxAppOpenAdapterListener)) {
                StringBuilder sbA = defpackage.a.a("Failed to fire display failed callback (");
                sbA.append(this.f11490d);
                sbA.append("): neither interstitial nor app open ad");
                throw new IllegalStateException(sbA.toString());
            }
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        }
        finish();
    }

    public void a(View view, String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((ViewGroup) findViewById(R.id.content)).addView(view);
        this.f11488b.bringToFront();
        MaxAdapterListener maxAdapterListener = this.f11490d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
                return;
            }
            StringBuilder sbA = defpackage.a.a("Failed to fire display callback (");
            sbA.append(this.f11490d);
            sbA.append("): neither interstitial nor app open ad");
            throw new IllegalStateException(sbA.toString());
        }
    }

    @Override // com.applovin.mediation.hybridAds.a.InterfaceC0152a
    public void a(a aVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public void a(c cVar, o oVar, MaxAdapterListener maxAdapterListener) {
        this.f11487a = oVar;
        this.f11489c = cVar;
        this.f11490d = maxAdapterListener;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(this.f11489c.a());
        o oVar = this.f11487a;
        com.applovin.impl.sdk.utils.b.a(oVar != null ? ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.f10359db)).booleanValue() : true, this);
        a aVar = new a(this.f11489c, this);
        this.f11488b = aVar;
        aVar.setListener(this);
        this.f11488b.setVisibility(4);
        viewGroup.addView(this.f11488b);
        x.a(this.f11488b, this.f11489c.f());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f11490d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else {
                if (!(maxAdapterListener instanceof MaxAppOpenAdapterListener)) {
                    StringBuilder sbA = defpackage.a.a("Failed to fire hidden callback (");
                    sbA.append(this.f11490d);
                    sbA.append("): neither interstitial nor app open ad");
                    throw new IllegalStateException(sbA.toString());
                }
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            }
        }
        super.onDestroy();
    }
}
