package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v61 implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v61 f25844a = new a();

    public class a extends v61 {
        @Override // com.yandex.mobile.ads.impl.v61
        public final int a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final b a(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final d a(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final Object a(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int b() {
            return 0;
        }
    }

    public static final class b implements wf {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final wf.a<b> f25845h = yn1.E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f25847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f25851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c4 f25852g = c4.f19369g;

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Bundle bundle) {
            int i10 = bundle.getInt(Integer.toString(0, 36), 0);
            long j10 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
            long j11 = bundle.getLong(Integer.toString(2, 36), 0L);
            boolean z10 = bundle.getBoolean(Integer.toString(3, 36));
            Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
            c4 c4Var = bundle2 != null ? (c4) c4.f19371i.fromBundle(bundle2) : c4.f19369g;
            b bVar = new b();
            bVar.a(null, null, i10, j10, j11, c4Var, z10);
            return bVar;
        }

        public final int a() {
            return this.f25852g.f19373b;
        }

        public final int a(int i10) {
            return this.f25852g.a(i10).f19380b;
        }

        public final int a(long j10) {
            c4 c4Var = this.f25852g;
            long j11 = this.f25849d;
            Objects.requireNonNull(c4Var);
            if (j10 == Long.MIN_VALUE) {
                return -1;
            }
            if (j11 != -9223372036854775807L && j10 >= j11) {
                return -1;
            }
            int i10 = c4Var.f19376e;
            while (i10 < c4Var.f19373b) {
                if (c4Var.a(i10).f19379a == Long.MIN_VALUE || c4Var.a(i10).f19379a > j10) {
                    c4.a aVarA = c4Var.a(i10);
                    if (aVarA.f19380b == -1 || aVarA.a(-1) < aVarA.f19380b) {
                        break;
                    }
                }
                i10++;
            }
            if (i10 < c4Var.f19373b) {
                return i10;
            }
            return -1;
        }

        public final long a(int i10, int i11) {
            c4.a aVarA = this.f25852g.a(i10);
            if (aVarA.f19380b != -1) {
                return aVarA.f19383e[i11];
            }
            return -9223372036854775807L;
        }

        public final b a(Object obj, Object obj2, int i10, long j10, long j11, c4 c4Var, boolean z10) {
            this.f25846a = obj;
            this.f25847b = obj2;
            this.f25848c = i10;
            this.f25849d = j10;
            this.f25850e = j11;
            this.f25852g = c4Var;
            this.f25851f = z10;
            return this;
        }

        public final int b(int i10, int i11) {
            c4.a aVarA = this.f25852g.a(i10);
            if (aVarA.f19380b != -1) {
                return aVarA.f19382d[i11];
            }
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0030  */
        public final int b(long j10) {
            boolean z10;
            c4 c4Var = this.f25852g;
            long j11 = this.f25849d;
            boolean z11 = true;
            int i10 = c4Var.f19373b - 1;
            while (i10 >= 0) {
                if (j10 == Long.MIN_VALUE) {
                    z10 = false;
                } else {
                    long j12 = c4Var.a(i10).f19379a;
                    if (j12 != Long.MIN_VALUE ? j10 >= j12 : j11 != -9223372036854775807L && j10 >= j11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                if (!z10) {
                    break;
                }
                i10--;
            }
            if (i10 >= 0) {
                c4.a aVarA = c4Var.a(i10);
                if (aVarA.f19380b != -1) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= aVarA.f19380b) {
                            z11 = false;
                            break;
                        }
                        int i12 = aVarA.f19382d[i11];
                        if (i12 == 0 || i12 == 1) {
                            break;
                        }
                        i11++;
                    }
                }
                if (z11) {
                    return i10;
                }
            }
            return -1;
        }

        public final long b() {
            return this.f25852g.f19374c;
        }

        public final long b(int i10) {
            return this.f25852g.a(i10).f19379a;
        }

        public final int c() {
            return this.f25852g.f19376e;
        }

        public final int c(int i10, int i11) {
            return this.f25852g.a(i10).a(i11);
        }

        public final long c(int i10) {
            return this.f25852g.a(i10).f19384f;
        }

        public final int d(int i10) {
            return this.f25852g.a(i10).a(-1);
        }

        public final boolean e(int i10) {
            c4.a aVarA = this.f25852g.a(i10);
            boolean z10 = false;
            if (aVarA.f19380b == -1) {
                z10 = true;
                break;
            }
            for (int i11 = 0; i11 < aVarA.f19380b; i11++) {
                int i12 = aVarA.f19382d[i11];
                if (i12 == 0 || i12 == 1) {
                    z10 = true;
                    break;
                }
            }
            return !z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return da1.a(this.f25846a, bVar.f25846a) && da1.a(this.f25847b, bVar.f25847b) && this.f25848c == bVar.f25848c && this.f25849d == bVar.f25849d && this.f25850e == bVar.f25850e && this.f25851f == bVar.f25851f && da1.a(this.f25852g, bVar.f25852g);
        }

        public final boolean f(int i10) {
            return this.f25852g.a(i10).f19385g;
        }

        public final int hashCode() {
            Object obj = this.f25846a;
            int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.f25847b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f25848c) * 31;
            long j10 = this.f25849d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f25850e;
            return this.f25852g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f25851f ? 1 : 0)) * 31);
        }
    }

    public static final class c extends v61 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.yandex.mobile.ads.embedded.guava.collect.p<d> f25853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.yandex.mobile.ads.embedded.guava.collect.p<b> f25854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f25855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f25856e;

        public c(com.yandex.mobile.ads.embedded.guava.collect.p<d> pVar, com.yandex.mobile.ads.embedded.guava.collect.p<b> pVar2, int[] iArr) {
            pa.a(pVar.size() == iArr.length);
            this.f25853b = pVar;
            this.f25854c = pVar2;
            this.f25855d = iArr;
            this.f25856e = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f25856e[iArr[i10]] = i10;
            }
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int a() {
            return this.f25854c.size();
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int a(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != b(z10)) {
                return z10 ? this.f25855d[this.f25856e[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int a(boolean z10) {
            if (c()) {
                return -1;
            }
            if (z10) {
                return this.f25855d[0];
            }
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final b a(int i10, b bVar, boolean z10) {
            b bVar2 = this.f25854c.get(i10);
            bVar.a(bVar2.f25846a, bVar2.f25847b, bVar2.f25848c, bVar2.f25849d, bVar2.f25850e, bVar2.f25852g, bVar2.f25851f);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final d a(int i10, d dVar, long j10) {
            d dVar2 = this.f25853b.get(i10);
            dVar.a(dVar2.f25861a, dVar2.f25863c, dVar2.f25864d, dVar2.f25865e, dVar2.f25866f, dVar2.f25867g, dVar2.f25868h, dVar2.f25869i, dVar2.f25871k, dVar2.f25873m, dVar2.f25874n, dVar2.f25875o, dVar2.f25876p, dVar2.f25877q);
            dVar.f25872l = dVar2.f25872l;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final Object a(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int b() {
            return this.f25853b.size();
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int b(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != a(z10)) {
                return z10 ? this.f25855d[this.f25856e[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return b(z10);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int b(boolean z10) {
            if (c()) {
                return -1;
            }
            return z10 ? this.f25855d[this.f25853b.size() - 1] : this.f25853b.size() - 1;
        }
    }

    public static final class d implements wf {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Object f25857r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final Object f25858s = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final bc0 f25859t = new bc0.a().b("com.yandex.mobile.ads.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final wf.a<d> f25860u = dp1.E;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f25862b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f25864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f25866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f25867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f25868h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f25869i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Deprecated
        public boolean f25870j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public bc0.e f25871k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f25872l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f25873m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f25874n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f25875o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f25876p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f25877q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f25861a = f25857r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bc0 f25863c = f25859t;

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            bc0 bc0Var = bundle2 != null ? (bc0) bc0.f19170g.fromBundle(bundle2) : null;
            long j10 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
            long j11 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
            long j12 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(Integer.toString(5, 36), false);
            boolean z11 = bundle.getBoolean(Integer.toString(6, 36), false);
            Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
            bc0.e eVar = bundle3 != null ? (bc0.e) bc0.e.f19209g.fromBundle(bundle3) : null;
            boolean z12 = bundle.getBoolean(Integer.toString(8, 36), false);
            long j13 = bundle.getLong(Integer.toString(9, 36), 0L);
            long j14 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
            int i10 = bundle.getInt(Integer.toString(11, 36), 0);
            int i11 = bundle.getInt(Integer.toString(12, 36), 0);
            long j15 = bundle.getLong(Integer.toString(13, 36), 0L);
            d dVar = new d();
            dVar.a(f25858s, bc0Var, null, j10, j11, j12, z10, z11, eVar, j13, j14, i10, i11, j15);
            dVar.f25872l = z12;
            return dVar;
        }

        public final d a(Object obj, bc0 bc0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, bc0.e eVar, long j13, long j14, int i10, int i11, long j15) {
            bc0.g gVar;
            this.f25861a = obj;
            this.f25863c = bc0Var != null ? bc0Var : f25859t;
            this.f25862b = (bc0Var == null || (gVar = bc0Var.f19172b) == null) ? null : gVar.f19226g;
            this.f25864d = obj2;
            this.f25865e = j10;
            this.f25866f = j11;
            this.f25867g = j12;
            this.f25868h = z10;
            this.f25869i = z11;
            this.f25870j = eVar != null;
            this.f25871k = eVar;
            this.f25873m = j13;
            this.f25874n = j14;
            this.f25875o = i10;
            this.f25876p = i11;
            this.f25877q = j15;
            this.f25872l = false;
            return this;
        }

        public final boolean a() {
            pa.b(this.f25870j == (this.f25871k != null));
            return this.f25871k != null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return da1.a(this.f25861a, dVar.f25861a) && da1.a(this.f25863c, dVar.f25863c) && da1.a(this.f25864d, dVar.f25864d) && da1.a(this.f25871k, dVar.f25871k) && this.f25865e == dVar.f25865e && this.f25866f == dVar.f25866f && this.f25867g == dVar.f25867g && this.f25868h == dVar.f25868h && this.f25869i == dVar.f25869i && this.f25872l == dVar.f25872l && this.f25873m == dVar.f25873m && this.f25874n == dVar.f25874n && this.f25875o == dVar.f25875o && this.f25876p == dVar.f25876p && this.f25877q == dVar.f25877q;
        }

        public final int hashCode() {
            int iHashCode = (this.f25863c.hashCode() + ((this.f25861a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f25864d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            bc0.e eVar = this.f25871k;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j10 = this.f25865e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f25866f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f25867g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f25868h ? 1 : 0)) * 31) + (this.f25869i ? 1 : 0)) * 31) + (this.f25872l ? 1 : 0)) * 31;
            long j13 = this.f25873m;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f25874n;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f25875o) * 31) + this.f25876p) * 31;
            long j15 = this.f25877q;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    static {
        dp1 dp1Var = dp1.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends wf> com.yandex.mobile.ads.embedded.guava.collect.p<T> a(wf.a<T> aVar, IBinder iBinder) {
        int i10;
        if (iBinder == null) {
            return com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar2 = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        int i11 = uf.f25604a;
        int i12 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar3 = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        int i13 = 0;
        int i14 = 1;
        while (i14 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i13);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            Objects.requireNonNull(bundle);
                            aVar3.b(bundle);
                            i13++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i14 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = aVar3.a();
        for (int i15 = 0; i15 < pVarA.size(); i15++) {
            aVar2.b(aVar.fromBundle((Bundle) pVarA.get(i15)));
        }
        return aVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v61 a(Bundle bundle) {
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = a(d.f25860u, vf.a(bundle, Integer.toString(0, 36)));
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA2 = a(b.f25845h, vf.a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int size = pVarA.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = i10;
            }
            intArray = iArr;
        }
        return new c(pVarA, pVarA2, intArray);
    }

    public abstract int a();

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == b(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == b(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final int a(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = a(i10, bVar, false).f25848c;
        if (a(i12, dVar, 0L).f25876p != i10) {
            return i10 + 1;
        }
        int iA = a(i12, i11, z10);
        if (iA == -1) {
            return -1;
        }
        return a(iA, dVar, 0L).f25875o;
    }

    public abstract int a(Object obj);

    public int a(boolean z10) {
        return c() ? -1 : 0;
    }

    public final Pair<Object, Long> a(d dVar, b bVar, int i10, long j10) {
        Pair<Object, Long> pairA = a(dVar, bVar, i10, j10, 0L);
        Objects.requireNonNull(pairA);
        return pairA;
    }

    public final Pair<Object, Long> a(d dVar, b bVar, int i10, long j10, long j11) {
        pa.a(i10, b());
        a(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.f25873m;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f25875o;
        a(i11, bVar, false);
        while (i11 < dVar.f25876p && bVar.f25850e != j10) {
            int i12 = i11 + 1;
            if (a(i12, bVar, false).f25850e > j10) {
                break;
            }
            i11 = i12;
        }
        a(i11, bVar, true);
        long jMin = j10 - bVar.f25850e;
        long j12 = bVar.f25849d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f25847b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public abstract b a(int i10, b bVar, boolean z10);

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public abstract d a(int i10, d dVar, long j10);

    public abstract Object a(int i10);

    public abstract int b();

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int iB;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v61)) {
            return false;
        }
        v61 v61Var = (v61) obj;
        if (v61Var.b() != b() || v61Var.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < b(); i10++) {
            if (!a(i10, dVar, 0L).equals(v61Var.a(i10, dVar2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < a(); i11++) {
            if (!a(i11, bVar, true).equals(v61Var.a(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != v61Var.a(true) || (iB = b(true)) != v61Var.b(true)) {
            return false;
        }
        while (iA != iB) {
            int iA2 = a(iA, 0, true);
            if (iA2 != v61Var.a(iA, 0, true)) {
                return false;
            }
            iA = iA2;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        d dVar = new d();
        b bVar = new b();
        int iB = b() + 217;
        int i11 = 0;
        while (true) {
            i10 = iB * 31;
            if (i11 >= b()) {
                break;
            }
            iB = i10 + a(i11, dVar, 0L).hashCode();
            i11++;
        }
        int iA = a() + i10;
        for (int i12 = 0; i12 < a(); i12++) {
            iA = (iA * 31) + a(i12, bVar, true).hashCode();
        }
        int iA2 = a(true);
        while (iA2 != -1) {
            iA = (iA * 31) + iA2;
            iA2 = a(iA2, 0, true);
        }
        return iA;
    }
}
