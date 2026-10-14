package fd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n1 extends x implements t0, e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o1 f29596f;

    @Override // fd.e1
    public boolean a() {
        return true;
    }

    @Override // fd.t0
    public void dispose() {
        Object objE0;
        o1 o1VarX = x();
        do {
            objE0 = o1VarX.e0();
            if (!(objE0 instanceof n1)) {
                if (!(objE0 instanceof e1) || ((e1) objE0).f() == null) {
                    return;
                }
                t();
                return;
            }
            if (objE0 != this) {
                return;
            }
        } while (!o1.f29597c.compareAndSet(o1VarX, objE0, p1.f29614g));
    }

    @Override // fd.e1
    public t1 f() {
        return null;
    }

    @Override // kd.k
    public String toString() {
        return getClass().getSimpleName() + '@' + j0.n(this) + "[job@" + j0.n(x()) + ']';
    }

    public final o1 x() {
        o1 o1Var = this.f29596f;
        if (o1Var != null) {
            return o1Var;
        }
        j0.r("job");
        throw null;
    }
}
