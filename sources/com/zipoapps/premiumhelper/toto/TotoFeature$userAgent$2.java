package com.zipoapps.premiumhelper.toto;

import com.zipoapps.premiumhelper.util.c;
import uc.a;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoFeature$userAgent$2 extends l implements a<String> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$userAgent$2(TotoFeature totoFeature) {
        super(0);
        this.this$0 = totoFeature;
    }

    @Override // uc.a
    public final String invoke() {
        return this.this$0.context.getPackageName() + '_' + c.l(this.this$0.context);
    }
}
