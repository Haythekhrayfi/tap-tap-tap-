package c5;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f3604c = new d("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3606b = 4;

    public d(String str) {
        this.f3605a = str;
    }

    public final boolean a(int i10) {
        return this.f3606b <= i10 || Log.isLoggable(this.f3605a, i10);
    }

    public void b(String str) {
        if (a(3)) {
            Log.d(this.f3605a, str, null);
        }
    }

    public void c(String str) {
        if (a(6)) {
            Log.e(this.f3605a, str, null);
        }
    }

    public void d(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f3605a, str, th);
        }
    }

    public void e(String str) {
        if (a(2)) {
            Log.v(this.f3605a, str, null);
        }
    }

    public void f(String str) {
        if (a(5)) {
            Log.w(this.f3605a, str, null);
        }
    }

    public void g(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f3605a, str, th);
        }
    }
}
