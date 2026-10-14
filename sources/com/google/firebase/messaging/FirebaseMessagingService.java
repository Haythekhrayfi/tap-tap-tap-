package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.b.z;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Tasks;
import d6.q;
import d6.s;
import d6.x;
import d6.y;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends d6.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Queue<String> f12609i = new ArrayDeque(10);

    @Override // d6.f
    public Intent b(Intent intent) {
        return y.a().f28747d.poll();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:143:0x027f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0289  */
    /* JADX WARN: Code duplicated, block: B:189:0x0292 A[EXC_TOP_SPLITTER, PHI: r0
  0x0292: PHI (r0v29 java.lang.String) = (r0v28 java.lang.String), (r0v33 java.lang.String) binds: [B:141:0x027c, B:147:0x028f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // d6.f
    public void c(Intent intent) {
        boolean z10;
        boolean z11;
        long j10;
        u4.d dVarB;
        String str;
        String str2;
        String[] strArrSplit;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                e(intent.getStringExtra("token"));
                return;
            }
            StringBuilder sbA = defpackage.a.a("Unknown intent action: ");
            sbA.append(intent.getAction());
            Log.d("FirebaseMessaging", sbA.toString());
            return;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        int iIntValue = 0;
        if (TextUtils.isEmpty(stringExtra)) {
            z10 = false;
        } else {
            ArrayDeque arrayDeque = (ArrayDeque) f12609i;
            if (arrayDeque.contains(stringExtra)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra);
                }
                z10 = true;
            } else {
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra);
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("message_type");
        if (stringExtra2 == null) {
            stringExtra2 = "gcm";
        }
        byte b10 = -1;
        switch (stringExtra2.hashCode()) {
            case -2062414158:
                if (stringExtra2.equals("deleted_messages")) {
                    b10 = 0;
                }
                break;
            case 102161:
                if (stringExtra2.equals("gcm")) {
                    b10 = 1;
                }
                break;
            case 814694033:
                if (stringExtra2.equals("send_error")) {
                    b10 = 2;
                }
                break;
            case 814800675:
                if (stringExtra2.equals("send_event")) {
                    b10 = 3;
                }
                break;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 == 2) {
                    if (intent.getStringExtra("google.message_id") == null) {
                        intent.getStringExtra("message_id");
                    }
                    new x(intent.getStringExtra("error"));
                    return;
                } else {
                    if (b10 == 3) {
                        intent.getStringExtra("google.message_id");
                        return;
                    }
                    Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra2);
                    return;
                }
            }
            if (q.c(intent)) {
                q.b("_nr", intent.getExtras());
            }
            if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                z11 = false;
            } else {
                try {
                    u4.d.b();
                    u4.d dVarB2 = u4.d.b();
                    dVarB2.a();
                    Context context = dVarB2.f36011a;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                    if (sharedPreferences.contains("export_to_big_query")) {
                        z11 = sharedPreferences.getBoolean("export_to_big_query", false);
                    } else {
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                z11 = false;
                            } else {
                                z11 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                } catch (IllegalStateException unused2) {
                    Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
                }
            }
            if (z11) {
                e6.a.b bVar = e6.a.b.MESSAGE_DELIVERED;
                TransportFactory transportFactory = FirebaseMessaging.f12589p;
                if (transportFactory == null) {
                    Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = Bundle.EMPTY;
                    }
                    int i10 = e6.a.f29027p;
                    e6.a.c cVar = e6.a.c.UNKNOWN;
                    e6.a.d dVar = e6.a.d.UNKNOWN_OS;
                    e6.a.b bVar2 = e6.a.b.UNKNOWN_EVENT;
                    Object obj = extras.get("google.ttl");
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused3) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    int i11 = iIntValue;
                    String string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            string = (String) Tasks.await(com.google.firebase.installations.b.f(u4.d.b()).getId());
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    String str3 = string;
                    u4.d dVarB3 = u4.d.b();
                    dVarB3.a();
                    String packageName = dVarB3.f36011a.getPackageName();
                    e6.a.d dVar2 = e6.a.d.ANDROID;
                    e6.a.c cVar2 = s.l(extras) ? e6.a.c.DISPLAY_NOTIFICATION : e6.a.c.DATA_MESSAGE;
                    String string2 = extras.getString("google.message_id");
                    if (string2 == null) {
                        string2 = extras.getString("message_id");
                    }
                    String str4 = string2 != null ? string2 : "";
                    String strA = q.a(extras);
                    String str5 = strA != null ? strA : "";
                    String string3 = extras.getString("collapse_key");
                    String str6 = string3 != null ? string3 : "";
                    String string4 = extras.getString("google.c.a.m_l");
                    String str7 = string4 != null ? string4 : "";
                    String string5 = extras.getString("google.c.a.c_l");
                    String str8 = string5 != null ? string5 : "";
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j10 = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e11) {
                            Log.w("FirebaseMessaging", "error parsing project number", e11);
                            dVarB = u4.d.b();
                            dVarB.a();
                            str = dVarB.f36013c.f36028e;
                            if (str != null) {
                                try {
                                    j10 = Long.parseLong(str);
                                } catch (NumberFormatException e12) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e12);
                                    dVarB.a();
                                    str2 = dVarB.f36013c.f36025b;
                                    if (str2.startsWith("1:")) {
                                        strArrSplit = str2.split(":");
                                        if (strArrSplit.length >= 2) {
                                            str2 = strArrSplit[1];
                                            if (!str2.isEmpty()) {
                                                j10 = Long.parseLong(str2);
                                            }
                                        }
                                        j10 = 0;
                                    } else {
                                        try {
                                            j10 = Long.parseLong(str2);
                                        } catch (NumberFormatException e13) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e13);
                                            j10 = 0;
                                        }
                                    }
                                }
                            } else {
                                dVarB.a();
                                str2 = dVarB.f36013c.f36025b;
                                if (str2.startsWith("1:")) {
                                    j10 = Long.parseLong(str2);
                                } else {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length >= 2) {
                                        str2 = strArrSplit[1];
                                        if (!str2.isEmpty()) {
                                            j10 = Long.parseLong(str2);
                                        }
                                    }
                                    j10 = 0;
                                }
                            }
                        }
                    } else {
                        dVarB = u4.d.b();
                        dVarB.a();
                        str = dVarB.f36013c.f36028e;
                        if (str != null) {
                            j10 = Long.parseLong(str);
                        } else {
                            dVarB.a();
                            str2 = dVarB.f36013c.f36025b;
                            if (str2.startsWith("1:")) {
                                j10 = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length >= 2) {
                                    str2 = strArrSplit[1];
                                    if (!str2.isEmpty()) {
                                        j10 = Long.parseLong(str2);
                                    }
                                }
                                j10 = 0;
                            }
                        }
                    }
                    try {
                        transportFactory.getTransport("FCM_CLIENT_EVENT_LOGGING", e6.b.class, Encoding.of("proto"), z.A).send(Event.ofData(new e6.b(new e6.a(j10 > 0 ? j10 : 0L, str4, str3, cVar2, dVar2, packageName, str6, 0, i11, str5, 0L, bVar, str7, 0L, str8))));
                    } catch (RuntimeException e14) {
                        Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e14);
                    }
                }
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            extras2.remove("androidx.content.wakelockid");
            if (s.l(extras2)) {
                s sVar = new s(extras2);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
                try {
                    boolean zA = new d6.c(this, sVar, executorServiceNewSingleThreadExecutor).a();
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (zA) {
                        return;
                    }
                    if (q.c(intent)) {
                        q.b("_nf", intent.getExtras());
                    }
                } catch (Throwable th) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    throw th;
                }
            }
            d(new RemoteMessage(extras2));
        }
    }

    public void d(RemoteMessage remoteMessage) {
    }

    public void e(String str) {
    }
}
