package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17416b;

    private so(uo<?> uoVar, boolean z10, String str) {
        Objects.requireNonNull(uoVar);
        this.f17415a = z10;
        this.f17416b = str;
    }

    public static final so a(uo<?> uoVar) {
        return new so(uoVar, true, "");
    }

    public static final so a(uo<?> uoVar, String str) {
        return new so(uoVar, false, str);
    }

    public final String a() {
        return this.f17416b;
    }

    public final boolean b() {
        return this.f17415a;
    }
}
