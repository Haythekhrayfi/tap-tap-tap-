package com.applovin.mediation.hybridAds;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.adview.s;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class a extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0152a f11486a;

    /* JADX INFO: renamed from: com.applovin.mediation.hybridAds.a$a, reason: collision with other inner class name */
    public interface InterfaceC0152a {
        void a(a aVar);
    }

    public a(c cVar, Context context) {
        super(context);
        setOnClickListener(this);
        s sVar = new s(context);
        int iDpToPx = AppLovinSdkUtils.dpToPx(context, cVar.d());
        sVar.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 17));
        sVar.a(iDpToPx);
        addView(sVar);
        int iDpToPx2 = AppLovinSdkUtils.dpToPx(context, (cVar.e() * 2) + cVar.d());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, 8388661);
        int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, cVar.b());
        int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, cVar.c());
        layoutParams.setMargins(iDpToPx4, iDpToPx3, iDpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f11486a.a(this);
    }

    public void setListener(InterfaceC0152a interfaceC0152a) {
        this.f11486a = interfaceC0152a;
    }
}
