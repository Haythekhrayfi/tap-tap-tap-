package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f14384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H6 f14385b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f14386a;

        public a(L6 l10, b bVar) {
            this.f14386a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                N6.a aVar = (N6.a) this.f14386a;
                N6.this.f14532c.a();
                N6 n10 = N6.this;
                O6 o10 = aVar.f14535a;
                Objects.requireNonNull(n10);
                if (o10 != null) {
                    o10.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public interface b {
    }

    public L6(InterfaceExecutorC1966sn interfaceExecutorC1966sn, H6 h10) {
        this.f14384a = interfaceExecutorC1966sn;
        this.f14385b = h10;
    }

    public void a() {
        this.f14385b.a();
    }

    public void a(long j10, b bVar) {
        ((C1941rn) this.f14384a).a(new a(this, bVar), j10);
    }

    public void a(long j10, boolean z10) {
        this.f14385b.a(j10, z10);
    }
}
