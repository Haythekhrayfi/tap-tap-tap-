package h6;

import fd.j0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import jc.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30935c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30936d;

    public /* synthetic */ i(j jVar) {
        this.f30936d = jVar;
    }

    public /* synthetic */ i(i6.e eVar) {
        this.f30936d = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileInputStream fileInputStreamOpenFileInput;
        com.google.firebase.remoteconfig.internal.b bVarA;
        switch (this.f30935c) {
            case 0:
                return ((j) this.f30936d).c();
            case 1:
                i6.e eVar = (i6.e) this.f30936d;
                synchronized (eVar) {
                    FileInputStream fileInputStream = null;
                    bVarA = null;
                    bVarA = null;
                    try {
                        try {
                            fileInputStreamOpenFileInput = eVar.f31289a.openFileInput(eVar.f31290b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                bVarA = com.google.firebase.remoteconfig.internal.b.a(new JSONObject(new String(bArr, "UTF-8")));
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                }
                                return bVarA;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStreamOpenFileInput;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    fileInputStreamOpenFileInput.close();
                    break;
                }
                return bVarA;
            default:
                v6.a aVar = (v6.a) this.f30936d;
                j0.i(aVar, "$settings");
                Iterator<T> it = aVar.b().iterator();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    Object next = it.next();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        r6.d dVar = (r6.d) next;
                        dVar.g(((r6.d) next2).e() - (dVar.c() + dVar.e()));
                        arrayList.add(w.f31842a);
                        next = next2;
                    }
                }
                Iterator<T> it2 = aVar.b().iterator();
                while (it2.hasNext()) {
                    ((r6.d) it2.next()).i(aVar.e());
                }
                return aVar.b();
        }
    }
}
