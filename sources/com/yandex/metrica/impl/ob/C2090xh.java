package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2090xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f17850a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xh$a */
    public class a implements ea.d {
        public a() {
        }

        public File getCrashesDirectory(Context context) {
            return C2090xh.this.f17850a.a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C2090xh.this.f17850a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xh$b */
    public class b implements ea.e {
        public b(C2090xh c2090xh) {
        }

        public String getDeviceType(Context context) {
            com.yandex.metrica.c cVarA = P0.i().p().a().a();
            if (cVarA == null) {
                return null;
            }
            return cVarA.a();
        }

        public String getVersion(Context context) {
            return U2.a(context, context.getPackageName());
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xh$c */
    public class c implements ea.d {
        public c() {
        }

        public File getCrashesDirectory(Context context) {
            return C2090xh.this.f17850a.a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C2090xh.this.f17850a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public C2090xh() {
        this(new L0());
    }

    public C2090xh(L0 l10) {
        this.f17850a = l10;
    }

    public ea.a a(ea.f fVar, String str, boolean z10) {
        com.yandex.metrica.rtm.wrapper.d dVar;
        if (B2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                dVar = new com.yandex.metrica.rtm.wrapper.d(fVar, str, z10);
            } catch (Throwable unused) {
                dVar = null;
            }
        } else {
            dVar = null;
        }
        return dVar == null ? new C1960sh() : dVar;
    }

    public ea.b a(Context context) {
        com.yandex.metrica.rtm.wrapper.e eVar;
        if (B2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                eVar = new com.yandex.metrica.rtm.wrapper.e(new c(), context);
            } catch (Throwable unused) {
                eVar = null;
            }
        } else {
            eVar = null;
        }
        return eVar == null ? new C1985th() : eVar;
    }

    public ea.c b(Context context) {
        com.yandex.metrica.rtm.wrapper.f fVar;
        if (B2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                fVar = new com.yandex.metrica.rtm.wrapper.f(new a(), context, P0.i().s().g(), new b(this));
            } catch (Throwable unused) {
                fVar = null;
            }
        } else {
            fVar = null;
        }
        return fVar == null ? new C2010uh() : fVar;
    }
}
