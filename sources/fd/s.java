package fd;

/* JADX INFO: loaded from: classes3.dex */
public final class s<T> extends o1 implements r<T> {
    public s(j1 j1Var) {
        super(true);
        h0(j1Var);
    }

    @Override // fd.r
    public boolean O(T t10) throws Throwable {
        Object objU0;
        do {
            objU0 = u0(e0(), t10);
            if (objU0 == p1.f29608a) {
                return false;
            }
            if (objU0 == p1.f29609b) {
                break;
            }
        } while (objU0 == p1.f29610c);
        return true;
    }

    @Override // fd.m0
    public Object T(mc.d<? super T> dVar) throws Throwable {
        Object objF = F(dVar);
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        return objF;
    }

    @Override // fd.m0
    public T e() {
        return (T) W();
    }
}
