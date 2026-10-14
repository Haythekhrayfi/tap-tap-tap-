package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeby implements zzebz {
    public static /* synthetic */ zzfgw zzc(String str, String str2, String str3, zzeca zzecaVar, String str4, WebView webView, String str5, String str6, zzecb zzecbVar) {
        String strValueOf;
        String str7;
        String strConcat;
        zzfhf zzfhfVarZza = zzfhf.zza("Google", str2);
        zzfhe zzfheVarZzm = zzm("javascript");
        zzfhb zzfhbVarZzk = zzk(zzecaVar.toString());
        zzfhe zzfheVar = zzfhe.NONE;
        if (zzfheVarZzm == zzfheVar) {
            strConcat = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (zzfhbVarZzk == null) {
                strValueOf = String.valueOf(zzecaVar);
                str7 = "Omid html session error; Unable to parse creative type: ";
            } else {
                zzfhe zzfheVarZzm2 = zzm(str4);
                if (zzfhbVarZzk != zzfhb.VIDEO || zzfheVarZzm2 != zzfheVar) {
                    return zzfgw.zza(zzfgx.zza(zzfhbVarZzk, zzl(zzecbVar.toString()), zzfheVarZzm, zzfheVarZzm2, true), zzfgy.zzb(zzfhfVarZza, webView, str5, ""));
                }
                strValueOf = String.valueOf(str4);
                str7 = "Omid html session error; Video events owner unknown for video creative: ";
            }
            strConcat = str7.concat(strValueOf);
        }
        zzbzr.zzj(strConcat);
        return null;
    }

    public static /* synthetic */ zzfgw zzd(String str, String str2, String str3, String str4, zzeca zzecaVar, WebView webView, String str5, String str6, zzecb zzecbVar) {
        String strValueOf;
        String str7;
        String strConcat;
        zzfhf zzfhfVarZza = zzfhf.zza(str, str2);
        zzfhe zzfheVarZzm = zzm("javascript");
        zzfhe zzfheVarZzm2 = zzm(str4);
        zzfhb zzfhbVarZzk = zzk(zzecaVar.toString());
        zzfhe zzfheVar = zzfhe.NONE;
        if (zzfheVarZzm == zzfheVar) {
            strConcat = "Omid js session error; Unable to parse impression owner: javascript";
        } else {
            if (zzfhbVarZzk == null) {
                strValueOf = String.valueOf(zzecaVar);
                str7 = "Omid js session error; Unable to parse creative type: ";
            } else {
                if (zzfhbVarZzk != zzfhb.VIDEO || zzfheVarZzm2 != zzfheVar) {
                    return zzfgw.zza(zzfgx.zza(zzfhbVarZzk, zzl(zzecbVar.toString()), zzfheVarZzm, zzfheVarZzm2, true), zzfgy.zzc(zzfhfVarZza, webView, str5, ""));
                }
                strValueOf = String.valueOf(str4);
                str7 = "Omid js session error; Video events owner unknown for video creative: ";
            }
            strConcat = str7.concat(strValueOf);
        }
        zzbzr.zzj(strConcat);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfhb zzk(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("video")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return zzfhb.HTML_DISPLAY;
        }
        if (b10 == 1) {
            return zzfhb.NATIVE_DISPLAY;
        }
        if (b10 != 2) {
            return null;
        }
        return zzfhb.VIDEO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfhd zzl(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("beginToRender")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return zzfhd.BEGIN_TO_RENDER;
        }
        if (b10 != 1) {
            return b10 != 2 ? zzfhd.UNSPECIFIED : zzfhd.ONE_PIXEL;
        }
        return zzfhd.DEFINED_BY_JAVASCRIPT;
    }

    private static zzfhe zzm(String str) {
        if (PluginErrorDetails.Platform.NATIVE.equals(str)) {
            return zzfhe.NATIVE;
        }
        return "javascript".equals(str) ? zzfhe.JAVASCRIPT : zzfhe.NONE;
    }

    private static final Object zzn(zzebx zzebxVar) {
        try {
            return zzebxVar.zza();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final zzfgw zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzecb zzecbVar, final zzeca zzecaVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue() || !zzfgu.zzb()) {
            return null;
        }
        final String str6 = "Google";
        final String str7 = "javascript";
        final String str8 = "";
        return (zzfgw) zzn(new zzebx(str6, str, str7, zzecaVar, str4, webView, str5, str8, zzecbVar) { // from class: com.google.android.gms.internal.ads.zzebu
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzeca zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzecb zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzecaVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzecbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzebx
            public final Object zza() {
                return zzeby.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final zzfgw zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzecb zzecbVar, final zzeca zzecaVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue() || !zzfgu.zzb()) {
            return null;
        }
        final String str7 = "javascript";
        final String str8 = "";
        return (zzfgw) zzn(new zzebx(str5, str, str7, str4, zzecaVar, webView, str6, str8, zzecbVar) { // from class: com.google.android.gms.internal.ads.zzebv
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzeca zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzecb zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzecaVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzecbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzebx
            public final Object zza() {
                return zzeby.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final String zze(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue()) {
            return (String) zzn(new zzebx() { // from class: com.google.android.gms.internal.ads.zzebr
                @Override // com.google.android.gms.internal.ads.zzebx
                public final Object zza() {
                    return "a.1.3.37-google_20220829";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final void zzf(final zzfgw zzfgwVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // java.lang.Runnable
            public final void run() {
                zzfgw zzfgwVar2 = zzfgwVar;
                View view2 = view;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue() && zzfgu.zzb()) {
                    zzfgwVar2.zzb(view2, zzfhc.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final void zzg(final zzfgw zzfgwVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // java.lang.Runnable
            public final void run() {
                zzfgw zzfgwVar2 = zzfgwVar;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue() && zzfgu.zzb()) {
                    zzfgwVar2.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final void zzh(final zzfgw zzfgwVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // java.lang.Runnable
            public final void run() {
                zzfgw zzfgwVar2 = zzfgwVar;
                View view2 = view;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue() && zzfgu.zzb()) {
                    zzfgwVar2.zzd(view2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final void zzi(final zzfgw zzfgwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue() && zzfgu.zzb()) {
            Objects.requireNonNull(zzfgwVar);
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebs
                @Override // java.lang.Runnable
                public final void run() {
                    zzfgwVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebz
    public final boolean zzj(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue()) {
            Boolean bool = (Boolean) zzn(new zzebx() { // from class: com.google.android.gms.internal.ads.zzebw
                @Override // com.google.android.gms.internal.ads.zzebx
                public final Object zza() {
                    Context context2 = context;
                    if (zzfgu.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfgu.zza(context2);
                    return Boolean.valueOf(zzfgu.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        zzbzr.zzj("Omid flag is disabled");
        return false;
    }
}
