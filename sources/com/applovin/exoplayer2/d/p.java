package com.applovin.exoplayer2.d;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.t.b f5164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f5167d;

    public p(String str, boolean z10, com.applovin.exoplayer2.k.t.b bVar) {
        com.applovin.exoplayer2.l.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f5164a = bVar;
        this.f5165b = str;
        this.f5166c = z10;
        this.f5167d = new HashMap();
    }

    private static String a(com.applovin.exoplayer2.k.t.e eVar, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = eVar.f7498d;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = eVar.f7500f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static byte[] a(com.applovin.exoplayer2.k.t.b bVar, String str, byte[] bArr, Map<String, String> map) throws s {
        com.applovin.exoplayer2.k.z zVar = new com.applovin.exoplayer2.k.z(bVar.a());
        com.applovin.exoplayer2.k.l lVarA = new com.applovin.exoplayer2.k.l.a().a(str).a(map).a(2).a(bArr).b(1).a();
        int i10 = 0;
        com.applovin.exoplayer2.k.l lVarA2 = lVarA;
        while (true) {
            try {
                com.applovin.exoplayer2.k.k kVar = new com.applovin.exoplayer2.k.k(zVar, lVarA2);
                try {
                    try {
                        byte[] bArrA = ai.a((InputStream) kVar);
                        ai.a((Closeable) kVar);
                        return bArrA;
                    } catch (com.applovin.exoplayer2.k.t.e e10) {
                        String strA = a(e10, i10);
                        if (strA == null) {
                            throw e10;
                        }
                        i10++;
                        lVarA2 = lVarA2.b().a(strA).a();
                        ai.a((Closeable) kVar);
                    }
                } catch (Throwable th) {
                    ai.a((Closeable) kVar);
                    throw th;
                }
            } catch (Exception e11) {
                throw new s(lVarA, (Uri) com.applovin.exoplayer2.l.a.b(zVar.e()), zVar.b(), zVar.d(), e11);
            }
        }
    }

    public void a(String str, String str2) {
        com.applovin.exoplayer2.l.a.b(str);
        com.applovin.exoplayer2.l.a.b(str2);
        synchronized (this.f5167d) {
            this.f5167d.put(str, str2);
        }
    }

    @Override // com.applovin.exoplayer2.d.r
    public byte[] a(UUID uuid, m.a aVar) throws s {
        String str;
        String strB = aVar.b();
        if (this.f5166c || TextUtils.isEmpty(strB)) {
            strB = this.f5165b;
        }
        if (TextUtils.isEmpty(strB)) {
            throw new s(new com.applovin.exoplayer2.k.l.a().a(Uri.EMPTY).a(), Uri.EMPTY, com.applovin.exoplayer2.common.a.u.a(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = com.applovin.exoplayer2.h.f6461e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = com.applovin.exoplayer2.h.f6459c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f5167d) {
            map.putAll(this.f5167d);
        }
        return a(this.f5164a, strB, aVar.a(), map);
    }

    @Override // com.applovin.exoplayer2.d.r
    public byte[] a(UUID uuid, m.d dVar) throws s {
        return a(this.f5164a, dVar.b() + "&signedRequest=" + ai.a(dVar.a()), null, Collections.emptyMap());
    }
}
