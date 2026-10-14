package la;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;
import fd.j0;
import gb.x;
import i.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import ka.d;
import kc.f0;
import ma.h;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.zipoapps.blytics.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f33050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33051c = "";

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    static {
        new a(null);
    }

    @Override // com.zipoapps.blytics.a
    public void b(Application application, boolean z10) {
        j0.i(application, "application");
        j0.i(application, "application");
        this.f33050b = application;
        if (this.f33051c.length() > 0) {
            new FlurryAgent.Builder().withDataSaleOptOut(false).withIncludeBackgroundSessionsInMetrics(true).withReportLocation(true).withPerformanceMetrics(FlurryPerformance.ALL).build(application, this.f33051c);
            return;
        }
        xe.a.c cVarB = xe.a.b("FlurryPlatform");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Flurry API key is empty");
        Objects.requireNonNull((xe.a.C0464a) cVarB);
        for (xe.a.c cVar : xe.a.f37600b) {
            cVar.o(illegalArgumentException);
        }
    }

    @Override // com.zipoapps.blytics.a
    public boolean c(Application application) {
        boolean z10;
        j0.i(application, "application");
        try {
            Class.forName("com.flurry.android.FlurryAgent");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            xe.a.b("FlurryPlatform").g("FlurryAnalytics not found!", new Object[0]);
            z10 = false;
        }
        String str = (String) h.f33410y.a().f33418g.h(oa.b.f34176i0);
        this.f33051c = str;
        if (z10) {
            if (str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zipoapps.blytics.a
    public void d(d dVar) {
        Application application = this.f33050b;
        j0.f(application);
        FlurryAgent.onEndSession(application);
    }

    @Override // com.zipoapps.blytics.a
    public void e(d dVar) {
        Application application = this.f33050b;
        j0.f(application);
        FlurryAgent.onStartSession(application);
    }

    @Override // com.zipoapps.blytics.a
    public void f(String str) {
        j0.i(str, "userId");
        FlurryAgent.setUserId(str);
    }

    @Override // com.zipoapps.blytics.a
    public void g(String str, String str2) {
    }

    @Override // com.zipoapps.blytics.a
    public void h(String str, Bundle bundle) {
        x cVar;
        x cVar2;
        j0.i(str, "event");
        j0.i(bundle, "params");
        a(bundle, 100);
        j0.i(bundle, "params");
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            j0.h(str2, Action.KEY_ATTRIBUTE);
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
        j0.i(map, "params");
        if (map.size() <= 10) {
            cVar2 = new x.c(map);
        } else {
            Map mapL = f0.l(map);
            Iterator<String> it = com.zipoapps.blytics.a.f28224a.iterator();
            while (mapL.size() > 10 && it.hasNext()) {
                mapL.remove(it.next());
            }
            if (mapL.size() > 10) {
                StringBuilder sbA = android.support.v4.media.c.a("Flurry", ": Failed to shorten the parameters list by removing optional parameters. Cutting ");
                sbA.append(mapL.size() - 10);
                sbA.append(" parameters");
                xe.a.f37601c.m(sbA.toString(), new Object[0]);
                int size = map.size();
                Iterator it2 = ((LinkedHashMap) mapL).keySet().iterator();
                while (it2.hasNext() && mapL.size() > 9) {
                    xe.a.f37601c.m(j.a("Flurry", ": Removing analytics parameter: ", (String) it2.next()), new Object[0]);
                    it2.remove();
                }
                mapL.put("limit_exceeded", n1.c.a("Limit: ", 10, " Params: ", size));
                if (mapL.size() > 10) {
                    StringBuilder sbA2 = defpackage.a.a("The number of parameters still above the limit: ");
                    sbA2.append(mapL.size());
                    sbA2.append(" (");
                    sbA2.append(10);
                    sbA2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    cVar = new x.b(new IllegalArgumentException(sbA2.toString()));
                } else {
                    cVar = new x.c(mapL);
                }
            } else {
                cVar = new x.c(mapL);
            }
            cVar2 = cVar;
        }
        if (cVar2 instanceof x.c) {
            FlurryAgent.logEvent(str, (Map) ((x.c) cVar2).f30417b);
        } else if (cVar2 instanceof x.b) {
            xe.a.b("FlurryPlatform").d(((x.b) cVar2).f30416b, f.a("The event: ", str), new Object[0]);
        }
    }
}
