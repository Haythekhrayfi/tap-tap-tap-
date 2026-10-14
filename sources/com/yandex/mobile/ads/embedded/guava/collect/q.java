package com.yandex.mobile.ads.embedded.guava.collect;

import ch.qos.logback.core.util.FileSize;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class q<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    private transient r<Map.Entry<K, V>> f18380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    private transient r<K> f18381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    private transient n<V> f18382c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f18383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18384b;

        public a() {
            this(4);
        }

        public a(int i10) {
            this.f18383a = new Object[i10 * 2];
            this.f18384b = 0;
        }

        public final a<K, V> a(K k10, V v10) {
            int i10 = (this.f18384b + 1) * 2;
            Object[] objArr = this.f18383a;
            if (i10 > objArr.length) {
                int length = objArr.length;
                if (i10 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int iHighestOneBit = length + (length >> 1) + 1;
                if (iHighestOneBit < i10) {
                    iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
                }
                if (iHighestOneBit < 0) {
                    iHighestOneBit = Integer.MAX_VALUE;
                }
                this.f18383a = Arrays.copyOf(objArr, iHighestOneBit);
            }
            if (k10 == null) {
                throw new NullPointerException("null key in entry: null=" + v10);
            }
            if (v10 == null) {
                throw new NullPointerException("null value in entry: " + k10 + "=null");
            }
            Object[] objArr2 = this.f18383a;
            int i11 = this.f18384b;
            int i12 = i11 * 2;
            objArr2[i12] = k10;
            objArr2[i12 + 1] = v10;
            this.f18384b = i11 + 1;
            return this;
        }

        public final q<K, V> a() {
            return g0.a(this.f18384b, this.f18383a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Set set) {
            if (set instanceof Collection) {
                int size = (set.size() + this.f18384b) * 2;
                Object[] objArr = this.f18383a;
                if (size > objArr.length) {
                    int length = objArr.length;
                    if (size < 0) {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                    int iHighestOneBit = length + (length >> 1) + 1;
                    if (iHighestOneBit < size) {
                        iHighestOneBit = Integer.highestOneBit(size - 1) << 1;
                    }
                    if (iHighestOneBit < 0) {
                        iHighestOneBit = Integer.MAX_VALUE;
                    }
                    this.f18383a = Arrays.copyOf(objArr, iHighestOneBit);
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    public static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f18385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f18386b;

        public b(q<K, V> qVar) {
            Object[] objArr = new Object[qVar.size()];
            Object[] objArr2 = new Object[qVar.size()];
            p0<Map.Entry<K, V>> it = qVar.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f18385a = objArr;
            this.f18386b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f18385a;
            if (!(objArr instanceof r)) {
                Object[] objArr2 = this.f18386b;
                a aVar = new a(objArr.length);
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    aVar.a(objArr[i10], objArr2[i10]);
                }
                return aVar.a();
            }
            r rVar = (r) objArr;
            n nVar = (n) this.f18386b;
            a aVar2 = new a(rVar.size());
            Iterator it = rVar.iterator();
            p0 it2 = nVar.iterator();
            while (it.hasNext()) {
                aVar2.a(it.next(), it2.next());
            }
            return aVar2.a();
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q a(HashMap map) {
        if ((map instanceof q) && !(map instanceof SortedMap)) {
            q qVar = (q) map;
            qVar.f();
            return qVar;
        }
        Set setEntrySet = map.entrySet();
        a aVar = new a(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        aVar.a(setEntrySet);
        return aVar.a();
    }

    public static <K, V> q<K, V> h() {
        return (q<K, V>) g0.f18335g;
    }

    public abstract r<Map.Entry<K, V>> b();

    public abstract r<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract n<V> d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final r<Map.Entry<K, V>> entrySet() {
        r<Map.Entry<K, V>> rVar = this.f18380a;
        if (rVar != null) {
            return rVar;
        }
        r<Map.Entry<K, V>> rVarB = b();
        this.f18380a = rVarB;
        return rVarB;
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((r) entrySet()).equals(((Map) obj).entrySet());
    }

    public abstract void f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final r<K> keySet() {
        r<K> rVar = this.f18381b;
        if (rVar != null) {
            return rVar;
        }
        r<K> rVarC = c();
        this.f18381b = rVarC;
        return rVarC;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return m0.a(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final n<V> values() {
        n<V> nVar = this.f18382c;
        if (nVar != null) {
            return nVar;
        }
        n<V> nVarD = d();
        this.f18382c = nVarD;
        return nVarD;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        h.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, FileSize.GB_COEFFICIENT));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object writeReplace() {
        return new b(this);
    }
}
