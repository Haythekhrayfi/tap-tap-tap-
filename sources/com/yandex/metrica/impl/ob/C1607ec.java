package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1607ec implements InterfaceC1781lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Qi f16038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile FutureTask<Void> f16039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f16040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f16041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f16042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1557cc f16043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1557cc f16044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1557cc f16045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f16046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceExecutorC1966sn f16047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile C1657gc f16048l;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C1607ec c1607ec = C1607ec.this;
            C1532bc c1532bcA = C1607ec.a(c1607ec, c1607ec.f16046j);
            C1607ec c1607ec2 = C1607ec.this;
            C1532bc c1532bcB = C1607ec.b(c1607ec2, c1607ec2.f16046j);
            C1607ec c1607ec3 = C1607ec.this;
            c1607ec.f16048l = new C1657gc(c1532bcA, c1532bcB, C1607ec.a(c1607ec3, c1607ec3.f16046j, new C1806mc()));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$b */
    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1831nc f16051b;

        public b(Context context, InterfaceC1831nc interfaceC1831nc) {
            this.f16050a = context;
            this.f16051b = interfaceC1831nc;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C1657gc c1657gc = C1607ec.this.f16048l;
            C1607ec c1607ec = C1607ec.this;
            C1532bc c1532bcA = C1607ec.a(c1607ec, C1607ec.a(c1607ec, this.f16050a), c1657gc.a());
            C1607ec c1607ec2 = C1607ec.this;
            C1532bc c1532bcA2 = C1607ec.a(c1607ec2, C1607ec.b(c1607ec2, this.f16050a), c1657gc.b());
            C1607ec c1607ec3 = C1607ec.this;
            c1607ec.f16048l = new C1657gc(c1532bcA, c1532bcA2, C1607ec.a(c1607ec3, C1607ec.a(c1607ec3, this.f16050a, this.f16051b), c1657gc.c()));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$c */
    public static class c implements g {
        @Override // com.yandex.metrica.impl.ob.C1607ec.g
        public boolean a(Qi qi) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$d */
    public static class d implements g {
        @Override // com.yandex.metrica.impl.ob.C1607ec.g
        public boolean a(Qi qi) {
            return qi != null && (qi.f().f17358w || !qi.r());
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$e */
    public static class e implements g {
        @Override // com.yandex.metrica.impl.ob.C1607ec.g
        public boolean a(Qi qi) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$f */
    public static class f implements g {
        @Override // com.yandex.metrica.impl.ob.C1607ec.g
        public boolean a(Qi qi) {
            return qi != null && qi.f().f17358w;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$g */
    public interface g {
        boolean a(Qi qi);
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$h */
    public static class h implements g {
        @Override // com.yandex.metrica.impl.ob.C1607ec.g
        public boolean a(Qi qi) {
            return qi != null && (qi.f().f17350o || !qi.r());
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ec$i */
    public static class i implements g {
        @Override // com.yandex.metrica.impl.ob.C1607ec.g
        public boolean a(Qi qi) {
            return qi != null && qi.f().f17350o;
        }
    }

    public C1607ec(g gVar, g gVar2, g gVar3, InterfaceExecutorC1966sn interfaceExecutorC1966sn, InterfaceC1557cc interfaceC1557cc, InterfaceC1557cc interfaceC1557cc2, InterfaceC1557cc interfaceC1557cc3, String str) {
        this.f16037a = new Object();
        this.f16040d = gVar;
        this.f16041e = gVar2;
        this.f16042f = gVar3;
        this.f16043g = interfaceC1557cc;
        this.f16044h = interfaceC1557cc2;
        this.f16045i = interfaceC1557cc3;
        this.f16047k = interfaceExecutorC1966sn;
        this.f16048l = new C1657gc();
    }

    public C1607ec(g gVar, g gVar2, g gVar3, InterfaceExecutorC1966sn interfaceExecutorC1966sn, String str) {
        this(gVar, gVar2, gVar3, interfaceExecutorC1966sn, new C1582dc(new C1930rc("google")), new C1582dc(new C1930rc("huawei")), new C1582dc(new C1930rc("yandex")), str);
    }

    public static C1532bc a(C1607ec c1607ec, Context context) {
        if (c1607ec.f16040d.a(c1607ec.f16038b)) {
            return c1607ec.f16043g.a(context);
        }
        Qi qi = c1607ec.f16038b;
        if (qi == null || !qi.r()) {
            return new C1532bc(null, EnumC1596e1.NO_STARTUP, "startup has not been received yet");
        }
        return !c1607ec.f16038b.f().f17350o ? new C1532bc(null, EnumC1596e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting") : new C1532bc(null, EnumC1596e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    public static C1532bc a(C1607ec c1607ec, Context context, InterfaceC1831nc interfaceC1831nc) {
        return c1607ec.f16042f.a(c1607ec.f16038b) ? c1607ec.f16045i.a(context, interfaceC1831nc) : new C1532bc(null, EnumC1596e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    public static C1532bc a(C1607ec c1607ec, C1532bc c1532bc, C1532bc c1532bc2) {
        Objects.requireNonNull(c1607ec);
        EnumC1596e1 enumC1596e1 = c1532bc.f15828b;
        return enumC1596e1 != EnumC1596e1.OK ? new C1532bc(c1532bc2.f15827a, enumC1596e1, c1532bc.f15829c) : c1532bc;
    }

    public static C1532bc b(C1607ec c1607ec, Context context) {
        if (c1607ec.f16041e.a(c1607ec.f16038b)) {
            return c1607ec.f16044h.a(context);
        }
        Qi qi = c1607ec.f16038b;
        if (qi == null || !qi.r()) {
            return new C1532bc(null, EnumC1596e1.NO_STARTUP, "startup has not been received yet");
        }
        return !c1607ec.f16038b.f().f17358w ? new C1532bc(null, EnumC1596e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting") : new C1532bc(null, EnumC1596e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    private void c() {
        boolean z10;
        if (this.f16046j != null) {
            synchronized (this) {
                EnumC1596e1 enumC1596e1 = this.f16048l.a().f15828b;
                EnumC1596e1 enumC1596e2 = EnumC1596e1.UNKNOWN;
                z10 = (enumC1596e1 == enumC1596e2 || this.f16048l.b().f15828b == enumC1596e2) ? false : true;
            }
            if (z10) {
                return;
            }
            a(this.f16046j);
        }
    }

    public C1657gc a(Context context) {
        b(context);
        try {
            this.f16039c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f16048l;
    }

    public C1657gc a(Context context, InterfaceC1831nc interfaceC1831nc) {
        FutureTask futureTask = new FutureTask(new b(context.getApplicationContext(), interfaceC1831nc));
        ((C1941rn) this.f16047k).execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f16048l;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1781lc
    @Deprecated
    public String a() {
        c();
        C1507ac c1507ac = this.f16048l.a().f15827a;
        if (c1507ac == null) {
            return null;
        }
        return c1507ac.f15739b;
    }

    public void a(Context context, Qi qi) {
        this.f16038b = qi;
        b(context);
    }

    public void a(Qi qi) {
        this.f16038b = qi;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1781lc
    @Deprecated
    public Boolean b() {
        c();
        C1507ac c1507ac = this.f16048l.a().f15827a;
        if (c1507ac == null) {
            return null;
        }
        return c1507ac.f15740c;
    }

    public void b(Context context) {
        this.f16046j = context.getApplicationContext();
        if (this.f16039c == null) {
            synchronized (this.f16037a) {
                if (this.f16039c == null) {
                    this.f16039c = new FutureTask<>(new a());
                    ((C1941rn) this.f16047k).execute(this.f16039c);
                }
            }
        }
    }

    public void c(Context context) {
        this.f16046j = context.getApplicationContext();
    }
}
