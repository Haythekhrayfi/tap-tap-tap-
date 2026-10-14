package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2021v3 implements InterfaceC1967t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1798m4 f17590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17591b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v3$a */
    public class a extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ca.b f17592a;

        public a(ca.b bVar) {
            this.f17592a = bVar;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            InterfaceC1798m4 interfaceC1798m4 = C2021v3.this.f17590a;
            C2021v3 c2021v3 = C2021v3.this;
            ca.b bVar = this.f17592a;
            Objects.requireNonNull(c2021v3);
            interfaceC1798m4.a(C1744k0.a().a(new B3(bVar).a()));
        }
    }

    public C2021v3(InterfaceC1798m4 interfaceC1798m4, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this.f17590a = interfaceC1798m4;
        this.f17591b = interfaceExecutorC1966sn;
    }

    public void a(List<ca.b> list) {
        for (ca.b bVar : list) {
            ((C1941rn) this.f17591b).execute(new a(bVar));
        }
    }
}
