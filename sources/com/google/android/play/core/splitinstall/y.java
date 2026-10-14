package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12524a;

    public y(Context context) {
        this.f12524a = context;
    }

    public static File a(Context context) {
        String string;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            return new File(context.getExternalFilesDir(null), string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final t a() {
        return t.a(this.f12524a);
    }

    public final Context b() {
        return this.f12524a;
    }
}
