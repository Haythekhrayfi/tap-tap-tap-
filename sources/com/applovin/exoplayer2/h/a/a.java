package com.applovin.exoplayer2.h.a;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6475f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0093a[] f6476i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6468a = new a(null, new C0093a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C0093a f6470h = new C0093a(0).b(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g.a<a> f6469g = p.f4008x;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.h.a.a$a, reason: collision with other inner class name */
    public static final class C0093a implements g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final g.a<C0093a> f6477h = z.f4659o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri[] f6480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f6481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long[] f6482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f6483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f6484g;

        public C0093a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private C0093a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            com.applovin.exoplayer2.l.a.a(iArr.length == uriArr.length);
            this.f6478a = j10;
            this.f6479b = i10;
            this.f6481d = iArr;
            this.f6480c = uriArr;
            this.f6482e = jArr;
            this.f6483f = j11;
            this.f6484g = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0093a a(Bundle bundle) {
            long j10 = bundle.getLong(c(0));
            int i10 = bundle.getInt(c(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(2));
            int[] intArray = bundle.getIntArray(c(3));
            long[] longArray = bundle.getLongArray(c(4));
            long j11 = bundle.getLong(c(5));
            boolean z10 = bundle.getBoolean(c(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C0093a(j10, i10, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        private static int[] a(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f6481d;
                if (i11 >= iArr.length || this.f6484g || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public C0093a b(int i10) {
            int[] iArrA = a(this.f6481d, i10);
            long[] jArrA = a(this.f6482e, i10);
            return new C0093a(this.f6478a, i10, iArrA, (Uri[]) Arrays.copyOf(this.f6480c, i10), jArrA, this.f6483f, this.f6484g);
        }

        public boolean b() {
            return this.f6479b == -1 || a() < this.f6479b;
        }

        public boolean c() {
            if (this.f6479b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f6479b; i10++) {
                int[] iArr = this.f6481d;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0093a.class != obj.getClass()) {
                return false;
            }
            C0093a c0093a = (C0093a) obj;
            return this.f6478a == c0093a.f6478a && this.f6479b == c0093a.f6479b && Arrays.equals(this.f6480c, c0093a.f6480c) && Arrays.equals(this.f6481d, c0093a.f6481d) && Arrays.equals(this.f6482e, c0093a.f6482e) && this.f6483f == c0093a.f6483f && this.f6484g == c0093a.f6484g;
        }

        public int hashCode() {
            int i10 = this.f6479b * 31;
            long j10 = this.f6478a;
            int iHashCode = (Arrays.hashCode(this.f6482e) + ((Arrays.hashCode(this.f6481d) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f6480c)) * 31)) * 31)) * 31;
            long j11 = this.f6483f;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f6484g ? 1 : 0);
        }
    }

    private a(Object obj, C0093a[] c0093aArr, long j10, long j11, int i10) {
        this.f6471b = obj;
        this.f6473d = j10;
        this.f6474e = j11;
        this.f6472c = c0093aArr.length + i10;
        this.f6476i = c0093aArr;
        this.f6475f = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a a(Bundle bundle) {
        C0093a[] c0093aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            c0093aArr = new C0093a[0];
        } else {
            C0093a[] c0093aArr2 = new C0093a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                c0093aArr2[i10] = (C0093a) C0093a.f6477h.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            c0093aArr = c0093aArr2;
        }
        return new a(null, c0093aArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), -9223372036854775807L), bundle.getInt(b(4)));
    }

    private boolean a(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = a(i10).f6478a;
        if (j12 == Long.MIN_VALUE) {
            return j11 == -9223372036854775807L || j10 < j11;
        }
        return j10 < j12;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public int a(long j10, long j11) {
        int i10 = this.f6472c - 1;
        while (i10 >= 0 && a(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !a(i10).c()) {
            return -1;
        }
        return i10;
    }

    public C0093a a(int i10) {
        int i11 = this.f6475f;
        return i10 < i11 ? f6470h : this.f6476i[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f6475f;
        while (i10 < this.f6472c && ((a(i10).f6478a != Long.MIN_VALUE && a(i10).f6478a <= j10) || !a(i10).b())) {
            i10++;
        }
        if (i10 < this.f6472c) {
            return i10;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return ai.a(this.f6471b, aVar.f6471b) && this.f6472c == aVar.f6472c && this.f6473d == aVar.f6473d && this.f6474e == aVar.f6474e && this.f6475f == aVar.f6475f && Arrays.equals(this.f6476i, aVar.f6476i);
    }

    public int hashCode() {
        int i10 = this.f6472c * 31;
        Object obj = this.f6471b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f6473d)) * 31) + ((int) this.f6474e)) * 31) + this.f6475f) * 31) + Arrays.hashCode(this.f6476i);
    }

    public String toString() {
        char c10;
        StringBuilder sbA = defpackage.a.a("AdPlaybackState(adsId=");
        sbA.append(this.f6471b);
        sbA.append(", adResumePositionUs=");
        sbA.append(this.f6473d);
        sbA.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f6476i.length; i10++) {
            sbA.append("adGroup(timeUs=");
            sbA.append(this.f6476i[i10].f6478a);
            sbA.append(", ads=[");
            for (int i11 = 0; i11 < this.f6476i[i10].f6481d.length; i11++) {
                sbA.append("ad(state=");
                int i12 = this.f6476i[i10].f6481d[i11];
                if (i12 == 0) {
                    c10 = '_';
                } else if (i12 == 1) {
                    c10 = 'R';
                } else if (i12 == 2) {
                    c10 = 'S';
                } else if (i12 != 3) {
                    c10 = i12 != 4 ? '?' : '!';
                } else {
                    c10 = 'P';
                }
                sbA.append(c10);
                sbA.append(", durationUs=");
                sbA.append(this.f6476i[i10].f6482e[i11]);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i11 < this.f6476i[i10].f6481d.length - 1) {
                    sbA.append(", ");
                }
            }
            sbA.append("])");
            if (i10 < this.f6476i.length - 1) {
                sbA.append(", ");
            }
        }
        sbA.append("])");
        return sbA.toString();
    }
}
