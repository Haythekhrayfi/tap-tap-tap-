package com.applovin.exoplayer2.h;

import android.os.Bundle;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.applovin.exoplayer2.g.a<ac> f6505b = g0.f6564d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6506a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.v[] f6507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6508d;

    public ac(com.applovin.exoplayer2.v... vVarArr) {
        com.applovin.exoplayer2.l.a.a(vVarArr.length > 0);
        this.f6507c = vVarArr;
        this.f6506a = vVarArr.length;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ac a(Bundle bundle) {
        return new ac((com.applovin.exoplayer2.v[]) com.applovin.exoplayer2.l.c.a(com.applovin.exoplayer2.v.F, bundle.getParcelableArrayList(b(0)), com.applovin.exoplayer2.common.a.s.g()).toArray(new com.applovin.exoplayer2.v[0]));
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private void a() {
        String strA = a(this.f6507c[0].f8189c);
        int iC = c(this.f6507c[0].f8191e);
        int i10 = 1;
        while (true) {
            com.applovin.exoplayer2.v[] vVarArr = this.f6507c;
            if (i10 >= vVarArr.length) {
                return;
            }
            if (!strA.equals(a(vVarArr[i10].f8189c))) {
                com.applovin.exoplayer2.v[] vVarArr2 = this.f6507c;
                a("languages", vVarArr2[0].f8189c, vVarArr2[i10].f8189c, i10);
                return;
            } else {
                if (iC != c(this.f6507c[i10].f8191e)) {
                    a("role flags", Integer.toBinaryString(this.f6507c[0].f8191e), Integer.toBinaryString(this.f6507c[i10].f8191e), i10);
                    return;
                }
                i10++;
            }
        }
    }

    private static void a(String str, String str2, String str3, int i10) {
        StringBuilder sbA = q2.a.a("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbA.append(str3);
        sbA.append("' (track ");
        sbA.append(i10);
        sbA.append(")");
        com.applovin.exoplayer2.l.q.c("TrackGroup", "", new IllegalStateException(sbA.toString()));
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    private static int c(int i10) {
        return i10 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    public int a(com.applovin.exoplayer2.v vVar) {
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.v[] vVarArr = this.f6507c;
            if (i10 >= vVarArr.length) {
                return -1;
            }
            if (vVar == vVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public com.applovin.exoplayer2.v a(int i10) {
        return this.f6507c[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ac.class != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f6506a == acVar.f6506a && Arrays.equals(this.f6507c, acVar.f6507c);
    }

    public int hashCode() {
        if (this.f6508d == 0) {
            this.f6508d = 527 + Arrays.hashCode(this.f6507c);
        }
        return this.f6508d;
    }
}
