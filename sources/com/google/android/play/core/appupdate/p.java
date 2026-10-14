package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ap;
import com.google.android.play.core.internal.by;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final af f11757b = new af("AppUpdateService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Intent f11758c = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap<com.google.android.play.core.internal.n> f11759a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f11761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f11762f;

    public p(Context context, r rVar) {
        this.f11760d = context.getPackageName();
        this.f11761e = context;
        this.f11762f = rVar;
        if (by.a(context)) {
            this.f11759a = new ap<>(com.google.android.play.core.splitcompat.p.a(context), f11757b, "AppUpdateService", f11758c, j.f11745a);
        }
    }

    public static /* synthetic */ Bundle a(p pVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(d());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(pVar.f11761e.getPackageManager().getPackageInfo(pVar.f11761e.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f11757b.b("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    private static <T> Task<T> c() {
        f11757b.b("onError(%d)", -9);
        return Tasks.a((Exception) new InstallException(-9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10800);
        return bundle;
    }

    public final Task<AppUpdateInfo> a(String str) {
        if (this.f11759a == null) {
            return c();
        }
        com.google.android.play.core.tasks.i iVarA = z.a(f11757b, "requestUpdateInfo(%s)", new Object[]{str});
        this.f11759a.a(new k(this, iVarA, str, iVarA));
        return iVarA.a();
    }

    public final Task<Void> b(String str) {
        if (this.f11759a == null) {
            return c();
        }
        com.google.android.play.core.tasks.i iVarA = z.a(f11757b, "completeUpdate(%s)", new Object[]{str});
        this.f11759a.a(new l(this, iVarA, iVarA, str));
        return iVarA.a();
    }
}
