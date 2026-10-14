package g3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f29970b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((u) message.obj).a();
            return true;
        }
    }

    public synchronized void a(u<?> uVar) {
        if (this.f29969a) {
            this.f29970b.obtainMessage(1, uVar).sendToTarget();
        } else {
            this.f29969a = true;
            uVar.a();
            this.f29969a = false;
        }
    }
}
