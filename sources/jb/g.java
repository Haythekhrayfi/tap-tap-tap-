package jb;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static void a(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("android_rate_pref_file", 0).edit();
        editorEdit.putBoolean("android_rate_is_agree_show_dialog", z10);
        editorEdit.apply();
    }
}
