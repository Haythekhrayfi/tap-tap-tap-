package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pu implements u40 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f24247e = R.drawable.yandex_ads_internal_instream_adtune_control_v2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa<?> f24248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ua f24249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eg1 f24250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s7 f24251d;

    public pu(qa<?> qaVar, ua uaVar, eg1 eg1Var, yo0 yo0Var, x30 x30Var) {
        fd.j0.i(uaVar, "assetClickConfigurator");
        fd.j0.i(eg1Var, "videoTracker");
        fd.j0.i(yo0Var, "openUrlHandler");
        fd.j0.i(x30Var, "instreamAdEventController");
        this.f24248a = qaVar;
        this.f24249b = uaVar;
        this.f24250c = eg1Var;
        this.f24251d = new s7(x30Var, yo0Var);
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        m mVar;
        m80 m80VarA;
        List<m> listA;
        Object next;
        fd.j0.i(fc1Var, "uiElements");
        ImageView imageViewH = fc1Var.h();
        if (imageViewH != null) {
            Context context = imageViewH.getContext();
            int i10 = f24247e;
            Object obj = e0.a.f28964a;
            imageViewH.setImageDrawable(e0.a.c.b(context, i10));
            imageViewH.setVisibility(0);
            qa<?> qaVar = this.f24248a;
            if (qaVar == null || (m80VarA = qaVar.a()) == null || (listA = m80VarA.a()) == null) {
                mVar = null;
            } else {
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fd.j0.d(((m) next).a(), "adtune"));
                mVar = (m) next;
            }
            k7 k7Var = mVar instanceof k7 ? (k7) mVar : null;
            if (k7Var == null) {
                this.f24249b.a(imageViewH, this.f24248a);
                return;
            }
            Context context2 = imageViewH.getContext();
            fd.j0.h(context2, "feedbackView.context");
            imageViewH.setOnClickListener(new ou(k7Var, this.f24251d, this.f24250c, new we1(context2)));
        }
    }
}
