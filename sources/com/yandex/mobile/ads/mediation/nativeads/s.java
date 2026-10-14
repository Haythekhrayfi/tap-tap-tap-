package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.a20;
import com.yandex.mobile.ads.impl.b7;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.fw0;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.id0;
import com.yandex.mobile.ads.impl.kd0;
import com.yandex.mobile.ads.impl.pi0;
import com.yandex.mobile.ads.impl.px0;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.u20;
import com.yandex.mobile.ads.impl.vd0;
import com.yandex.mobile.ads.impl.xd0;
import com.yandex.mobile.ads.impl.zd0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class s implements MediatedNativeAdapterListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdResponse<cj0> f27615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id0<MediatedNativeAdapter, MediatedNativeAdapterListener> f27616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<com.yandex.mobile.ads.nativeads.o> f27617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f27618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a20 f27619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f27620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f27621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap f27622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f27623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i f27624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u20 f27625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final xd0 f27626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27627n;

    public s(AdResponse<cj0> adResponse, com.yandex.mobile.ads.nativeads.o oVar, id0<MediatedNativeAdapter, MediatedNativeAdapterListener> id0Var) {
        HashMap map = new HashMap();
        this.f27621h = map;
        this.f27622i = new HashMap();
        Context contextI = oVar.i();
        Context applicationContext = contextI.getApplicationContext();
        this.f27614a = applicationContext;
        this.f27615b = adResponse;
        this.f27616c = id0Var;
        this.f27617d = new WeakReference<>(oVar);
        this.f27618e = new f();
        a20 a20Var = new a20(contextI);
        this.f27619f = a20Var;
        this.f27623j = new j();
        i iVar = new i(contextI);
        this.f27624k = iVar;
        this.f27620g = new h(contextI, a20Var, iVar);
        this.f27625l = new u20(id0Var);
        this.f27626m = new xd0(applicationContext, id0Var, map);
    }

    private void a(final MediatedNativeAd mediatedNativeAd, int i10) {
        final com.yandex.mobile.ads.nativeads.o oVar = this.f27617d.get();
        if (oVar != null) {
            Context contextI = oVar.i();
            this.f27621h.put("native_ad_type", px0.a(i10));
            this.f27616c.c(contextI, this.f27621h);
            HashMap map = new HashMap();
            map.put("title", mediatedNativeAd.getMediatedNativeAdAssets().getTitle());
            this.f27622i.putAll(map);
            Objects.requireNonNull(this.f27623j);
            MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
            ArrayList<MediatedNativeAdImage> arrayList = new ArrayList();
            arrayList.add(mediatedNativeAdAssets.getFavicon());
            arrayList.add(mediatedNativeAdAssets.getIcon());
            arrayList.add(mediatedNativeAdAssets.getImage());
            ArrayList arrayList2 = new ArrayList();
            for (MediatedNativeAdImage mediatedNativeAdImage : arrayList) {
                if (mediatedNativeAdImage != null) {
                    arrayList2.add(mediatedNativeAdImage);
                }
            }
            this.f27619f.a(this.f27624k.b(arrayList2));
            this.f27620g.a(mediatedNativeAd, i10, arrayList2, new h.a() { // from class: com.yandex.mobile.ads.mediation.nativeads.t
                @Override // com.yandex.mobile.ads.mediation.nativeads.h.a
                public final void a(AdResponse adResponse) {
                    this.f27628a.a(mediatedNativeAd, oVar, adResponse);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediatedNativeAd mediatedNativeAd, com.yandex.mobile.ads.nativeads.o oVar, AdResponse adResponse) {
        o oVar2 = new o(mediatedNativeAd, this.f27626m);
        oVar.a((AdResponse<cj0>) adResponse, new pi0(new kd0(this.f27615b, this.f27616c.a()), new e(new r(this)), oVar2, new vd0(), new zd0()), new b7(this.f27616c).a());
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClicked() {
        this.f27616c.a(this.f27614a, this.f27621h);
        Context context = this.f27614a;
        fw0.b bVar = fw0.b.A;
        gw0 gw0Var = new gw0(this.f27621h);
        gw0Var.b(bVar.a(), "event_type");
        gw0Var.b(this.f27622i, "ad_info");
        gw0Var.a(this.f27615b.c());
        Map<String, Object> mapS = this.f27615b.s();
        if (mapS != null) {
            gw0Var.a(mapS);
        }
        this.f27616c.a(context, gw0Var.a());
        this.f27618e.a();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClosed() {
        this.f27618e.b();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdFailedToLoad(AdRequestError adRequestError) {
        com.yandex.mobile.ads.nativeads.o oVar = this.f27617d.get();
        if (oVar != null) {
            this.f27616c.b(oVar.i(), new t2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdImpression() {
        if (this.f27627n) {
            return;
        }
        this.f27627n = true;
        this.f27616c.b(this.f27614a, this.f27621h);
        Context context = this.f27614a;
        fw0.b bVar = fw0.b.f20896w;
        gw0 gw0Var = new gw0(this.f27621h);
        gw0Var.b(bVar.a(), "event_type");
        gw0Var.b(this.f27622i, "ad_info");
        gw0Var.a(this.f27615b.c());
        Map<String, Object> mapS = this.f27615b.s();
        if (mapS != null) {
            gw0Var.a(mapS);
        }
        this.f27616c.a(context, gw0Var.a());
        this.f27618e.a(this.f27625l.a());
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdLeftApplication() {
        this.f27618e.c();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdOpened() {
        this.f27618e.d();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAppInstallAdLoaded(MediatedNativeAd mediatedNativeAd) {
        a(mediatedNativeAd, 2);
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onContentAdLoaded(MediatedNativeAd mediatedNativeAd) {
        a(mediatedNativeAd, 1);
    }
}
