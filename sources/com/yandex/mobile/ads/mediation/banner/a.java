package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.b7;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.u20;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a implements MediatedBannerAdapter.MediatedBannerAdapterListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<com.yandex.mobile.ads.banner.e> f27511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f27512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f27513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u20 f27514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27515e;

    /* JADX INFO: renamed from: com.yandex.mobile.ads.mediation.banner.a$a, reason: collision with other inner class name */
    public class C0213a implements h.a {
        private C0213a() {
        }

        public /* synthetic */ C0213a(a aVar, int i10) {
            this();
        }
    }

    public a(com.yandex.mobile.ads.banner.e eVar, id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> id0Var, h hVar) {
        this.f27513c = id0Var;
        this.f27512b = hVar;
        this.f27511a = new WeakReference<>(eVar);
        this.f27514d = new u20(id0Var);
    }

    public static void c(a aVar) {
        com.yandex.mobile.ads.banner.e eVar = aVar.f27511a.get();
        if (eVar != null) {
            Context contextI = eVar.i();
            id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> id0Var = aVar.f27513c;
            Objects.requireNonNull(id0Var);
            id0Var.b(contextI, new HashMap());
            eVar.a(aVar.f27514d.a());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdClicked() {
        com.yandex.mobile.ads.banner.e eVar = this.f27511a.get();
        if (eVar != null) {
            Context contextI = eVar.i();
            id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> id0Var = this.f27513c;
            Objects.requireNonNull(id0Var);
            id0Var.a(contextI, new HashMap());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdFailedToLoad(AdRequestError adRequestError) {
        com.yandex.mobile.ads.banner.e eVar = this.f27511a.get();
        if (eVar != null) {
            Context contextI = eVar.i();
            t2 t2Var = new t2(adRequestError.getCode(), adRequestError.getDescription());
            if (this.f27515e) {
                this.f27513c.a(contextI, t2Var, this);
            } else {
                this.f27513c.b(contextI, t2Var, this);
            }
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdImpression() {
        com.yandex.mobile.ads.banner.e eVar;
        if (this.f27513c.b() || (eVar = this.f27511a.get()) == null) {
            return;
        }
        Context contextI = eVar.i();
        id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> id0Var = this.f27513c;
        Objects.requireNonNull(id0Var);
        id0Var.b(contextI, new HashMap());
        eVar.a(this.f27514d.a());
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLeftApplication() {
        com.yandex.mobile.ads.banner.e eVar = this.f27511a.get();
        if (eVar != null) {
            eVar.onLeftApplication();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLoaded(View view) {
        com.yandex.mobile.ads.banner.e eVar = this.f27511a.get();
        if (eVar != null) {
            Context context = view.getContext();
            if (this.f27515e) {
                this.f27513c.b(context);
            } else {
                this.f27515e = true;
                id0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> id0Var = this.f27513c;
                Objects.requireNonNull(id0Var);
                id0Var.c(context, new HashMap());
            }
            this.f27512b.a(view, new C0213a(this, 0));
            eVar.b(new b7(this.f27513c).a());
            eVar.p();
        }
    }
}
