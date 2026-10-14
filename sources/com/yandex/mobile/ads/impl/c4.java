package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c4 implements wf {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c4 f19369g = new c4(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f19370h = new a().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wf.a<c4> f19371i = yn1.f26949i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f19377f;

    public static final class a implements wf {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final wf.a<a> f19378h = dp1.f19950i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri[] f19381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f19382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long[] f19383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f19384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f19385g;

        public a() {
            this(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            pa.a(iArr.length == uriArr.length);
            this.f19379a = j10;
            this.f19380b = i10;
            this.f19382d = iArr;
            this.f19381c = uriArr;
            this.f19383e = jArr;
            this.f19384f = j11;
            this.f19385g = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            long j10 = bundle.getLong(Integer.toString(0, 36));
            int i10 = bundle.getInt(Integer.toString(1, 36), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
            int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
            long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
            return new a(j10, i10, intArray == null ? new int[0] : intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }

        public final int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f19382d;
                if (i12 >= iArr.length || this.f19385g || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public final a a() {
            int[] iArr = this.f19382d;
            int length = iArr.length;
            int iMax = Math.max(0, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArr = this.f19383e;
            int length2 = jArr.length;
            int iMax2 = Math.max(0, length2);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
            Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
            return new a(this.f19379a, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f19381c, 0), jArrCopyOf, this.f19384f, this.f19385g);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19379a == aVar.f19379a && this.f19380b == aVar.f19380b && Arrays.equals(this.f19381c, aVar.f19381c) && Arrays.equals(this.f19382d, aVar.f19382d) && Arrays.equals(this.f19383e, aVar.f19383e) && this.f19384f == aVar.f19384f && this.f19385g == aVar.f19385g;
        }

        public final int hashCode() {
            int i10 = this.f19380b * 31;
            long j10 = this.f19379a;
            int iHashCode = (Arrays.hashCode(this.f19383e) + ((Arrays.hashCode(this.f19382d) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f19381c)) * 31)) * 31)) * 31;
            long j11 = this.f19384f;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f19385g ? 1 : 0);
        }
    }

    private c4(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f19372a = obj;
        this.f19374c = j10;
        this.f19375d = j11;
        this.f19373b = aVarArr.length + i10;
        this.f19377f = aVarArr;
        this.f19376e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c4 a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.f19378h.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c4(null, aVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final a a(int i10) {
        int i11 = this.f19376e;
        return i10 < i11 ? f19370h : this.f19377f[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c4.class != obj.getClass()) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return da1.a(this.f19372a, c4Var.f19372a) && this.f19373b == c4Var.f19373b && this.f19374c == c4Var.f19374c && this.f19375d == c4Var.f19375d && this.f19376e == c4Var.f19376e && Arrays.equals(this.f19377f, c4Var.f19377f);
    }

    public final int hashCode() {
        int i10 = this.f19373b * 31;
        Object obj = this.f19372a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f19374c)) * 31) + ((int) this.f19375d)) * 31) + this.f19376e) * 31) + Arrays.hashCode(this.f19377f);
    }

    public final String toString() {
        char c10;
        StringBuilder sbA = defpackage.a.a("AdPlaybackState(adsId=");
        sbA.append(this.f19372a);
        sbA.append(", adResumePositionUs=");
        sbA.append(this.f19374c);
        sbA.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f19377f.length; i10++) {
            sbA.append("adGroup(timeUs=");
            sbA.append(this.f19377f[i10].f19379a);
            sbA.append(", ads=[");
            for (int i11 = 0; i11 < this.f19377f[i10].f19382d.length; i11++) {
                sbA.append("ad(state=");
                int i12 = this.f19377f[i10].f19382d[i11];
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
                sbA.append(this.f19377f[i10].f19383e[i11]);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i11 < this.f19377f[i10].f19382d.length - 1) {
                    sbA.append(", ");
                }
            }
            sbA.append("])");
            if (i10 < this.f19377f.length - 1) {
                sbA.append(", ");
            }
        }
        sbA.append("])");
        return sbA.toString();
    }
}
