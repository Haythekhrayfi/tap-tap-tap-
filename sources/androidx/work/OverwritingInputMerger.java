package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends x1.g {
    @Override // x1.g
    public c a(List<c> list) {
        c.a aVar = new c.a();
        HashMap map = new HashMap();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(it.next().f3119a));
        }
        aVar.c(map);
        return aVar.a();
    }
}
