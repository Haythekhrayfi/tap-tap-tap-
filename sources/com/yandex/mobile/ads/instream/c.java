package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.d40;
import com.yandex.mobile.ads.impl.dk;
import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.qc1;
import com.yandex.mobile.ads.impl.s40;
import com.yandex.mobile.ads.impl.v50;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d40 f27486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s40 f27487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f27488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f27489d;

    public c(Context context, v50 v50Var, d40 d40Var, e eVar) {
        this.f27486a = d40Var;
        this.f27488c = eVar;
        s40 s40Var = new s40();
        this.f27487b = s40Var;
        this.f27489d = new b(context, v50Var, d40Var, s40Var, eVar);
    }

    public final void a() {
        this.f27489d.c();
    }

    public final void a(dk dkVar) {
        this.f27489d.a(dkVar);
    }

    public final void a(n50 n50Var) {
        this.f27489d.a(n50Var);
    }

    public final void a(InstreamAdView instreamAdView, List<qc1> list) {
        this.f27487b.a(instreamAdView, list);
        this.f27486a.a();
        this.f27488c.g();
        this.f27489d.a();
    }

    public final void b() {
        this.f27489d.d();
    }

    public final void c() {
        this.f27486a.a();
        this.f27489d.h();
    }

    public final void d() {
        this.f27489d.j();
        this.f27487b.b();
    }
}
