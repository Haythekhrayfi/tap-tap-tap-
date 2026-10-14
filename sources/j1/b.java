package j1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends g {
    public b(androidx.room.g gVar) {
        super(gVar);
    }

    public abstract void d(n1.g gVar, T t10);

    public final void e(T t10) {
        n1.g gVarA = a();
        try {
            d(gVarA, t10);
            ((o1.f) gVarA).f33886d.executeInsert();
        } finally {
            c(gVarA);
        }
    }
}
