package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import java.io.File;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1848o4 extends C1624f4 implements Kg, Jg {
    private final Vg A;
    private final M2 B;
    private final M7<File> C;
    private final C2101y3 D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Ug f16993z;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o4$a */
    public class a implements Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            C1848o4.a(C1848o4.this, file);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o4$b */
    public class b implements Ug.a {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.Ug.a
        public void a(Fg fg) {
            if (fg == null) {
                return;
            }
            C1848o4.this.a(new C1744k0().a(fg.a()).a(EnumC1745k1.EVENT_TYPE_SEND_REFERRER.b()));
        }
    }

    public C1848o4(Context context, Qi qi, C1549c4 c1549c4, X3.a aVar, Ug ug, M2 m10, Wi wi) {
        this(context, c1549c4, qi, aVar, new V3(), new R2(), new L0(), new C1873p4(context, c1549c4, aVar, wi, qi, new C1823n4(m10), P0.i().s().e(), U2.b(context, c1549c4.b()), P0.i().s(), P0.i().j()), ug, m10);
    }

    public C1848o4(Context context, C1549c4 c1549c4, Qi qi, X3.a aVar, V3 v10, R2 r10, L0 l10, C1873p4 c1873p4, Ug ug, M2 m10) {
        super(context, c1549c4, v10, r10, c1873p4);
        this.f16993z = ug;
        C1575d5 c1575d5K = k();
        c1575d5K.a(EnumC1745k1.EVENT_TYPE_REGULAR, new W5(c1575d5K.b()));
        this.A = c1873p4.c(this);
        this.B = m10;
        V7 v7A = c1873p4.a(c1873p4.e(), c1873p4.b(this), f());
        this.C = v7A;
        v7A.a();
        a(context, l10);
        C2101y3 c2101y3A = c1873p4.a(this);
        this.D = c2101y3A;
        c2101y3A.a(qi, aVar.f15465q);
    }

    private void a(Context context, L0 l10) {
        File fileA = l10.a(context, "YandexMetricaNativeCrashes");
        if (fileA != null) {
            new G7(fileA, new a()).a();
        }
    }

    public static void a(C1848o4 c1848o4, File file) {
        c1848o4.C.a(file);
    }

    @Override // com.yandex.metrica.impl.ob.C1624f4
    public void F() {
        this.f16993z.a(this.A);
    }

    @Override // com.yandex.metrica.impl.ob.Jg
    public void a() {
        w().c(true);
    }

    @Override // com.yandex.metrica.impl.ob.C1624f4, com.yandex.metrica.impl.ob.Li
    public void a(Qi qi) {
        super.a(qi);
        this.D.a(qi);
    }

    @Override // com.yandex.metrica.impl.ob.C1624f4, com.yandex.metrica.impl.ob.InterfaceC1798m4
    public synchronized void a(X3.a aVar) {
        super.a(aVar);
        this.B.a(aVar.f15460l);
    }

    @Override // com.yandex.metrica.impl.ob.C1624f4
    public CounterConfiguration.b s() {
        return CounterConfiguration.b.MAIN;
    }
}
