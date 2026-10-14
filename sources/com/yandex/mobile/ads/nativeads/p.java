package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.r90;
import com.yandex.mobile.ads.impl.t90;
import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.ww0;
import com.yandex.mobile.ads.impl.xi0;
import com.yandex.mobile.ads.impl.yk0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class p implements xi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27801a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t90 f27803c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NativeAdLoadListener f27805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NativeBulkAdLoadListener f27806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SliderAdLoadListener f27807g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f27802b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r90 f27804d = new r90();

    public p(Context context) {
        this.f27801a = context;
        t90 t90Var = new t90(context);
        this.f27803c = t90Var;
        t90Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, wk0 wk0Var, yk0 yk0Var, ww0 ww0Var) {
        q qVar = new q(this.f27801a, this);
        this.f27802b.add(qVar);
        qVar.a(this.f27805e);
        qVar.a(nativeAdRequestConfiguration, wk0Var, yk0Var, ww0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, wk0 wk0Var, yk0 yk0Var, ww0 ww0Var, int i10) {
        q qVar = new q(this.f27801a, this);
        this.f27802b.add(qVar);
        qVar.a(this.f27806f);
        qVar.a(nativeAdRequestConfiguration, wk0Var, yk0Var, ww0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(NativeAdRequestConfiguration nativeAdRequestConfiguration, wk0 wk0Var, yk0 yk0Var, ww0 ww0Var) {
        q qVar = new q(this.f27801a, this);
        this.f27802b.add(qVar);
        qVar.a(this.f27807g);
        qVar.a(nativeAdRequestConfiguration, wk0Var, yk0Var, ww0Var);
    }

    public final void a() {
        this.f27803c.a();
        this.f27804d.a();
        Iterator it = this.f27802b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a();
        }
        this.f27802b.clear();
    }

    public final void a(NativeAdLoadListener nativeAdLoadListener) {
        this.f27803c.a();
        this.f27805e = nativeAdLoadListener;
        Iterator it = this.f27802b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(nativeAdLoadListener);
        }
    }

    public final void a(NativeAdRequestConfiguration nativeAdRequestConfiguration, aj0 aj0Var) {
        wk0 wk0Var = wk0.f26300b;
        yk0 yk0Var = yk0.f26867b;
        this.f27803c.a();
        this.f27804d.a(new t0(this, nativeAdRequestConfiguration, wk0Var, yk0Var, aj0Var, 1));
    }

    public final void a(final NativeAdRequestConfiguration nativeAdRequestConfiguration, final aj0 aj0Var, final int i10) {
        final wk0 wk0Var = wk0.f26301c;
        final yk0 yk0Var = yk0.f26867b;
        this.f27803c.a();
        this.f27804d.a(new Runnable() { // from class: com.yandex.mobile.ads.nativeads.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27965c.a(nativeAdRequestConfiguration, wk0Var, yk0Var, aj0Var, i10);
            }
        });
    }

    public final void a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f27803c.a();
        this.f27806f = nativeBulkAdLoadListener;
        Iterator it = this.f27802b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(nativeBulkAdLoadListener);
        }
    }

    public final void a(SliderAdLoadListener sliderAdLoadListener) {
        this.f27803c.a();
        this.f27807g = sliderAdLoadListener;
        Iterator it = this.f27802b.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(sliderAdLoadListener);
        }
    }

    public final void a(q qVar) {
        this.f27803c.a();
        this.f27802b.remove(qVar);
    }

    public final void b(NativeAdRequestConfiguration nativeAdRequestConfiguration, aj0 aj0Var) {
        wk0 wk0Var = wk0.f26302d;
        yk0 yk0Var = yk0.f26867b;
        this.f27803c.a();
        this.f27804d.a(new t0(this, nativeAdRequestConfiguration, wk0Var, yk0Var, aj0Var, 0));
    }
}
