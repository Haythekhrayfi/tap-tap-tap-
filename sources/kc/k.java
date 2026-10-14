package kc;

import fd.j0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    public static final <T> List<T> a(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        j0.h(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
