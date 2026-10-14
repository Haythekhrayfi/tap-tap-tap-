package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class VZ implements EW {
    public static String[] A05 = {"2", "A1R5XmGNdue", "Xf2fF", "2MZr802CwBgh98iwI2LX9r8AFH0stAP", "PWtCslqWMOhLlWMecFeGOSMcL", "Nab9jbcw8W2RSLeSFi8qaY40Uhnm56i", "UlYKNWRAV2IAyBS", "QHLbHyQnMMy3J3Z"};
    public XF A00;
    public AbstractC07459x A01;
    public Object A02;
    public final ArrayList<EV> A04 = new ArrayList<>(1);
    public final C0840Eh A03 = new C0840Eh();

    public abstract void A02();

    public abstract void A03(XF xf, boolean z10);

    public final C0840Eh A00(EU eu) {
        return this.A03.A02(0, eu, 0L);
    }

    public final void A01(AbstractC07459x abstractC07459x, Object obj) {
        this.A01 = abstractC07459x;
        this.A02 = obj;
        Iterator<EV> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACo(this, abstractC07459x, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EW
    public final void A3J(Handler handler, InterfaceC0843Ek interfaceC0843Ek) {
        this.A03.A07(handler, interfaceC0843Ek);
    }

    @Override // com.facebook.ads.redexgen.X.EW
    public final void ADm(XF xf, boolean z10, EV ev) {
        XF xf2 = this.A00;
        HG.A03(xf2 == null || xf2 == xf);
        this.A04.add(ev);
        if (this.A00 == null) {
            this.A00 = xf;
            A03(xf, z10);
        } else {
            AbstractC07459x abstractC07459x = this.A01;
            if (abstractC07459x == null) {
                return;
            }
            ev.ACo(this, abstractC07459x, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EW
    public final void AEK(EV ev) {
        this.A04.remove(ev);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            if (A05[2].length() == 23) {
                throw new RuntimeException();
            }
            A05[2] = "TEgrTEJPhaeJK53iaQZF";
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.EW
    public final void AEM(InterfaceC0843Ek interfaceC0843Ek) {
        this.A03.A0D(interfaceC0843Ek);
    }
}
