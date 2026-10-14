package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07379o {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC07359m A0A;
    public final InterfaceC07369n A0B;
    public final AbstractC07459x A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C07379o(InterfaceC07359m interfaceC07359m, InterfaceC07369n interfaceC07369n, AbstractC07459x abstractC07459x, int i10, Handler handler) {
        this.A0A = interfaceC07359m;
        this.A0B = interfaceC07369n;
        this.A0C = abstractC07459x;
        this.A03 = handler;
        this.A01 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC07369n A04() {
        return this.A0B;
    }

    public final C07379o A05() {
        HG.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            HG.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AEt(this);
        return this;
    }

    public final C07379o A06(int i10) {
        HG.A04(!this.A09);
        this.A00 = i10;
        return this;
    }

    public final C07379o A07(Object obj) {
        HG.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC07459x A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        HG.A04(this.A09);
        HG.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
