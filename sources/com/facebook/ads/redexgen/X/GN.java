package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GN {
    public int A00;
    public final int A01;
    public final GM[] A02;

    public GN(GM... gmArr) {
        this.A02 = gmArr;
        this.A01 = gmArr.length;
    }

    public final GM A00(int i10) {
        return this.A02[i10];
    }

    public final GM[] A01() {
        return (GM[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((GN) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
