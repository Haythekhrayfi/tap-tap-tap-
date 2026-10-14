package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class al<K, V> extends u<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u<Object, Object> f4802b = new al(null, new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f4803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int[] f4804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f4805e;

    public static class a<K, V> extends w<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient u<K, V> f4806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient Object[] f4807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient int f4808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f4809d;

        public a(u<K, V> uVar, Object[] objArr, int i10, int i11) {
            this.f4806a = uVar;
            this.f4807b = objArr;
            this.f4808c = i10;
            this.f4809d = i11;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int a(Object[] objArr, int i10) {
            return e().a(objArr, i10);
        }

        @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public ax<Map.Entry<K, V>> iterator() {
            return e().iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f4806a.get(key));
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.a.w
        public s<Map.Entry<K, V>> i() {
            return new s<Map.Entry<K, V>>() { // from class: com.applovin.exoplayer2.common.a.al.a.1
                @Override // java.util.List
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> get(int i10) {
                    Preconditions.checkElementIndex(i10, a.this.f4809d);
                    int i11 = i10 * 2;
                    return new AbstractMap.SimpleImmutableEntry(a.this.f4807b[a.this.f4808c + i11], a.this.f4807b[i11 + (a.this.f4808c ^ 1)]);
                }

                @Override // com.applovin.exoplayer2.common.a.q
                public boolean f() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return a.this.f4809d;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4809d;
        }
    }

    public static final class b<K> extends w<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient u<K, ?> f4811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient s<K> f4812b;

        public b(u<K, ?> uVar, s<K> sVar) {
            this.f4811a = uVar;
            this.f4812b = sVar;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public int a(Object[] objArr, int i10) {
            return e().a(objArr, i10);
        }

        @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a */
        public ax<K> iterator() {
            return e().iterator();
        }

        @Override // com.applovin.exoplayer2.common.a.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f4811a.get(obj) != null;
        }

        @Override // com.applovin.exoplayer2.common.a.w, com.applovin.exoplayer2.common.a.q
        public s<K> e() {
            return this.f4812b;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4811a.size();
        }
    }

    public static final class c extends s<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient Object[] f4813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient int f4814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient int f4815c;

        public c(Object[] objArr, int i10, int i11) {
            this.f4813a = objArr;
            this.f4814b = i10;
            this.f4815c = i11;
        }

        @Override // com.applovin.exoplayer2.common.a.q
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            Preconditions.checkElementIndex(i10, this.f4815c);
            return this.f4813a[(i10 * 2) + this.f4814b];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4815c;
        }
    }

    private al(int[] iArr, Object[] objArr, int i10) {
        this.f4804d = iArr;
        this.f4803c = objArr;
        this.f4805e = i10;
    }

    public static <K, V> al<K, V> a(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (al) f4802b;
        }
        if (i10 == 1) {
            j.a(objArr[0], objArr[1]);
            return new al<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i10, objArr.length >> 1);
        return new al<>(a(objArr, i10, w.a(i10), 0), objArr, i10);
    }

    public static Object a(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i10, int i11, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj)) {
                return objArr[i11 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iA = p.a(obj.hashCode());
        while (true) {
            int i12 = iA & length;
            int i13 = iArr[i12];
            if (i13 == -1) {
                return null;
            }
            if (objArr[i13].equals(obj)) {
                return objArr[i13 ^ 1];
            }
            iA = i12 + 1;
        }
    }

    public static int[] a(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        if (i10 == 1) {
            j.a(objArr[i12], objArr[i12 ^ 1]);
            return null;
        }
        int i14 = i11 - 1;
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = i15 * 2;
            int i17 = i16 + i12;
            Object obj = objArr[i17];
            Object obj2 = objArr[i16 + (i12 ^ 1)];
            j.a(obj, obj2);
            int iA = p.a(obj.hashCode());
            while (true) {
                i13 = iA & i14;
                int i18 = iArr[i13];
                if (i18 == -1) {
                    break;
                }
                if (objArr[i18].equals(obj)) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i18] + "=" + objArr[i18 ^ 1]);
                }
                iA = i13 + 1;
            }
            iArr[i13] = i17;
        }
        return iArr;
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public w<Map.Entry<K, V>> d() {
        return new a(this, this.f4803c, 0, this.f4805e);
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public w<K> f() {
        return new b(this, new c(this.f4803c, 0, this.f4805e));
    }

    @Override // com.applovin.exoplayer2.common.a.u, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) a(this.f4804d, this.f4803c, this.f4805e, 0, obj);
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public q<V> h() {
        return new c(this.f4803c, 1, this.f4805e);
    }

    @Override // com.applovin.exoplayer2.common.a.u
    public boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f4805e;
    }
}
