package com.applovin.impl.mediation.debugger.ui.a;

import android.app.Activity;
import com.applovin.impl.sdk.o;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements com.applovin.impl.mediation.debugger.ui.d.d.a, com.applovin.impl.sdk.utils.b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f9603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.mediation.debugger.b.a.a f9604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.mediation.debugger.b.a.b f9605f;

    public /* synthetic */ i(a aVar, o oVar, com.applovin.impl.mediation.debugger.b.a.a aVar2, com.applovin.impl.mediation.debugger.b.a.b bVar) {
        this.f9602c = aVar;
        this.f9603d = oVar;
        this.f9604e = aVar2;
        this.f9605f = bVar;
    }

    public /* synthetic */ i(com.applovin.impl.mediation.debugger.ui.d.c cVar, com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, o oVar) {
        this.f9602c = cVar;
        this.f9604e = aVar;
        this.f9605f = bVar;
        this.f9603d = oVar;
    }

    @Override // com.applovin.impl.sdk.utils.b.a
    public void onActivityCreated(Activity activity) {
        a.a((com.applovin.impl.mediation.debugger.ui.d.c) this.f9602c, this.f9604e, this.f9605f, this.f9603d, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
    public void onClick(com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
        ((a) this.f9602c).a(this.f9603d, this.f9604e, this.f9605f, aVar, cVar);
    }
}
