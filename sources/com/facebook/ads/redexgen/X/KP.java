package com.facebook.ads.redexgen.X;

import android.app.Activity;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KP {
    public static final KP A04 = new KP(new C1232Tr(), new C1231Tq());
    public final KO A02;
    public final LE A03;
    public boolean A01 = true;
    public long A00 = -1;

    public KP(LE le2, KO ko) {
        this.A03 = le2;
        this.A02 = ko;
    }

    public static KP A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A4v();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A78();
        boolean z10 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (KP.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A4v() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
