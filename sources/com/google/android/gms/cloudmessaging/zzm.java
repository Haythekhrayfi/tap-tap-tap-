package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class zzm implements ServiceConnection {
    public zzn zzc;
    public final /* synthetic */ zzs zzf;

    @GuardedBy("this")
    public int zza = 0;
    public final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            zzm zzmVar = this.zza;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (zzmVar) {
                zzp<?> zzpVar = zzmVar.zze.get(i10);
                if (zzpVar == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                zzmVar.zze.remove(i10);
                zzmVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzpVar.zzc(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzpVar.zza(data);
                return true;
            }
        }
    }));

    @GuardedBy("this")
    public final Queue<zzp<?>> zzd = new ArrayDeque();

    @GuardedBy("this")
    public final SparseArray<zzp<?>> zze = new SparseArray<>();

    public /* synthetic */ zzm(zzs zzsVar, zzl zzlVar) {
        this.zzf = zzsVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzm zzmVar = this.zza;
                IBinder iBinder2 = iBinder;
                synchronized (zzmVar) {
                    try {
                        if (iBinder2 == null) {
                            zzmVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzmVar.zzc = new zzn(iBinder2);
                            zzmVar.zza = 2;
                            zzmVar.zzc();
                        } catch (RemoteException e10) {
                            zzmVar.zza(0, e10.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized void zza(int i10, String str) {
        zzb(i10, str, null);
    }

    public final synchronized void zzb(int i10, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i11 = this.zza;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.zza = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.zza = 4;
        ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        zzq zzqVar = new zzq(i10, str, th);
        Iterator<zzp<?>> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zzc(zzqVar);
        }
        this.zzd.clear();
        for (int i12 = 0; i12 < this.zze.size(); i12++) {
            this.zze.valueAt(i12).zzc(zzqVar);
        }
        this.zze.clear();
    }

    public final void zzc() {
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final zzp<?> zzpVarPoll;
                final zzm zzmVar = this.zza;
                while (true) {
                    synchronized (zzmVar) {
                        if (zzmVar.zza != 2) {
                            return;
                        }
                        if (zzmVar.zzd.isEmpty()) {
                            zzmVar.zzf();
                            return;
                        } else {
                            zzpVarPoll = zzmVar.zzd.poll();
                            zzmVar.zze.put(zzpVarPoll.zza, zzpVarPoll);
                            zzmVar.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzmVar.zze(zzpVarPoll.zza);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(zzpVarPoll);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(strValueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context context = zzmVar.zzf.zzb;
                    Messenger messenger = zzmVar.zzb;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = zzpVarPoll.zzc;
                    messageObtain.arg1 = zzpVarPoll.zza;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzpVarPoll.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzpVarPoll.zzd);
                    messageObtain.setData(bundle);
                    try {
                        zzmVar.zzc.zza(messageObtain);
                    } catch (RemoteException e10) {
                        zzmVar.zza(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i10) {
        zzp<?> zzpVar = this.zze.get(i10);
        if (zzpVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.zze.remove(i10);
            zzpVar.zzc(new zzq(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.zza = 3;
            ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        }
    }

    public final synchronized boolean zzg(zzp<?> zzpVar) {
        int i10 = this.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzd.add(zzpVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.zzd.add(zzpVar);
            zzc();
            return true;
        }
        this.zzd.add(zzpVar);
        Preconditions.checkState(this.zza == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.zzf.zzb, intent, this, 1)) {
                this.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            zzb(0, "Unable to bind to service", e10);
        }
        return true;
    }
}
