package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.od;
import com.yandex.mobile.ads.impl.q71;
import com.yandex.mobile.ads.impl.s90;
import com.yandex.mobile.ads.impl.x60;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends q71 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s90 f18133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final od f18134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g f18135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18136p;

    public c(Context context, AdResponse<String> adResponse, k2 k2Var, g gVar, od odVar) {
        super(context, new b(gVar), adResponse, k2Var);
        this.f18135o = gVar;
        this.f18133m = new s90();
        this.f18136p = false;
        this.f18134n = odVar;
    }

    @Override // com.yandex.mobile.ads.impl.w20.a
    public final void a(AdImpressionData adImpressionData) {
        if (this.f18136p) {
            return;
        }
        this.f18136p = true;
        this.f18134n.a(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final boolean a(int i10) {
        return eh1.a(this.f18135o.findViewById(2), i10);
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final boolean j() {
        return eh1.c(this.f18135o.findViewById(2));
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final boolean k() {
        View viewFindViewById = this.f18135o.findViewById(2);
        return viewFindViewById != null && eh1.b(viewFindViewById) >= 1;
    }

    public final void m() {
        this.f18133m.a();
        g();
        x60.d("onDestroy(), clazz = " + c.class, new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final void onLeftApplication() {
        this.f18134n.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final void onReturnedToApplication() {
        this.f18134n.onReturnedToApplication();
    }
}
