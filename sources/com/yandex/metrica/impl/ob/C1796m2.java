package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C1624f4;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1796m2<C extends C1624f4> extends Q2<C> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f16871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16872f;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m2$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1796m2.this.d();
        }
    }

    public C1796m2(C c10, Zi zi, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        super(c10, zi);
        this.f16871e = new a();
        this.f16872f = interfaceExecutorC1966sn;
    }

    @Override // com.yandex.metrica.impl.ob.Q2
    public void c() {
        ((C1941rn) this.f16872f).a(this.f16871e);
    }

    @Override // com.yandex.metrica.impl.ob.Q2
    public void f() {
        super.f();
        C1736jh c1736jhM = e().m();
        if (c1736jhM.G()) {
            String strC = c1736jhM.C();
            if ((TextUtils.isEmpty(strC) || "-1".equals(strC)) ? false : true) {
                try {
                    C1721j2 c1721j2 = new C1721j2(e());
                    R1 r1L = P0.i().l();
                    if (r1L != null) {
                        r1L.b(c1721j2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void g() {
        synchronized (this.f14734b) {
            if (!this.f14735c) {
                c();
                if (e().m().H() > 0) {
                    ((C1941rn) this.f16872f).a(this.f16871e, TimeUnit.SECONDS.toMillis(e().m().H()));
                }
            }
        }
    }
}
