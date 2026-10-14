package h3;

import ch.qos.logback.core.CoreConstants;
import h3.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g<K extends l, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f30556a = new a<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f30557b = new HashMap();

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f30558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<V> f30559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f30560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f30561d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f30561d = this;
            this.f30560c = this;
            this.f30558a = k10;
        }

        public V a() {
            List<V> list = this.f30559b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f30559b.remove(size - 1);
            }
            return null;
        }
    }

    public V a(K k10) {
        a<K, V> aVar = this.f30557b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f30557b.put(k10, aVar);
        } else {
            k10.a();
        }
        a<K, V> aVar2 = aVar.f30561d;
        aVar2.f30560c = aVar.f30560c;
        aVar.f30560c.f30561d = aVar2;
        a<K, V> aVar3 = this.f30556a;
        aVar.f30561d = aVar3;
        a<K, V> aVar4 = aVar3.f30560c;
        aVar.f30560c = aVar4;
        aVar4.f30561d = aVar;
        aVar.f30561d.f30560c = aVar;
        return aVar.a();
    }

    public void b(K k10, V v10) {
        a<K, V> aVar = this.f30557b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            a<K, V> aVar2 = aVar.f30561d;
            aVar2.f30560c = aVar.f30560c;
            aVar.f30560c.f30561d = aVar2;
            a<K, V> aVar3 = this.f30556a;
            aVar.f30561d = aVar3.f30561d;
            aVar.f30560c = aVar3;
            aVar3.f30561d = aVar;
            aVar.f30561d.f30560c = aVar;
            this.f30557b.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f30559b == null) {
            aVar.f30559b = new ArrayList();
        }
        aVar.f30559b.add(v10);
    }

    public V c() {
        a aVar = this.f30556a;
        while (true) {
            aVar = aVar.f30561d;
            if (aVar.equals(this.f30556a)) {
                return null;
            }
            V v10 = (V) aVar.a();
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar2 = aVar.f30561d;
            aVar2.f30560c = aVar.f30560c;
            aVar.f30560c.f30561d = aVar2;
            this.f30557b.remove(aVar.f30558a);
            ((l) aVar.f30558a).a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f30556a.f30560c; !aVar.equals(this.f30556a); aVar = aVar.f30560c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f30558a);
            sb2.append(CoreConstants.COLON_CHAR);
            List<V> list = aVar.f30559b;
            sb2.append(list != null ? list.size() : 0);
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
