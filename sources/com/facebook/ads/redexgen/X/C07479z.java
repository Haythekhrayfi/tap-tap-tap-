package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07479z {
    public static String[] A06 = {"rmgpPCWB7BYHQ3azE8yCiRChgWLX4K1O", "ESYL8WQp59BjyyK9DI9xkUBJ1yOk4QLd", "YweXfGig2PVNilG2mJZlv3ovQAOkP8UY", "CAftEyLXQvcAYYqOnK17yfwScyM6Y9GQ", "5ZUx", "CHSAxwc6W9B6bhcUywJKjVUar2kzl0Sb", "G9dVYOs473", "8VVZpCzafohaQpJb3SOOvVZNRfYg5osa"};
    public A0 A01;
    public A0 A02;
    public boolean A03;
    public final ArrayList<A0> A05 = new ArrayList<>();
    public final C07439v A04 = new C07439v();
    public AbstractC07459x A00 = AbstractC07459x.A01;

    private A0 A00(A0 a10, AbstractC07459x abstractC07459x) {
        if (abstractC07459x.A0E() || this.A00.A0E()) {
            return a10;
        }
        AbstractC07459x abstractC07459x2 = this.A00;
        int i10 = a10.A01.A02;
        if (A06[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A06[3] = "6Z7kXvoTE0GMRlV8X7ahHWF28Ir1JA8U";
        Object uid = abstractC07459x2.A0A(i10, this.A04, true).A03;
        int newPeriodIndex = abstractC07459x.A04(uid);
        if (newPeriodIndex == -1) {
            return a10;
        }
        int newWindowIndex = abstractC07459x.A09(newPeriodIndex, this.A04).A00;
        return new A0(newWindowIndex, a10.A01.A00(newPeriodIndex));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    public final A0 A03() {
        return this.A01;
    }

    public final A0 A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<A0> arrayList = this.A05;
        int size = arrayList.size() - 1;
        if (A06[3].charAt(28) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "IuVtQJyFuB";
        strArr[7] = "VEjGs0KHAo6Qkjlg0Fq6YAYYmbb9RMII";
        return arrayList.get(size);
    }

    public final A0 A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    public final A0 A06() {
        return this.A02;
    }

    public final EU A07(int i10) {
        EU eu = null;
        AbstractC07459x abstractC07459x = this.A00;
        if (abstractC07459x != null) {
            int iA00 = abstractC07459x.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                A0 mediaPeriod = this.A05.get(periodIndex);
                EU match = mediaPeriod.A01;
                int i11 = match.A02;
                if (i11 < iA00 && this.A00.A09(i11, this.A04).A00 == i10) {
                    if (eu != null) {
                        return null;
                    }
                    eu = mediaPeriod.A01;
                }
            }
        }
        return eu;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i10) {
        A02();
    }

    public final void A0B(int i10, EU eu) {
        this.A05.add(new A0(i10, eu));
        if (this.A05.size() == 1 && !this.A00.A0E()) {
            A02();
        }
    }

    public final void A0C(int i10, EU eu) {
        A0 mediaPeriod;
        A0 a10 = new A0(i10, eu);
        this.A05.remove(a10);
        A0 mediaPeriod2 = this.A02;
        if (a10.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                A0 mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i10, EU eu) {
        this.A02 = new A0(i10, eu);
    }

    public final void A0E(AbstractC07459x abstractC07459x) {
        for (int i10 = 0; i10 < i; i10++) {
            ArrayList<A0> arrayList = this.A05;
            arrayList.set(i10, A00(arrayList.get(i10), abstractC07459x));
        }
        A0 a10 = this.A02;
        if (a10 != null) {
            this.A02 = A00(a10, abstractC07459x);
        }
        this.A00 = abstractC07459x;
        A02();
    }

    public final boolean A0F() {
        return this.A03;
    }
}
