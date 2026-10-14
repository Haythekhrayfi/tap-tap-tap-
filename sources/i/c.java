package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class c extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f31121f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f31123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f31124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f31125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f31126e;

    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f31122a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f31123b = theme;
    }

    public void a(Configuration configuration) {
        if (this.f31126e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f31125d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f31125d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f31123b == null) {
            this.f31123b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f31123b.setTo(theme);
            }
        }
        this.f31123b.applyStyle(this.f31122a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources;
        if (this.f31126e == null) {
            Configuration configuration = this.f31125d;
            if (configuration == null) {
                resources = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f31121f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        f31121f = configuration2;
                    }
                    if (configuration.equals(f31121f)) {
                        resources = super.getResources();
                    }
                }
                resources = a.a(this, this.f31125d).getResources();
            }
            this.f31126e = resources;
        }
        return this.f31126e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f31124c == null) {
            this.f31124c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f31124c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f31123b;
        if (theme != null) {
            return theme;
        }
        if (this.f31122a == 0) {
            this.f31122a = 2131952257;
        }
        b();
        return this.f31123b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f31122a != i10) {
            this.f31122a = i10;
            b();
        }
    }
}
