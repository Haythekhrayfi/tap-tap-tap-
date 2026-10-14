package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekp implements zzeqy {
    private final zzfwn zza;
    private final zzfwn zzb;
    private final Context zzc;
    private final zzfai zzd;
    private final View zze;

    public zzekp(zzfwn zzfwnVar, zzfwn zzfwnVar2, Context context, zzfai zzfaiVar, ViewGroup viewGroup) {
        this.zza = zzfwnVar;
        this.zzb = zzfwnVar2;
        this.zzc = context;
        this.zzd = zzfaiVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        zzfwn zzfwnVar;
        Callable callable;
        zzbbm.zza(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjD)).booleanValue()) {
            zzfwnVar = this.zzb;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzekn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc();
                }
            };
        } else {
            zzfwnVar = this.zza;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeko
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzd();
                }
            };
        }
        return zzfwnVar.zzb(callable);
    }

    public final /* synthetic */ zzekq zzc() throws Exception {
        return new zzekq(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzekq zzd() throws Exception {
        return new zzekq(this.zzc, this.zzd.zze, zze());
    }
}
