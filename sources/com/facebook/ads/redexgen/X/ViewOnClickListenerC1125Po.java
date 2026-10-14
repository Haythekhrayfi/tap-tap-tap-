package com.facebook.ads.redexgen.X;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1125Po implements View.OnClickListener {
    public final /* synthetic */ C0971Jn A00;

    public ViewOnClickListenerC1125Po(C0971Jn c0971Jn) {
        this.A00 = c0971Jn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.A03.A04(EnumC0944Ik.A0e, null);
            this.A00.A02.A0E().A36();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
