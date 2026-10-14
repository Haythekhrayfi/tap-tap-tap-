package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class tp extends p7.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uk f25427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vp f25428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kq f25429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jq f25430d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tp(Context context, yh yhVar, uk ukVar) {
        this(context, yhVar, ukVar, 0);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(yhVar, "mainClickConnector");
        fd.j0.i(ukVar, "contentCloseListener");
    }

    public /* synthetic */ tp(Context context, yh yhVar, uk ukVar, int i10) {
        this(context, yhVar, ukVar, new vp(yhVar), new kq(new nq0(context)), new jq(context));
    }

    public tp(Context context, yh yhVar, uk ukVar, vp vpVar, kq kqVar, jq jqVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(yhVar, "mainClickConnector");
        fd.j0.i(ukVar, "contentCloseListener");
        fd.j0.i(vpVar, "clickHandler");
        fd.j0.i(kqVar, "trackingUrlHandler");
        fd.j0.i(jqVar, "trackAnalyticsHandler");
        this.f25427a = ukVar;
        this.f25428b = vpVar;
        this.f25429c = kqVar;
        this.f25430d = jqVar;
    }

    private final boolean a(y9.q qVar, Uri uri, p7.f1 f1Var) {
        String host;
        if (fd.j0.d(uri.getScheme(), "mobileads") && (host = uri.getHost()) != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != 94750088) {
                if (iHashCode != 866535483) {
                    if (iHashCode != 986975867) {
                        if (iHashCode == 1270469668 && host.equals("trackUrl")) {
                            this.f25429c.a(uri);
                            return true;
                        }
                    } else if (host.equals("trackAnalytics")) {
                        this.f25430d.a(uri, qVar.f42099d);
                        return true;
                    }
                } else if (host.equals("closeAd")) {
                    this.f25427a.e();
                    return true;
                }
            } else if (host.equals("click")) {
                this.f25428b.a(uri, f1Var);
                return true;
            }
        }
        return false;
    }

    public final void a(int i10, yh yhVar) {
        fd.j0.i(yhVar, "clickConnector");
        this.f25428b.a(i10, yhVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // p7.j
    public final boolean handleAction(y9.q qVar, p7.f1 f1Var) {
        boolean z10;
        fd.j0.i(qVar, "action");
        fd.j0.i(f1Var, "view");
        if (!super.handleAction(qVar, f1Var)) {
            v9.b<Uri> bVar = qVar.f42101f;
            if (bVar != null) {
                v9.d expressionResolver = f1Var.getExpressionResolver();
                fd.j0.h(expressionResolver, "view.expressionResolver");
                if (a(qVar, bVar.b(expressionResolver), f1Var)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
