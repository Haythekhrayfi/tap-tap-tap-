package fd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AwaitAll;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29548b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred<T>[] f29549a;
    public volatile /* synthetic */ int notCompletedCount;

    public final class a extends n1 {
        private volatile /* synthetic */ Object _disposer = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i<List<? extends T>> f29550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public t0 f29551h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super List<? extends T>> iVar) {
            this.f29550g = iVar;
        }

        @Override // uc.l
        public /* bridge */ /* synthetic */ jc.w invoke(Throwable th) {
            w(th);
            return jc.w.f31842a;
        }

        @Override // fd.x
        public void w(Throwable th) {
            if (th != null) {
                Object objT = this.f29550g.t(th);
                if (objT != null) {
                    this.f29550g.B(objT);
                    b bVar = (b) this._disposer;
                    if (bVar != null) {
                        bVar.d();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c.f29548b.decrementAndGet(c.this) == 0) {
                i<List<? extends T>> iVar = this.f29550g;
                m0[] m0VarArr = c.this.f29549a;
                ArrayList arrayList = new ArrayList(m0VarArr.length);
                for (m0 m0Var : m0VarArr) {
                    arrayList.add(m0Var.e());
                }
                jc.i.a aVar = jc.i.f31813c;
                iVar.resumeWith(arrayList);
            }
        }

        public final void y(c<T>.b bVar) {
            this._disposer = bVar;
        }
    }

    public final class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AwaitAll<T>.AwaitAllNode[] f29553c;

        public b(c cVar, AwaitAll<T>.AwaitAllNode[] awaitAllNodeArr) {
            this.f29553c = awaitAllNodeArr;
        }

        @Override // fd.h
        public void a(Throwable th) {
            d();
        }

        public final void d() {
            for (a aVar : this.f29553c) {
                t0 t0Var = aVar.f29551h;
                if (t0Var == null) {
                    j0.r("handle");
                    throw null;
                }
                t0Var.dispose();
            }
        }

        @Override // uc.l
        public jc.w invoke(Throwable th) {
            d();
            return jc.w.f31842a;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("DisposeHandlersOnCancel[");
            sbA.append(this.f29553c);
            sbA.append(']');
            return sbA.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Deferred<? extends T>[] deferredArr) {
        this.f29549a = deferredArr;
        this.notCompletedCount = deferredArr.length;
    }

    public final Object a(mc.d<? super List<? extends T>> dVar) {
        k kVar = new k(nc.b.c(dVar), 1);
        kVar.u();
        int length = this.f29549a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            j1 j1Var = this.f29549a[i10];
            j1Var.start();
            a aVar = new a(kVar);
            aVar.f29551h = j1Var.g(aVar);
            aVarArr[i10] = aVar;
        }
        c<T>.b bVar = new b(this, aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].y(bVar);
        }
        if (kVar.y()) {
            bVar.d();
        } else {
            kVar.s(bVar);
        }
        Object objR = kVar.r();
        if (objR == nc.a.COROUTINE_SUSPENDED) {
            j0.i(dVar, "frame");
        }
        return objR;
    }
}
