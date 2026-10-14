package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1018Ll extends LinearLayout {
    public static int A00 = (int) (Kn.A02 * 56.0f);

    public abstract void A04();

    public abstract void A05();

    public abstract void A06(C1M c1m, boolean z10);

    public abstract boolean A07();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC1017Lk getToolbarListener();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss);

    public abstract void setFullscreen(boolean z10);

    public abstract void setPageDetails(C1W c1w, String str, int i10, C05311c c05311c);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f10);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(LW lw);

    public abstract void setProgressImmediate(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i10);

    public abstract void setToolbarListener(InterfaceC1017Lk interfaceC1017Lk);

    public AbstractC1018Ll(Context context) {
        super(context);
    }
}
