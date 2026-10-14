package com.yandex.mobile.ads.impl;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.BuildConfigFieldProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class aa1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k01 f18825a;

    public /* synthetic */ aa1() {
        this(new k01());
    }

    public aa1(k01 k01Var) {
        fd.j0.i(k01Var, "sdkVersionFormatter");
        this.f18825a = k01Var;
    }

    public static String a() {
        String strA;
        StringBuilder sbA = o2.b.a(CoreConstants.LEFT_PARENTHESIS_CHAR);
        String str = Build.MODEL;
        fd.j0.h(str, "MODEL");
        String str2 = Build.MANUFACTURER;
        fd.j0.h(str2, "MANUFACTURER");
        if (ed.q.u(str, str2, false, 2)) {
            strA = a51.a(str);
            fd.j0.h(strA, "{\n            StringUtil…ze(Build.MODEL)\n        }");
        } else {
            strA = a51.a(str2) + ' ' + str;
        }
        sbA.append(strA);
        sbA.append("; Android ");
        return s.a.a(sbA, Build.VERSION.RELEASE, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final String b() {
        StringBuilder sbA = v60.a("com.yandex.mobile.metrica.ads.sdk/");
        sbA.append(this.f18825a.a());
        sbA.append(CoreConstants.DOT);
        sbA.append(BuildConfigFieldProvider.getBuildNumber());
        return sbA.toString();
    }
}
