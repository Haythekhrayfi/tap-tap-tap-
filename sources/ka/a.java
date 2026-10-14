package ka;

import android.text.TextUtils;
import i.f;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31961e;

    public a(String str, String str2, int i10) {
        this.f31957a = str;
        this.f31958b = str2;
        this.f31959c = i10;
    }

    public static String a(String str, String str2) {
        return f.a(!TextUtils.isEmpty(str) ? f.a(str, ".") : null, str2);
    }

    public void b(int i10) {
        this.f31961e = System.currentTimeMillis();
        this.f31960d = i10;
    }
}
