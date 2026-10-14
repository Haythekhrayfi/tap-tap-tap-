package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c<K, V> f32076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c<K, V> f32077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f32078e = new WeakHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32079f = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f32083f;
        }

        @Override // l.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f32082e;
        }
    }

    /* JADX INFO: renamed from: l.b$b, reason: collision with other inner class name */
    public static class C0332b<K, V> extends e<K, V> {
        public C0332b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f32082e;
        }

        @Override // l.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f32083f;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final K f32080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f32081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c<K, V> f32082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c<K, V> f32083f;

        public c(K k10, V v10) {
            this.f32080c = k10;
            this.f32081d = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f32080c.equals(cVar.f32080c) && this.f32081d.equals(cVar.f32081d);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f32080c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f32081d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f32080c.hashCode() ^ this.f32081d.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f32080c + "=" + this.f32081d;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f32084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f32085d = true;

        public d() {
        }

        @Override // l.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f32084c;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f32083f;
                this.f32084c = cVar3;
                this.f32085d = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f32085d) {
                return b.this.f32076c != null;
            }
            c<K, V> cVar = this.f32084c;
            return (cVar == null || cVar.f32082e == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f32085d) {
                this.f32085d = false;
                cVar = b.this.f32076c;
            } else {
                c<K, V> cVar2 = this.f32084c;
                cVar = cVar2 != null ? cVar2.f32082e : null;
            }
            this.f32084c = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f32087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f32088d;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f32087c = cVar2;
            this.f32088d = cVar;
        }

        @Override // l.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f32087c == cVar && cVar == this.f32088d) {
                this.f32088d = null;
                this.f32087c = null;
            }
            c<K, V> cVar2 = this.f32087c;
            if (cVar2 == cVar) {
                this.f32087c = b(cVar2);
            }
            c<K, V> cVar3 = this.f32088d;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f32087c;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f32088d = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32088d != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f32088d;
            c<K, V> cVar2 = this.f32087c;
            this.f32088d = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k10) {
        c<K, V> cVar = this.f32076c;
        while (cVar != null && !cVar.f32080c.equals(k10)) {
            cVar = cVar.f32082e;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f32078e.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> e(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f32079f++;
        c<K, V> cVar2 = this.f32077d;
        if (cVar2 == null) {
            this.f32076c = cVar;
        } else {
            cVar2.f32082e = cVar;
            cVar.f32083f = cVar2;
        }
        this.f32077d = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f32079f != bVar.f32079f) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public V f(K k10, V v10) {
        c<K, V> cVarA = a(k10);
        if (cVarA != null) {
            return cVarA.f32081d;
        }
        e(k10, v10);
        return null;
    }

    public V g(K k10) {
        c<K, V> cVarA = a(k10);
        if (cVarA == null) {
            return null;
        }
        this.f32079f--;
        if (!this.f32078e.isEmpty()) {
            Iterator<f<K, V>> it = this.f32078e.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.f32083f;
        c<K, V> cVar2 = cVarA.f32082e;
        if (cVar != null) {
            cVar.f32082e = cVar2;
        } else {
            this.f32076c = cVar2;
        }
        c<K, V> cVar3 = cVarA.f32082e;
        if (cVar3 != null) {
            cVar3.f32083f = cVar;
        } else {
            this.f32077d = cVar;
        }
        cVarA.f32082e = null;
        cVarA.f32083f = null;
        return cVarA.f32081d;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f32076c, this.f32077d);
        this.f32078e.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sbA.append("]");
                return sbA.toString();
            }
            sbA.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sbA.append(", ");
            }
        }
    }
}
