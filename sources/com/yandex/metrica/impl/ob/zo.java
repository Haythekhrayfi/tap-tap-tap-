package com.yandex.metrica.impl.ob;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f18065a;

    public zo(boolean z10) {
        this.f18065a = false;
        this.f18065a = z10;
    }

    private String d(String str, Object[] objArr) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a());
            if (str == null) {
                str = "";
            }
            sb2.append(String.format(Locale.US, str, objArr));
            return sb2.toString();
        } catch (Throwable unused) {
            return a();
        }
    }

    public abstract String a();

    public void a(int i10, String str) {
        if (f()) {
            String strB = b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a());
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.println(i10, strB, sb2.toString());
        }
    }

    public void a(String str) {
        a(6, str);
    }

    public void a(String str, Object... objArr) {
        if (f()) {
            Log.println(4, b(), d(str, objArr));
        }
    }

    public void a(Throwable th, String str) {
        if (this.f18065a) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a());
            if (str == null) {
                str = "";
            }
            sb3.append(str);
            sb2.append(sb3.toString());
            sb2.append("\n");
            sb2.append(Log.getStackTraceString(th));
            Log.println(6, "AppMetrica", sb2.toString());
        }
    }

    public void a(Throwable th, String str, Object... objArr) {
        Log.println(6, b(), d(str, objArr) + "\n" + Log.getStackTraceString(th));
    }

    public abstract String b();

    public void b(String str) {
        a(4, str);
    }

    public void b(String str, Object... objArr) {
        Log.println(5, b(), d(str, objArr));
    }

    public void c(String str) {
        a(5, str);
    }

    public void c(String str, Object... objArr) {
        if (f()) {
            Log.println(5, b(), d(str, objArr));
        }
    }

    public boolean c() {
        return this.f18065a;
    }

    public void d() {
        this.f18065a = false;
    }

    public void e() {
        this.f18065a = true;
    }

    public boolean f() {
        return this.f18065a;
    }
}
