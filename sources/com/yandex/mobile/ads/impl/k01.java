package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jf0 f22220a = new jf0();

    public final String a() {
        Objects.requireNonNull(this.f22220a);
        vb1 vb1VarA = jf0.a();
        return String.format(Locale.US, "%d.%d%d", Integer.valueOf(vb1VarA.a()), Integer.valueOf(vb1VarA.b()), Integer.valueOf(vb1VarA.c()));
    }

    public final String b() {
        Objects.requireNonNull(this.f22220a);
        vb1 vb1VarA = jf0.a();
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(vb1VarA.a()), Integer.valueOf(vb1VarA.b()), Integer.valueOf(vb1VarA.c()));
    }
}
