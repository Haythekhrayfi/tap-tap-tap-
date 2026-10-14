package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ko implements sv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final go f22470b = new go();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mb0 f22471c = mb0.f23019a;

    public ko(Context context) {
        this.f22469a = context;
    }

    @Override // com.yandex.mobile.ads.impl.sv0
    public final pv0[] a(Handler handler, sf1 sf1Var, ac acVar, j61 j61Var, le0 le0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qb0(this.f22469a, this.f22470b, this.f22471c, handler, sf1Var));
        nn nnVarA = new nn.e().a(wb.a(this.f22469a)).c().b().d().a();
        arrayList.add(new fb0(this.f22469a, this.f22470b, this.f22471c, handler, acVar, nnVarA));
        arrayList.add(new k61(j61Var, handler.getLooper()));
        arrayList.add(new com.yandex.mobile.ads.exo.metadata.a(le0Var, handler.getLooper()));
        arrayList.add(new fh());
        return (pv0[]) arrayList.toArray(new pv0[0]);
    }
}
