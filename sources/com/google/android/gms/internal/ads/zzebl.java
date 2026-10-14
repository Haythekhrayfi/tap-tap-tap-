package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.applovin.impl.mediation.b.a.c;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import d0.a0;
import d0.t;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebl extends zzbrl {
    private final Context zza;
    private final zzdqa zzb;
    private final zzbzw zzc;
    private final zzeba zzd;
    private final zzfev zze;
    private String zzf;
    private String zzg;

    public zzebl(Context context, zzeba zzebaVar, zzbzw zzbzwVar, zzdqa zzdqaVar, zzfev zzfevVar) {
        this.zza = context;
        this.zzb = zzdqaVar;
        this.zzc = zzbzwVar;
        this.zzd = zzebaVar;
        this.zze = zzfevVar;
    }

    public static void zzc(Context context, zzdqa zzdqaVar, zzfev zzfevVar, zzeba zzebaVar, String str, String str2, Map map) {
        String strZza;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzo().zzx(context) ? "offline" : "online";
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzig)).booleanValue() || zzdqaVar == null) {
            zzfeu zzfeuVarZzb = zzfeu.zzb(str2);
            zzfeuVarZzb.zza("gqi", str);
            zzfeuVarZzb.zza("device_connectivity", str3);
            zzfeuVarZzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzfeuVarZzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            strZza = zzfevVar.zza(zzfeuVarZzb);
        } else {
            zzdpz zzdpzVarZza = zzdqaVar.zza();
            zzdpzVarZza.zzb("gqi", str);
            zzdpzVarZza.zzb("action", str2);
            zzdpzVarZza.zzb("device_connectivity", str3);
            zzdpzVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zzdpzVarZza.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            strZza = zzdpzVarZza.zzf();
        }
        zzebaVar.zzd(new zzebc(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, strZza, 2));
    }

    private static String zzo(int i10, String str) {
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        return resourcesZzd == null ? str : resourcesZzd.getString(i10);
    }

    private final void zzp(String str, String str2, Map map) {
        zzc(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private final void zzq(com.google.android.gms.ads.internal.util.zzbr zzbrVar) {
        try {
            if (zzbrVar.zzf(ObjectWrapper.wrap(this.zza), this.zzg, this.zzf)) {
                return;
            }
        } catch (RemoteException e10) {
            zzbzr.zzh("Failed to schedule offline notification poster.", e10);
        }
        this.zzd.zzc(this.zzf);
        zzp(this.zzf, "offline_notification_worker_not_scheduled", zzfsf.zzd());
    }

    private final void zzr(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbr zzbrVar) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (new a0(activity).a()) {
            zzq(zzbrVar);
            zzs(activity, zzlVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzp(this.zzf, "asnpdi", zzfsf.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
            builderZzG.setTitle(zzo(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzo(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.zza.zzd(activity, zzbrVar, zzlVar, dialogInterface, i10);
                }
            }).setNegativeButton(zzo(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebe
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.zza.zzj(zzlVar, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebf
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzk(zzlVar, dialogInterface);
                }
            });
            builderZzG.create().show();
            zzp(this.zzf, "rtsdi", zzfsf.zzd());
        }
    }

    private final void zzs(Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        String strZzo = zzo(R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
        builderZzG.setMessage(strZzo).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebj
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        AlertDialog alertDialogCreate = builderZzG.create();
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new zzebk(this, alertDialogCreate, timer, zzlVar), 3000L);
    }

    private static final PendingIntent zzt(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return zzfmm.zza(context, 0, intent, zzfmm.zza | 1073741824, 0);
    }

    public final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.util.zzbr zzbrVar, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i10) {
        zzp(this.zzf, "rtsdc", c.a("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzq().zzg(activity));
        zzq(zzbrVar);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzx = com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza);
            HashMap map = new HashMap();
            char c10 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c10 = true == zZzx ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.zza.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zza.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzp(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (c10 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzeba.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e10) {
                zzbzr.zzg("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzebn zzebnVar = (zzebn) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzebnVar.zza();
                com.google.android.gms.ads.internal.util.zzbr zzbrVarZzc = zzebnVar.zzc();
                com.google.android.gms.ads.internal.overlay.zzl zzlVarZzb = zzebnVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i10] == 0) {
                    map.put("dialog_action", "confirm");
                    if (zzbrVarZzc != null) {
                        zzq(zzbrVarZzc);
                    }
                    zzs(activityZza, zzlVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzlVarZzb != null) {
                        zzlVarZzb.zzb();
                    }
                }
                zzp(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzebn zzebnVar = (zzebn) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzebnVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzl zzlVarZzb = zzebnVar.zzb();
        final com.google.android.gms.ads.internal.util.zzbr zzbrVarZzc = zzebnVar.zzc();
        this.zzf = zzebnVar.zzd();
        this.zzg = zzebnVar.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhZ)).booleanValue()) {
            zzr(activityZza, zzlVarZzb, zzbrVarZzc);
            return;
        }
        zzp(this.zzf, "dialog_impression", zzfsf.zzd());
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(activityZza);
        builderZzG.setTitle(zzo(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzo(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzo(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.zza.zzl(activityZza, zzlVarZzb, zzbrVarZzc, dialogInterface, i10);
            }
        }).setNegativeButton(zzo(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.zza.zzm(zzlVarZzb, dialogInterface, i10);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzn(zzlVarZzb, dialogInterface);
            }
        });
        builderZzG.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzh() {
        zzeba zzebaVar = this.zzd;
        final zzbzw zzbzwVar = this.zzc;
        zzebaVar.zze(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzeaw
            @Override // com.google.android.gms.internal.ads.zzfdo
            public final Object zza(Object obj) throws Exception {
                zzeba.zzb(zzbzwVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzt = zzt(context, "offline_notification_clicked", str2, str);
        PendingIntent pendingIntentZzt2 = zzt(context, "offline_notification_dismissed", str2, str);
        t tVar = new t(context, "offline_notification_channel");
        tVar.e(zzo(R.string.offline_notification_title, "View the ad you saved when you were offline"));
        tVar.d(zzo(R.string.offline_notification_text, "Tap to open ad"));
        tVar.g(16, true);
        tVar.N.deleteIntent = pendingIntentZzt2;
        tVar.f28585g = pendingIntentZzt;
        tVar.N.icon = context.getApplicationInfo().icon;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str2, 54321, tVar.a());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            map.put("notification_not_shown_reason", e10.getMessage());
            str3 = "offline_notification_failed";
        }
        zzp(str2, str3, map);
    }

    public final /* synthetic */ void zzj(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i10) {
        this.zzd.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzp(this.zzf, "rtsdc", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, com.google.android.gms.ads.internal.util.zzbr zzbrVar, DialogInterface dialogInterface, int i10) {
        zzp(this.zzf, "dialog_click", c.a("dialog_action", "confirm"));
        zzr(activity, zzlVar, zzbrVar);
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i10) {
        this.zzd.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzp(this.zzf, "dialog_click", map);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
