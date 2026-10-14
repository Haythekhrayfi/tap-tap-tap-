package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ka implements r3<ja> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t90 f22303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r90 f22304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.common.a f22305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final la f22306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList<ja> f22307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AppOpenAdLoadListener f22308g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ka(Context context) {
        this(context, 0);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    public /* synthetic */ ka(Context context, int i10) {
        this(context, new t90(context), new r90(), new com.yandex.mobile.ads.common.a(), new la());
    }

    public ka(Context context, t90 t90Var, r90 r90Var, com.yandex.mobile.ads.common.a aVar, la laVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(t90Var, "mainThreadUsageValidator");
        fd.j0.i(r90Var, "mainThreadExecutor");
        fd.j0.i(aVar, "adRequestConfigurationProvider");
        fd.j0.i(laVar, "adLoadControllerFactory");
        this.f22302a = context;
        this.f22303b = t90Var;
        this.f22304c = r90Var;
        this.f22305d = aVar;
        this.f22306e = laVar;
        this.f22307f = new CopyOnWriteArrayList<>();
        t90Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ka kaVar, AdRequestConfiguration adRequestConfiguration) {
        fd.j0.i(kaVar, "this$0");
        fd.j0.i(adRequestConfiguration, "$adRequestConfiguration");
        la laVar = kaVar.f22306e;
        Context context = kaVar.f22302a;
        Objects.requireNonNull(laVar);
        ja jaVarA = la.a(context, kaVar);
        kaVar.f22307f.add(jaVarA);
        Objects.requireNonNull(kaVar.f22305d);
        String strB = com.yandex.mobile.ads.common.a.b(adRequestConfiguration);
        Objects.requireNonNull(kaVar.f22305d);
        AdRequest adRequestA = com.yandex.mobile.ads.common.a.a(adRequestConfiguration);
        jaVarA.a(strB);
        jaVarA.a(kaVar.f22308g);
        jaVarA.b(adRequestA);
    }

    public final void a() {
        this.f22303b.a();
        this.f22304c.a();
        for (ja jaVar : this.f22307f) {
            jaVar.a((AppOpenAdLoadListener) null);
            jaVar.u();
        }
        this.f22307f.clear();
    }

    public final void a(AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f22303b.a();
        this.f22308g = appOpenAdLoadListener;
        Iterator<ja> it = this.f22307f.iterator();
        while (it.hasNext()) {
            it.next().a(appOpenAdLoadListener);
        }
    }

    public final void a(AdRequestConfiguration adRequestConfiguration) {
        fd.j0.i(adRequestConfiguration, "adRequestConfiguration");
        this.f22303b.a();
        this.f22304c.a(new do1(this, adRequestConfiguration));
    }

    @Override // com.yandex.mobile.ads.impl.r3
    public final void a(ja jaVar) {
        fd.j0.i(jaVar, "loadController");
        this.f22303b.a();
        jaVar.a((AppOpenAdLoadListener) null);
        this.f22307f.remove(jaVar);
    }
}
