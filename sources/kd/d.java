package kd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d<T> extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32027a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = c.f32025a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kd.u
    public d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kd.u
    public final Object b(Object obj) {
        Object objD = this._consensus;
        if (objD == c.f32025a) {
            objD = d(e(obj));
        }
        c(obj, objD);
        return objD;
    }

    public abstract void c(T t10, Object obj);

    public final Object d(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = c.f32025a;
        if (obj2 != obj3) {
            return obj2;
        }
        return f32027a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    public abstract Object e(T t10);
}
