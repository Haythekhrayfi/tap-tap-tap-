package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ta1 implements uw0<sa1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ab1 f25299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final je1 f25300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w3 f25301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final uw0<sa1> f25302d;

    public class a implements uw0<List<ac1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final sa1 f25303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final uw0<sa1> f25304b;

        public a(sa1 sa1Var, uw0<sa1> uw0Var) {
            this.f25303a = sa1Var;
            this.f25304b = uw0Var;
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(lc1 lc1Var) {
            ta1.a(ta1.this, lc1Var);
            this.f25304b.a(lc1Var);
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(List<ac1> list) {
            ta1.a(ta1.this);
            this.f25304b.a(new sa1(new na1(this.f25303a.b().a(), list), this.f25303a.a()));
        }
    }

    public ta1(Context context, ab1 ab1Var, w3 w3Var, qa1 qa1Var, db1 db1Var) {
        this.f25299a = ab1Var;
        this.f25301c = w3Var;
        this.f25302d = db1Var;
        this.f25300b = new je1(context, qa1Var);
    }

    public static void a(ta1 ta1Var) {
        Objects.requireNonNull(ta1Var);
        ta1Var.f25301c.a(v3.f25808k, new ya1("success", null), ta1Var.f25299a);
    }

    public static void a(ta1 ta1Var, lc1 lc1Var) {
        Objects.requireNonNull(ta1Var);
        ta1Var.f25301c.a(v3.f25808k, new ya1("error", lc1Var), ta1Var.f25299a);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(lc1 lc1Var) {
        this.f25301c.a(v3.f25808k, new ya1("error", lc1Var), this.f25299a);
        this.f25302d.a(lc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.uw0
    public final void a(sa1 sa1Var) {
        sa1 sa1Var2 = sa1Var;
        this.f25300b.a(sa1Var2.b().b(), new a(sa1Var2, this.f25302d));
    }
}
