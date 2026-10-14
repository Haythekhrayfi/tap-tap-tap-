package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzgws;
import e0.a;
import n.j;

/* JADX INFO: loaded from: classes.dex */
final class zzn implements zzbcl {
    public final /* synthetic */ zzbcn zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ Uri zzc;

    public zzn(zzs zzsVar, zzbcn zzbcnVar, Context context, Uri uri) {
        this.zza = zzbcnVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zza() {
        j jVarA = new j.a(this.zza.zza()).a();
        jVarA.f33567a.setPackage(zzgws.zza(this.zzb));
        Context context = this.zzb;
        jVarA.f33567a.setData(this.zzc);
        Intent intent = jVarA.f33567a;
        Object obj = a.f28964a;
        a.C0247a.b(context, intent, null);
        this.zza.zzf((Activity) this.zzb);
    }
}
