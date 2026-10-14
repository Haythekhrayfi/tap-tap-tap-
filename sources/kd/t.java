package kd;

/* JADX INFO: loaded from: classes3.dex */
public final class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> f0 a(uc.l<? super E, jc.w> lVar, E e10, f0 f0Var) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (f0Var == null || f0Var.getCause() == th) {
                return new f0("Exception in undelivered element handler for " + e10, th);
            }
            jc.a.a(f0Var, th);
        }
        return f0Var;
    }
}
