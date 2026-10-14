package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h70 extends i70 {

    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f21325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21327c;

        public a(int i10, int i11, int[] iArr) {
            this.f21325a = iArr;
            this.f21326b = i10;
            this.f21327c = i11;
        }

        public final int[] b() {
            return Arrays.copyOfRange(this.f21325a, this.f21326b, this.f21327c);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f21325a;
                int iIntValue = ((Integer) obj).intValue();
                int i10 = this.f21326b;
                int i11 = this.f21327c;
                while (i10 < i11) {
                    if (iArr[i10] != iIntValue) {
                        i10++;
                    } else if (i10 != -1) {
                        return true;
                    }
                }
                i10 = -1;
                if (i10 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f21325a[this.f21326b + i10] != aVar.f21325a[aVar.f21326b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            fs0.a(i10, size());
            return Integer.valueOf(this.f21325a[this.f21326b + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i10 = 1;
            for (int i11 = this.f21326b; i11 < this.f21327c; i11++) {
                i10 = (i10 * 31) + this.f21325a[i11];
            }
            return i10;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001e  */
        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f21325a;
                int iIntValue = ((Integer) obj).intValue();
                int i10 = this.f21326b;
                int i11 = this.f21327c;
                while (i10 < i11) {
                    if (iArr[i10] != iIntValue) {
                        i10++;
                    } else if (i10 >= 0) {
                        return i10 - this.f21326b;
                    }
                }
                i10 = -1;
                if (i10 >= 0) {
                    return i10 - this.f21326b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0020  */
        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f21325a;
                int iIntValue = ((Integer) obj).intValue();
                int i10 = this.f21326b;
                int i11 = this.f21327c - 1;
                while (i11 >= i10) {
                    if (iArr[i11] != iIntValue) {
                        i11--;
                    } else if (i11 >= 0) {
                        return i11 - this.f21326b;
                    }
                }
                i11 = -1;
                if (i11 >= 0) {
                    return i11 - this.f21326b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            Integer num = (Integer) obj;
            fs0.a(i10, size());
            int[] iArr = this.f21325a;
            int i11 = this.f21326b + i10;
            int i12 = iArr[i11];
            Objects.requireNonNull(num);
            iArr[i11] = num.intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f21327c - this.f21326b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i10, int i11) {
            fs0.a(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f21325a;
            int i12 = this.f21326b;
            return new a(i10 + i12, i12 + i11, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f21325a[this.f21326b]);
            int i10 = this.f21326b;
            while (true) {
                i10++;
                if (i10 >= this.f21327c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f21325a[i10]);
            }
        }
    }

    public static int a(long j10) {
        int i10 = (int) j10;
        if (((long) i10) == j10) {
            return i10;
        }
        throw new IllegalArgumentException(d51.a("Out of range: %s", Long.valueOf(j10)));
    }

    public static List<Integer> a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(0, iArr.length, iArr);
    }

    public static int[] a(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof a) {
            return ((a) abstractCollection).b();
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            Objects.requireNonNull(obj);
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
