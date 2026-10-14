package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.InitializationListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cf0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f19488e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile cf0 f19489f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xe0 f19490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bf0 f19491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c01 f19492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19493d = 1;

    public class a implements h01.a {
        private a() {
        }

        public /* synthetic */ a(cf0 cf0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.h01.a
        public final void a(d8 d8Var, wr wrVar) {
            synchronized (cf0.f19488e) {
                cf0.this.f19493d = 3;
            }
            cf0.this.f19491b.a();
        }

        @Override // com.yandex.mobile.ads.impl.h01.a
        public final void a(t2 t2Var) {
            synchronized (cf0.f19488e) {
                cf0.this.f19493d = 1;
            }
            cf0.this.f19491b.a();
        }
    }

    private cf0(xe0 xe0Var, bf0 bf0Var, c01 c01Var) {
        this.f19490a = xe0Var;
        this.f19491b = bf0Var;
        this.f19492c = c01Var;
    }

    public static cf0 b() {
        if (f19489f == null) {
            synchronized (f19488e) {
                if (f19489f == null) {
                    f19489f = new cf0(new xe0(new ye0()), new bf0(), new c01());
                }
            }
        }
        return f19489f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(Context context, InitializationListener initializationListener) {
        boolean z10;
        int i10;
        boolean z11;
        synchronized (f19488e) {
            j30 j30Var = new j30(this.f19490a, initializationListener);
            z10 = true;
            i10 = 0;
            if (this.f19493d == 3) {
                z11 = false;
            } else {
                this.f19491b.a(j30Var);
                if (this.f19493d == 1) {
                    this.f19493d = 2;
                    z11 = true;
                    z10 = false;
                } else {
                    z11 = false;
                    z10 = false;
                }
            }
        }
        if (z10) {
            xe0 xe0Var = this.f19490a;
            Objects.requireNonNull(initializationListener);
            xe0Var.b(new tn1(initializationListener, 0));
        }
        if (z11) {
            this.f19490a.a(this.f19492c.a(context, new a(this, i10)));
        }
    }

    public final void a(Context context, InitializationListener initializationListener) {
        this.f19490a.a(new ap1(this, context, initializationListener));
    }
}
