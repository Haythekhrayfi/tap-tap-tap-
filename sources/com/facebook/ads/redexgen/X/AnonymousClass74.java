package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.74, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass74 extends C1115Pe {
    public int A00;
    public boolean A01;
    public final C8Y<AnonymousClass73> A02;
    public final C8Y<AnonymousClass70> A03;
    public final C8Y<MC> A04;
    public final C8Y<C06746z> A05;
    public final C8Y<M1> A06;
    public final C8Y<LM> A07;
    public final C8Y<LH> A08;
    public final C8Y<KF> A09;
    public final C8Y<KC> A0A;
    public final RN A0B;
    public final M3 A0C;
    public final KG A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AnonymousClass74(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, RN rn, List<C2B> list, String str) {
        super(c1337Xw, interfaceC0937Id, rn, list, str, !rn.A0h(), new C1114Pd(c1337Xw, rn));
        KG kg = new KG() { // from class: com.facebook.ads.redexgen.X.77
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0988Kf c0988Kf) {
                this.A00.A0Z();
            }
        };
        this.A0D = kg;
        RK rk = new RK(this);
        this.A07 = rk;
        RG rg = new RG(this);
        this.A03 = rg;
        QU qu = new QU(this);
        this.A04 = qu;
        C1127Pq c1127Pq = new C1127Pq(this);
        this.A05 = c1127Pq;
        C1126Pp c1126Pp = new C1126Pp(this);
        this.A02 = c1126Pp;
        C1124Pn c1124Pn = new C1124Pn(this);
        this.A06 = c1124Pn;
        C1119Pi c1119Pi = new C1119Pi(this);
        this.A09 = c1119Pi;
        C1118Ph c1118Ph = new C1118Ph(this);
        this.A0A = c1118Ph;
        RM rm = new RM(this);
        this.A08 = rm;
        M3 m10 = new M3() { // from class: com.facebook.ads.redexgen.X.78
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m11) {
                AnonymousClass74 anonymousClass74 = this.A00;
                anonymousClass74.A00 = anonymousClass74.A0B.getDuration();
            }
        };
        this.A0C = m10;
        this.A01 = false;
        this.A0B = rn;
        rn.getEventBus().A03(kg, c1127Pq, rk, qu, rg, c1126Pp, c1124Pn, c1119Pi, c1118Ph, m10, rm);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AnonymousClass74(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, RN rn, List<C2B> list, String str, Bundle bundle, Map<String, String> map) {
        super(c1337Xw, interfaceC0937Id, rn, list, str, !rn.A0h(), bundle, map, new C1114Pd(c1337Xw, rn));
        KG kg = new KG() { // from class: com.facebook.ads.redexgen.X.77
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0988Kf c0988Kf) {
                this.A00.A0Z();
            }
        };
        this.A0D = kg;
        RK rk = new RK(this);
        this.A07 = rk;
        RG rg = new RG(this);
        this.A03 = rg;
        QU qu = new QU(this);
        this.A04 = qu;
        C1127Pq c1127Pq = new C1127Pq(this);
        this.A05 = c1127Pq;
        C1126Pp c1126Pp = new C1126Pp(this);
        this.A02 = c1126Pp;
        C1124Pn c1124Pn = new C1124Pn(this);
        this.A06 = c1124Pn;
        C1119Pi c1119Pi = new C1119Pi(this);
        this.A09 = c1119Pi;
        C1118Ph c1118Ph = new C1118Ph(this);
        this.A0A = c1118Ph;
        RM rm = new RM(this);
        this.A08 = rm;
        this.A0C = new M3() { // from class: com.facebook.ads.redexgen.X.78
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m11) {
                AnonymousClass74 anonymousClass74 = this.A00;
                anonymousClass74.A00 = anonymousClass74.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = rn;
        rn.getEventBus().A03(kg, c1127Pq, rk, qu, rg, c1126Pp, c1124Pn, c1119Pi, c1118Ph, rm);
    }

    public AnonymousClass74(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, RN rn, String str) {
        this(c1337Xw, interfaceC0937Id, rn, new ArrayList(), str);
    }

    public AnonymousClass74(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, RN rn, String str, Bundle bundle) {
        this(c1337Xw, interfaceC0937Id, rn, new ArrayList(), str, bundle, null);
    }

    public AnonymousClass74(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, RN rn, String str, Map<String, String> extraParams) {
        this(c1337Xw, interfaceC0937Id, rn, new ArrayList(), str, null, extraParams);
    }

    public final void A0g() {
        RL rl = new RL(this);
        if (this.A0B.A0l()) {
            LI.A00(rl);
        } else {
            this.A0B.getStateHandler().post(rl);
        }
    }
}
