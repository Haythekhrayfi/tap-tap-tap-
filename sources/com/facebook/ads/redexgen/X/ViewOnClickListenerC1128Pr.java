package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1128Pr implements View.OnClickListener {
    public final /* synthetic */ C6C A00;

    public ViewOnClickListenerC1128Pr(C6C c6c) {
        this.A00 = c6c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
        }
        try {
            if (this.A00.getVideoView() != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A04(EnumC0944Ik.A0t, null);
                }
                this.A00.A01.A0E().A30();
                switch (C1129Ps.A00[this.A00.getVideoView().getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        this.A00.getVideoView().A0b(PZ.A04, 12);
                        break;
                    case 5:
                        this.A00.getVideoView().A0e(true, 8);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
