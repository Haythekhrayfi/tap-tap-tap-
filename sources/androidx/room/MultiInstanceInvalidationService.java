package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2800c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<Integer, String> f2801d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList<androidx.room.b> f2802e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.a f2803f = new b();

    public class a extends RemoteCallbackList<androidx.room.b> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.f2801d.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class b extends c.a {
        public b() {
        }

        @Override // androidx.room.c
        public int c(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2802e) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f2800c + 1;
                multiInstanceInvalidationService.f2800c = i10;
                if (multiInstanceInvalidationService.f2802e.register(bVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f2801d.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService.this.f2800c--;
                return 0;
            }
        }

        @Override // androidx.room.c
        public void c0(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2802e) {
                try {
                    String str = MultiInstanceInvalidationService.this.f2801d.get(Integer.valueOf(i10));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.f2802e.beginBroadcast();
                    for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                        try {
                            int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f2802e.getBroadcastCookie(i11)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.f2801d.get(Integer.valueOf(iIntValue));
                            if (i10 != iIntValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.b) MultiInstanceInvalidationService.this.f2802e.getBroadcastItem(i11)).b(strArr);
                                } catch (RemoteException e10) {
                                    Log.w("ROOM", "Error invoking a remote callback", e10);
                                }
                            }
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f2802e.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.f2802e.finishBroadcast();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void i0(androidx.room.b bVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f2802e) {
                MultiInstanceInvalidationService.this.f2802e.unregister(bVar);
                MultiInstanceInvalidationService.this.f2801d.remove(Integer.valueOf(i10));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2803f;
    }
}
