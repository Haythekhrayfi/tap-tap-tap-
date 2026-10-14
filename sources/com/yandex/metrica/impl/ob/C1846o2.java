package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1846o2 implements C2074x1.c, ea.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f16971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2074x1 f16972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f16973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V6 f16975e;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$a */
    public class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U3 f16976b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U3 u10) {
            super(C1846o2.this, null);
            this.f16976b = u10;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            Z0 z10 = C1846o2.this.f16971a;
            U3 u10 = this.f16976b;
            Objects.requireNonNull((C1821n2) z10);
            Bundle bundle = new Bundle();
            synchronized (u10) {
                bundle.putParcelable("PROCESS_CFG_OBJ", u10);
            }
            iMetricaService.b(bundle);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$b */
    public class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U3 f16978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(U3 u10) {
            super(C1846o2.this, null);
            this.f16978b = u10;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            Z0 z10 = C1846o2.this.f16971a;
            U3 u10 = this.f16978b;
            Objects.requireNonNull((C1821n2) z10);
            Bundle bundle = new Bundle();
            synchronized (u10) {
                bundle.putParcelable("PROCESS_CFG_OBJ", u10);
            }
            iMetricaService.a(bundle);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$c */
    public class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Dm f16981e;

        public c(f fVar, Dm dm) {
            super(fVar);
            this.f16980d = false;
            this.f16981e = dm;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g
        /* JADX INFO: renamed from: a */
        public synchronized Void call() {
            boolean z10;
            if (this.f16980d) {
                return null;
            }
            this.f16980d = true;
            Dm dm = this.f16981e;
            Objects.requireNonNull(dm);
            try {
                z10 = !TextUtils.isEmpty(dm.b()) && dm.b().endsWith(":Metrica");
            } catch (Throwable unused) {
            }
            if (z10) {
                a(this.f16983b);
                return null;
            }
            C1846o2.this.f16972b.g();
            return super.call();
        }

        public void a(f fVar) {
            C1846o2.this.f16975e.a(fVar);
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g
        public boolean b() {
            f fVar = this.f16983b;
            if (fVar.b().f16518h == 0) {
                Context contextA = ((C1821n2) C1846o2.this.f16971a).a();
                Intent intentB = H2.b(contextA);
                fVar.b().f16515e = EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b();
                intentB.putExtras(fVar.b().b(fVar.a().c()));
                try {
                    contextA.startService(intentB);
                    return false;
                } catch (Throwable unused) {
                }
            }
            C1846o2.this.f16975e.a(fVar);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$d */
    public class d extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f16983b;

        public d(f fVar) {
            super(C1846o2.this, null);
            this.f16983b = fVar;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            f fVar = this.f16983b;
            ((C1821n2) C1846o2.this.f16971a).a(iMetricaService, fVar.e(), fVar.f16986b);
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g
        public void a(Throwable th) {
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g, java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
            return call();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$e */
    public interface e {
        C1744k0 a(C1744k0 c1744k0);
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$f */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C1744k0 f16985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C1746k2 f16986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f16987c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f16988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private HashMap<S.a, Integer> f16989e;

        public f(C1744k0 c1744k0, C1746k2 c1746k2) {
            this.f16985a = c1744k0;
            this.f16986b = new C1746k2(new U3(c1746k2.a()), new CounterConfiguration(c1746k2.b()), c1746k2.e());
        }

        public C1746k2 a() {
            return this.f16986b;
        }

        public f a(e eVar) {
            this.f16988d = eVar;
            return this;
        }

        public f a(HashMap<S.a, Integer> map) {
            this.f16989e = map;
            return this;
        }

        public f a(boolean z10) {
            this.f16987c = z10;
            return this;
        }

        public C1744k0 b() {
            return this.f16985a;
        }

        public HashMap<S.a, Integer> c() {
            return this.f16989e;
        }

        public boolean d() {
            return this.f16987c;
        }

        public C1744k0 e() {
            e eVar = this.f16988d;
            return eVar != null ? eVar.a(this.f16985a) : this.f16985a;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ReportToSend{mReport=");
            sbA.append(this.f16985a);
            sbA.append(", mEnvironment=");
            sbA.append(this.f16986b);
            sbA.append(", mCrash=");
            sbA.append(this.f16987c);
            sbA.append(", mAction=");
            sbA.append(this.f16988d);
            sbA.append(", mTrimmedFields=");
            sbA.append(this.f16989e);
            sbA.append('}');
            return sbA.toString();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$g */
    public abstract class g implements Callable<Void> {
        private g() {
        }

        public /* synthetic */ g(C1846o2 c1846o2, a aVar) {
            this();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            int i10 = 0;
            do {
                try {
                    IMetricaService iMetricaServiceD = C1846o2.this.f16972b.d();
                    if (iMetricaServiceD != null) {
                        try {
                            a(iMetricaServiceD);
                            return null;
                        } catch (RemoteException unused) {
                        }
                    }
                    i10++;
                    if (!b() || P1.a()) {
                        break;
                    }
                } catch (Throwable th) {
                    a(th);
                    return null;
                }
            } while (i10 < 20);
            return null;
        }

        public abstract void a(IMetricaService iMetricaService) throws RemoteException;

        public void a(Throwable th) {
        }

        public boolean b() {
            C1846o2.this.f16972b.b();
            synchronized (C1846o2.this.f16973c) {
                if (!C1846o2.this.f16972b.e()) {
                    try {
                        C1846o2.this.f16973c.wait(500L, 0);
                    } catch (InterruptedException unused) {
                        C1846o2.this.f16973c.notifyAll();
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o2$h */
    public class h extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f16992c;

        public h(C1846o2 c1846o2, int i10, Bundle bundle) {
            super(c1846o2, null);
            this.f16991b = i10;
            this.f16992c = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.C1846o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            iMetricaService.a(this.f16991b, this.f16992c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1846o2(Z0 z10) {
        C1821n2 c1821n2 = (C1821n2) z10;
        this(c1821n2, Y.g().d().d(), new V6(c1821n2.a()));
    }

    public C1846o2(Z0 z10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, V6 v10) {
        this.f16973c = new Object();
        this.f16971a = z10;
        this.f16974d = interfaceExecutorC1966sn;
        this.f16975e = v10;
        C2074x1 c2074x1C = ((C1821n2) z10).c();
        this.f16972b = c2074x1C;
        c2074x1C.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.C2074x1.c
    public void onServiceConnected() {
        synchronized (this.f16973c) {
            this.f16973c.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.ob.C2074x1.c
    public void onServiceDisconnected() {
    }

    public Future<Void> queuePauseUserSession(U3 u10) {
        return ((C1941rn) this.f16974d).a(new b(u10));
    }

    public Future<Void> queueReport(f fVar) {
        return ((C1941rn) this.f16974d).a(fVar.d() ? new c(fVar, Y.g().h()) : new d(fVar));
    }

    public Future<Void> queueResumeUserSession(U3 u10) {
        return ((C1941rn) this.f16974d).a(new a(u10));
    }

    public void reportData(int i10, Bundle bundle) {
        ((C1941rn) this.f16974d).a(new h(this, i10, bundle));
    }

    public void sendCrash(f fVar) {
        c cVar = new c(fVar, Y.g().h());
        if (this.f16972b.e()) {
            try {
                ((FutureTask) ((C1941rn) this.f16974d).a(cVar)).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (cVar.f16980d) {
            return;
        }
        try {
            cVar.call();
        } catch (Throwable unused2) {
        }
    }
}
