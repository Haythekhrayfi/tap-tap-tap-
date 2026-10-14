package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i71 implements wf {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i71 f21617d = new i71(new h71[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wf.a<i71> f21618e = dp1.f19956o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.embedded.guava.collect.p<h71> f21620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21621c;

    public i71(h71... h71VarArr) {
        this.f21620b = com.yandex.mobile.ads.embedded.guava.collect.p.b(h71VarArr);
        this.f21619a = h71VarArr.length;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i71 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new i71(new h71[0]) : new i71((h71[]) xf.a(h71.f21328f, parcelableArrayList).toArray(new h71[0]));
    }

    private void a() {
        int i10 = 0;
        while (i10 < this.f21620b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f21620b.size(); i12++) {
                if (this.f21620b.get(i10).equals(this.f21620b.get(i12))) {
                    p90.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final int a(h71 h71Var) {
        int iIndexOf = this.f21620b.indexOf(h71Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final h71 a(int i10) {
        return this.f21620b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i71.class != obj.getClass()) {
            return false;
        }
        i71 i71Var = (i71) obj;
        return this.f21619a == i71Var.f21619a && this.f21620b.equals(i71Var.f21620b);
    }

    public final int hashCode() {
        if (this.f21621c == 0) {
            this.f21621c = this.f21620b.hashCode();
        }
        return this.f21621c;
    }
}
