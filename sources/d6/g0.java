package d6;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class g0 extends Binder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28701d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f28702c;

    public interface a {
    }

    public g0(a aVar) {
        this.f28702c = aVar;
    }

    public void a(h0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        a aVar2 = this.f28702c;
        Intent intent = aVar.f28710a;
        f fVar = f.this;
        Objects.requireNonNull(fVar);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fVar.f28689c.execute(new androidx.emoji2.text.f(fVar, intent, taskCompletionSource));
        taskCompletionSource.getTask().addOnCompleteListener(e.f28683h, new e0(aVar));
    }
}
