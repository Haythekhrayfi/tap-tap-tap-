package dd;

import fd.j0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o extends vc.k implements uc.l<Iterable<Object>, Iterator<Object>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f28952c = new o();

    public o() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // uc.l
    public Iterator<Object> invoke(Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        j0.i(iterable2, "p0");
        return iterable2.iterator();
    }
}
