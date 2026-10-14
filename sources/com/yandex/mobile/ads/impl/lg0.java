package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class lg0 extends ge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf0 f22706b;

    public static class a implements ig0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<b00> f22707a;

        public a(b00 b00Var) {
            this.f22707a = new WeakReference<>(b00Var);
        }

        @Override // com.yandex.mobile.ads.impl.ig0
        public final void a(kp0 kp0Var, Map map) {
            b00 b00Var = this.f22707a.get();
            if (b00Var != null) {
                b00Var.a(kp0Var, map);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ig0
        public final void a(String str) {
            b00 b00Var = this.f22707a.get();
            if (b00Var != null) {
                b00Var.a(str);
            }
        }
    }

    public lg0(kp0 kp0Var, b00 b00Var) {
        super(kp0Var);
        yf0 yf0Var = new yf0(kp0Var);
        this.f22706b = yf0Var;
        yf0Var.a(new a(b00Var));
    }

    @Override // com.yandex.mobile.ads.impl.ge
    public final void a(b00 b00Var) {
        super.a(new dg0(this.f22706b, b00Var));
    }

    @Override // com.yandex.mobile.ads.impl.ge, com.yandex.mobile.ads.impl.vz
    public final void a(String str) {
        this.f22706b.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.ge, com.yandex.mobile.ads.impl.vz
    public final void invalidate() {
        super.invalidate();
        this.f22706b.a();
    }
}
