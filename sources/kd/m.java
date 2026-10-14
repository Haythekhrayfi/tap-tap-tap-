package kd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class m<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32054a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public m(boolean z10) {
        this._cur = new n(8, z10);
    }

    public final boolean a(E e10) {
        while (true) {
            n nVar = (n) this._cur;
            int iA = nVar.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                f32054a.compareAndSet(this, nVar, nVar.e());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            n nVar = (n) this._cur;
            if (nVar.b()) {
                return;
            } else {
                f32054a.compareAndSet(this, nVar, nVar.e());
            }
        }
    }

    public final int c() {
        return ((n) this._cur).c();
    }

    public final E d() {
        while (true) {
            n nVar = (n) this._cur;
            E e10 = (E) nVar.f();
            if (e10 != n.f32058h) {
                return e10;
            }
            f32054a.compareAndSet(this, nVar, nVar.e());
        }
    }
}
