package com.zipoapps.blytics;

import android.app.Application;
import android.os.Bundle;
import fd.j0;
import java.util.List;
import kc.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f28224a;

    /* JADX INFO: renamed from: com.zipoapps.blytics.a$a, reason: collision with other inner class name */
    public static final class C0233a {
        public C0233a() {
        }

        public C0233a(vc.g gVar) {
        }
    }

    static {
        new C0233a(null);
        f28224a = l.c("isForegroundSession", "days_since_install", "occurrence");
    }

    public final Bundle a(Bundle bundle, int i10) {
        String string;
        j0.i(bundle, "params");
        for (String str : bundle.keySet()) {
            if ((bundle.get(str) instanceof String) && (string = bundle.getString(str)) != null && string.length() > i10) {
                String strSubstring = string.substring(0, i10);
                j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                bundle.putString(str, strSubstring);
            }
        }
        return bundle;
    }

    public void b(Application application, boolean z10) {
        j0.i(application, "application");
    }

    public abstract boolean c(Application application);

    public abstract void d(ka.d dVar);

    public abstract void e(ka.d dVar);

    public abstract void f(String str);

    public abstract void g(String str, String str2);

    public abstract void h(String str, Bundle bundle);
}
