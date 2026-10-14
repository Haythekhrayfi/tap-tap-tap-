package m5;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f implements SuccessContinuation<Void, Void> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f33205c;

    public f(g gVar) {
        this.f33205c = gVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(Void r10) throws Exception {
        JSONObject jSONObjectD;
        FileWriter fileWriter;
        g gVar = this.f33205c;
        c cVar = gVar.f33211f;
        k kVar = gVar.f33207b;
        Objects.requireNonNull(cVar);
        FileWriter fileWriter2 = null;
        try {
            Map<String, String> mapC = cVar.c(kVar);
            j5.b bVar = cVar.f33193b;
            String str = cVar.f33192a;
            Objects.requireNonNull(bVar);
            j5.a aVar = new j5.a(str, mapC);
            aVar.f31710c.put("User-Agent", "Crashlytics Android SDK/18.3.1");
            aVar.f31710c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            cVar.a(aVar, kVar);
            cVar.f33194c.b("Requesting settings from " + cVar.f33192a);
            cVar.f33194c.e("Settings query params were: " + mapC);
            jSONObjectD = cVar.d(aVar.b());
        } catch (IOException e10) {
            c5.d dVar = cVar.f33194c;
            if (dVar.a(6)) {
                Log.e(dVar.f3605a, "Settings request failed.", e10);
            }
            jSONObjectD = null;
        }
        if (jSONObjectD != null) {
            d dVarA = this.f33205c.f33208c.a(jSONObjectD);
            a aVar2 = this.f33205c.f33210e;
            long j10 = dVarA.f33197c;
            Objects.requireNonNull(aVar2);
            c5.d.f3604c.e("Writing settings to cache file...");
            try {
                jSONObjectD.put("expires_at", j10);
                fileWriter = new FileWriter(aVar2.f33191a);
                try {
                    try {
                        fileWriter.write(jSONObjectD.toString());
                        fileWriter.flush();
                    } catch (Exception e11) {
                        e = e11;
                        try {
                            c5.d dVar2 = c5.d.f3604c;
                            if (dVar2.a(6)) {
                                Log.e(dVar2.f3605a, "Failed to cache settings", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            fileWriter = fileWriter2;
                            f5.e.a(fileWriter, "Failed to close settings writer.");
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f5.e.a(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                f5.e.a(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            f5.e.a(fileWriter, "Failed to close settings writer.");
            this.f33205c.c(jSONObjectD, "Loaded settings: ");
            g gVar2 = this.f33205c;
            String str2 = gVar2.f33207b.f33221f;
            SharedPreferences.Editor editorEdit = f5.e.g(gVar2.f33206a).edit();
            editorEdit.putString("existing_instance_identifier", str2);
            editorEdit.apply();
            this.f33205c.f33213h.set(dVarA);
            this.f33205c.f33214i.get().trySetResult(dVarA);
        }
        return Tasks.forResult(null);
    }
}
