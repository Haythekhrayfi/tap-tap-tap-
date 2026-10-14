package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class hv implements al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ri f21512a;

    public hv(ri riVar) {
        this.f21512a = riVar;
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final RelativeLayout a(ax axVar, AdResponse adResponse) {
        Context context = axVar.getContext();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParamsA = m5.a(context, adResponse);
        int i10 = eh1.f20253b;
        int iA = y11.a(context, 1, 64.0f);
        layoutParamsA.width = Math.min(layoutParamsA.width + iA, context.getResources().getDisplayMetrics().widthPixels);
        layoutParamsA.height = Math.min(layoutParamsA.height + iA, context.getResources().getDisplayMetrics().heightPixels);
        relativeLayout.setLayoutParams(layoutParamsA);
        relativeLayout.addView(axVar, m5.a(context, adResponse));
        relativeLayout.addView(this.f21512a.d(), m5.a(context, axVar));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void a() {
        this.f21512a.a();
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void a(RelativeLayout relativeLayout) {
        relativeLayout.setBackground(l5.f22620a);
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void a(boolean z10) {
        this.f21512a.a(z10);
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void b() {
        this.f21512a.b();
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void c() {
        this.f21512a.c();
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void d() {
        this.f21512a.invalidate();
    }
}
