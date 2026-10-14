package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
final class dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12136a = new com.google.android.play.core.internal.af("PackageStateCache");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12138c = -1;

    public dl(Context context) {
        this.f12137b = context;
    }

    public final synchronized int a() {
        if (this.f12138c == -1) {
            try {
                this.f12138c = this.f12137b.getPackageManager().getPackageInfo(this.f12137b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f12136a.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f12138c;
    }
}
