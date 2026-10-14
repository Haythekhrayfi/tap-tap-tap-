package kc;

import fd.j0;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class m extends l {
    public static final <T> int j(Iterable<? extends T> iterable, int i10) {
        j0.i(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
