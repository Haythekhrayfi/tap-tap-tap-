package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class y90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ea0 f26743a = ea0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s40 f26744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d40 f26745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t1 f26746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final da0 f26747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ld1 f26748f;

    public class a implements u1 {
        private a() {
        }

        public /* synthetic */ a(y90 y90Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void a() {
            y90.this.f26747e.onInstreamAdBreakPrepared();
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void b() {
            y90.this.f26747e.onInstreamAdBreakStarted();
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void d() {
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void e() {
            y90.this.f26747e.onInstreamAdBreakCompleted();
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void g() {
            y90.this.f26747e.onInstreamAdBreakError("Ad player returned error");
        }
    }

    public y90(Context context, w50 w50Var, d40 d40Var, x1 x1Var, da0 da0Var) {
        this.f26745c = d40Var;
        this.f26747e = da0Var;
        s40 s40Var = new s40();
        this.f26744b = s40Var;
        this.f26746d = new t1(context, w50Var, d40Var, new p40(context, s40Var, new fa0(), d40Var), s40Var, x1Var);
        this.f26748f = new ld1();
    }

    public final void a() {
        this.f26746d.b();
        this.f26745c.b();
        this.f26744b.b();
    }

    public final void a(id1 id1Var) {
        kd1 kd1VarA;
        if (id1Var != null) {
            Objects.requireNonNull(this.f26748f);
            kd1VarA = ld1.a(id1Var);
        } else {
            kd1VarA = null;
        }
        this.f26746d.a(kd1VarA);
    }

    public final void a(InstreamAdView instreamAdView) {
        y90 y90VarA = this.f26743a.a(instreamAdView);
        if (!equals(y90VarA)) {
            if (y90VarA != null) {
                y90VarA.f26746d.c();
                y90VarA.f26744b.b();
            }
            if (this.f26743a.a(this)) {
                this.f26746d.c();
                this.f26744b.b();
            }
            this.f26743a.a(instreamAdView, this);
        }
        this.f26744b.a(instreamAdView, Collections.emptyList());
        this.f26745c.a();
        this.f26746d.g();
    }

    public final void b() {
        r40 r40VarA = this.f26744b.a();
        if ((r40VarA == null || r40VarA.b() == null) ? false : true) {
            this.f26746d.a();
        }
    }

    public final void c() {
        this.f26745c.a();
        this.f26746d.a(new a(this, 0));
        this.f26746d.d();
    }

    public final void d() {
        r40 r40VarA = this.f26744b.a();
        if ((r40VarA == null || r40VarA.b() == null) ? false : true) {
            this.f26746d.f();
        }
    }
}
