package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2377b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f2378c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f2379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PreferenceScreen f2382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f2383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f2384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f2385j;

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public k(Context context) {
        this.f2376a = context;
        this.f2381f = context.getPackageName() + "_preferences";
    }

    public SharedPreferences.Editor a() {
        if (!this.f2380e) {
            return b().edit();
        }
        if (this.f2379d == null) {
            this.f2379d = b().edit();
        }
        return this.f2379d;
    }

    public SharedPreferences b() {
        if (this.f2378c == null) {
            this.f2378c = this.f2376a.getSharedPreferences(this.f2381f, 0);
        }
        return this.f2378c;
    }
}
