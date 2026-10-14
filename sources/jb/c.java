package jb;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f31801c;

    public c(Context context, f fVar) {
        this.f31801c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        SharedPreferences.Editor editorEdit = this.f31801c.getSharedPreferences("android_rate_pref_file", 0).edit();
        editorEdit.remove("android_rate_remind_interval");
        editorEdit.putLong("android_rate_remind_interval", new Date().getTime());
        editorEdit.apply();
    }
}
