package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0880Fv implements InterfaceC1468bM {
    public final /* synthetic */ C1467bL A00;

    public C0880Fv(C1467bL c1467bL) {
        this.A00 = c1467bL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1468bM
    public final void ACg() {
        ArrayList arrayList;
        synchronized (this.A00.A06) {
            arrayList = new ArrayList(this.A00.A06.size());
            for (Runnable runnable : this.A00.A06.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A06.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.ACg();
    }
}
