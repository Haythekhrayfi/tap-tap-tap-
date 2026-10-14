package com.zipoapps.premiumhelper.toto;

import oa.b;
import uc.a;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoFeature$serviceConfig$2 extends l implements a<TotoService.ServiceConfig> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$serviceConfig$2(TotoFeature totoFeature) {
        super(0);
        this.this$0 = totoFeature;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uc.a
    public final TotoService.ServiceConfig invoke() {
        return (this.this$0.configuration.l() && ((Boolean) this.this$0.configuration.h(b.f34196s0)).booleanValue()) ? TotoService.ServiceConfig.Companion.getStaging() : TotoService.ServiceConfig.Companion.getProduction();
    }
}
