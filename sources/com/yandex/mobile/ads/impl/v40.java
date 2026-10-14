package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<VideoAd> f25837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ol f25838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a41 f25839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qn f25840d;

    public /* synthetic */ v40(Context context, sc1 sc1Var) {
        this(context, sc1Var, new ol(), new a41(context, sc1Var), new qn(context));
    }

    public v40(Context context, sc1<VideoAd> sc1Var, ol olVar, a41 a41Var, qn qnVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(olVar, "creativeAssetsProvider");
        fd.j0.i(a41Var, "sponsoredAssetProviderCreator");
        fd.j0.i(qnVar, "callToActionAssetProvider");
        this.f25837a = sc1Var;
        this.f25838b = olVar;
        this.f25839c = a41Var;
        this.f25840d = qnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<qa<?>> a() {
        Object next;
        nl nlVarA = this.f25837a.a();
        fd.j0.h(nlVarA, "videoAdInfo.creative");
        Objects.requireNonNull(this.f25838b);
        List<qa<?>> listJ = kc.t.J(ol.a(nlVarA));
        for (jc.h hVar : kc.l.c(new jc.h("sponsored", this.f25839c.a()), new jc.h("call_to_action", this.f25840d))) {
            String str = (String) hVar.f31811c;
            mn mnVar = (mn) hVar.f31812d;
            ArrayList arrayList = (ArrayList) listJ;
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fd.j0.d(((qa) next).b(), str));
            if (((qa) next) == null) {
                arrayList.add(mnVar.a());
            }
        }
        return listJ;
    }
}
