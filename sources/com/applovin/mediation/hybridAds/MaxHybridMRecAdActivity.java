package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.View;
import com.applovin.impl.sdk.o;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;

/* JADX INFO: loaded from: classes.dex */
public class MaxHybridMRecAdActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f11482d;

    public void a(c cVar, View view, o oVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, oVar, maxAdapterListener);
        this.f11482d = view;
    }

    @Override // com.applovin.mediation.hybridAds.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f11482d, "MaxHybridMRecAdActivity");
    }
}
