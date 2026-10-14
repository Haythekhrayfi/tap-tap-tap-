package com.applovin.exoplayer2.m;

import android.os.Bundle;
import com.applovin.exoplayer2.b.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.applovin.exoplayer2.g.a<b> f7760e = z.f4662r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7764d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7765f;

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f7761a = i10;
        this.f7762b = i11;
        this.f7763c = i12;
        this.f7764d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b a(Bundle bundle) {
        return new b(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7761a == bVar.f7761a && this.f7762b == bVar.f7762b && this.f7763c == bVar.f7763c && Arrays.equals(this.f7764d, bVar.f7764d);
    }

    public int hashCode() {
        if (this.f7765f == 0) {
            this.f7765f = Arrays.hashCode(this.f7764d) + ((((((527 + this.f7761a) * 31) + this.f7762b) * 31) + this.f7763c) * 31);
        }
        return this.f7765f;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ColorInfo(");
        sbA.append(this.f7761a);
        sbA.append(", ");
        sbA.append(this.f7762b);
        sbA.append(", ");
        sbA.append(this.f7763c);
        sbA.append(", ");
        sbA.append(this.f7764d != null);
        sbA.append(")");
        return sbA.toString();
    }
}
