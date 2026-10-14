package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Fj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Fj f14015b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1518an f14016a;

    public Fj(C1518an c1518an) {
        this.f14016a = c1518an;
    }

    public static Fj a(Context context) {
        if (f14015b == null) {
            synchronized (Fj.class) {
                if (f14015b == null) {
                    f14015b = new Fj(new C1518an(context, "uuid.dat"));
                }
            }
        }
        return f14015b;
    }

    public Ej a(Context context, Cj cj) {
        return new Ej(cj, new Hj(context, new L0()), this.f14016a, new Gj(context, new L0(), new Rm()));
    }

    public Ej b(Context context, Cj cj) {
        return new Ej(cj, new Bj(), this.f14016a, new Gj(context, new L0(), new Rm()));
    }
}
