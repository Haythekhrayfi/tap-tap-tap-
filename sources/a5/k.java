package a5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a5.c<?> f110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<b> f111b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<b> f112c = new HashSet();

        public b(a5.c<?> cVar) {
            this.f110a = cVar;
        }

        public boolean a() {
            return this.f112c.isEmpty();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f114b;

        public c(Class cls, boolean z10, a aVar) {
            this.f113a = cls;
            this.f114b = z10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f113a.equals(this.f113a) && cVar.f114b == this.f114b;
        }

        public int hashCode() {
            return ((this.f113a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f114b).hashCode();
        }
    }

    public static void a(List<a5.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<a5.c<?>> it = list.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (l lVar : bVar.f110a.f81c) {
                            if ((lVar.f117c == 0) && (set = (Set) map.get(new c(lVar.f115a, lVar.a(), null))) != null) {
                                for (b bVar2 : set) {
                                    bVar.f111b.add(bVar2);
                                    bVar2.f112c.add(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet<b> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (b bVar3 : hashSet) {
                    if (bVar3.a()) {
                        hashSet2.add(bVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b bVar4 = (b) hashSet2.iterator().next();
                    hashSet2.remove(bVar4);
                    i10++;
                    for (b bVar5 : bVar4.f111b) {
                        bVar5.f112c.remove(bVar4);
                        if (bVar5.a()) {
                            hashSet2.add(bVar5);
                        }
                    }
                }
                if (i10 == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (b bVar6 : hashSet) {
                    if (!bVar6.a() && !bVar6.f111b.isEmpty()) {
                        arrayList.add(bVar6.f110a);
                    }
                }
                throw new m(arrayList);
            }
            a5.c<?> next = it.next();
            b bVar7 = new b(next);
            for (Class<? super Object> cls : next.f80b) {
                boolean z10 = !next.c();
                c cVar = new c(cls, z10, null);
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !z10) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar7);
            }
        }
    }
}
