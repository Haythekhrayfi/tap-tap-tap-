package d6;

import android.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f28658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f28660c;

    public c(Context context, s sVar, ExecutorService executorService) {
        this.f28658a = executorService;
        this.f28659b = context;
        this.f28660c = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0229  */
    /* JADX WARN: Code duplicated, block: B:163:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[EDGE_INSN: B:21:0x0059->B:22:0x005a BREAK  A[LOOP:0: B:14:0x0041->B:251:?]] */
    /* JADX WARN: Code duplicated, block: B:235:0x039a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:65:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x013f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    public boolean a() {
        boolean z10;
        com.google.firebase.messaging.f fVar;
        Bundle bundle;
        String str;
        int identifier;
        String string;
        int i10;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        int i11;
        if (this.f28660c.a("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.f28659b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f28659b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                z10 = false;
                break;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                break;
            }
        }
        z10 = false;
        break;
        if (z10) {
            return false;
        }
        String strJ = this.f28660c.j("gcm.n.image");
        if (TextUtils.isEmpty(strJ)) {
            fVar = null;
        } else {
            try {
                fVar = new com.google.firebase.messaging.f(new URL(strJ));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strJ);
                fVar = null;
            }
        }
        if (fVar != null) {
            ExecutorService executorService = this.f28658a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            fVar.f12642d = executorService.submit(new androidx.appcompat.app.s(fVar, taskCompletionSource));
            fVar.f12643e = taskCompletionSource.getTask();
        }
        Context context = this.f28659b;
        s sVar = this.f28660c;
        AtomicInteger atomicInteger = a.f28648a;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        String strJ2 = sVar.j("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strJ2 = null;
        } else {
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                    strJ2 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strJ2)) {
                        strJ2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strJ2)) {
                            str = notificationManager.getNotificationChannel(strJ2) == null ? "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used." : "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                        }
                        Log.w("FirebaseMessaging", str);
                        strJ2 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strJ2) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strJ2 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strJ2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strJ2)) {
                            if (notificationManager.getNotificationChannel(strJ2) == null) {
                            }
                        }
                        Log.w("FirebaseMessaging", str);
                        strJ2 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = context.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        d0.t tVar = new d0.t(context, strJ2);
        CharSequence charSequenceI = sVar.i(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(charSequenceI)) {
            tVar.e(charSequenceI);
        }
        CharSequence charSequenceI2 = sVar.i(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(charSequenceI2)) {
            tVar.d(charSequenceI2);
            d0.r rVar = new d0.r();
            rVar.j(charSequenceI2);
            if (tVar.f28594p != rVar) {
                tVar.f28594p = rVar;
                rVar.i(tVar);
            }
        }
        String strJ3 = sVar.j("gcm.n.icon");
        if (TextUtils.isEmpty(strJ3)) {
            i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i10 == 0 && a.a(resources, i10)) {
                identifier2 = i10;
            } else {
                try {
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e11);
                    identifier2 = i10;
                }
            }
            if (identifier2 != 0 || !a.a(resources, identifier2)) {
                identifier2 = R.drawable.sym_def_app_icon;
            }
        } else {
            identifier2 = resources.getIdentifier(strJ3, "drawable", packageName);
            if ((identifier2 == 0 || !a.a(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strJ3, "mipmap", packageName)) == 0 || !a.a(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strJ3 + " not found. Notification will use default icon.");
                i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = i10 == 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = R.drawable.sym_def_app_icon;
                } else {
                    identifier2 = R.drawable.sym_def_app_icon;
                }
            }
        }
        tVar.N.icon = identifier2;
        String strJ4 = sVar.j("gcm.n.sound2");
        if (TextUtils.isEmpty(strJ4)) {
            strJ4 = sVar.j("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strJ4)) {
            defaultUri = null;
        } else if ("default".equals(strJ4) || resources.getIdentifier(strJ4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strJ4);
        }
        if (defaultUri != null) {
            tVar.j(defaultUri);
        }
        String strJ5 = sVar.j("gcm.n.click_action");
        if (TextUtils.isEmpty(strJ5)) {
            Uri uriE = sVar.e();
            if (uriE != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uriE);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strJ5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle2 = new Bundle(sVar.f28736a);
            for (String str2 : sVar.f28736a.keySet()) {
                if (str2.startsWith("google.c.") || str2.startsWith("gcm.n.") || str2.startsWith("gcm.notification.")) {
                    bundle2.remove(str2);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (sVar.a("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", sVar.m());
            }
            activity = PendingIntent.getActivity(context, a.f28648a.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        tVar.f28585g = activity;
        PendingIntent broadcast = !sVar.a("google.c.a.e") ? null : PendingIntent.getBroadcast(context, a.f28648a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(sVar.m())), 1140850688);
        if (broadcast != null) {
            tVar.N.deleteIntent = broadcast;
        }
        String strJ6 = sVar.j("gcm.n.color");
        if (TextUtils.isEmpty(strJ6)) {
            i11 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i11 != 0) {
                Object obj = e0.a.f28964a;
                numValueOf = Integer.valueOf(e0.a.d.a(context, i11));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strJ6));
            } catch (IllegalArgumentException unused3) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strJ6 + ". Notification will use default color.");
                i11 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                    try {
                        Object obj2 = e0.a.f28964a;
                        numValueOf = Integer.valueOf(e0.a.d.a(context, i11));
                    } catch (Resources.NotFoundException unused4) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            tVar.D = numValueOf.intValue();
        }
        tVar.g(16, !sVar.a("gcm.n.sticky"));
        tVar.f28603y = sVar.a("gcm.n.local_only");
        String strJ7 = sVar.j("gcm.n.ticker");
        if (strJ7 != null) {
            tVar.N.tickerText = d0.t.c(strJ7);
        }
        Integer numB = sVar.b("gcm.n.notification_priority");
        if (numB == null) {
            numB = null;
        } else if (numB.intValue() < -2 || numB.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
            numB = null;
        }
        if (numB != null) {
            tVar.f28590l = numB.intValue();
        }
        Integer numB2 = sVar.b("gcm.n.visibility");
        if (numB2 == null) {
            numB2 = null;
        } else if (numB2.intValue() < -1 || numB2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numB2 + ". Skipping setting visibility.");
            numB2 = null;
        }
        if (numB2 != null) {
            tVar.E = numB2.intValue();
        }
        Integer numB3 = sVar.b("gcm.n.notification_count");
        if (numB3 == null) {
            numB3 = null;
        } else if (numB3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numB3 + ". Skipping setting notificationCount.");
            numB3 = null;
        }
        if (numB3 != null) {
            tVar.f28589k = numB3.intValue();
        }
        Long lH = sVar.h("gcm.n.event_time");
        if (lH != null) {
            tVar.f28591m = true;
            tVar.N.when = lH.longValue();
        }
        long[] jArrK = sVar.k();
        if (jArrK != null) {
            tVar.N.vibrate = jArrK;
        }
        int[] iArrD = sVar.d();
        if (iArrD != null) {
            tVar.i(iArrD[0], iArrD[1], iArrD[2]);
        }
        boolean zA = sVar.a("gcm.n.default_sound");
        ?? r10 = zA;
        if (sVar.a("gcm.n.default_vibrate_timings")) {
            r10 = (zA ? 1 : 0) | 2;
        }
        int i12 = r10;
        if (sVar.a("gcm.n.default_light_settings")) {
            i12 = (r10 == true ? 1 : 0) | 4;
        }
        tVar.f(i12);
        String strJ8 = sVar.j("gcm.n.tag");
        if (TextUtils.isEmpty(strJ8)) {
            StringBuilder sbA = defpackage.a.a("FCM-Notification:");
            sbA.append(SystemClock.uptimeMillis());
            strJ8 = sbA.toString();
        }
        if (fVar != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await((Task) Preconditions.checkNotNull(fVar.f12643e), 5L, TimeUnit.SECONDS);
                tVar.h(bitmap);
                d0.q qVar = new d0.q();
                qVar.l(bitmap);
                qVar.k(null);
                if (tVar.f28594p != qVar) {
                    tVar.f28594p = qVar;
                    qVar.i(tVar);
                }
            } catch (InterruptedException unused5) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                fVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e12) {
                StringBuilder sbA2 = defpackage.a.a("Failed to download image: ");
                sbA2.append(e12.getCause());
                Log.w("FirebaseMessaging", sbA2.toString());
            } catch (TimeoutException unused6) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                fVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f28659b.getSystemService("notification")).notify(strJ8, 0, tVar.a());
        return true;
    }
}
