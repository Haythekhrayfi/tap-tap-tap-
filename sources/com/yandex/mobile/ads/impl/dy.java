package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class dy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f19998b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b90 f19999a;

    public dy(b90 b90Var) {
        fd.j0.i(b90Var, "localStorage");
        this.f19999a = b90Var;
    }

    public final boolean a(f8 f8Var) {
        String strA;
        boolean z10 = false;
        if (f8Var == null || (strA = f8Var.a()) == null) {
            return false;
        }
        synchronized (f19998b) {
            String strB = this.f19999a.b("google_advertising_id_key");
            if (strB != null && !fd.j0.d(strA, strB)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void b(f8 f8Var) {
        String strB = this.f19999a.b("google_advertising_id_key");
        String strA = f8Var != null ? f8Var.a() : null;
        if (strB != null || strA == null) {
            return;
        }
        this.f19999a.putString("google_advertising_id_key", strA);
    }
}
