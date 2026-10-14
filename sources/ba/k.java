package ba;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.impl.ob.C1868p;
import com.yandex.metrica.impl.ob.InterfaceC1893q;
import com.yandex.metrica.impl.ob.InterfaceC1942s;
import com.yandex.metrica.impl.ob.InterfaceC1967t;
import com.yandex.metrica.impl.ob.InterfaceC1992u;
import com.yandex.metrica.impl.ob.InterfaceC2017v;
import com.yandex.metrica.impl.ob.r;
import fd.j0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements r, InterfaceC1893q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1868p f3451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f3453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f3454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1967t f3455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1942s f3456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC2017v f3457g;

    public static final class a extends com.yandex.metrica.billing_interface.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1868p f3459d;

        public a(C1868p c1868p) {
            this.f3459d = c1868p;
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            Context context = k.this.f3452b;
            g gVar = new g();
            j0 j0Var = new j0(1);
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            com.android.billingclient.api.f fVar = new com.android.billingclient.api.f(j0Var, context, gVar, null);
            fVar.i(new ba.a(this.f3459d, fVar, k.this));
        }
    }

    public k(Context context, Executor executor, Executor executor2, InterfaceC1992u interfaceC1992u, InterfaceC1967t interfaceC1967t, InterfaceC1942s interfaceC1942s, InterfaceC2017v interfaceC2017v) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(executor, "workerExecutor");
        j0.i(executor2, "uiExecutor");
        j0.i(interfaceC1992u, "billingInfoStorage");
        j0.i(interfaceC1967t, "billingInfoSender");
        j0.i(interfaceC1942s, "billingInfoManager");
        j0.i(interfaceC2017v, "updatePolicy");
        this.f3452b = context;
        this.f3453c = executor;
        this.f3454d = executor2;
        this.f3455e = interfaceC1967t;
        this.f3456f = interfaceC1942s;
        this.f3457g = interfaceC2017v;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public Executor a() {
        return this.f3453c;
    }

    @Override // com.yandex.metrica.impl.ob.r
    public synchronized void a(C1868p c1868p) {
        this.f3451a = c1868p;
    }

    @Override // com.yandex.metrica.impl.ob.r
    public void b() {
        C1868p c1868p = this.f3451a;
        if (c1868p != null) {
            this.f3454d.execute(new a(c1868p));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public Executor c() {
        return this.f3454d;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public InterfaceC1967t d() {
        return this.f3455e;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public InterfaceC1942s e() {
        return this.f3456f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1893q
    public InterfaceC2017v f() {
        return this.f3457g;
    }
}
