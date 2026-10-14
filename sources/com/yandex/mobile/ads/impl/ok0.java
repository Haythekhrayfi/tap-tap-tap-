package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ok0 implements yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k6 f23843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x51 f23844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jw0 f23845c;

    public ok0(k6 k6Var, x51 x51Var, jw0 jw0Var) {
        fd.j0.i(k6Var, "adTracker");
        fd.j0.i(x51Var, "targetUrlHandler");
        fd.j0.i(jw0Var, "reporter");
        this.f23843a = k6Var;
        this.f23844b = x51Var;
        this.f23845c = jw0Var;
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    public final void a(String str) {
        fd.j0.i(str, ImagesContract.URL);
        k6 k6Var = this.f23843a;
        x51 x51Var = this.f23844b;
        jw0 jw0Var = this.f23845c;
        Objects.requireNonNull(k6Var);
        k6.a(str, x51Var, jw0Var);
    }
}
