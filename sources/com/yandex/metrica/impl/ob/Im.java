package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Im extends Am {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f14240d = {3, 6, 4};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Im f14241e = new Im("");

    public Im() {
        this("");
    }

    public Im(String str) {
        super(str);
    }

    public static Im g() {
        return f14241e;
    }

    public void a(Vf.d dVar, String str) {
        boolean z10;
        String string;
        for (Vf.d.a aVar : dVar.f15271d) {
            if (aVar != null) {
                int[] iArr = f14240d;
                int length = iArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    }
                    if (aVar.f15275d == iArr[i10]) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    StringBuilder sbA = android.support.v4.media.c.a(str, ": ");
                    if (aVar.f15275d == 3 && TextUtils.isEmpty(aVar.f15276e)) {
                        string = "Native crash of app";
                    } else if (aVar.f15275d == 4) {
                        StringBuilder sb2 = new StringBuilder(aVar.f15276e);
                        byte[] bArr = aVar.f15277f;
                        if (bArr != null) {
                            String str2 = new String(bArr);
                            if (!TextUtils.isEmpty(str2)) {
                                sb2.append(" with value ");
                                sb2.append(str2);
                            }
                        }
                        string = sb2.toString();
                    } else {
                        string = aVar.f15276e;
                    }
                    sbA.append(string);
                    b(sbA.toString());
                }
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.zo
    public String b() {
        return "AppMetrica";
    }
}
