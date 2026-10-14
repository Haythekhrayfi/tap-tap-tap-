package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1015Li implements View.OnClickListener {
    public final /* synthetic */ C1W A00;
    public final /* synthetic */ C0945Il A01;
    public final /* synthetic */ C1016Lj A02;
    public final /* synthetic */ InterfaceC1019Lm A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC1015Li(C1016Lj c1016Lj, C0945Il c0945Il, InterfaceC1019Lm interfaceC1019Lm, String str, C1W c1w) {
        this.A02 = c1016Lj;
        this.A01 = c0945Il;
        this.A03 = interfaceC1019Lm;
        this.A04 = str;
        this.A00 = c1w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.A04(EnumC0944Ik.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A01(), true)) {
                this.A03.A96(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                KV.A0L(new KV(), this.A02.A03, KW.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
