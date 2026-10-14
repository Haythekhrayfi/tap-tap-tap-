package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzdsw;
import com.google.android.gms.internal.ads.zzdsx;
import com.google.android.gms.internal.ads.zzfwm;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw {
    private zzdsx zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    public String zza = "";

    /* JADX WARN: Multi-variable type inference failed */
    public static final String zzo(Context context, String str, String str2) {
        String strValueOf;
        String str3;
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str2));
        zzfwm zzfwmVarZzb = new zzbo(context).zzb(0, str, map, null);
        try {
            return (String) zzfwmVarZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzey)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            strValueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            zzbzr.zzh(str3.concat(strValueOf), e);
            zzfwmVarZzb.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            e = e11;
            strValueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            zzbzr.zzh(str3.concat(strValueOf), e);
            zzfwmVarZzb.cancel(true);
            return null;
        } catch (Exception e12) {
            zzbzr.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e12);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0030, B:12:0x0038, B:14:0x004d, B:17:0x005f, B:9:0x0029, B:18:0x0064, B:19:0x0066), top: B:29:0x000b, inners: #0, #1 }] */
    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzp();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    zzbzr.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        zzbzr.zzh("Error writing to file in internal storage.", e10);
                    }
                    str4 = this.zzc;
                } else {
                    str4 = this.zzc;
                }
            } else {
                str4 = this.zzc;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final zzdsx zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzdsx zzdsxVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue() || (zzdsxVar = this.zzg) == null) {
            return;
        }
        zzdsxVar.zzh(new zzat(this, context), zzdsw.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzQ(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeu), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzex), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzH(context, str, builderBuildUpon.build().toString());
    }

    public final void zzf(boolean z10) {
        synchronized (this.zzb) {
            this.zzf = z10;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(z10);
                zzdsx zzdsxVar = this.zzg;
                if (zzdsxVar != null) {
                    zzdsxVar.zzj(z10);
                }
            }
        }
    }

    public final void zzg(zzdsx zzdsxVar) {
        this.zzg = zzdsxVar;
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzb) {
            this.zze = z10;
        }
    }

    public final void zzi(Context context, String str, boolean z10, boolean z11) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzav(this, context, str, z10, z11));
        } else {
            zzbzr.zzi("Can not create dialog without Activity Context");
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzew), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zzbzr.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strZzo.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
                zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzh.zzA(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            zzbzr.zzk("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final boolean zzk(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzev), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zzbzr.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZzo.trim());
            String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
                boolean z10 = "0".equals(this.zza) || "2".equals(this.zza);
                zzf(z10);
                zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
                if (!z10) {
                    str = "";
                }
                zzgVarZzh.zzA(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (JSONException e10) {
            zzbzr.zzk("Fail to get in app preview response json.", e10);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzf;
        }
        return z10;
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zze;
        }
        return z10;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        zzbzr.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
