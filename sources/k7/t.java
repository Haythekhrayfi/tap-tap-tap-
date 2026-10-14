package k7;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f31931a;

    public t(Context context, String str) {
        this.f31931a = context.getSharedPreferences(str, 0);
    }
}
