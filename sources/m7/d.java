package m7;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import fd.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f33242a;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public d(Context context, b bVar) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bVar, "configuration");
        this.f33242a = new k(context, bVar);
    }

    public final void a(final Uri uri, final Map<String, String> map, final JSONObject jSONObject) {
        k9.h.a aVar;
        final k kVar = this.f33242a;
        Objects.requireNonNull(kVar);
        j0.p("Adding url ", uri);
        k.e eVar = kVar.f33256c;
        final boolean z10 = true;
        Runnable runnable = new Runnable() { // from class: m7.j
            @Override // java.lang.Runnable
            public final void run() {
                String string;
                boolean z11;
                k kVar2 = kVar;
                Uri uri2 = uri;
                Map map2 = map;
                JSONObject jSONObject2 = jSONObject;
                boolean z12 = z10;
                j0.i(kVar2, "this$0");
                j0.i(uri2, "$url");
                j0.i(map2, "$headers");
                k.b bVar = kVar2.f33257d;
                Objects.requireNonNull(bVar);
                j0.i(uri2, ImagesContract.URL);
                j0.i(map2, "headers");
                Objects.requireNonNull(k9.a.f31935a);
                long jCurrentTimeMillis = System.currentTimeMillis();
                k.d dVar = (k.d) bVar.f33259a.getValue();
                Objects.requireNonNull(dVar);
                j0.i(uri2, ImagesContract.URL);
                j0.i(map2, "headers");
                c cVar = dVar.f33262c;
                Objects.requireNonNull(cVar);
                j0.i(uri2, ImagesContract.URL);
                j0.i(map2, "headers");
                ContentValues contentValues = new ContentValues(3);
                contentValues.put(ImagesContract.URL, uri2.toString());
                j0.i(map2, "<this>");
                if (map2.isEmpty()) {
                    string = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry entry : map2.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        sb2.append(str);
                        sb2.append('\t');
                        sb2.append(str2);
                        sb2.append((char) 0);
                    }
                    string = sb2.toString();
                }
                contentValues.put("headers", string);
                contentValues.put("add_timestamp", Long.valueOf(jCurrentTimeMillis));
                SQLiteDatabase writableDatabase = cVar.getWritableDatabase();
                try {
                    long jInsert = writableDatabase.insert("items", null, contentValues);
                    c0.g(writableDatabase, null);
                    a.C0355a c0355a = new a.C0355a(uri2, map2, jSONObject2, jCurrentTimeMillis, jInsert);
                    dVar.f33263d.push(c0355a);
                    dVar.d();
                    k.d dVar2 = (k.d) bVar.f33259a.getValue();
                    if (z12) {
                        Objects.requireNonNull(f.f33243e);
                        j0.i(c0355a, "beaconItem");
                        f fVar = new f(c0355a.f33229a, c0355a.f33230b, c0355a.f33231c, null);
                        Uri uri3 = c0355a.f33229a;
                        String string2 = fVar.f33244a.toString();
                        j0.h(string2, "request.url.toString()");
                        bVar.f33260b.f33255b.f33237d.c(string2);
                        boolean z13 = true;
                        try {
                            h hVarA = bVar.f33260b.f33255b.f33235b.a(fVar);
                            if (hVarA.a()) {
                                bVar.f33260b.f33255b.f33237d.b(string2);
                                j0.p("Sent url ok ", uri3);
                            } else if (hVarA.b() / 100 == 5) {
                                bVar.f33260b.f33255b.f33237d.d(string2);
                                Objects.toString(uri3);
                            } else {
                                z11 = false;
                                try {
                                    bVar.f33260b.f33255b.f33237d.a(string2, false);
                                    j0.p("Failed to send url ", uri3);
                                } catch (IOException unused) {
                                    bVar.f33260b.f33255b.f33237d.a(string2, true);
                                    j0.p("Failed to send url ", uri3);
                                }
                                z13 = z11;
                            }
                        } catch (IOException unused2) {
                            z11 = false;
                        }
                        if (z13) {
                            dVar2.f33262c.b(dVar2.f33263d.pop().a());
                            dVar2.d();
                            return;
                        }
                    }
                    if (bVar.f33260b.f33258e.get() == null) {
                        k kVar3 = bVar.f33260b;
                        kVar3.f33255b.f33236c.a(kVar3);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0.g(writableDatabase, th);
                        throw th2;
                    }
                }
            }
        };
        Objects.requireNonNull(eVar);
        synchronized (eVar.f31948c) {
            if (eVar.f31950e == null) {
                eVar.f31950e = new ArrayList(2);
            }
            List<Runnable> list = eVar.f31950e;
            if (list != null) {
                list.add(runnable);
            }
            if (eVar.f31949d == null) {
                aVar = new k9.h.a(eVar);
                eVar.f31949d = aVar;
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            eVar.f31946a.execute(aVar);
        }
    }
}
