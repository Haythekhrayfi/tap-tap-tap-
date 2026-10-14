package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqv extends zzbqw implements zzbij {
    public DisplayMetrics zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    private final zzcez zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbaw zzk;
    private float zzl;
    private int zzm;

    public zzbqv(zzcez zzcezVar, Context context, zzbaw zzbawVar) {
        super(zzcezVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcezVar;
        this.zzi = context;
        this.zzk = zzbawVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* synthetic */ void zza(Object obj, Map map) {
        int iZzv;
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzbzk.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzbzk.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.zzh.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.zzd = this.zzb;
            iZzv = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] iArrZzM = com.google.android.gms.ads.internal.util.zzs.zzM(activityZzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = zzbzk.zzv(this.zza, iArrZzM[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            iZzv = zzbzk.zzv(this.zza, iArrZzM[1]);
        }
        this.zze = iZzv;
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbqu zzbquVar = new zzbqu();
        zzbaw zzbawVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbquVar.zze(zzbawVar.zza(intent));
        zzbaw zzbawVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbquVar.zzc(zzbawVar2.zza(intent2));
        zzbquVar.zza(this.zzk.zzb());
        zzbquVar.zzd(this.zzk.zzc());
        zzbquVar.zzb(true);
        boolean z10 = zzbquVar.zza;
        boolean z11 = zzbquVar.zzb;
        boolean z12 = zzbquVar.zzc;
        boolean z13 = zzbquVar.zzd;
        boolean z14 = zzbquVar.zze;
        zzcez zzcezVar = this.zzh;
        try {
            jSONObjectPut = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e10) {
            zzbzr.zzh("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObjectPut = null;
        }
        zzcezVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (zzbzr.zzm(2)) {
            zzbzr.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f A[PHI: r2
  0x006f: PHI (r2v4 int) = (r2v3 int), (r2v8 int) binds: [B:11:0x0046, B:17:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i12 = com.google.android.gms.ads.internal.util.zzs.zzN((Activity) this.zzi)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzS)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height != 0) {
                    i13 = height;
                } else if (this.zzh.zzO() != null) {
                    i13 = this.zzh.zzO().zza;
                }
            } else {
                i13 = height;
            }
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i13);
        }
        zzf(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i10, i11);
    }
}
