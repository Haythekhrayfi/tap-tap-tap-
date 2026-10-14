package com.zipoapps.premiumhelper.toto;

import fd.j0;
import gb.x;
import java.util.Objects;
import jc.w;
import ma.f;
import vc.l;
import xe.a;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoFeature$getConfig$3$3 extends l implements uc.l<x.b, w> {
    public final /* synthetic */ TotoFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoFeature$getConfig$3$3(TotoFeature totoFeature) {
        super(1);
        this.this$0 = totoFeature;
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(x.b bVar) {
        invoke2(bVar);
        return w.f31842a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(x.b bVar) {
        j0.i(bVar, "e");
        a.f37601c.c(bVar.f30416b);
        f fVar = this.this$0.preferences;
        Objects.requireNonNull(fVar);
        if (oa.a.C0376a.b(fVar, "post_config_sent", false)) {
            return;
        }
        PostConfigWorker.Companion.scheduleNow(this.this$0.context);
    }
}
