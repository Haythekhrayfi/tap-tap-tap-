package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzgd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3764a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3765b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f3766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f3767d;

    public /* synthetic */ d0(f fVar, l lVar) {
        this.f3767d = fVar;
        this.f3766c = lVar;
    }

    public final void a(n nVar) {
        synchronized (this.f3764a) {
            l lVar = this.f3766c;
            if (lVar != null) {
                lVar.a(nVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzi("BillingClient", "Billing service connected.");
        this.f3767d.f3793g = zzd.zzn(iBinder);
        f fVar = this.f3767d;
        if (fVar.n(new Callable() { // from class: com.android.billingclient.api.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle;
                int i10;
                int iZzq;
                d0 d0Var = this.f3759c;
                synchronized (d0Var.f3764a) {
                    if (!d0Var.f3765b) {
                        if (TextUtils.isEmpty(null)) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("accountName", null);
                        }
                        int i11 = 3;
                        try {
                            String packageName = d0Var.f3767d.f3791e.getPackageName();
                            iZzq = 3;
                            int i12 = 20;
                            while (true) {
                                if (i12 < 3) {
                                    i12 = 0;
                                    break;
                                }
                                if (bundle == null) {
                                    try {
                                        iZzq = d0Var.f3767d.f3793g.zzq(i12, packageName, "subs");
                                    } catch (Exception e10) {
                                        e = e10;
                                        i11 = iZzq;
                                        zzb.zzk("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        d0Var.f3767d.f3787a = 0;
                                        d0Var.f3767d.f3793g = null;
                                        i10 = 42;
                                        iZzq = i11;
                                    }
                                } else {
                                    iZzq = d0Var.f3767d.f3793g.zzc(i12, packageName, "subs", bundle);
                                }
                                if (iZzq == 0) {
                                    zzb.zzi("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                    break;
                                }
                                i12--;
                            }
                            Objects.requireNonNull(d0Var.f3767d);
                            boolean z10 = true;
                            d0Var.f3767d.f3795i = i12 >= 3;
                            if (i12 < 3) {
                                zzb.zzi("BillingClient", "In-app billing API does not support subscription on this device.");
                                i10 = 9;
                            } else {
                                i10 = 1;
                            }
                            for (int i13 = 20; i13 >= 3; i13--) {
                                iZzq = bundle == null ? d0Var.f3767d.f3793g.zzq(i13, packageName, "inapp") : d0Var.f3767d.f3793g.zzc(i13, packageName, "inapp", bundle);
                                if (iZzq == 0) {
                                    d0Var.f3767d.f3796j = i13;
                                    zzb.zzi("BillingClient", "mHighestLevelSupportedForInApp: " + i13);
                                    break;
                                }
                            }
                            f fVar2 = d0Var.f3767d;
                            int i14 = fVar2.f3796j;
                            fVar2.f3804r = i14 >= 19;
                            fVar2.f3803q = i14 >= 17;
                            fVar2.f3802p = i14 >= 16;
                            fVar2.f3801o = i14 >= 15;
                            fVar2.f3800n = i14 >= 14;
                            fVar2.f3799m = i14 >= 10;
                            fVar2.f3798l = i14 >= 9;
                            if (i14 < 6) {
                                z10 = false;
                            }
                            fVar2.f3797k = z10;
                            if (i14 < 3) {
                                zzb.zzj("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i10 = 36;
                            }
                            if (iZzq == 0) {
                                d0Var.f3767d.f3787a = 2;
                            } else {
                                d0Var.f3767d.f3787a = 0;
                                d0Var.f3767d.f3793g = null;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        f fVar3 = d0Var.f3767d;
                        if (iZzq == 0) {
                            fVar3.f3792f.f(u1.a.x(6));
                            d0Var.a(e0.f3778k);
                        } else {
                            j1.c cVar = fVar3.f3792f;
                            n nVar = e0.f3768a;
                            cVar.e(u1.a.w(i10, 6, nVar));
                            d0Var.a(nVar);
                        }
                    }
                }
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0 d0Var = this.f3760c;
                d0Var.f3767d.f3787a = 0;
                d0Var.f3767d.f3793g = null;
                j1.c cVar = d0Var.f3767d.f3792f;
                n nVar = e0.f3780m;
                cVar.e(u1.a.w(24, 6, nVar));
                d0Var.a(nVar);
            }
        }, fVar.j()) == null) {
            n nVarL = this.f3767d.l();
            this.f3767d.f3792f.e(u1.a.w(25, 6, nVarL));
            a(nVarL);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzj("BillingClient", "Billing service disconnected.");
        j1.c cVar = this.f3767d.f3792f;
        zzgd zzgdVarZzw = zzgd.zzw();
        Objects.requireNonNull(cVar);
        try {
            zzfy zzfyVarZzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) cVar.f31679a;
            if (zzfmVar != null) {
                zzfyVarZzv.zzk(zzfmVar);
            }
            zzfyVarZzv.zzl(zzgdVarZzw);
            ((g0) cVar.f31680b).a((zzfz) zzfyVarZzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
        this.f3767d.f3793g = null;
        this.f3767d.f3787a = 0;
        synchronized (this.f3764a) {
            l lVar = this.f3766c;
            if (lVar != null) {
                lVar.b();
            }
        }
    }
}
