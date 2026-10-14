package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static t.a f671c = new t.a(new t.b());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f672d = -100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static l0.f f673e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static l0.f f674f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f675g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f676h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q.c<WeakReference<i>> f677i = new q.c<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f678j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f679k = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean k(Context context) {
        if (f675g == null) {
            try {
                int i10 = r.f691c;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) r.class), r.a.a() | 128).metaData;
                if (bundle != null) {
                    f675g = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f675g = Boolean.FALSE;
            }
        }
        return f675g.booleanValue();
    }

    public static void t(i iVar) {
        synchronized (f678j) {
            Iterator<WeakReference<i>> it = f677i.iterator();
            while (it.hasNext()) {
                i iVar2 = it.next().get();
                if (iVar2 == iVar || iVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract i.a B(i.a.InterfaceC0307a interfaceC0307a);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public Context b(Context context) {
        return context;
    }

    public abstract <T extends View> T c(int i10);

    public Context d() {
        return null;
    }

    public abstract androidx.appcompat.app.b e();

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract androidx.appcompat.app.a h();

    public abstract void i();

    public abstract void j();

    public abstract void l(Configuration configuration);

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i10);

    public abstract void v(int i10);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public void z(int i10) {
    }
}
