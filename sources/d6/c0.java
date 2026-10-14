package d6;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import fd.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28661c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f28666h;

    public /* synthetic */ c0(Activity activity, String str, String str2, Object obj, Uri uri) {
        this.f28662d = activity;
        this.f28663e = str;
        this.f28664f = str2;
        this.f28665g = obj;
        this.f28666h = uri;
    }

    public /* synthetic */ c0(Activity activity, String str, String str2, Object obj, File file) {
        this.f28662d = activity;
        this.f28663e = str;
        this.f28664f = str2;
        this.f28665g = obj;
        this.f28666h = file;
    }

    public /* synthetic */ c0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, r rVar, com.google.firebase.messaging.e eVar) {
        this.f28662d = context;
        this.f28663e = scheduledExecutorService;
        this.f28664f = firebaseMessaging;
        this.f28665g = rVar;
        this.f28666h = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        b0 b0Var;
        switch (this.f28661c) {
            case 0:
                Context context = (Context) this.f28662d;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f28663e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f28664f;
                r rVar = (r) this.f28665g;
                com.google.firebase.messaging.e eVar = (com.google.firebase.messaging.e) this.f28666h;
                synchronized (b0.class) {
                    WeakReference<b0> weakReference = b0.f28654d;
                    b0 b0Var2 = weakReference != null ? weakReference.get() : null;
                    if (b0Var2 == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                        b0Var2 = new b0(sharedPreferences, scheduledExecutorService);
                        synchronized (b0Var2) {
                            b0Var2.f28656b = z.b(sharedPreferences, "topic_operation_queue", ",", scheduledExecutorService);
                        }
                        b0.f28654d = new WeakReference<>(b0Var2);
                    }
                    b0Var = b0Var2;
                }
                return new com.google.firebase.messaging.i(firebaseMessaging, rVar, b0Var, eVar, context, scheduledExecutorService);
            case 1:
                Activity activity = (Activity) this.f28662d;
                String str = (String) this.f28663e;
                String str2 = (String) this.f28664f;
                Object obj = this.f28665g;
                Uri uri = (Uri) this.f28666h;
                int i10 = y6.s.f38376d;
                j0.i(activity, "$activity");
                j0.i(str, "$name");
                j0.i(str2, "$type");
                j0.i(obj, "$data");
                j0.i(uri, "$file");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i11 = activity.getResources().getConfiguration().orientation;
                int i12 = i11 == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
                int i13 = i11 == 1 ? displayMetrics.heightPixels : displayMetrics.widthPixels;
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strG = new Gson().g(obj);
                j0.h(strG, "Gson().toJson(data)");
                y6.p pVar = new y6.p(646, str, i12, i13, str2, jCurrentTimeMillis, strG);
                OutputStream outputStreamOpenOutputStream = activity.getContentResolver().openOutputStream(uri);
                if (outputStreamOpenOutputStream != null) {
                    String strG2 = new Gson().g(pVar);
                    j0.h(strG2, "Gson().toJson(exportedSettings)");
                    byte[] bytes = strG2.getBytes(ed.c.f29139b);
                    j0.h(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStreamOpenOutputStream.write(bytes);
                }
                if (outputStreamOpenOutputStream == null) {
                    return "";
                }
                outputStreamOpenOutputStream.close();
                return "";
            default:
                Activity activity2 = (Activity) this.f28662d;
                String str3 = (String) this.f28663e;
                String str4 = (String) this.f28664f;
                Object obj2 = this.f28665g;
                File file = (File) this.f28666h;
                int i14 = y6.s.f38376d;
                j0.i(activity2, "$activity");
                j0.i(str3, "$name");
                j0.i(str4, "$type");
                j0.i(obj2, "$data");
                j0.i(file, "$directory");
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                activity2.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                int i15 = activity2.getResources().getConfiguration().orientation;
                int i16 = i15 == 1 ? displayMetrics2.widthPixels : displayMetrics2.heightPixels;
                int i17 = i15 == 1 ? displayMetrics2.heightPixels : displayMetrics2.widthPixels;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                String strG3 = new Gson().g(obj2);
                j0.h(strG3, "Gson().toJson(data)");
                y6.p pVar2 = new y6.p(646, str3, i16, i17, str4, jCurrentTimeMillis2, strG3);
                String str5 = str3 + '_' + str4 + ".cm";
                File file2 = new File(file, str5);
                xe.a.f37601c.a("Trying to save to file export: " + file2.getAbsolutePath(), new Object[0]);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                String strG4 = new Gson().g(pVar2);
                Charset charsetDefaultCharset = Charset.defaultCharset();
                int i18 = sd.b.f35504a;
                if (strG4 == null) {
                    strG4 = null;
                }
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                        throw new IOException("Directory '" + parentFile + "' could not be created");
                    }
                } else {
                    if (file2.isDirectory()) {
                        throw new IOException("File '" + file2 + "' exists but is a directory");
                    }
                    if (!file2.canWrite()) {
                        throw new IOException("File '" + file2 + "' cannot be written to");
                    }
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                try {
                    int i19 = sd.c.f35505a;
                    if (strG4 != null) {
                        fileOutputStream.write(strG4.getBytes(sd.a.a(charsetDefaultCharset)));
                        break;
                    }
                    fileOutputStream.close();
                    return str5;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
        }
    }
}
