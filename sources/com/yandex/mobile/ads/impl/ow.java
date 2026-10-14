package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
final class ow implements al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ri f23927a;

    public ow(ri riVar) {
        this.f23927a = riVar;
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final RelativeLayout a(ax axVar, AdResponse adResponse) {
        Context context = axVar.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(axVar, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.f23927a.d(), m5.a(context, axVar));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void a() {
        this.f23927a.a();
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void a(RelativeLayout relativeLayout) {
        relativeLayout.setBackground(l5.f22621b);
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void a(boolean z10) {
        this.f23927a.a(z10);
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void b() {
        this.f23927a.b();
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void c() {
        this.f23927a.c();
    }

    @Override // com.yandex.mobile.ads.impl.al
    public final void d() {
        this.f23927a.invalidate();
    }
}
