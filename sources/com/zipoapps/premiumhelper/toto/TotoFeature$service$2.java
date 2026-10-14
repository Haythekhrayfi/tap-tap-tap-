package com.zipoapps.premiumhelper.toto;

import uc.a;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoFeature$service$2 extends l implements a<TotoService.TotoServiceApi> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$service$2(TotoFeature totoFeature) {
        super(0);
        this.this$0 = totoFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uc.a
    public final TotoService.TotoServiceApi invoke() {
        return TotoService.INSTANCE.build(this.this$0.getServiceConfig(), this.this$0.configuration.l());
    }
}
