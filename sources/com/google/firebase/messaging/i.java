package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d6.a0;
import d6.b0;
import d6.d0;
import d6.r;
import d6.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f12653i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f12654j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f12657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f12658d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f12660f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f12662h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f12659e = new q.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12661g = false;

    public i(FirebaseMessaging firebaseMessaging, r rVar, b0 b0Var, e eVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f12658d = firebaseMessaging;
        this.f12656b = rVar;
        this.f12662h = b0Var;
        this.f12657c = eVar;
        this.f12655a = context;
        this.f12660f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) throws IOException {
        e eVar = this.f12657c;
        String strA = this.f12658d.a();
        Objects.requireNonNull(eVar);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(eVar.a(eVar.c(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        e eVar = this.f12657c;
        String strA = this.f12658d.a();
        Objects.requireNonNull(eVar);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(eVar.a(eVar.c(strA, "/topics/" + str, bundle)));
    }

    public synchronized void e(boolean z10) {
        this.f12661g = z10;
    }

    public void f() {
        boolean z10;
        if (this.f12662h.a() != null) {
            synchronized (this) {
                z10 = this.f12661g;
            }
            if (z10) {
                return;
            }
            h(0L);
        }
    }

    public boolean g() throws IOException {
        String string;
        StringBuilder sb2;
        String string2;
        while (true) {
            synchronized (this) {
                a0 a0VarA = this.f12662h.a();
                boolean z10 = true;
                if (a0VarA == null) {
                    if (d()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                try {
                    String str = a0VarA.f28651b;
                    byte b10 = -1;
                    int iHashCode = str.hashCode();
                    if (iHashCode != 83) {
                        if (iHashCode == 85 && str.equals("U")) {
                            b10 = 1;
                        }
                    } else if (str.equals("S")) {
                        b10 = 0;
                    }
                    if (b10 == 0) {
                        b(a0VarA.f28650a);
                        if (d()) {
                            sb2 = new StringBuilder();
                            sb2.append("Subscribe to topic: ");
                            sb2.append(a0VarA.f28650a);
                            sb2.append(" succeeded.");
                            string2 = sb2.toString();
                            Log.d("FirebaseMessaging", string2);
                        }
                    } else if (b10 == 1) {
                        c(a0VarA.f28650a);
                        if (d()) {
                            sb2 = new StringBuilder();
                            sb2.append("Unsubscribe from topic: ");
                            sb2.append(a0VarA.f28650a);
                            sb2.append(" succeeded.");
                            string2 = sb2.toString();
                            Log.d("FirebaseMessaging", string2);
                        }
                    } else if (d()) {
                        string2 = "Unknown topic operation" + a0VarA + ".";
                        Log.d("FirebaseMessaging", string2);
                    }
                } catch (IOException e10) {
                    if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                        StringBuilder sbA = defpackage.a.a("Topic operation failed: ");
                        sbA.append(e10.getMessage());
                        sbA.append(". Will retry Topic operation.");
                        string = sbA.toString();
                    } else {
                        if (e10.getMessage() != null) {
                            throw e10;
                        }
                        string = "Topic operation failed without exception message. Will retry Topic operation.";
                    }
                    Log.e("FirebaseMessaging", string);
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                b0 b0Var = this.f12662h;
                synchronized (b0Var) {
                    z zVar = b0Var.f28656b;
                    String str2 = a0VarA.f28652c;
                    synchronized (zVar.f28751d) {
                        if (zVar.f28751d.remove(str2)) {
                            zVar.f28752e.execute(new androidx.activity.c(zVar));
                        }
                    }
                }
                synchronized (this.f12659e) {
                    String str3 = a0VarA.f28652c;
                    if (this.f12659e.containsKey(str3)) {
                        ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f12659e.get(str3);
                        TaskCompletionSource<Void> taskCompletionSourcePoll = arrayDeque.poll();
                        if (taskCompletionSourcePoll != null) {
                            taskCompletionSourcePoll.setResult(null);
                        }
                        if (arrayDeque.isEmpty()) {
                            this.f12659e.remove(str3);
                        }
                    }
                }
            }
        }
    }

    public void h(long j10) {
        this.f12660f.schedule(new d0(this, this.f12655a, this.f12656b, Math.min(Math.max(30L, 2 * j10), f12653i)), j10, TimeUnit.SECONDS);
        e(true);
    }
}
