package ba;

import com.android.billingclient.api.l;
import com.android.billingclient.api.n;
import com.yandex.metrica.impl.ob.C1868p;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1868p f3403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.e f3404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1893q f3405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f3406d;

    /* JADX INFO: renamed from: ba.a$a, reason: collision with other inner class name */
    public static final class C0061a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f3408d;

        public C0061a(n nVar) {
            this.f3408d = nVar;
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            a aVar = a.this;
            n nVar = this.f3408d;
            Objects.requireNonNull(aVar);
            if (nVar.f3848a != 0) {
                return;
            }
            for (String str : kc.l.c("inapp", "subs")) {
                c cVar = new c(aVar.f3403a, aVar.f3404b, aVar.f3405c, str, aVar.f3406d);
                aVar.f3406d.a(cVar);
                aVar.f3405c.c().execute(new b(str, cVar, aVar));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C1868p c1868p, com.android.billingclient.api.e eVar, InterfaceC1893q interfaceC1893q) {
        this(c1868p, eVar, interfaceC1893q, new j(eVar, null, 2));
        j0.i(c1868p, "config");
        j0.i(eVar, "billingClient");
        j0.i(interfaceC1893q, "utilsProvider");
    }

    public a(C1868p c1868p, com.android.billingclient.api.e eVar, InterfaceC1893q interfaceC1893q, j jVar) {
        j0.i(c1868p, "config");
        j0.i(eVar, "billingClient");
        j0.i(interfaceC1893q, "utilsProvider");
        j0.i(jVar, "billingLibraryConnectionHolder");
        this.f3403a = c1868p;
        this.f3404b = eVar;
        this.f3405c = interfaceC1893q;
        this.f3406d = jVar;
    }

    @Override // com.android.billingclient.api.l
    public void a(n nVar) {
        j0.i(nVar, "billingResult");
        this.f3405c.a().execute(new C0061a(nVar));
    }

    @Override // com.android.billingclient.api.l
    public void b() {
    }
}
