package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f14279a;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final P6 f14280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f14281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final O6 f14282c;

        public a(P6 p10, Bundle bundle, O6 o10) {
            this.f14280a = p10;
            this.f14281b = bundle;
            this.f14282c = o10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14280a.a(this.f14281b, this.f14282c);
            } catch (Throwable unused) {
                O6 o10 = this.f14282c;
                if (o10 != null) {
                    o10.a();
                }
            }
        }
    }

    public J6() {
        this(P0.i().s().a());
    }

    public J6(InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this.f14279a = interfaceExecutorC1966sn;
    }

    public InterfaceExecutorC1966sn a() {
        return this.f14279a;
    }

    public void a(P6 p10, Bundle bundle) {
        ((C1941rn) this.f14279a).execute(new a(p10, bundle, null));
    }

    public void a(P6 p10, Bundle bundle, O6 o10) {
        ((C1941rn) this.f14279a).execute(new a(p10, bundle, o10));
    }
}
