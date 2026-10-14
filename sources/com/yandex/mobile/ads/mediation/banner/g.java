package com.yandex.mobile.ads.mediation.banner;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.sg1;
import com.yandex.mobile.ads.impl.x60;

/* JADX INFO: loaded from: classes3.dex */
final class g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f27523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.a f27524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f27525c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg1.a((ViewGroup) g.this.f27525c.f27528b.get(), false);
        }
    }

    public g(h hVar, View view, h.a aVar) {
        this.f27525c = hVar;
        this.f27523a = view;
        this.f27524b = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        x60.d("onPreDraw(), clazz = " + this, new Object[0]);
        if (!this.f27523a.isShown()) {
            return true;
        }
        this.f27523a.getViewTreeObserver().removeOnPreDrawListener(this);
        com.yandex.mobile.ads.mediation.banner.a.C0213a c0213a = (com.yandex.mobile.ads.mediation.banner.a.C0213a) this.f27524b;
        com.yandex.mobile.ads.banner.e eVar = (com.yandex.mobile.ads.banner.e) com.yandex.mobile.ads.mediation.banner.a.this.f27511a.get();
        if (eVar != null) {
            com.yandex.mobile.ads.mediation.banner.a.this.f27513c.c(eVar.i());
        }
        if (com.yandex.mobile.ads.mediation.banner.a.this.f27513c.b()) {
            com.yandex.mobile.ads.mediation.banner.a.c(com.yandex.mobile.ads.mediation.banner.a.this);
        }
        this.f27525c.f27527a.postDelayed(new a(), 50L);
        return true;
    }
}
