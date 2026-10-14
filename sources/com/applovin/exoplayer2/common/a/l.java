package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient long[] f4888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Object[] f4889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Object[] f4890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient float f4891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f4892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient int[] f4893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f4894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f4895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Set<K> f4896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> f4897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @MonotonicNonNullDecl
    private transient Collection<V> f4898k;

    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = l.this.a(entry.getKey());
            return iA != -1 && Objects.equal(l.this.f4890c[iA], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return l.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iA = l.this.a(entry.getKey());
            if (iA == -1 || !Objects.equal(l.this.f4890c[iA], entry.getValue())) {
                return false;
            }
            l.this.j(iA);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.f4895h;
        }
    }

    public abstract class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4905d;

        private b() {
            this.f4903b = l.this.f4892e;
            this.f4904c = l.this.b();
            this.f4905d = -1;
        }

        private void a() {
            if (l.this.f4892e != this.f4903b) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T a(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4904c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f4904c;
            this.f4905d = i10;
            T tA = a(i10);
            this.f4904c = l.this.e(this.f4904c);
            return tA;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j.a(this.f4905d >= 0);
            this.f4903b++;
            l.this.j(this.f4905d);
            this.f4904c = l.this.a(this.f4904c, this.f4905d);
            this.f4905d = -1;
        }
    }

    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return l.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iA = l.this.a(obj);
            if (iA == -1) {
                return false;
            }
            l.this.j(iA);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l.this.f4895h;
        }
    }

    public final class d extends com.applovin.exoplayer2.common.a.e<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NullableDecl
        private final K f4909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4910c;

        public d(int i10) {
            this.f4909b = (K) l.this.f4889b[i10];
            this.f4910c = i10;
        }

        private void a() {
            int i10 = this.f4910c;
            if (i10 == -1 || i10 >= l.this.size() || !Objects.equal(this.f4909b, l.this.f4889b[this.f4910c])) {
                this.f4910c = l.this.a(this.f4909b);
            }
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public K getKey() {
            return this.f4909b;
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public V getValue() {
            a();
            int i10 = this.f4910c;
            if (i10 == -1) {
                return null;
            }
            return (V) l.this.f4890c[i10];
        }

        @Override // com.applovin.exoplayer2.common.a.e, java.util.Map.Entry
        public V setValue(V v10) {
            a();
            int i10 = this.f4910c;
            if (i10 == -1) {
                l.this.put(this.f4909b, v10);
                return null;
            }
            Object[] objArr = l.this.f4890c;
            V v11 = (V) objArr[i10];
            objArr[i10] = v10;
            return v11;
        }
    }

    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return l.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return l.this.f4895h;
        }
    }

    public l() {
        a(3, 1.0f);
    }

    public l(int i10) {
        this(i10, 1.0f);
    }

    public l(int i10, float f10) {
        a(i10, f10);
    }

    private static int a(long j10) {
        return (int) (j10 >>> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(@NullableDecl Object obj) {
        int iA = p.a(obj);
        int iB = this.f4893f[i() & iA];
        while (iB != -1) {
            long j10 = this.f4888a[iB];
            if (a(j10) == iA && Objects.equal(obj, this.f4889b[iB])) {
                return iB;
            }
            iB = b(j10);
        }
        return -1;
    }

    private static long a(long j10, int i10) {
        return (j10 & (-4294967296L)) | (((long) i10) & 4294967295L);
    }

    public static <K, V> l<K, V> a() {
        return new l<>();
    }

    public static <K, V> l<K, V> a(int i10) {
        return new l<>(i10);
    }

    @NullableDecl
    private V a(@NullableDecl Object obj, int i10) {
        int i11 = i() & i10;
        int i12 = this.f4893f[i11];
        if (i12 == -1) {
            return null;
        }
        int i13 = -1;
        while (true) {
            if (a(this.f4888a[i12]) == i10 && Objects.equal(obj, this.f4889b[i12])) {
                V v10 = (V) this.f4890c[i12];
                if (i13 == -1) {
                    this.f4893f[i11] = b(this.f4888a[i12]);
                } else {
                    long[] jArr = this.f4888a;
                    jArr[i13] = a(jArr[i13], b(jArr[i12]));
                }
                d(i12);
                this.f4895h--;
                this.f4892e++;
                return v10;
            }
            int iB = b(this.f4888a[i12]);
            if (iB == -1) {
                return null;
            }
            i13 = i12;
            i12 = iB;
        }
    }

    private static int b(long j10) {
        return (int) j10;
    }

    private static int[] f(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] g(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private void h(int i10) {
        int length = this.f4888a.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                c(iMax);
            }
        }
    }

    private int i() {
        return this.f4893f.length - 1;
    }

    private void i(int i10) {
        if (this.f4893f.length >= 1073741824) {
            this.f4894g = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f4891d)) + 1;
        int[] iArrF = f(i10);
        long[] jArr = this.f4888a;
        int length = iArrF.length - 1;
        for (int i12 = 0; i12 < this.f4895h; i12++) {
            int iA = a(jArr[i12]);
            int i13 = iA & length;
            int i14 = iArrF[i13];
            iArrF[i13] = i12;
            jArr[i12] = (((long) iA) << 32) | (((long) i14) & 4294967295L);
        }
        this.f4894g = i11;
        this.f4893f = iArrF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V j(int i10) {
        return a(this.f4889b[i10], a(this.f4888a[i10]));
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    public void a(int i10, float f10) {
        Preconditions.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, "Illegal load factor");
        int iA = p.a(i10, f10);
        this.f4893f = f(iA);
        this.f4891d = f10;
        this.f4889b = new Object[i10];
        this.f4890c = new Object[i10];
        this.f4888a = g(i10);
        this.f4894g = Math.max(1, (int) (iA * f10));
    }

    public void a(int i10, @NullableDecl K k10, @NullableDecl V v10, int i11) {
        this.f4888a[i10] = (((long) i11) << 32) | 4294967295L;
        this.f4889b[i10] = k10;
        this.f4890c[i10] = v10;
    }

    public int b() {
        return isEmpty() ? -1 : 0;
    }

    public void b(int i10) {
    }

    public Set<K> c() {
        return new c();
    }

    public void c(int i10) {
        this.f4889b = Arrays.copyOf(this.f4889b, i10);
        this.f4890c = Arrays.copyOf(this.f4890c, i10);
        long[] jArr = this.f4888a;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f4888a = jArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f4892e++;
        Arrays.fill(this.f4889b, 0, this.f4895h, (Object) null);
        Arrays.fill(this.f4890c, 0, this.f4895h, (Object) null);
        Arrays.fill(this.f4893f, -1);
        Arrays.fill(this.f4888a, -1L);
        this.f4895h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i10 = 0; i10 < this.f4895h; i10++) {
            if (Objects.equal(obj, this.f4890c[i10])) {
                return true;
            }
        }
        return false;
    }

    public Iterator<K> d() {
        return new l<K, V>.b<K>() { // from class: com.applovin.exoplayer2.common.a.l.1
            @Override // com.applovin.exoplayer2.common.a.l.b
            public K a(int i10) {
                return (K) l.this.f4889b[i10];
            }
        };
    }

    public void d(int i10) {
        int size = size() - 1;
        if (i10 >= size) {
            this.f4889b[i10] = null;
            this.f4890c[i10] = null;
            this.f4888a[i10] = -1;
            return;
        }
        Object[] objArr = this.f4889b;
        objArr[i10] = objArr[size];
        Object[] objArr2 = this.f4890c;
        objArr2[i10] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        long[] jArr = this.f4888a;
        long j10 = jArr[size];
        jArr[i10] = j10;
        jArr[size] = -1;
        int iA = a(j10) & i();
        int[] iArr = this.f4893f;
        int i11 = iArr[iA];
        if (i11 == size) {
            iArr[iA] = i10;
            return;
        }
        while (true) {
            long j11 = this.f4888a[i11];
            int iB = b(j11);
            if (iB == size) {
                this.f4888a[i11] = a(j11, i10);
                return;
            }
            i11 = iB;
        }
    }

    public int e(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f4895h) {
            return i11;
        }
        return -1;
    }

    public Set<Map.Entry<K, V>> e() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f4897j;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setE = e();
        this.f4897j = setE;
        return setE;
    }

    public Iterator<Map.Entry<K, V>> f() {
        return new l<K, V>.b<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.l.2
            @Override // com.applovin.exoplayer2.common.a.l.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(int i10) {
                return new d(i10);
            }
        };
    }

    public Collection<V> g() {
        return new e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iA = a(obj);
        b(iA);
        if (iA == -1) {
            return null;
        }
        return (V) this.f4890c[iA];
    }

    public Iterator<V> h() {
        return new l<K, V>.b<V>() { // from class: com.applovin.exoplayer2.common.a.l.3
            @Override // com.applovin.exoplayer2.common.a.l.b
            public V a(int i10) {
                return (V) l.this.f4890c[i10];
            }
        };
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f4895h == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f4896i;
        if (set != null) {
            return set;
        }
        Set<K> setC = c();
        this.f4896i = setC;
        return setC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V put(@NullableDecl K k10, @NullableDecl V v10) {
        long[] jArr = this.f4888a;
        Object[] objArr = this.f4889b;
        Object[] objArr2 = this.f4890c;
        int iA = p.a(k10);
        int i10 = i() & iA;
        int i11 = this.f4895h;
        int[] iArr = this.f4893f;
        int i12 = iArr[i10];
        if (i12 == -1) {
            iArr[i10] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (a(j10) == iA && Objects.equal(k10, objArr[i12])) {
                    V v11 = (V) objArr2[i12];
                    objArr2[i12] = v10;
                    b(i12);
                    return v11;
                }
                int iB = b(j10);
                if (iB == -1) {
                    jArr[i12] = a(j10, i11);
                    break;
                }
                i12 = iB;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i13 = i11 + 1;
        h(i13);
        a(i11, k10, v10, iA);
        this.f4895h = i13;
        if (i11 >= this.f4894g) {
            i(this.f4893f.length * 2);
        }
        this.f4892e++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return a(obj, p.a(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4895h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f4898k;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionG = g();
        this.f4898k = collectionG;
        return collectionG;
    }
}
