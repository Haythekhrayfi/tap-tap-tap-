package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.j2objc.annotations.RetainedWith;
import com.yandex.mobile.ads.impl.u60;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class r<E> extends n<E> implements Set<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    private transient p<E> f18387b;

    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f18388a;

        public a(Object[] objArr) {
            this.f18388a = objArr;
        }

        public Object readResolve() {
            return r.a(this.f18388a);
        }
    }

    public static int a(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static r a(String str, String str2) {
        return b(2, str, str2);
    }

    public static r a(String str, String str2, String str3) {
        return b(3, str, str2, str3);
    }

    public static r a(Set set) {
        if ((set instanceof r) && !(set instanceof SortedSet)) {
            r rVar = (r) set;
            if (!rVar.f()) {
                return rVar;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }

    public static <E> r<E> a(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? b(eArr.length, (Object[]) eArr.clone()) : new n0(eArr[0]);
        }
        return h0.f18350i;
    }

    private static <E> r<E> b(int i10, Object... objArr) {
        if (i10 == 0) {
            return h0.f18350i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new n0(obj);
        }
        int iA = a(i10);
        Object[] objArr2 = new Object[iA];
        int i11 = iA - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(u60.a("at index ", i14));
            }
            int iHashCode = obj2.hashCode();
            int iA2 = m.a(iHashCode);
            while (true) {
                int i15 = iA2 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA2++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new n0(obj4);
        }
        if (a(i13) < iA / 2) {
            return b(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new h0(objArr, i12, objArr2, i11, i13);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public p<E> b() {
        p<E> pVar = this.f18387b;
        if (pVar != null) {
            return pVar;
        }
        p<E> pVarH = h();
        this.f18387b = pVarH;
        return pVarH;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && (this instanceof h0)) {
            r rVar = (r) obj;
            Objects.requireNonNull(rVar);
            if ((rVar instanceof h0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return m0.a(this, obj);
    }

    public p<E> h() {
        Object[] array = toArray();
        int i10 = p.f18374c;
        return p.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return m0.a(this);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.n
    public Object writeReplace() {
        return new a(toArray());
    }
}
