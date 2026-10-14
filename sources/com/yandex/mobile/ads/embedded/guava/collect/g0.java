package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class g0<K, V> extends q<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q<Object, Object> f18335g = new g0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private final transient Object f18336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f18337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f18338f;

    public static class a<K, V> extends r<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient q<K, V> f18339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f18340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f18341e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f18342f;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.embedded.guava.collect.g0$a$a, reason: collision with other inner class name */
        public class C0191a extends p<Map.Entry<K, V>> {
            public C0191a() {
            }

            @Override // com.yandex.mobile.ads.embedded.guava.collect.n
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i10) {
                fs0.a(i10, a.this.f18342f);
                int i11 = i10 * 2;
                Object obj = a.this.f18340d[a.this.f18341e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f18340d[i11 + (a.this.f18341e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f18342f;
            }
        }

        public a(q qVar, Object[] objArr, int i10) {
            this.f18339c = qVar;
            this.f18340d = objArr;
            this.f18342f = i10;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int a(int i10, Object[] objArr) {
            return b().a(i10, objArr);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f18339c.get(key));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public final p0<Map.Entry<K, V>> iterator() {
            return b().listIterator(0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r
        public final p<Map.Entry<K, V>> h() {
            return new C0191a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18342f;
        }
    }

    public static final class b<K> extends r<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient q<K, ?> f18344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient p<K> f18345d;

        public b(q<K, ?> qVar, p<K> pVar) {
            this.f18344c = qVar;
            this.f18345d = pVar;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final int a(int i10, Object[] objArr) {
            return this.f18345d.a(i10, objArr);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n
        public final p<K> b() {
            return this.f18345d;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return this.f18344c.get(obj) != null;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.r, com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public final p0<K> iterator() {
            return this.f18345d.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18344c.size();
        }
    }

    public static final class c extends p<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f18346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f18347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f18348f;

        public c(Object[] objArr, int i10, int i11) {
            this.f18346d = objArr;
            this.f18347e = i10;
            this.f18348f = i11;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.n
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            fs0.a(i10, this.f18348f);
            Object obj = this.f18346d[(i10 * 2) + this.f18347e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18348f;
        }
    }

    private g0(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.f18336d = obj;
        this.f18337e = objArr;
        this.f18338f = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    public static <K, V> g0<K, V> a(int i10, Object[] objArr) {
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            return (g0) f18335g;
        }
        ?? r10 = 0;
        if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new g0<>(null, objArr, 1);
        }
        fs0.b(i10, objArr.length >> 1);
        int iA = r.a(i10);
        if (i10 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
        } else {
            int i14 = iA - 1;
            if (iA <= 128) {
                bArr = new byte[iA];
                Arrays.fill(bArr, (byte) -1);
                for (int i15 = 0; i15 < i10; i15++) {
                    int i16 = (i15 * 2) + 0;
                    Object obj = objArr[i16];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i16 ^ 1];
                    Objects.requireNonNull(obj2);
                    int iA2 = m.a(obj.hashCode());
                    while (true) {
                        i13 = iA2 & i14;
                        int i17 = bArr[i13] & 255;
                        if (i17 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i17])) {
                            throw a(obj, obj2, objArr, i17);
                        }
                        iA2 = i13 + 1;
                    }
                    bArr[i13] = (byte) i16;
                }
            } else if (iA <= 32768) {
                bArr = new short[iA];
                Arrays.fill(bArr, (short) -1);
                for (int i18 = 0; i18 < i10; i18++) {
                    int i19 = (i18 * 2) + 0;
                    Object obj3 = objArr[i19];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr[i19 ^ 1];
                    Objects.requireNonNull(obj4);
                    int iA3 = m.a(obj3.hashCode());
                    while (true) {
                        i12 = iA3 & i14;
                        int i20 = bArr[i12] & 65535;
                        if (i20 == 65535) {
                            break;
                        }
                        if (obj3.equals(objArr[i20])) {
                            throw a(obj3, obj4, objArr, i20);
                        }
                        iA3 = i12 + 1;
                    }
                    bArr[i12] = (short) i19;
                }
            } else {
                bArr = new int[iA];
                Arrays.fill((int[]) bArr, -1);
                for (int i21 = 0; i21 < i10; i21++) {
                    int i22 = (i21 * 2) + 0;
                    Object obj5 = objArr[i22];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArr[i22 ^ 1];
                    Objects.requireNonNull(obj6);
                    int iA4 = m.a(obj5.hashCode());
                    while (true) {
                        i11 = iA4 & i14;
                        ?? r11 = bArr[i11];
                        if (r11 == -1) {
                            break;
                        }
                        if (obj5.equals(objArr[r11])) {
                            throw a(obj5, obj6, objArr, r11);
                        }
                        iA4 = i11 + 1;
                    }
                    bArr[i11] = i22;
                }
            }
            r10 = bArr;
        }
        return new g0<>(r10, objArr, i10);
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i10) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i10] + "=" + objArr[i10 ^ 1]);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final r<Map.Entry<K, V>> b() {
        return new a(this, this.f18337e, this.f18338f);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final r<K> c() {
        return new b(this, new c(this.f18337e, 0, this.f18338f));
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final n<V> d() {
        return new c(this.f18337e, 1, this.f18338f);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.q
    public final void f() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d A[EDGE_INSN: B:43:0x008d->B:35:0x008d BREAK  A[LOOP:0: B:15:0x0036->B:21:0x004c], EDGE_INSN: B:45:0x008d->B:35:0x008d BREAK  A[LOOP:1: B:25:0x0061->B:31:0x0078], EDGE_INSN: B:47:0x008d->B:35:0x008d BREAK  A[LOOP:2: B:33:0x0087->B:42:0x009f]] */
    @Override // com.yandex.mobile.ads.embedded.guava.collect.q, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v10;
        Object obj2 = this.f18336d;
        Object[] objArr = this.f18337e;
        int i10 = this.f18338f;
        if (obj == null) {
            v10 = null;
        } else if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                v10 = (V) objArr[1];
                Objects.requireNonNull(v10);
            } else {
                v10 = null;
            }
        } else if (obj2 == null) {
            v10 = null;
        } else if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iA = m.a(obj.hashCode());
            while (true) {
                int i11 = iA & length;
                int i12 = bArr[i11] & 255;
                if (i12 == 255) {
                    break;
                }
                if (obj.equals(objArr[i12])) {
                    v10 = (V) objArr[i12 ^ 1];
                } else {
                    iA = i11 + 1;
                }
            }
            v10 = null;
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iA2 = m.a(obj.hashCode());
            while (true) {
                int i13 = iA2 & length2;
                int i14 = sArr[i13] & 65535;
                if (i14 == 65535) {
                    break;
                }
                if (obj.equals(objArr[i14])) {
                    v10 = (V) objArr[i14 ^ 1];
                } else {
                    iA2 = i13 + 1;
                }
            }
            v10 = null;
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iA3 = m.a(obj.hashCode());
            while (true) {
                int i15 = iA3 & length3;
                int i16 = iArr[i15];
                if (i16 == -1) {
                    break;
                }
                if (obj.equals(objArr[i16])) {
                    v10 = (V) objArr[i16 ^ 1];
                } else {
                    iA3 = i15 + 1;
                }
            }
            v10 = null;
        }
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18338f;
    }
}
