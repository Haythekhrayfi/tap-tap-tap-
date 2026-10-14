package com.yandex.mobile.ads.exo.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.ao;
import com.yandex.mobile.ads.impl.cg;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.lm;
import com.yandex.mobile.ads.impl.nm;
import com.yandex.mobile.ads.impl.o41;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.pm;
import com.yandex.mobile.ads.impl.r00;
import com.yandex.mobile.ads.impl.tb0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lm.a f18511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f18514d;

    public o(String str, boolean z10, ao.a aVar) {
        pa.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f18511a = aVar;
        this.f18512b = str;
        this.f18513c = z10;
        this.f18514d = new HashMap();
    }

    private static byte[] a(lm.a aVar, String str, byte[] bArr, Map<String, String> map) throws tb0 {
        Map<String, List<String>> map2;
        List<String> list;
        o41 o41Var = new o41(aVar.a());
        pm pmVarA = new pm.a().b(str).a(map).b().a(bArr).a(1).a();
        int i10 = 0;
        int i11 = 0;
        pm pmVarA2 = pmVarA;
        while (true) {
            try {
                nm nmVar = new nm(o41Var, pmVarA2);
                try {
                    try {
                        int i12 = da1.f19803a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i13 = nmVar.read(bArr2);
                            if (i13 == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                da1.a((Closeable) nmVar);
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr2, i10, i13);
                            da1.a((Closeable) nmVar);
                            throw th;
                        }
                    } catch (r00 e10) {
                        int i14 = e10.f24580d;
                        String str2 = ((((i14 == 307 || i14 == 308) && i11 < 5) ? 1 : i10) == 0 || (map2 = e10.f24581e) == null || (list = map2.get("Location")) == null || list.isEmpty()) ? null : list.get(i10);
                        if (str2 == null) {
                            throw e10;
                        }
                        i11++;
                        pmVarA2 = pmVarA2.a().b(str2).a();
                        da1.a((Closeable) nmVar);
                    }
                } catch (Throwable th) {
                    da1.a((Closeable) nmVar);
                    throw th;
                }
            } catch (Exception e11) {
                Uri uriG = o41Var.g();
                Objects.requireNonNull(uriG);
                throw new tb0(pmVarA, uriG, o41Var.b(), o41Var.f(), e11);
            }
        }
    }

    public final void a(String str, String str2) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        synchronized (this.f18514d) {
            this.f18514d.put(str, str2);
        }
    }

    public final byte[] a(m.d dVar) throws tb0 {
        return a(this.f18511a, dVar.b() + "&signedRequest=" + da1.a(dVar.a()), null, Collections.emptyMap());
    }

    public final byte[] a(UUID uuid, m.a aVar) throws tb0 {
        String str;
        String strB = aVar.b();
        if (this.f18513c || TextUtils.isEmpty(strB)) {
            strB = this.f18512b;
        }
        if (TextUtils.isEmpty(strB)) {
            throw new tb0(new pm.a().a(Uri.EMPTY).a(), Uri.EMPTY, com.yandex.mobile.ads.embedded.guava.collect.q.h(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = cg.f19502e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = cg.f19500c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f18514d) {
            map.putAll(this.f18514d);
        }
        return a(this.f18511a, strB, aVar.a(), map);
    }
}
