package d6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28735e = 0;

    public r(Context context) {
        this.f28731a = context;
    }

    public static String b(u4.d dVar) {
        dVar.a();
        String str = dVar.f36013c.f36028e;
        if (str != null) {
            return str;
        }
        dVar.a();
        String str2 = dVar.f36013c.f36025b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        if (this.f28732b == null) {
            e();
        }
        return this.f28732b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f28731a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:13:0x0025, B:15:0x002b, B:17:0x003d, B:19:0x0043, B:22:0x0048, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:13:0x0025, B:15:0x002b, B:17:0x003d, B:19:0x0043, B:22:0x0048, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:13:0x0025, B:15:0x002b, B:17:0x003d, B:19:0x0043, B:22:0x0048, B:24:0x005b, B:26:0x0061, B:29:0x0066, B:31:0x0073, B:33:0x0078, B:32:0x0076), top: B:42:0x0001 }] */
    public boolean d() {
        int i10;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i10 = this.f28735e;
            if (i10 == 0) {
                PackageManager packageManager = this.f28731a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else if (PlatformVersion.isAtLeastO()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                    }
                    Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    if (PlatformVersion.isAtLeastO()) {
                        this.f28735e = 2;
                    } else {
                        this.f28735e = 1;
                    }
                    i10 = this.f28735e;
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (PlatformVersion.isAtLeastO()) {
                                this.f28735e = 2;
                            } else {
                                this.f28735e = 1;
                            }
                            i10 = this.f28735e;
                        } else {
                            this.f28735e = 2;
                            i10 = 2;
                        }
                    } else {
                        this.f28735e = 1;
                        i10 = 1;
                    }
                }
            }
        }
        return i10 != 0;
    }

    public final synchronized void e() {
        PackageInfo packageInfoC = c(this.f28731a.getPackageName());
        if (packageInfoC != null) {
            this.f28732b = Integer.toString(packageInfoC.versionCode);
            this.f28733c = packageInfoC.versionName;
        }
    }
}
