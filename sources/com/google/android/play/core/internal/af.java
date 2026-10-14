package com.google.android.play.core.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.d0;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12242a;

    public af(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(iMyUid);
        sb2.append("]  PID: [");
        sb2.append(iMyPid);
        sb2.append("] ");
        String strValueOf = String.valueOf(sb2.toString());
        String strValueOf2 = String.valueOf(str);
        this.f12242a = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    private final int a(int i10, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i10)) {
            return Log.i("PlayCore", a(this.f12242a, str, objArr));
        }
        return 0;
    }

    private static String a(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                String strValueOf = String.valueOf(str2);
                Log.e("PlayCore", strValueOf.length() != 0 ? "Unable to format ".concat(strValueOf) : new String("Unable to format "), e10);
                String strJoin = TextUtils.join(", ", objArr);
                str2 = w0.a.a(new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(strJoin).length()), str2, " [", strJoin, "]");
            }
        }
        return d0.a(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        a(3, str, objArr);
    }

    public final void a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", a(this.f12242a, str, objArr), th);
        }
    }

    public final void b(String str, Object... objArr) {
        a(6, str, objArr);
    }

    public final void c(String str, Object... objArr) {
        a(4, str, objArr);
    }

    public final void d(String str, Object... objArr) {
        a(5, str, objArr);
    }
}
