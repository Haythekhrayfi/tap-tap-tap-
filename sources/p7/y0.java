package p7;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import y9.f7;
import y9.x6;

/* JADX INFO: loaded from: classes2.dex */
public class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final a f34605d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.x f34606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f34607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7.a f34608c;

    public interface a {
        void f(boolean z10);
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }
    }

    public static final class c extends z7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f34609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AtomicInteger f34610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AtomicInteger f34611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AtomicBoolean f34612d;

        public c(a aVar) {
            fd.j0.i(aVar, "callback");
            this.f34609a = aVar;
            this.f34610b = new AtomicInteger(0);
            this.f34611c = new AtomicInteger(0);
            this.f34612d = new AtomicBoolean(false);
        }

        @Override // z7.c
        public void a() {
            this.f34611c.incrementAndGet();
            c();
        }

        @Override // z7.c
        public void b(z7.b bVar) {
            c();
        }

        public final void c() {
            this.f34610b.decrementAndGet();
            if (this.f34610b.get() == 0 && this.f34612d.get()) {
                this.f34609a.f(this.f34611c.get() != 0);
            }
        }
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34613a = a.f34614a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f34614a = new a();
        }

        void cancel();
    }

    public final class e extends f9.a<jc.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f34615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f34616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v9.d f34617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g f34618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y0 f34619e;

        public e(y0 y0Var, c cVar, a aVar, v9.d dVar) {
            fd.j0.i(y0Var, "this$0");
            fd.j0.i(cVar, "downloadCallback");
            fd.j0.i(aVar, "callback");
            fd.j0.i(dVar, "resolver");
            this.f34619e = y0Var;
            this.f34615a = cVar;
            this.f34616b = aVar;
            this.f34617c = dVar;
            this.f34618d = new g();
        }

        @Override // f9.a
        public /* bridge */ /* synthetic */ jc.w a(y9.k kVar, v9.d dVar) {
            n(kVar, dVar);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w b(y9.k.c cVar, v9.d dVar) {
            Iterator<T> it = cVar.f40976c.f43638t.iterator();
            while (it.hasNext()) {
                m((y9.k) it.next(), dVar);
            }
            n(cVar, dVar);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w c(y9.k.d dVar, v9.d dVar2) {
            d dVarPreload;
            List<y9.k> list = dVar.f40977c.f40547o;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m((y9.k) it.next(), dVar2);
                }
            }
            l0 l0Var = this.f34619e.f34607b;
            if (l0Var != null && (dVarPreload = l0Var.preload(dVar.f40977c, this.f34616b)) != null) {
                g gVar = this.f34618d;
                Objects.requireNonNull(gVar);
                gVar.f34620a.add(dVarPreload);
            }
            n(dVar, dVar2);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w d(y9.k.e eVar, v9.d dVar) {
            Iterator<T> it = eVar.f40978c.f42724r.iterator();
            while (it.hasNext()) {
                m((y9.k) it.next(), dVar);
            }
            n(eVar, dVar);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w f(y9.k.g gVar, v9.d dVar) {
            Iterator<T> it = gVar.f40980c.f39044t.iterator();
            while (it.hasNext()) {
                m((y9.k) it.next(), dVar);
            }
            n(gVar, dVar);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w h(y9.k.C0475k c0475k, v9.d dVar) {
            Iterator<T> it = c0475k.f40984c.f42306o.iterator();
            while (it.hasNext()) {
                m((y9.k) it.next(), dVar);
            }
            n(c0475k, dVar);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w j(y9.k.o oVar, v9.d dVar) {
            Iterator<T> it = oVar.f40988c.f44147s.iterator();
            while (it.hasNext()) {
                y9.k kVar = ((x6.f) it.next()).f44164c;
                if (kVar != null) {
                    m(kVar, dVar);
                }
            }
            n(oVar, dVar);
            return jc.w.f31842a;
        }

        @Override // f9.a
        public jc.w k(y9.k.p pVar, v9.d dVar) {
            Iterator<T> it = pVar.f40989c.f40008o.iterator();
            while (it.hasNext()) {
                m(((f7.e) it.next()).f40026a, dVar);
            }
            n(pVar, dVar);
            return jc.w.f31842a;
        }

        public void n(y9.k kVar, v9.d dVar) {
            fd.j0.i(kVar, "data");
            fd.j0.i(dVar, "resolver");
            i8.x xVar = this.f34619e.f34606a;
            if (xVar != null) {
                c cVar = this.f34615a;
                fd.j0.i(kVar, "div");
                fd.j0.i(dVar, "resolver");
                fd.j0.i(cVar, "callback");
                i8.x.a aVar = new i8.x.a(xVar, cVar, dVar, false);
                fd.j0.i(kVar, "div");
                aVar.m(kVar, aVar.f31487b);
                ArrayList<z7.e> arrayList = aVar.f31489d;
                if (arrayList != null) {
                    for (z7.e eVar : arrayList) {
                        g gVar = this.f34618d;
                        Objects.requireNonNull(gVar);
                        fd.j0.i(eVar, "reference");
                        gVar.f34620a.add(new a1(eVar));
                    }
                }
            }
            x7.a aVar2 = this.f34619e.f34608c;
            y9.g0 g0VarA = kVar.a();
            Objects.requireNonNull(aVar2);
            fd.j0.i(g0VarA, "div");
            fd.j0.i(dVar, "resolver");
            if (aVar2.c(g0VarA)) {
                for (x7.c cVar2 : aVar2.f37517a) {
                    if (cVar2.matches(g0VarA)) {
                        cVar2.preprocess(g0VarA, dVar);
                    }
                }
            }
        }
    }

    public interface f {
        void cancel();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f34620a = new ArrayList();

        @Override // p7.y0.f
        public void cancel() {
            Iterator<T> it = this.f34620a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).cancel();
            }
        }
    }

    static {
        new b(null);
        f34605d = i5.a.f31255k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(i8.x xVar, l0 l0Var, List<? extends x7.c> list) {
        this(xVar, l0Var, new x7.a(list));
        fd.j0.i(list, "extensionHandlers");
    }

    public y0(i8.x xVar, l0 l0Var, x7.a aVar) {
        fd.j0.i(aVar, "extensionController");
        this.f34606a = xVar;
        this.f34607b = l0Var;
        this.f34608c = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y0(p7.e eVar) {
        fd.j0.i(eVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        i8.x xVar = ((r7.a.b) eVar.f34504a).B.get();
        r7.b bVar = eVar.f34504a;
        l0 l0Var = ((r7.a.b) bVar).f35197a.f34542j;
        x7.a aVar = ((r7.a.b) bVar).E.get();
        fd.j0.h(aVar, "context.div2Component.extensionController");
        this(xVar, l0Var, aVar);
    }

    public f a(y9.k kVar, v9.d dVar, a aVar) {
        fd.j0.i(kVar, "div");
        fd.j0.i(dVar, "resolver");
        fd.j0.i(aVar, "callback");
        c cVar = new c(aVar);
        e eVar = new e(this, cVar, aVar, dVar);
        fd.j0.i(kVar, "div");
        eVar.m(kVar, eVar.f34617c);
        g gVar = eVar.f34618d;
        cVar.f34612d.set(true);
        if (cVar.f34610b.get() == 0) {
            cVar.f34609a.f(cVar.f34611c.get() != 0);
        }
        return gVar;
    }
}
