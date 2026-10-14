package k7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f31929a;

    public m(r rVar) {
        Objects.requireNonNull(rVar, "Parser should not be null");
        this.f31929a = rVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.util.HashSet] */
    public <T> T a(String str, c cVar) throws Exception {
        Class cls = cVar.f31913b;
        Class cls2 = cVar.f31914c;
        switch (cVar.f31912a) {
            case '0':
                return (T) ((f) this.f31929a).a(str, cls);
            case '1':
                if (cls == null) {
                    return (T) new ArrayList();
                }
                ?? r10 = (T) ((List) ((f) this.f31929a).a(str, new j(this).type));
                int size = r10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    f fVar = (f) this.f31929a;
                    r10.set(i10, fVar.a(fVar.b(r10.get(i10)), cls));
                }
                return r10;
            case '2':
                ?? r11 = (T) new HashMap();
                if (cls != null && cls2 != null) {
                    for (Map.Entry entry : ((Map) ((f) this.f31929a).a(str, new l(this).type)).entrySet()) {
                        r11.put(((f) this.f31929a).a(((f) this.f31929a).b(entry.getKey()), cls), ((f) this.f31929a).a(((f) this.f31929a).b(entry.getValue()), cls2));
                    }
                }
                return r11;
            case '3':
                ?? r12 = (T) new HashSet();
                if (cls != null) {
                    Iterator it = ((Set) ((f) this.f31929a).a(str, new k(this).type)).iterator();
                    while (it.hasNext()) {
                        r12.add(((f) this.f31929a).a(((f) this.f31929a).b(it.next()), cls));
                    }
                }
                return r12;
            default:
                return null;
        }
    }
}
