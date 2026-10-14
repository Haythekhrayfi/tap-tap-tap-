package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class qc1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f24450d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fv0 f24453c;

    public enum a {
        f24454a,
        f24455b,
        f24456c,
        f24457d;

        a() {
        }
    }

    static {
        vc.n nVar = new vc.n(qc1.class, "view", "getView()Landroid/view/View;", 0);
        Objects.requireNonNull(vc.b0.f36991a);
        f24450d = new cd.i[]{nVar};
    }

    public qc1(View view, a aVar, String str) {
        fd.j0.i(view, "view");
        fd.j0.i(aVar, "purpose");
        this.f24451a = aVar;
        this.f24452b = str;
        this.f24453c = gv0.a(view);
    }

    public final String a() {
        return this.f24452b;
    }

    public final a b() {
        return this.f24451a;
    }

    public final View c() {
        return (View) this.f24453c.getValue(this, f24450d[0]);
    }
}
