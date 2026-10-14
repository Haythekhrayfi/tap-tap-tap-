package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d6.r;
import f5.l0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f12635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rpc f12637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x5.b<g6.g> f12638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x5.b<v5.h> f12639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y5.b f12640f;

    public e(u4.d dVar, r rVar, x5.b<g6.g> bVar, x5.b<v5.h> bVar2, y5.b bVar3) {
        dVar.a();
        Rpc rpc = new Rpc(dVar.f36011a);
        this.f12635a = dVar;
        this.f12636b = rVar;
        this.f12637c = rpc;
        this.f12638d = bVar;
        this.f12639e = bVar2;
        this.f12640f = bVar3;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(d6.e.f28681f, new l0(this));
    }

    public final void b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i10;
        String str3;
        String strEncodeToString;
        v5.h.a aVarB;
        PackageInfo packageInfoC;
        bundle.putString(Action.SCOPE_ATTRIBUTE, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        u4.d dVar = this.f12635a;
        dVar.a();
        bundle.putString("gmp_app_id", dVar.f36013c.f36025b);
        r rVar = this.f12636b;
        synchronized (rVar) {
            if (rVar.f28734d == 0 && (packageInfoC = rVar.c("com.google.android.gms")) != null) {
                rVar.f28734d = packageInfoC.versionCode;
            }
            i10 = rVar.f28734d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f12636b.a());
        r rVar2 = this.f12636b;
        synchronized (rVar2) {
            if (rVar2.f28733c == null) {
                rVar2.e();
            }
            str3 = rVar2.f28733c;
        }
        bundle.putString("app_ver_name", str3);
        u4.d dVar2 = this.f12635a;
        dVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(dVar2.f36012b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((com.google.firebase.installations.e) Tasks.await(this.f12640f.a(false))).a();
            if (TextUtils.isEmpty(strA)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f12640f.getId()));
        bundle.putString("cliv", "fcm-23.1.0");
        v5.h hVar = this.f12639e.get();
        g6.g gVar = this.f12638d.get();
        if (hVar == null || gVar == null || (aVarB = hVar.b("fire-iid")) == v5.h.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.getCode()));
        bundle.putString("Firebase-Client", gVar.a());
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f12637c.send(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }
}
