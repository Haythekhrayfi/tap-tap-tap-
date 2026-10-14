package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1582dc implements InterfaceC1557cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1557cc f15920a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dc$a */
    public class a implements Ym<C1532bc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f15921a;

        public a(Context context) {
            this.f15921a = context;
        }

        @Override // com.yandex.metrica.impl.ob.Ym
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1532bc a() {
            return C1582dc.this.f15920a.a(this.f15921a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dc$b */
    public class b implements Ym<C1532bc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f15923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1831nc f15924b;

        public b(Context context, InterfaceC1831nc interfaceC1831nc) {
            this.f15923a = context;
            this.f15924b = interfaceC1831nc;
        }

        @Override // com.yandex.metrica.impl.ob.Ym
        public C1532bc a() {
            return C1582dc.this.f15920a.a(this.f15923a, this.f15924b);
        }
    }

    public C1582dc(InterfaceC1557cc interfaceC1557cc) {
        this.f15920a = interfaceC1557cc;
    }

    private C1532bc a(Ym<C1532bc> ym) {
        C1532bc c1532bcA = ym.a();
        C1507ac c1507ac = c1532bcA.f15827a;
        return (c1507ac == null || !"00000000-0000-0000-0000-000000000000".equals(c1507ac.f15739b)) ? c1532bcA : new C1532bc(null, EnumC1596e1.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1557cc
    public C1532bc a(Context context) {
        return a(new a(context));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1557cc
    public C1532bc a(Context context, InterfaceC1831nc interfaceC1831nc) {
        return a(new b(context, interfaceC1831nc));
    }
}
