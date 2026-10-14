package com.yandex.mobile.ads.impl;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kp0 f26856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w11 f26857b = new w11();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f26858b;

        public a(Map map) {
            this.f26858b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            yi1.this.f26856a.setVisibility(0);
            yi1.a(yi1.this, this.f26858b);
        }
    }

    public yi1(kp0 kp0Var) {
        this.f26856a = kp0Var;
    }

    public static void a(yi1 yi1Var, Map map) {
        Objects.requireNonNull(yi1Var);
        x60.d("A page has finished loading", new Object[0]);
        kp0 kp0Var = yi1Var.f26856a;
        b00 b00Var = kp0Var.f22485f;
        if (b00Var != null) {
            b00Var.a(kp0Var, map);
        }
    }

    public final void a(Map<String, String> map) {
        this.f26857b.a(new a(map));
    }
}
