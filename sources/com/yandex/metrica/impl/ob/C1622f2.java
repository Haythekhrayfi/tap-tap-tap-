package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1622f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D4 f16088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L0 f16089d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f2$a */
    public class a implements Um<H7> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(H7 h10) {
            H7 h11 = h10;
            C1622f2 c1622f2 = C1622f2.this;
            C4 c10 = new C4(h11.a(), h11.f(), h11.g(), h11.h(), h11.i());
            String strE = h11.e();
            byte[] bArrC = h11.c();
            int iB = h11.b();
            HashMap<S.a, Integer> mapJ = h11.j();
            String strD = h11.d();
            Im imB = AbstractC2145zm.b(h11.a());
            List<Integer> list = J0.f14266i;
            S sA = new S(bArrC, strE, EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), imB).a(mapJ);
            sA.f16518h = iB;
            c1622f2.a(c10, sA.c(strD), new X3(new C1761kh.b(null, null, null, null, null, null, false, null), new X3.a(), null));
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f2$b */
    public class b implements Um<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4 f16091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Vm<String, C1744k0> f16092b;

        public b(C4 c10, Vm<String, C1744k0> vm) {
            this.f16091a = c10;
            this.f16092b = vm;
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            C1622f2.this.a(this.f16091a, this.f16092b.a(str), new X3(new C1761kh.b(null, null, null, null, null, null, false, null), new X3.a(), null));
        }
    }

    public C1622f2(Context context, D4 d10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, L0 l10) {
        this.f16086a = context;
        this.f16087b = interfaceExecutorC1966sn;
        this.f16088c = d10;
        this.f16089d = l10;
    }

    public void a(C4 c10, C1744k0 c1744k0, X3 x10) {
        this.f16088c.a(c10, x10).a(c1744k0, x10);
        this.f16088c.a(c10.b(), c10.c().intValue(), c10.d());
    }

    public void a(Z7 z10, Vm<String, C1744k0> vm) {
        InterfaceExecutorC1966sn interfaceExecutorC1966sn = this.f16087b;
        L0 l10 = this.f16089d;
        String str = z10.f15636a.f15877b;
        Objects.requireNonNull(l10);
        ((C1941rn) interfaceExecutorC1966sn).execute(new RunnableC1527b7(new File(str), new Q7(new K7(O7.CRASHPAD, z10.f15638c.f16999b), new P7(new C2080x7())), new C1578d8.c(z10.f15636a.f15876a), new b(z10.f15637b, vm)));
    }

    public void a(C1744k0 c1744k0, Bundle bundle) {
        if (EnumC1745k1.EVENT_TYPE_UNDEFINED.b() == c1744k0.f16515e) {
            return;
        }
        ((C1941rn) this.f16087b).execute(new RunnableC1672h2(this.f16086a, c1744k0, bundle, this.f16088c));
    }

    public void a(File file) {
        I7 i10 = new I7();
        ((C1941rn) this.f16087b).execute(new RunnableC1527b7(file, i10, i10, new a()));
    }
}
