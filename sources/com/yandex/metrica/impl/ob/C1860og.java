package com.yandex.metrica.impl.ob;

import android.util.Log;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1860og implements IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2139zg f17007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.metrica.g f17008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ym<W0> f17010d;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.og$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f17011a;

        public a(PluginErrorDetails pluginErrorDetails) {
            this.f17011a = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1860og.a(C1860og.this).reportUnhandledException(this.f17011a);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.og$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f17013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17014b;

        public b(PluginErrorDetails pluginErrorDetails, String str) {
            this.f17013a = pluginErrorDetails;
            this.f17014b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1860og.a(C1860og.this).reportError(this.f17013a, this.f17014b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.og$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PluginErrorDetails f17018c;

        public c(String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f17016a = str;
            this.f17017b = str2;
            this.f17018c = pluginErrorDetails;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1860og.a(C1860og.this).reportError(this.f17016a, this.f17017b, this.f17018c);
        }
    }

    public C1860og(C2139zg c2139zg, com.yandex.metrica.g gVar, InterfaceExecutorC1966sn interfaceExecutorC1966sn, Ym<W0> ym) {
        this.f17007a = c2139zg;
        this.f17008b = gVar;
        this.f17009c = interfaceExecutorC1966sn;
        this.f17010d = ym;
    }

    public static IPluginReporter a(C1860og c1860og) {
        return c1860og.f17010d.a().getPluginExtension();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        if (!this.f17007a.a(pluginErrorDetails, str)) {
            Log.w("AppMetrica", "Error stacktrace must be non empty");
            return;
        }
        Objects.requireNonNull(this.f17008b);
        ((C1941rn) this.f17009c).execute(new b(pluginErrorDetails, str));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f17007a.reportError(str, str2, pluginErrorDetails);
        Objects.requireNonNull(this.f17008b);
        ((C1941rn) this.f17009c).execute(new c(str, str2, pluginErrorDetails));
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f17007a.reportUnhandledException(pluginErrorDetails);
        Objects.requireNonNull(this.f17008b);
        ((C1941rn) this.f17009c).execute(new a(pluginErrorDetails));
    }
}
