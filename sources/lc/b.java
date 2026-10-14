package lc;

import fd.j0;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f33069c = new b();

    @Override // java.util.Comparator
    public int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        j0.i(comparable3, "a");
        j0.i(comparable4, "b");
        return comparable3.compareTo(comparable4);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return c.f33070c;
    }
}
