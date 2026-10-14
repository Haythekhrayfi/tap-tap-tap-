package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f14283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L0 f14286d;

    public static final class a extends vc.l implements uc.l<String, Boolean> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public Boolean invoke(String str) {
            return Boolean.valueOf(!J8.this.a().contains(str));
        }
    }

    public J8(Context context, String str, L0 l10) {
        this.f14284b = context;
        this.f14285c = str;
        this.f14286d = l10;
    }

    public abstract Set<String> a();

    public final synchronized void a(JSONObject jSONObject) {
        try {
            File fileA = this.f14286d.a(this.f14284b, this.f14285c);
            if (fileA != null) {
                String string = jSONObject.toString();
                fd.j0.h(string, "contents.toString()");
                Charset charset = ed.c.f29139b;
                fd.j0.i(fileA, "<this>");
                fd.j0.i(string, "text");
                fd.j0.i(charset, "charset");
                byte[] bytes = string.getBytes(charset);
                fd.j0.h(bytes, "this as java.lang.String).getBytes(charset)");
                sc.b.b(fileA, bytes);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:18:0x0057, B:19:0x0059, B:23:0x005f, B:24:0x0064, B:16:0x004c, B:17:0x0052, B:6:0x0006, B:8:0x0014, B:11:0x001c, B:12:0x003c, B:14:0x0042), top: B:28:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x005d, please report this as an issue */
    public final synchronized JSONObject b() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this.f14283a == null) {
            try {
                try {
                    File fileA = this.f14286d.a(this.f14284b, this.f14285c);
                    jSONObject = new JSONObject(fileA != null ? sc.b.a(fileA, null, 1) : "{}");
                    Iterator<String> itKeys = jSONObject.keys();
                    fd.j0.h(itKeys, "json.keys()");
                    dd.d.a aVar = new dd.d.a((dd.d) dd.q.d(dd.j.a(itKeys), new a()));
                    while (aVar.hasNext()) {
                        jSONObject.remove((String) aVar.next());
                    }
                } catch (FileNotFoundException unused) {
                    jSONObject = new JSONObject();
                }
            } catch (Throwable unused2) {
                jSONObject = new JSONObject();
            }
            this.f14283a = jSONObject;
            jSONObject2 = this.f14283a;
            if (jSONObject2 != null) {
                fd.j0.r("fileContents");
                throw null;
            }
        } else {
            jSONObject2 = this.f14283a;
            if (jSONObject2 != null) {
                fd.j0.r("fileContents");
                throw null;
            }
        }
        throw th;
        return jSONObject2;
    }
}
