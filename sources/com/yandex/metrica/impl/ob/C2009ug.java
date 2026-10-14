package com.yandex.metrica.impl.ob;

import android.util.Log;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2009ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1984tg f17533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1810mg f17534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2114yg f17535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.metrica.g f17536e;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ug$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f17538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17539c;

        public a(PluginErrorDetails pluginErrorDetails, String str) {
            this.f17538b = pluginErrorDetails;
            this.f17539c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2009ug.a(C2009ug.this).getPluginExtension().reportError(this.f17538b, this.f17539c);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ug$b */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f17543d;

        public b(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f17541b = str;
            this.f17542c = str2;
            this.f17543d = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2009ug.a(C2009ug.this).getPluginExtension().reportError(this.f17541b, this.f17542c, this.f17543d);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ug$c */
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f17545b;

        public c(PluginErrorDetails pluginErrorDetails) {
            this.f17545b = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2009ug.a(C2009ug.this).getPluginExtension().reportUnhandledException(this.f17545b);
        }
    }

    public C2009ug(InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(interfaceExecutorC1966sn, new C1984tg());
    }

    private C2009ug(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1984tg c1984tg) {
        this(interfaceExecutorC1966sn, c1984tg, new C1810mg(c1984tg), new C2114yg(), new com.yandex.metrica.g(c1984tg, new X2()));
    }

    public C2009ug(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1984tg c1984tg, C1810mg c1810mg, C2114yg c2114yg, com.yandex.metrica.g gVar) {
        this.f17532a = interfaceExecutorC1966sn;
        this.f17533b = c1984tg;
        this.f17534c = c1810mg;
        this.f17535d = c2114yg;
        this.f17536e = gVar;
    }

    public static final U0 a(C2009ug c2009ug) {
        Objects.requireNonNull(c2009ug.f17533b);
        C1772l3 c1772l3K = C1772l3.k();
        fd.j0.f(c1772l3K);
        C1969t1 c1969t1D = c1772l3K.d();
        fd.j0.f(c1969t1D);
        U0 u0B = c1969t1D.b();
        fd.j0.h(u0B, "provider.peekInitialized…erProvider!!.mainReporter");
        return u0B;
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        this.f17534c.a(null);
        this.f17535d.a().reportUnhandledException(pluginErrorDetails);
        com.yandex.metrica.g gVar = this.f17536e;
        fd.j0.f(pluginErrorDetails);
        Objects.requireNonNull(gVar);
        ((C1941rn) this.f17532a).execute(new c(pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f17534c.a(null);
        if (!this.f17535d.a().a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        com.yandex.metrica.g gVar = this.f17536e;
        fd.j0.f(pluginErrorDetails);
        Objects.requireNonNull(gVar);
        ((C1941rn) this.f17532a).execute(new a(pluginErrorDetails, str));
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f17534c.a(null);
        this.f17535d.a().reportError(str, str2, pluginErrorDetails);
        com.yandex.metrica.g gVar = this.f17536e;
        fd.j0.f(str);
        Objects.requireNonNull(gVar);
        ((C1941rn) this.f17532a).execute(new b(str, str2, pluginErrorDetails));
    }
}
