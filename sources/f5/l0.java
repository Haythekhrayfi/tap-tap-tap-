package f5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29296a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29297b;

    public /* synthetic */ l0(com.google.firebase.messaging.e eVar) {
        this.f29297b = eVar;
    }

    public /* synthetic */ l0(CountDownLatch countDownLatch) {
        this.f29297b = countDownLatch;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        boolean z10 = true;
        switch (this.f29296a) {
            case 0:
                Objects.requireNonNull((m0) this.f29297b);
                if (task.isSuccessful()) {
                    b0 b0Var = (b0) task.getResult();
                    c5.d dVar = c5.d.f3604c;
                    dVar.b("Crashlytics report successfully enqueued to DataTransport: " + b0Var.c());
                    File fileB = b0Var.b();
                    if (fileB.delete()) {
                        dVar.b("Deleted report file: " + fileB.getPath());
                    } else {
                        dVar.f("Crashlytics could not delete report file: " + fileB.getPath());
                    }
                } else {
                    c5.d dVar2 = c5.d.f3604c;
                    Exception exception = task.getException();
                    if (dVar2.a(5)) {
                        Log.w(dVar2.f3605a, "Crashlytics report could not be enqueued to DataTransport", exception);
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                CountDownLatch countDownLatch = (CountDownLatch) this.f29297b;
                ExecutorService executorService = q0.f29336a;
                countDownLatch.countDown();
                return null;
            case 2:
                Objects.requireNonNull((com.google.firebase.messaging.e) this.f29297b);
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            default:
                com.google.firebase.remoteconfig.a aVar = (com.google.firebase.remoteconfig.a) this.f29297b;
                Objects.requireNonNull(aVar);
                if (task.isSuccessful()) {
                    com.google.firebase.remoteconfig.internal.a aVar2 = aVar.f12665c;
                    synchronized (aVar2) {
                        aVar2.f12684c = Tasks.forResult(null);
                        break;
                    }
                    i6.e eVar = aVar2.f12683b;
                    synchronized (eVar) {
                        eVar.f31289a.deleteFile(eVar.f31290b);
                    }
                    if (task.getResult() != null) {
                        JSONArray jSONArray = ((com.google.firebase.remoteconfig.internal.b) task.getResult()).f12690d;
                        if (aVar.f12663a != null) {
                            try {
                                aVar.f12663a.c(com.google.firebase.remoteconfig.a.c(jSONArray));
                            } catch (JSONException e10) {
                                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                            } catch (v4.a e11) {
                                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
                            }
                        }
                    } else {
                        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                    }
                    break;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
