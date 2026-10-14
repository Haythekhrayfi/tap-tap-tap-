package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class H9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2131z8 f14135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14136b;

    public H9(InterfaceC2131z8 interfaceC2131z8) {
        this(interfaceC2131z8, null);
    }

    public H9(InterfaceC2131z8 interfaceC2131z8, String str) {
        this.f14135a = interfaceC2131z8;
        this.f14136b = str;
    }

    public int a(String str, int i10) {
        return this.f14135a.a(str, i10);
    }

    public long a(String str, long j10) {
        return this.f14135a.a(str, j10);
    }

    public String a(String str, String str2) {
        return this.f14135a.b(str, str2);
    }

    public List<String> a(String str, List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String strB = this.f14135a.b(str, (String) null);
        if (!TextUtils.isEmpty(strB)) {
            try {
                JSONArray jSONArray = new JSONArray(strB);
                strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public boolean a(String str, boolean z10) {
        return this.f14135a.b(str, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, int i10) {
        synchronized (this) {
            this.f14135a.b(str, i10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, long j10) {
        synchronized (this) {
            this.f14135a.b(str, j10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, String str2) {
        synchronized (this) {
            this.f14135a.a(str, str2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, List<String> list) {
        String string;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f14135a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, boolean z10) {
        synchronized (this) {
            this.f14135a.a(str, z10);
        }
        return this;
    }

    public boolean b(String str) {
        return this.f14135a.a(str);
    }

    public C2112ye c(String str) {
        return new C2112ye(str, this.f14136b);
    }

    public void c() {
        synchronized (this) {
            this.f14135a.b();
        }
    }

    public String d(String str) {
        return this.f14135a.b(str, (String) null);
    }

    public Set<String> d() {
        return this.f14135a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T e(String str) {
        synchronized (this) {
            this.f14135a.b(str);
        }
        return this;
    }
}
