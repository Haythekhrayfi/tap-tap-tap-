package mc;

import fd.j0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> implements d<T>, oc.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final AtomicReferenceFieldUpdater<i<?>, Object> f33540d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<T> f33541c;
    private volatile Object result;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
        f33540d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> dVar) {
        this(dVar, nc.a.UNDECIDED);
        j0.i(dVar, "delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> dVar, Object obj) {
        j0.i(dVar, "delegate");
        this.f33541c = dVar;
        this.result = obj;
    }

    public final Object b() throws Throwable {
        Object obj = this.result;
        nc.a aVar = nc.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f33540d;
            nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
            if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                return aVar2;
            }
            obj = this.result;
        }
        if (obj == nc.a.RESUMED) {
            return nc.a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof jc.i.b) {
            throw ((jc.i.b) obj).f31814c;
        }
        return obj;
    }

    @Override // oc.d
    public oc.d getCallerFrame() {
        d<T> dVar = this.f33541c;
        if (dVar instanceof oc.d) {
            return (oc.d) dVar;
        }
        return null;
    }

    @Override // mc.d
    public f getContext() {
        return this.f33541c.getContext();
    }

    @Override // mc.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            nc.a aVar = nc.a.UNDECIDED;
            if (obj2 != aVar) {
                nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
                if (obj2 != aVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (f33540d.compareAndSet(this, aVar2, nc.a.RESUMED)) {
                    this.f33541c.resumeWith(obj);
                    return;
                }
            } else if (f33540d.compareAndSet(this, aVar, obj)) {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("SafeContinuation for ");
        sbA.append(this.f33541c);
        return sbA.toString();
    }
}
