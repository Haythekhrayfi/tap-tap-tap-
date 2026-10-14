package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class r<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator<Comparable> f12868j = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Comparator<? super K> f12869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<K, V> f12870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e<K, V> f12873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r<K, V>.b f12874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r<K, V>.c f12875i;

    public static class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends r<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarB;
            if (!(obj instanceof Map.Entry) || (eVarB = r.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            r.this.e(eVarB, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r.this.f12871e;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends r<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f12887h;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return r.this.c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            r rVar = r.this;
            e<K, V> eVarC = rVar.c(obj);
            if (eVarC != null) {
                rVar.e(eVarC, true);
            }
            return eVarC != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r.this.f12871e;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f12878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f12879d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12880e;

        public d() {
            this.f12878c = r.this.f12873g.f12885f;
            this.f12880e = r.this.f12872f;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f12878c;
            r rVar = r.this;
            if (eVar == rVar.f12873g) {
                throw new NoSuchElementException();
            }
            if (rVar.f12872f != this.f12880e) {
                throw new ConcurrentModificationException();
            }
            this.f12878c = eVar.f12885f;
            this.f12879d = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f12878c != r.this.f12873g;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f12879d;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            r.this.e(eVar, true);
            this.f12879d = null;
            this.f12880e = r.this.f12872f;
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f12882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f12883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e<K, V> f12884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e<K, V> f12885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e<K, V> f12886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final K f12887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public V f12888i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f12889j;

        public e() {
            this.f12887h = null;
            this.f12886g = this;
            this.f12885f = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f12882c = eVar;
            this.f12887h = k10;
            this.f12889j = 1;
            this.f12885f = eVar2;
            this.f12886g = eVar3;
            eVar3.f12885f = this;
            eVar2.f12886g = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f12887h;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f12888i;
            Object value = entry.getValue();
            if (v10 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v10.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f12887h;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12888i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f12887h;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f12888i;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f12888i;
            this.f12888i = v10;
            return v11;
        }

        public String toString() {
            return this.f12887h + "=" + this.f12888i;
        }
    }

    public r() {
        this(f12868j);
    }

    public r(Comparator<? super K> comparator) {
        this.f12871e = 0;
        this.f12872f = 0;
        this.f12873g = new e<>();
        this.f12869c = comparator == null ? f12868j : comparator;
    }

    public e<K, V> a(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f12869c;
        e<K, V> eVar2 = this.f12870d;
        if (eVar2 != null) {
            Comparable comparable = comparator == f12868j ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f12887h;
                iCompareTo = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f12883d : eVar2.f12884e;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f12873g;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f12886g);
            if (iCompareTo < 0) {
                eVar2.f12883d = eVar;
            } else {
                eVar2.f12884e = eVar;
            }
            d(eVar2, true);
        } else {
            if (comparator == f12868j && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f12886g);
            this.f12870d = eVar;
        }
        this.f12871e++;
        this.f12872f++;
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public e<K, V> b(Map.Entry<?, ?> entry) {
        boolean z10;
        e<K, V> eVarC = c(entry.getKey());
        if (eVarC != null) {
            V v10 = eVarC.f12888i;
            Object value = entry.getValue();
            z10 = v10 == value || (v10 != null && v10.equals(value));
        }
        if (z10) {
            return eVarC;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f12870d = null;
        this.f12871e = 0;
        this.f12872f++;
        e<K, V> eVar = this.f12873g;
        eVar.f12886g = eVar;
        eVar.f12885f = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f12883d;
            e<K, V> eVar3 = eVar.f12884e;
            int i10 = eVar2 != null ? eVar2.f12889j : 0;
            int i11 = eVar3 != null ? eVar3.f12889j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f12883d;
                e<K, V> eVar5 = eVar3.f12884e;
                int i13 = (eVar4 != null ? eVar4.f12889j : 0) - (eVar5 != null ? eVar5.f12889j : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    h(eVar3);
                }
                g(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f12883d;
                e<K, V> eVar7 = eVar2.f12884e;
                int i14 = (eVar6 != null ? eVar6.f12889j : 0) - (eVar7 != null ? eVar7.f12889j : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    g(eVar2);
                }
                h(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f12889j = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f12889j = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f12882c;
        }
    }

    public void e(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i10;
        if (z10) {
            e<K, V> eVar4 = eVar.f12886g;
            eVar4.f12885f = eVar.f12885f;
            eVar.f12885f.f12886g = eVar4;
        }
        e<K, V> eVar5 = eVar.f12883d;
        e<K, V> eVar6 = eVar.f12884e;
        e<K, V> eVar7 = eVar.f12882c;
        int i11 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.f12883d = null;
            } else if (eVar6 != null) {
                f(eVar, eVar6);
                eVar.f12884e = null;
            } else {
                f(eVar, null);
            }
            d(eVar7, false);
            this.f12871e--;
            this.f12872f++;
            return;
        }
        if (eVar5.f12889j > eVar6.f12889j) {
            do {
                eVar3 = eVar5;
                eVar5 = eVar5.f12884e;
            } while (eVar5 != null);
        } else {
            do {
                eVar2 = eVar6;
                eVar6 = eVar6.f12883d;
            } while (eVar6 != null);
            eVar3 = eVar2;
        }
        e(eVar3, false);
        e<K, V> eVar8 = eVar.f12883d;
        if (eVar8 != null) {
            i10 = eVar8.f12889j;
            eVar3.f12883d = eVar8;
            eVar8.f12882c = eVar3;
            eVar.f12883d = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar9 = eVar.f12884e;
        if (eVar9 != null) {
            i11 = eVar9.f12889j;
            eVar3.f12884e = eVar9;
            eVar9.f12882c = eVar3;
            eVar.f12884e = null;
        }
        eVar3.f12889j = Math.max(i10, i11) + 1;
        f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.b bVar = this.f12874h;
        if (bVar != null) {
            return bVar;
        }
        r<K, V>.b bVar2 = new b();
        this.f12874h = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f12882c;
        eVar.f12882c = null;
        if (eVar2 != null) {
            eVar2.f12882c = eVar3;
        }
        if (eVar3 == null) {
            this.f12870d = eVar2;
        } else if (eVar3.f12883d == eVar) {
            eVar3.f12883d = eVar2;
        } else {
            eVar3.f12884e = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f12883d;
        e<K, V> eVar3 = eVar.f12884e;
        e<K, V> eVar4 = eVar3.f12883d;
        e<K, V> eVar5 = eVar3.f12884e;
        eVar.f12884e = eVar4;
        if (eVar4 != null) {
            eVar4.f12882c = eVar;
        }
        f(eVar, eVar3);
        eVar3.f12883d = eVar;
        eVar.f12882c = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f12889j : 0, eVar4 != null ? eVar4.f12889j : 0) + 1;
        eVar.f12889j = iMax;
        eVar3.f12889j = Math.max(iMax, eVar5 != null ? eVar5.f12889j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarC = c(obj);
        if (eVarC != null) {
            return eVarC.f12888i;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f12883d;
        e<K, V> eVar3 = eVar.f12884e;
        e<K, V> eVar4 = eVar2.f12883d;
        e<K, V> eVar5 = eVar2.f12884e;
        eVar.f12883d = eVar5;
        if (eVar5 != null) {
            eVar5.f12882c = eVar;
        }
        f(eVar, eVar2);
        eVar2.f12884e = eVar;
        eVar.f12882c = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f12889j : 0, eVar5 != null ? eVar5.f12889j : 0) + 1;
        eVar.f12889j = iMax;
        eVar2.f12889j = Math.max(iMax, eVar4 != null ? eVar4.f12889j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        r<K, V>.c cVar = this.f12875i;
        if (cVar != null) {
            return cVar;
        }
        r<K, V>.c cVar2 = new c();
        this.f12875i = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e<K, V> eVarA = a(k10, true);
        V v11 = eVarA.f12888i;
        eVarA.f12888i = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarC = c(obj);
        if (eVarC != null) {
            e(eVarC, true);
        }
        if (eVarC != null) {
            return eVarC.f12888i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12871e;
    }
}
