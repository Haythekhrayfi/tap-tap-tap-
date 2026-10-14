package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class h71 implements wf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wf.a<h71> f21328f = yn1.f26955o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yv[] f21332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21333e;

    public h71(String str, yv... yvVarArr) {
        pa.a(yvVarArr.length > 0);
        this.f21330b = str;
        this.f21332d = yvVarArr;
        this.f21329a = yvVarArr.length;
        int iA = te0.a(yvVarArr[0].f27115l);
        this.f21331c = iA == -1 ? te0.a(yvVarArr[0].f27114k) : iA;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h71 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new h71(bundle.getString(Integer.toString(1, 36), ""), (yv[]) (parcelableArrayList == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : xf.a(yv.H, parcelableArrayList)).toArray(new yv[0]));
    }

    private void a() {
        IllegalStateException illegalStateException;
        String str = this.f21332d[0].f27106c;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i10 = this.f21332d[0].f27108e | Http2.INITIAL_MAX_FRAME_SIZE;
        int i11 = 1;
        while (true) {
            yv[] yvVarArr = this.f21332d;
            if (i11 >= yvVarArr.length) {
                return;
            }
            String str2 = yvVarArr[i11].f27106c;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                yv[] yvVarArr2 = this.f21332d;
                String str3 = yvVarArr2[0].f27106c;
                String str4 = yvVarArr2[i11].f27106c;
                StringBuilder sbA = q2.a.a("Different ", "languages", " combined in one TrackGroup: '", str3, "' (track 0) and '");
                sbA.append(str4);
                sbA.append("' (track ");
                sbA.append(i11);
                sbA.append(")");
                illegalStateException = new IllegalStateException(sbA.toString());
                break;
            }
            yv[] yvVarArr3 = this.f21332d;
            if (i10 != (yvVarArr3[i11].f27108e | Http2.INITIAL_MAX_FRAME_SIZE)) {
                String binaryString = Integer.toBinaryString(yvVarArr3[0].f27108e);
                String binaryString2 = Integer.toBinaryString(this.f21332d[i11].f27108e);
                StringBuilder sbA2 = q2.a.a("Different ", "role flags", " combined in one TrackGroup: '", binaryString, "' (track 0) and '");
                sbA2.append(binaryString2);
                sbA2.append("' (track ");
                sbA2.append(i11);
                sbA2.append(")");
                illegalStateException = new IllegalStateException(sbA2.toString());
                break;
            }
            i11++;
        }
        p90.a("TrackGroup", "", illegalStateException);
    }

    public final int a(yv yvVar) {
        int i10 = 0;
        while (true) {
            yv[] yvVarArr = this.f21332d;
            if (i10 >= yvVarArr.length) {
                return -1;
            }
            if (yvVar == yvVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final yv a(int i10) {
        return this.f21332d[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h71.class != obj.getClass()) {
            return false;
        }
        h71 h71Var = (h71) obj;
        return this.f21330b.equals(h71Var.f21330b) && Arrays.equals(this.f21332d, h71Var.f21332d);
    }

    public final int hashCode() {
        if (this.f21333e == 0) {
            this.f21333e = z11.a(this.f21330b, 527, 31) + Arrays.hashCode(this.f21332d);
        }
        return this.f21333e;
    }
}
