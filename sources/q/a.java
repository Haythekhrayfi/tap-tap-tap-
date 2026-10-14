package q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import q.g.b;
import q.g.c;
import q.g.e;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g<K, V> f34695j;

    /* JADX INFO: renamed from: q.a$a, reason: collision with other inner class name */
    public class C0388a extends g<K, V> {
        public C0388a() {
        }

        @Override // q.g
        public void a() {
            a.this.clear();
        }

        @Override // q.g
        public Object b(int i10, int i11) {
            return a.this.f34736d[(i10 << 1) + i11];
        }

        @Override // q.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // q.g
        public int d() {
            return a.this.f34737e;
        }

        @Override // q.g
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // q.g
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // q.g
        public void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // q.g
        public void h(int i10) {
            a.this.j(i10);
        }

        @Override // q.g
        public V i(int i10, V v10) {
            return a.this.k(i10, v10);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(h hVar) {
        super(hVar);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> gVarM = m();
        if (gVarM.f34716a == null) {
            gVarM.f34716a = gVarM.new b();
        }
        return gVarM.f34716a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> gVarM = m();
        if (gVarM.f34717b == null) {
            gVarM.f34717b = gVarM.new c();
        }
        return gVarM.f34717b;
    }

    public final g<K, V> m() {
        if (this.f34695j == null) {
            this.f34695j = new C0388a();
        }
        return this.f34695j;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f34737e);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> gVarM = m();
        if (gVarM.f34718c == null) {
            gVarM.f34718c = gVarM.new e();
        }
        return gVarM.f34718c;
    }
}
