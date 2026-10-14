package fd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 extends c0 {
    public abstract s1 e0();

    public final String f0() {
        s1 s1VarE0;
        c0 c0Var = s0.f29619a;
        s1 s1Var = kd.q.f32064a;
        if (this == s1Var) {
            return "Dispatchers.Main";
        }
        try {
            s1VarE0 = s1Var.e0();
        } catch (UnsupportedOperationException unused) {
            s1VarE0 = null;
        }
        if (this == s1VarE0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // fd.c0
    public String toString() {
        String strF0 = f0();
        if (strF0 != null) {
            return strF0;
        }
        return getClass().getSimpleName() + '@' + j0.n(this);
    }
}
