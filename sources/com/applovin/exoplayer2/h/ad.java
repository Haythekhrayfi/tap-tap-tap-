package com.applovin.exoplayer2.h;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ad f6509a = new ad(new ac[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.applovin.exoplayer2.g.a<ad> f6510c = a0.f6486d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6511b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ac[] f6512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6513e;

    public ad(ac... acVarArr) {
        this.f6512d = acVarArr;
        this.f6511b = acVarArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ad a(Bundle bundle) {
        return new ad((ac[]) com.applovin.exoplayer2.l.c.a(ac.f6505b, bundle.getParcelableArrayList(b(0)), com.applovin.exoplayer2.common.a.s.g()).toArray(new ac[0]));
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public int a(ac acVar) {
        for (int i10 = 0; i10 < this.f6511b; i10++) {
            if (this.f6512d[i10] == acVar) {
                return i10;
            }
        }
        return -1;
    }

    public ac a(int i10) {
        return this.f6512d[i10];
    }

    public boolean a() {
        return this.f6511b == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad.class != obj.getClass()) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f6511b == adVar.f6511b && Arrays.equals(this.f6512d, adVar.f6512d);
    }

    public int hashCode() {
        if (this.f6513e == 0) {
            this.f6513e = Arrays.hashCode(this.f6512d);
        }
        return this.f6513e;
    }
}
