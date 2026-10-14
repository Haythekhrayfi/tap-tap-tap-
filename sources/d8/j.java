package d8;

import fd.j0;
import java.util.List;
import jc.w;
import y9.q;
import y9.v7;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f28888k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7 f28889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.j f28890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.d f28891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.d f28892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i8.k f28893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<q> f28895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<q> f28896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d8.d f28898j;

    public static final class a extends vc.l implements uc.l<Long, w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Long l10) {
            l10.longValue();
            j.a(j.this);
            return w.f31842a;
        }
    }

    public static final class b extends vc.l implements uc.l<Long, w> {
        public b() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Long l10) {
            l10.longValue();
            j.a(j.this);
            return w.f31842a;
        }
    }

    public static final class c {
        public c() {
        }

        public c(vc.g gVar) {
        }
    }

    public /* synthetic */ class d extends vc.k implements uc.l<Long, w> {
        public d(Object obj) {
            super(1, obj, j.class, "updateTimerVariable", "updateTimerVariable(J)V", 0);
        }

        @Override // uc.l
        public w invoke(Long l10) {
            long jLongValue = l10.longValue();
            j jVar = (j) this.receiver;
            int i10 = j.f28888k;
            jVar.b(jLongValue);
            return w.f31842a;
        }
    }

    public /* synthetic */ class e extends vc.k implements uc.l<Long, w> {
        public e(Object obj) {
            super(1, obj, j.class, "updateTimerVariable", "updateTimerVariable(J)V", 0);
        }

        @Override // uc.l
        public w invoke(Long l10) {
            long jLongValue = l10.longValue();
            j jVar = (j) this.receiver;
            int i10 = j.f28888k;
            jVar.b(jLongValue);
            return w.f31842a;
        }
    }

    public /* synthetic */ class f extends vc.k implements uc.l<Long, w> {
        public f(Object obj) {
            super(1, obj, j.class, "onEnd", "onEnd(J)V", 0);
        }

        @Override // uc.l
        public w invoke(Long l10) {
            long jLongValue = l10.longValue();
            j jVar = (j) this.receiver;
            int i10 = j.f28888k;
            jVar.b(jLongValue);
            k9.k kVar = k9.k.f31954a;
            if (k9.k.a()) {
                List<q> list = jVar.f28895g;
                if (list != null) {
                    for (q qVar : list) {
                        i8.k kVar2 = jVar.f28893e;
                        if (kVar2 != null) {
                            jVar.f28890b.handleAction(qVar, kVar2);
                        }
                    }
                }
            } else {
                k9.k.f31955b.post(new k(jVar));
            }
            return w.f31842a;
        }
    }

    public /* synthetic */ class g extends vc.k implements uc.l<Long, w> {
        public g(Object obj) {
            super(1, obj, j.class, "onTick", "onTick(J)V", 0);
        }

        @Override // uc.l
        public w invoke(Long l10) {
            long jLongValue = l10.longValue();
            j jVar = (j) this.receiver;
            int i10 = j.f28888k;
            jVar.b(jLongValue);
            k9.k kVar = k9.k.f31954a;
            if (k9.k.a()) {
                List<q> list = jVar.f28896h;
                if (list != null) {
                    for (q qVar : list) {
                        i8.k kVar2 = jVar.f28893e;
                        if (kVar2 != null) {
                            jVar.f28890b.handleAction(qVar, kVar2);
                        }
                    }
                }
            } else {
                k9.k.f31955b.post(new l(jVar));
            }
            return w.f31842a;
        }
    }

    public static final class h implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f28902d;

        public h(long j10) {
            this.f28902d = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = j.this;
            i8.k kVar = jVar.f28893e;
            if (kVar == null) {
                return;
            }
            kVar.z(jVar.f28894f, String.valueOf(this.f28902d));
        }
    }

    static {
        new c(null);
    }

    public j(v7 v7Var, p7.j jVar, q8.d dVar, v9.d dVar2) {
        j0.i(v7Var, "divTimer");
        j0.i(jVar, "divActionHandler");
        j0.i(dVar, "errorCollector");
        j0.i(dVar2, "expressionResolver");
        this.f28889a = v7Var;
        this.f28890b = jVar;
        this.f28891c = dVar;
        this.f28892d = dVar2;
        String str = v7Var.f43581c;
        this.f28894f = v7Var.f43584f;
        this.f28895g = v7Var.f43580b;
        this.f28896h = v7Var.f43582d;
        this.f28898j = new d8.d(str, new d(this), new e(this), new f(this), new g(this), dVar);
        v7Var.f43579a.f(dVar2, new a());
        v9.b<Long> bVar = v7Var.f43583e;
        if (bVar == null) {
            return;
        }
        bVar.f(dVar2, new b());
    }

    public static final void a(j jVar) {
        Long lB;
        d8.d dVar = jVar.f28898j;
        long jLongValue = jVar.f28889a.f43579a.b(jVar.f28892d).longValue();
        v9.b<Long> bVar = jVar.f28889a.f43583e;
        dVar.f28865h = (bVar == null || (lB = bVar.b(jVar.f28892d)) == null) ? null : Long.valueOf(lB.longValue());
        dVar.f28864g = jLongValue != 0 ? Long.valueOf(jLongValue) : null;
    }

    public final void b(long j10) {
        if (this.f28894f != null) {
            k9.k kVar = k9.k.f31954a;
            if (!k9.k.a()) {
                k9.k.f31955b.post(new h(j10));
                return;
            }
            i8.k kVar2 = this.f28893e;
            if (kVar2 == null) {
                return;
            }
            kVar2.z(this.f28894f, String.valueOf(j10));
        }
    }
}
