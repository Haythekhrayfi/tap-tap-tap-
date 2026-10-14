package aa;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.impl.ob.C1868p;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import com.yandex.metrica.impl.ob.InterfaceC1942s;
import com.yandex.metrica.impl.ob.InterfaceC1967t;
import com.yandex.metrica.impl.ob.InterfaceC2017v;
import com.yandex.metrica.impl.ob.r;
import fd.j0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class i implements r, InterfaceC1893q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1942s f255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2017v f256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1967t f257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1868p f258g;

    public class a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C1868p f259c;

        public a(C1868p c1868p) {
            this.f259c = c1868p;
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            Context context = i.this.f252a;
            f fVar = new f();
            j0 j0Var = new j0(1);
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            com.android.billingclient.api.f fVar2 = new com.android.billingclient.api.f(j0Var, context, fVar, null);
            C1868p c1868p = this.f259c;
            i iVar = i.this;
            fVar2.i(new aa.a(c1868p, iVar.f253b, iVar.f254c, fVar2, iVar, new androidx.viewpager2.widget.d(fVar2, new Handler(Looper.getMainLooper()))));
        }
    }

    public i(Context context, Executor executor, Executor executor2, InterfaceC1942s interfaceC1942s, InterfaceC2017v interfaceC2017v, InterfaceC1967t interfaceC1967t) {
        this.f252a = context;
        this.f253b = executor;
        this.f254c = executor2;
        this.f255d = interfaceC1942s;
        this.f256e = interfaceC2017v;
        this.f257f = interfaceC1967t;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public Executor a() {
        return this.f253b;
    }

    @Override // com.yandex.metrica.impl.ob.r
    public synchronized void a(C1868p c1868p) {
        this.f258g = c1868p;
    }

    @Override // com.yandex.metrica.impl.ob.r
    public void b() throws Throwable {
        C1868p c1868p = this.f258g;
        if (c1868p != null) {
            this.f254c.execute(new a(c1868p));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public Executor c() {
        return this.f254c;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public InterfaceC1967t d() {
        return this.f257f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public InterfaceC1942s e() {
        return this.f255d;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public InterfaceC2017v f() {
        return this.f256e;
    }
}
