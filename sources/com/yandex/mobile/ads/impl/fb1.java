package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jo0 f20592a;

    public final class a implements ho0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f20593a;

        public a(cb1 cb1Var) {
            fd.j0.i(cb1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f20593a = cb1Var;
        }

        @Override // com.yandex.mobile.ads.impl.ho0
        public final void a() {
            this.f20593a.a();
        }
    }

    public interface b {
        void a();
    }

    public fb1(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f20592a = new jo0(context);
    }

    public final void a(List list, cb1 cb1Var) {
        ArrayList arrayListD;
        fd.j0.i(list, "videoAds");
        fd.j0.i(cb1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        boolean z10 = true;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else {
                    arrayListD = ((ac1) it.next()).d();
                    fd.j0.h(arrayListD, "videoAd.adVerifications");
                }
            } while (!(!arrayListD.isEmpty()));
        } else {
            z10 = false;
            break;
        }
        if (!z10) {
            cb1Var.a();
        } else {
            this.f20592a.a(new a(cb1Var));
        }
    }
}
