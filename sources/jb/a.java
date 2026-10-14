package jb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.inscode.autoclicker.ui.main.MainActivity;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f31793f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f31795b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31796c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31797d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31798e = 1;

    /* JADX INFO: renamed from: jb.a$a, reason: collision with other inner class name */
    public interface InterfaceC0327a {
    }

    public a(Context context) {
        this.f31794a = context.getApplicationContext();
    }

    public static boolean a(InterfaceC0327a interfaceC0327a) {
        Objects.requireNonNull(f31793f);
        a aVar = f31793f;
        boolean z10 = false;
        if (aVar.f31794a.getSharedPreferences("android_rate_pref_file", 0).getBoolean("android_rate_is_agree_show_dialog", true)) {
            if ((aVar.f31794a.getSharedPreferences("android_rate_pref_file", 0).getInt("android_rate_launch_times", 0) >= aVar.f31797d) && b(aVar.f31794a.getSharedPreferences("android_rate_pref_file", 0).getLong("android_rate_install_date", 0L), aVar.f31796c) && b(aVar.f31794a.getSharedPreferences("android_rate_pref_file", 0).getLong("android_rate_remind_interval", 0L), aVar.f31798e)) {
                z10 = true;
            }
        }
        if (z10) {
            MainActivity.initRateApp$lambda$15(((com.inscode.autoclicker.ui.main.b) interfaceC0327a).f13381c);
        }
        return z10;
    }

    public static boolean b(long j10, int i10) {
        return new Date().getTime() - j10 >= ((long) ((((i10 * 24) * 60) * 60) * 1000));
    }

    public static a e(Context context) {
        if (f31793f == null) {
            synchronized (a.class) {
                if (f31793f == null) {
                    f31793f = new a(context);
                }
            }
        }
        return f31793f;
    }

    public void c() {
        if (this.f31794a.getSharedPreferences("android_rate_pref_file", 0).getLong("android_rate_install_date", 0L) == 0) {
            SharedPreferences.Editor editorEdit = this.f31794a.getSharedPreferences("android_rate_pref_file", 0).edit();
            editorEdit.putLong("android_rate_install_date", new Date().getTime());
            editorEdit.apply();
        }
        Context context = this.f31794a;
        int i10 = context.getSharedPreferences("android_rate_pref_file", 0).getInt("android_rate_launch_times", 0) + 1;
        SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("android_rate_pref_file", 0).edit();
        editorEdit2.putInt("android_rate_launch_times", i10);
        editorEdit2.apply();
    }

    public void d(Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        e eVar = this.f31795b;
        androidx.appcompat.app.g.a aVar = new androidx.appcompat.app.g.a(activity);
        aVar.setMessage(activity.getString(eVar.f31806d));
        aVar.setTitle(activity.getString(eVar.f31805c));
        aVar.setCancelable(false);
        aVar.setPositiveButton(activity.getString(eVar.f31807e), new b(eVar, activity, null));
        if (eVar.f31803a) {
            aVar.setNeutralButton(activity.getString(eVar.f31808f), new c(activity, null));
        }
        aVar.setNegativeButton(activity.getString(eVar.f31809g), new d(activity, null));
        aVar.create().show();
    }
}
