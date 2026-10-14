package v5;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f36683d;

    public /* synthetic */ b(d dVar, int i10) {
        this.f36682c = i10;
        this.f36683d = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f36682c) {
            case 0:
                d dVar = this.f36683d;
                synchronized (dVar) {
                    dVar.f36686a.get().h(System.currentTimeMillis(), dVar.f36688c.get().a());
                    break;
                }
                return null;
            default:
                d dVar2 = this.f36683d;
                synchronized (dVar2) {
                    i iVar = dVar2.f36686a.get();
                    List<j> listC = iVar.c();
                    iVar.b();
                    JSONArray jSONArray = new JSONArray();
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) listC;
                        if (i10 < arrayList.size()) {
                            j jVar = (j) arrayList.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", jVar.b());
                            jSONObject.put("dates", new JSONArray((Collection) jVar.a()));
                            jSONArray.put(jSONObject);
                            i10++;
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("heartbeats", jSONArray);
                            jSONObject2.put("version", "2");
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                                try {
                                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                    gZIPOutputStream.close();
                                    base64OutputStream.close();
                                    string = byteArrayOutputStream.toString("UTF-8");
                                } catch (Throwable th) {
                                    try {
                                        gZIPOutputStream.close();
                                        break;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    base64OutputStream.close();
                                    break;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                    }
                }
                return string;
        }
    }
}
