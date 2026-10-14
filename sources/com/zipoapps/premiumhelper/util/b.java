package com.zipoapps.premiumhelper.util;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.applinks.AppLinkData;
import com.google.firebase.analytics.FirebaseAnalytics;
import fd.i;
import fd.j0;
import fd.k;
import jc.h;
import ma.f;
import oc.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f28442b;

    @e(c = "com.zipoapps.premiumhelper.util.FacebookInstallData", f = "FacebookInstallData.kt", l = {59}, m = "fetchFromServer")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f28444d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f28446f;

        public a(mc.d<? super a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28444d = obj;
            this.f28446f |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.util.b$b, reason: collision with other inner class name */
    public static final class C0243b implements AppLinkData.CompletionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<AppLinkData> f28447a;

        public C0243b(i<? super AppLinkData> iVar) {
            this.f28447a = iVar;
        }
    }

    public b(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f28441a = context;
        this.f28442b = new f(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(mc.d<? super AppLinkData> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f28446f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28446f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objR = aVar.f28444d;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = aVar.f28446f;
        try {
            if (i11 == 0) {
                h9.d.t(objR);
                aVar.f28443c = this;
                aVar.f28446f = 1;
                k kVar = new k(nc.b.c(aVar), 1);
                kVar.u();
                AppLinkData.fetchDeferredAppLinkData(this.f28441a, new C0243b(kVar));
                objR = kVar.r();
                if (objR == aVar2) {
                    j0.i(aVar, "frame");
                }
                if (objR == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objR);
            }
            return (AppLinkData) objR;
        } catch (Exception e10) {
            xe.a.f37601c.c(e10);
            return null;
        }
    }

    public final void b(AppLinkData appLinkData) {
        if (appLinkData != null) {
            FirebaseAnalytics.getInstance(this.f28441a).f12556a.zzx("fb_install", androidx.activity.i.a(new h("uri", String.valueOf(appLinkData.getTargetUri())), new h("promo", appLinkData.getPromotionCode())));
        }
    }
}
