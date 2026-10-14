package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0981Jy implements InterfaceC1111Pa {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    public RN A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final MN A07 = new MN() { // from class: com.facebook.ads.redexgen.X.6y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8Y
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass70 anonymousClass70) {
            this.A00.A05.removeCallbacksAndMessages(null);
            if (this.A00.A0D(EnumC1132Pv.A05)) {
                this.A00.A03();
                this.A00.A06(true, false);
            }
            this.A00.A03 = true;
        }
    };
    public final OR A06 = new OR() { // from class: com.facebook.ads.redexgen.X.6x
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8Y
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass73 anonymousClass73) {
            this.A00.A03();
            this.A00.A06(false, false);
            this.A00.A03 = true;
        }
    };
    public final MB A08 = new C06726w(this);
    public final M2 A09 = new M2() { // from class: com.facebook.ads.redexgen.X.6v
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8Y
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C06746z c06746z) {
            if (this.A00.A02 || !this.A00.A0D(EnumC1132Pv.A05)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, false);
        }
    };
    public final AbstractC1001Ku A0A = new C06706u(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC1133Pw> A0B = new ArrayList();
    public int A00 = 2000;

    public C0981Jy(boolean z10) {
        this.A02 = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC1133Pw> it = this.A0B.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (zHasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z10, boolean z11) {
        for (InterfaceC1133Pw interfaceC1133Pw : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            interfaceC1133Pw.A3T(z10, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0D(EnumC1132Pv enumC1132Pv) {
        Iterator<InterfaceC1133Pw> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A7t() != enumC1132Pv) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i10) {
        this.A00 = i10;
    }

    public final void A0I(InterfaceC1133Pw interfaceC1133Pw) {
        this.A0B.add(interfaceC1133Pw);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void A9B(RN rn) {
        this.A01 = rn;
        rn.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1111Pa
    public final void AFp(RN rn) {
        A03();
        rn.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
