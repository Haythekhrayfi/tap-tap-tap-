package com.facebook.ads.redexgen.X;

import android.content.Context;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V2 implements GZ {
    public final Context A00;
    public final GZ A01;
    public final InterfaceC0905Gw<? super InterfaceC0885Ga> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public V2(Context context, InterfaceC0905Gw<? super InterfaceC0885Ga> interfaceC0905Gw, GZ gz) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0905Gw;
        this.A01 = gz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public V2(Context context, String str, InterfaceC0905Gw<? super InterfaceC0885Ga> interfaceC0905Gw) {
        this(context, interfaceC0905Gw, new C2N(str, interfaceC0905Gw));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GZ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final V3 A4T() {
        return new V3(this.A00, this.A02, this.A01.A4T());
    }
}
