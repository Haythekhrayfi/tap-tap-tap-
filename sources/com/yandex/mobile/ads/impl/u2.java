package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vw0 f25540a = vw0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<ae<?>> f25541b;

    public u2(ae<?> aeVar) {
        this.f25541b = new WeakReference<>(aeVar);
    }

    public static t2 a(k2 k2Var, int i10) {
        switch (i10) {
            case 2:
                return v4.f25824g;
            case 3:
            default:
                return v4.f25836s;
            case 4:
            case 10:
                return v4.b(k2Var != null ? k2Var.c() : null);
            case 5:
                return v4.f25821d;
            case 6:
                return v4.f25829l;
            case 7:
                return v4.f25830m;
            case 8:
                return v4.f25823f;
            case 9:
                return v4.f25825h;
            case 11:
                return v4.f25832o;
            case 12:
                return v4.f25835r;
        }
    }

    public final void a(xd xdVar) {
        ae<?> aeVar = this.f25541b.get();
        if (aeVar != null) {
            vw0 vw0Var = this.f25540a;
            Context context = aeVar.f18884b;
            synchronized (vw0Var) {
                gn0.a(context).a(xdVar);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.vh
    public final boolean a() {
        return false;
    }

    public final void b() {
        ae<?> aeVar = this.f25541b.get();
        if (aeVar != null) {
            vw0 vw0Var = this.f25540a;
            Context context = aeVar.f18884b;
            int i10 = t6.f25286b;
            String string = aeVar.toString();
            Objects.requireNonNull(vw0Var);
            vw0.a(context, string);
        }
    }

    public final void c() {
        b();
        this.f25541b.clear();
    }
}
