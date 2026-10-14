package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0819Dm implements Runnable {
    public final /* synthetic */ RunnableC0820Dn A00;
    public final /* synthetic */ DownloadAction[] A01;

    public RunnableC0819Dm(RunnableC0820Dn runnableC0820Dn, DownloadAction[] downloadActionArr) {
        this.A00 = runnableC0820Dn;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00.A03) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.A00.A00.A0C);
            this.A00.A00.A0C.clear();
            for (DownloadAction downloadAction : this.A01) {
                this.A00.A00.A02(downloadAction);
            }
            this.A00.A00.A02 = true;
            Iterator it = this.A00.A00.A0D.iterator();
            while (it.hasNext()) {
                ((InterfaceC0822Dp) it.next()).ABP(this.A00.A00);
            }
            if (!arrayList.isEmpty()) {
                this.A00.A00.A0C.addAll(arrayList);
                this.A00.A00.A0B();
            }
            this.A00.A00.A0A();
            for (int i10 = 0; i10 < this.A00.A00.A0C.size(); i10++) {
                RunnableC0826Dt runnableC0826Dt = (RunnableC0826Dt) this.A00.A00.A0C.get(i10);
                if (runnableC0826Dt.A06 == 0) {
                    this.A00.A00.A0D(runnableC0826Dt);
                }
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
