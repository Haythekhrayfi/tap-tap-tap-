package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbit implements zzbij {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdqa zzb;
    private final zzfev zzc;
    private final zzbqq zze;
    private final zzeba zzf;
    private com.google.android.gms.ads.internal.overlay.zzx zzg = null;
    private final zzbzw zzd = new zzbzw(null);

    public zzbit(com.google.android.gms.ads.internal.zzb zzbVar, zzbqq zzbqqVar, zzeba zzebaVar, zzdqa zzdqaVar, zzfev zzfevVar) {
        this.zza = zzbVar;
        this.zze = zzbqqVar;
        this.zzf = zzebaVar;
        this.zzb = zzdqaVar;
        this.zzc = zzfevVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzc(Context context, zzaqs zzaqsVar, Uri uri, View view, Activity activity) {
        if (zzaqsVar == null) {
            return uri;
        }
        try {
            return zzaqsVar.zze(uri) ? zzaqsVar.zza(uri, context, view, activity) : uri;
        } catch (zzaqt unused) {
            return uri;
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            zzbzr.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    private final void zzh(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdqa zzdqaVar = this.zzb;
        if (zzdqaVar != null) {
            zzebl.zzc(context, zzdqaVar, this.zzc, this.zzf, str, "dialog_not_shown", zzfsf.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130  */
    private final void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z10, String str, boolean z11) {
        Uri.Builder builderScheme;
        ArrayList arrayList;
        Intent intentZza;
        Intent intentZza2;
        ResolveInfo resolveInfoZzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzc;
        boolean z12 = true;
        zzj(true);
        zzcez zzcezVar = (zzcez) zzaVar;
        Context context = zzcezVar.getContext();
        zzaqs zzaqsVarZzI = zzcezVar.zzI();
        View viewZzF = zzcezVar.zzF();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intentZzb = null;
        Uri uriBuild = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri uriZzd = zzd(zzc(context, zzaqsVarZzI, Uri.parse(str2), viewZzF, null));
            boolean z13 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z14 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzek)).booleanValue()) {
                    z12 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriZzd.getScheme())) {
                builderScheme = uriZzd.buildUpon().scheme("https");
            } else if ("https".equalsIgnoreCase(uriZzd.getScheme())) {
                builderScheme = uriZzd.buildUpon().scheme("http");
            } else {
                arrayList = new ArrayList();
                intentZza = zzbis.zza(uriZzd, context, zzaqsVarZzI, viewZzF);
                intentZza2 = zzbis.zza(uriBuild, context, zzaqsVarZzI, viewZzF);
                if (z12) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza2);
                }
                resolveInfoZzd = zzbis.zzd(intentZza, arrayList, context, zzaqsVarZzI, viewZzF);
                if (resolveInfoZzd != null) {
                    intentZzb = zzbis.zzb(intentZza, resolveInfoZzd, context, zzaqsVarZzI, viewZzF);
                } else if (intentZza2 == null && (resolveInfoZzc = zzbis.zzc(intentZza2, context, zzaqsVarZzI, viewZzF)) != null) {
                    intentZzb = zzbis.zzb(intentZza, resolveInfoZzc, context, zzaqsVarZzI, viewZzF);
                    if (zzbis.zzc(intentZzb, context, zzaqsVarZzI, viewZzF) == null) {
                        if (!arrayList.isEmpty()) {
                            intentZzb = intentZza;
                        } else if (!z14) {
                            if (z13) {
                                intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
                            } else {
                                intentZzb = intentZza;
                            }
                        } else if (z13) {
                            intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
                        } else {
                            intentZzb = intentZza;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    intentZzb = intentZza;
                } else if (!z14 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i10);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                int i11 = i10 + 1;
                                if (!it.hasNext()) {
                                    i10 = i11;
                                } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                    intentZzb = zzbis.zzb(intentZza, resolveInfo, context, zzaqsVarZzI, viewZzF);
                                }
                            }
                        } else if (z13) {
                            intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
                        } else {
                            intentZzb = intentZza;
                        }
                    }
                } else if (z13) {
                    intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
                } else {
                    intentZzb = intentZza;
                }
            }
            uriBuild = builderScheme.build();
            arrayList = new ArrayList();
            intentZza = zzbis.zza(uriZzd, context, zzaqsVarZzI, viewZzF);
            intentZza2 = zzbis.zza(uriBuild, context, zzaqsVarZzI, viewZzF);
            if (z12) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza2);
            }
            resolveInfoZzd = zzbis.zzd(intentZza, arrayList, context, zzaqsVarZzI, viewZzF);
            if (resolveInfoZzd != null) {
                intentZzb = zzbis.zzb(intentZza, resolveInfoZzd, context, zzaqsVarZzI, viewZzF);
            } else if (intentZza2 == null) {
                if (!arrayList.isEmpty()) {
                    intentZzb = intentZza;
                } else if (!z14) {
                    if (z13) {
                        intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
                    } else {
                        intentZzb = intentZza;
                    }
                } else if (z13) {
                    intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
                } else {
                    intentZzb = intentZza;
                }
            } else if (!arrayList.isEmpty()) {
                intentZzb = intentZza;
            } else if (!z14) {
                if (z13) {
                    intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
                } else {
                    intentZzb = intentZza;
                }
            } else if (z13) {
                intentZzb = zzbis.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzaqsVarZzI, viewZzF);
            } else {
                intentZzb = intentZza;
            }
        }
        if (!z10 || this.zzf == null || intentZzb == null || !zzk(zzaVar, zzcezVar.getContext(), intentZzb.getData().toString(), str)) {
            try {
                ((zzcge) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intentZzb, this.zzg), z11);
            } catch (ActivityNotFoundException e10) {
                zzbzr.zzj(e10.getMessage());
            }
        }
    }

    private final void zzj(boolean z10) {
        zzbqq zzbqqVar = this.zze;
        if (zzbqqVar != null) {
            zzbqqVar.zza(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(android.os.Build.VERSION.SDK_INT < 33 ? com.google.android.gms.internal.ads.zzbbm.zzhY : com.google.android.gms.internal.ads.zzbbm.zzhX)).booleanValue() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzk(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbit.zzk(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(int i10) {
        if (this.zzb == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzig)).booleanValue()) {
            zzdpz zzdpzVarZza = this.zzb.zza();
            zzdpzVarZza.zzb("action", "cct_action");
            zzdpzVarZza.zzb("cct_open_status", zzbcm.zza(i10));
            zzdpzVarZza.zzg();
            return;
        }
        zzfev zzfevVar = this.zzc;
        String strZza = zzbcm.zza(i10);
        zzfeu zzfeuVarZzb = zzfeu.zzb("cct_action");
        zzfeuVarZzb.zza("cct_open_status", strZza);
        zzfevVar.zzb(zzfeuVarZzb);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0307  */
    @Override // com.google.android.gms.internal.ads.zzbij
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z10;
        zzcez zzcezVar = (zzcez) zzaVar;
        String strZzc = zzbxy.zzc((String) map.get("u"), zzcezVar.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzbzr.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(strZzc);
            return;
        }
        zzezn zzeznVarZzD = zzcezVar.zzD();
        zzezq zzezqVarZzP = zzcezVar.zzP();
        boolean z11 = false;
        if (zzeznVarZzD == null || zzezqVarZzP == null) {
            str = "";
            z10 = false;
        } else {
            z10 = zzeznVarZzD.zzaj;
            str = zzezqVarZzP.zzb;
        }
        boolean z12 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjq)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcezVar.zzaA()) {
                zzbzr.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzj(false);
                ((zzcge) zzaVar).zzaF(zzf(map), zzb(map), z12);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzj(false);
            if (strZzc != null) {
                ((zzcge) zzaVar).zzaG(zzf(map), zzb(map), strZzc, z12);
                return;
            } else {
                ((zzcge) zzaVar).zzaH(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z12);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcezVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzem)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzes)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeq)).booleanValue()) {
                        z11 = true;
                        break;
                    }
                    String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzer);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        Iterator it = zzfpu.zzc(zzfos.zzc(';')).zzd(str3).iterator();
                        while (it.hasNext()) {
                            if (((String) it.next()).equals(packageName)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zZzg = zzbcn.zzg(zzcezVar.getContext());
            if (z11) {
                if (zZzg) {
                    zzj(true);
                    if (TextUtils.isEmpty(strZzc)) {
                        zzbzr.zzj("Cannot open browser with null or empty url");
                        zzl(7);
                        return;
                    }
                    Uri uriZzd = zzd(zzc(zzcezVar.getContext(), zzcezVar.zzI(), Uri.parse(strZzc), zzcezVar.zzF(), zzcezVar.zzi()));
                    if (z10 && this.zzf != null && zzk(zzaVar, zzcezVar.getContext(), uriZzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbiq(this);
                    ((zzcge) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(null, uriZzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z12);
                    return;
                }
                zzl(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzi(zzaVar, map, z10, str, z12);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzi(zzaVar, map, z10, str, z12);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhN)).booleanValue()) {
                zzj(true);
                String str4 = (String) map.get("p");
                if (str4 == null) {
                    zzbzr.zzj("Package name missing from open app action.");
                    return;
                }
                if (z10 && this.zzf != null && zzk(zzaVar, zzcezVar.getContext(), str4, str)) {
                    return;
                }
                PackageManager packageManager = zzcezVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzbzr.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                if (launchIntentForPackage != null) {
                    ((zzcge) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z12);
                    return;
                }
                return;
            }
            return;
        }
        zzj(true);
        String str5 = (String) map.get("intent_url");
        Intent uri = null;
        if (!TextUtils.isEmpty(str5)) {
            try {
                uri = Intent.parseUri(str5, 0);
            } catch (URISyntaxException e10) {
                zzbzr.zzh("Error parsing the url: ".concat(String.valueOf(str5)), e10);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZzd2 = zzd(zzc(zzcezVar.getContext(), zzcezVar.zzI(), data, zzcezVar.zzF(), zzcezVar.zzi()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriZzd2);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhO)).booleanValue()) {
                        intent.setDataAndType(uriZzd2, intent.getType());
                    } else {
                        intent.setData(uriZzd2);
                    }
                }
            }
        }
        boolean z13 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzic)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap map2 = new HashMap();
        if (z13) {
            this.zzg = new zzbir(this, z12, zzaVar, map2, map);
            z12 = false;
        }
        if (intent != null) {
            if (!z10 || this.zzf == null || !zzk(zzaVar, zzcezVar.getContext(), intent.getData().toString(), str)) {
                ((zzcge) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z12);
                return;
            } else {
                if (z13) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzblc) zzaVar).zzd("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(strZzc)) {
            strZzc = zzd(zzc(zzcezVar.getContext(), zzcezVar.zzI(), Uri.parse(strZzc), zzcezVar.zzF(), zzcezVar.zzi())).toString();
        }
        if (!z10 || this.zzf == null || !zzk(zzaVar, zzcezVar.getContext(), strZzc, str)) {
            ((zzcge) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get(IntegerTokenConverter.CONVERTER_KEY), strZzc, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z12);
        } else if (z13) {
            map2.put((String) map.get("event_id"), Boolean.TRUE);
            ((zzblc) zzaVar).zzd("openIntentAsync", map2);
        }
    }
}
