package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u4.d;
import x4.b;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f12555c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzee f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f12557b;

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f12556a = zzeeVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f12555c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f12555c == null) {
                    f12555c = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                }
            }
        }
        return f12555c;
    }

    @Keep
    public static zzie getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzeeVarZzg = zzee.zzg(context, null, null, null, bundle);
        if (zzeeVarZzg == null) {
            return null;
        }
        return new b(zzeeVarZzg);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = com.google.firebase.installations.b.f12568m;
            return (String) Tasks.await(com.google.firebase.installations.b.f(d.b()).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f12556a.zzG(activity, str, str2);
    }
}
