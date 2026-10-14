package aa;

import com.android.billingclient.api.l;
import com.android.billingclient.api.n;
import com.yandex.metrica.impl.ob.C1868p;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1868p f210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.android.billingclient.api.e f213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1893q f214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.viewpager2.widget.d f215f;

    /* JADX INFO: renamed from: aa.a$a, reason: collision with other inner class name */
    public class C0009a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f216c;

        public C0009a(n nVar) {
            this.f216c = nVar;
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() throws Throwable {
            a aVar = a.this;
            n nVar = this.f216c;
            Objects.requireNonNull(aVar);
            if (nVar.f3848a == 0) {
                for (String str : Arrays.asList("inapp", "subs")) {
                    C1868p c1868p = aVar.f210a;
                    Executor executor = aVar.f211b;
                    Executor executor2 = aVar.f212c;
                    com.android.billingclient.api.e eVar = aVar.f213d;
                    InterfaceC1893q interfaceC1893q = aVar.f214e;
                    androidx.viewpager2.widget.d dVar = aVar.f215f;
                    c cVar = new c(c1868p, executor, executor2, eVar, interfaceC1893q, str, dVar, new ca.c());
                    ((Set) dVar.f3052c).add(cVar);
                    aVar.f212c.execute(new b(aVar, str, cVar));
                }
            }
        }
    }

    public a(C1868p c1868p, Executor executor, Executor executor2, com.android.billingclient.api.e eVar, InterfaceC1893q interfaceC1893q, androidx.viewpager2.widget.d dVar) {
        this.f210a = c1868p;
        this.f211b = executor;
        this.f212c = executor2;
        this.f213d = eVar;
        this.f214e = interfaceC1893q;
        this.f215f = dVar;
    }

    @Override // com.android.billingclient.api.l
    public void a(n nVar) {
        this.f211b.execute(new C0009a(nVar));
    }

    @Override // com.android.billingclient.api.l
    public void b() {
    }
}
