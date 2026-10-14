package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class Gm extends HashMap<String, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14108a;

    public Gm() {
        this.f14108a = 0;
    }

    public Gm(String str) throws JSONException {
        super(C2120ym.e(str));
        this.f14108a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f14108a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f14108a;
        }
    }

    public int a() {
        return this.f14108a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String remove(Object obj) {
        if (containsKey(obj)) {
            String str = get(obj);
            this.f14108a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String put(String str, String str2) {
        int length;
        if (containsKey(str)) {
            if (str2 == null) {
                return remove(str);
            }
            String str3 = get(str);
            length = (str2.length() - (str3 == null ? 0 : str3.length())) + this.f14108a;
        } else {
            if (str2 == null) {
                return null;
            }
            length = str2.length() + str.length() + this.f14108a;
        }
        this.f14108a = length;
        return (String) super.put(str, str2);
    }
}
